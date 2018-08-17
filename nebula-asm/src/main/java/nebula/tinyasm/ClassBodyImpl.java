package nebula.tinyasm;

import static nebula.tinyasm.util.TypeUtils.internalNamelOf;
import static nebula.tinyasm.util.TypeUtils.toSimpleName;
import static nebula.tinyasm.util.TypeUtils.typeOf;

import java.util.List;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

import nebula.tinyasm.data.Annotation;
import nebula.tinyasm.data.ArrayListMap;
import nebula.tinyasm.data.ClassBody;
import nebula.tinyasm.data.Field;
import nebula.tinyasm.data.GenericClazz;
import nebula.tinyasm.data.MethodHeader;

class ClassBodyImpl extends ClassVisitor implements ClassBuilder, ClassBody {

	ArrayListMap<ClassField> fields = new ArrayListMap<>();
	ArrayListMap<ClassField> staticFields = new ArrayListMap<>();

	boolean hadEnd = false;

	final private Type superType;

	final private Type thisType;

	ClassBodyImpl(ClassVisitor cv, ClassHeaderImpl header) {
		super(Opcodes.ASM5, cv);

		this.thisType = typeOf(header.name);
		this.superType = typeOf(header.superClazz.clazz);
		{
			int version = 52;
			int access = header.access;
			String name = this.thisType.getInternalName();
			String signature = null;
			boolean needSignature = header.superClazz.needSignature();
			String superSignature = header.superClazz.signatureAnyway();
			for (GenericClazz inTerface : header.interfaces) {
				needSignature |= inTerface.needSignature();
				superSignature += inTerface.signatureAnyway();
			}

			if (needSignature) signature = superSignature;

			String superName = this.superType.getInternalName();
			String[] interfaces = new String[header.interfaces.size()];
			for (int i = 0; i < header.interfaces.size(); i++) {
				interfaces[i] = internalNamelOf(header.interfaces.get(i).clazz);
			}

			cv.visit(version, access, name, signature, superName, interfaces);
		}
		cv.visitSource(toSimpleName(this.thisType.getClassName()) + ".java", null);

		for (Annotation annotation : header.annotations) {
			Annotation.visitAnnotation(cv, annotation);
		}
	}

	@Override
	public String clazzOfField(String name) {
		return fields.get(name).clazz.clazz;
	}

	@Override
	public ClassBodyImpl end() {
		cv.visitEnd();
		hadEnd = true;
		return this;
	}

	public Field fieldOfThis(String fieldName) {
		return fields.get(fieldName);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends Field> List<T> getFields() {
		return (List<T>) this.fields.list();
	}

	@Override
	public String getName() {
		return this.thisType.getClassName();
	}

	@Override
	public String getSimpleName() {
		String name = getName();
		return name.substring(name.lastIndexOf(".") + 1, name.length());
	}

	@Override
	public String getSuperClass() {
		return superType.getClassName();
	}

	@Override
	public ClassBody staticField(int access, String name, GenericClazz clazz) {
		access |= Opcodes.ACC_STATIC;
		ClassField field1 = new ClassField(access, name, clazz, null);
		staticFields.push(field1.name, field1);
		FieldVisitor fv = cv.visitField(access, name, clazz.getDescriptor(), clazz.signatureWhenNeed(), null);
		fv.visitEnd();
		return this;
	}

	@Override
	public ClassBody staticField(int access, Annotation annotation, String name, GenericClazz clazz) {
		access |= Opcodes.ACC_STATIC;
		ClassField field1 = new ClassField(access, name, clazz, null);
		staticFields.push(field1.name, field1);
		FieldVisitor fv = cv.visitField(access, name, clazz.getDescriptor(), clazz.signatureWhenNeed(), null);
		if (annotation != null) {
			Annotation.visitAnnotation(fv, annotation);
		}
		fv.visitEnd();
		return this;
	}

	@Override
	public ClassBody field(int access, String name, GenericClazz clazz) {
		ClassField field1 = new ClassField(access, name, clazz, null);
		fields.push(field1.name, field1);
		FieldVisitor fv = cv.visitField(access, name, clazz.getDescriptor(), clazz.signatureWhenNeed(), null);
		fv.visitEnd();
		return this;
	}

	@Override
	public ClassBody field(int access, Annotation annotation, String name, GenericClazz clazz) {
		ClassField field1 = new ClassField(access, name, clazz, null);
		fields.push(field1.name, field1);
		FieldVisitor fv = cv.visitField(access, name, clazz.getDescriptor(), clazz.signatureWhenNeed(), null);
		if (annotation != null) {
			Annotation.visitAnnotation(fv, annotation);
		}
		fv.visitEnd();
		return this;
	}

	@Override
	public MethodHeader staticMethod(int access, String name) {
		return new MethodHeaderBuilder(this, thisType.getClassName(), access |= Opcodes.ACC_STATIC, name);
	}

	@Override
	public MethodHeader staticMethod(int access, String returnType, String name) {
		return new MethodHeaderBuilder(this, thisType.getClassName(), access |= Opcodes.ACC_STATIC, returnType, name);
	}

	@Override
	public MethodHeader method(int access, String name) {
		return new MethodHeaderBuilder(this, thisType.getClassName(), access, name);
	}

	@Override
	public MethodHeader method(int access, String returnType, String name) {
		return new MethodHeaderBuilder(this, thisType.getClassName(), access, returnType, name);
	}

	@Override
	public String referInnerClass(String name) {
		String internalName = thisType.getInternalName() + "$" + name;

		cv.visitInnerClass(internalName, thisType.getInternalName(), name, 0);

		return Type.getType("L" + internalName + ";").getClassName();
	}

	@Override
	public byte[] toByteArray() {
		if (!hadEnd) {
			end();
		}
		if (cv instanceof ClassWriter) {
			return ((ClassWriter) cv).toByteArray();
		}
		return null;
	}

//	@Override
//	public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
//		initType(Type.getObjectType(name), Type.getObjectType(superName));
//		super.visit(version, access, name, signature, superName, interfaces);
//	}

	@Override
	public void visitEnd() {
		super.visitEnd();
		hadEnd = true;
	}

//	@Override
//	public FieldVisitor visitField(int access, String name, String desc, String signature, Object value) {
//		Field field = new ClassField(access, name, Type.getType(desc), value);
//		this.fields.push(field.name, field);
//		return super.visitField(access, name, desc, signature, value);
//	}
//
//	@Override
//	public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
//		return cv.visitMethod(access, name, desc, signature, exceptions);
//	}

}
