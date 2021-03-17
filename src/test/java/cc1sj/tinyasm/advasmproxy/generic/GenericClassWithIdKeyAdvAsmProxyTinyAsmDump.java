package cc1sj.tinyasm.advasmproxy.generic;
import org.objectweb.asm.Label;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Opcodes;
import cc1sj.tinyasm.ClassBody;
import cc1sj.tinyasm.ClassBuilder;
import cc1sj.tinyasm.MethodCode;
import org.objectweb.asm.Type;
import static org.objectweb.asm.Opcodes.*;
import cc1sj.tinyasm.Annotation;
import cc1sj.tinyasm.Clazz;
import cc1sj.tinyasm.advmagicbuilder.WithIdKey;
import cc1sj.tinyasm.advasmproxy.simple.PojoClassChild;
import java.lang.ThreadLocal;
import cc1sj.tinyasm.AdvContext;
import java.lang.Exception;
import cc1sj.tinyasm.ClazzSimple;
import cc1sj.tinyasm.MethodCode;
import cc1sj.tinyasm.MethodCaller;
import cc1sj.tinyasm.advasmproxy.generic.PojoClassWithIdKey;
import cc1sj.tinyasm.AdvRuntimeReferNameObject;
import cc1sj.tinyasm.Adv;
import java.lang.Class;
import java.lang.Object;
import cc1sj.tinyasm.ConsumerWithException;
import java.lang.String;
import cc1sj.tinyasm.advasmproxy.generic.GenericClassWithIdKey;
import cc1sj.tinyasm.Clazz;
@SuppressWarnings("unused")
public class GenericClassWithIdKeyAdvAsmProxyTinyAsmDump {

	public static byte[] dump () throws Exception {
		return new GenericClassWithIdKeyAdvAsmProxyTinyAsmDump().dump("cc1sj.tinyasm.advasmproxy.generic.GenericClassWithIdKeyAdvAsmProxy");
	}

	public byte[] dump(String className) throws Exception {
		ClassBody classBody = ClassBuilder.class_(className, Clazz.of(GenericClassWithIdKey.class,Clazz.of(PojoClassWithIdKey.class)),Clazz.of(AdvRuntimeReferNameObject.class))
			.access(ACC_PUBLIC | ACC_SUPER).body();

classBody.referInnerClass(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "java.lang.invoke.MethodHandles", "Lookup");

		classBody.private_().field("_magicNumber", Clazz.of(byte.class));
		classBody.private_().field("_contextThreadLocal",Clazz.of(ThreadLocal.class,Clazz.of(AdvContext.class)));
		__init_(classBody);
		_get__MagicNumber(classBody);
		_set__MagicNumber(classBody);
		_set__Context(classBody);
		_get__TargetClazz(classBody);
		_getT(classBody);
		_setT(classBody);
		_getPojoClassChildSample(classBody);
		_setPojoClassChildSample(classBody);
		_bridge_setT(classBody);
		_bridge_getT(classBody);
		_bridge_setT_Object_void(classBody);
		_bridge_getT_Object(classBody);
		_lambda$setPojoClassChildSample$3(classBody);
		_lambda$getPojoClassChildSample$2(classBody);
		_lambda$setT$1(classBody);
		_lambda$getT$0(classBody);

		return classBody.end().toByteArray();
	}

	protected void __init_(ClassBody classBody) {
		MethodCode code = classBody.public_().method("<init>").begin();

		code.LINE();
		code.LOAD("this");
		code.SPECIAL(GenericClassWithIdKey.class, "<init>").INVOKE();
		code.RETURN();

		code.END();
	}

	protected void _get__MagicNumber(ClassBody classBody) {
		MethodCode code = classBody.public_().method("get__MagicNumber")
			.return_(byte.class ).begin();

		code.LINE();
		code.LOAD("this");
		code.GETFIELD_OF_THIS("_magicNumber");
		code.RETURNTop();

		code.END();
	}

	protected void _set__MagicNumber(ClassBody classBody) {
		MethodCode code = classBody.public_().method("set__MagicNumber")
			.parameter("_magicNumber",byte.class).begin();

		code.LINE();
		code.LOAD("this");
		code.LOAD("_magicNumber");
		code.PUTFIELD_OF_THIS("_magicNumber");

		code.LINE();
		code.RETURN();

		code.END();
	}

	protected void _set__Context(ClassBody classBody) {
		MethodCode code = classBody.public_().method("set__Context")
			.return_(Clazz.of(void.class) )
			.parameter("_contextThreadLocal",Clazz.of(ThreadLocal.class,Clazz.of(AdvContext.class)))
			.parameter("_magicNumber",Clazz.of(byte.class)).begin();

		code.LINE();
		code.LOAD("this");
		code.LOAD("_contextThreadLocal");
		code.PUTFIELD_OF_THIS("_contextThreadLocal");

		code.LINE();
		code.LOAD("this");
		code.LOAD("_magicNumber");
		code.PUTFIELD_OF_THIS("_magicNumber");

		code.LINE();
		code.RETURN();

		code.END();
	}

	protected void _get__TargetClazz(ClassBody classBody) {
		MethodCode code = classBody.public_().method("get__TargetClazz")
			.return_(Clazz.class ).begin();

		code.LINE();
		code.LOADConst(Type.getType("Lcc1sj/tinyasm/advasmproxy/generic/GenericClassWithIdKey;"));
		code.STATIC(Clazz.class, "of")
			.return_(ClazzSimple.class)
			.parameter(Class.class).INVOKE();
		code.RETURNTop();

		code.END();
	}

	protected void _getT(ClassBody classBody) {
		MethodCode code = classBody.public_().method("getT")
			.return_(PojoClassWithIdKey.class ).begin();

		code.LINE();
		code.LOAD("this");
		code.GETFIELD_OF_THIS("_contextThreadLocal");
		code.VIRTUAL(ThreadLocal.class, "get")
			.return_(Object.class).INVOKE();
		code.CHECKCAST(AdvContext.class);
		code.STORE("context",AdvContext.class);

		code.LINE();
		code.LOAD("context");
		code.LOAD("this");
		code.VIRTUAL(AdvContext.class, "resolve")
			.return_(ConsumerWithException.class)
			.parameter(Object.class).INVOKE();
		code.STORE("objEval",Clazz.of(ConsumerWithException.class,Clazz.of(MethodCode.class)));

		code.LINE();
		code.LOAD("context");
		code.LOADConst(Type.getType("Lcc1sj/tinyasm/advasmproxy/generic/PojoClassWithIdKey;"));
		code.LOAD("objEval");
		code.visitInvokeDynamicInsn("accept", "(Lcc1sj/tinyasm/ConsumerWithException;)Lcc1sj/tinyasm/ConsumerWithException;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESTATIC, "cc1sj/tinyasm/advasmproxy/generic/GenericClassWithIdKeyAdvAsmProxy", "lambda$getT$0", "(Lcc1sj/tinyasm/ConsumerWithException;Lcc1sj/tinyasm/MethodCode;)V", false), Type.getType("(Lcc1sj/tinyasm/MethodCode;)V")});
		code.VIRTUAL(AdvContext.class, "push")
			.return_(byte.class)
			.parameter(Class.class)
			.parameter(ConsumerWithException.class).INVOKE();
		code.STORE("codeIndex",byte.class);

		code.LINE();
		code.LOADConst(80);
		code.LOAD("codeIndex");
		code.ADD();
		code.CONVERTTO(byte.class);
		code.STORE("magicNumber",byte.class);

		code.LINE();
		code.LOADConst(Type.getType("Lcc1sj/tinyasm/advasmproxy/generic/PojoClassWithIdKey;"));
		code.STATIC(Adv.class, "canProxy")
			.return_(boolean.class)
			.parameter(Class.class).INVOKE();
		Label label5OfIFEQ = new Label();
		code.IFEQ(label5OfIFEQ);

		code.LINE();
		code.LOADConst(Type.getType("Lcc1sj/tinyasm/advasmproxy/generic/PojoClassWithIdKey;"));
		code.LOAD("magicNumber");
		code.STATIC(Adv.class, "buildProxyClass")
			.return_(Object.class)
			.parameter(Class.class)
			.parameter(byte.class).INVOKE();
		code.CHECKCAST(PojoClassWithIdKey.class);
		code.RETURNTop();

		code.visitLabel(label5OfIFEQ);

		code.LINE();
		code.LOADConstNULL();
		code.RETURNTop();

		code.END();
	}

	protected void _setT(ClassBody classBody) {
		MethodCode code = classBody.public_().method("setT")
			.parameter("param0",PojoClassWithIdKey.class).begin();

		code.LINE();
		code.LOAD("this");
		code.GETFIELD_OF_THIS("_contextThreadLocal");
		code.VIRTUAL(ThreadLocal.class, "get")
			.return_(Object.class).INVOKE();
		code.CHECKCAST(AdvContext.class);
		code.STORE("context",AdvContext.class);

		code.LINE();
		code.LOAD("context");
		code.LOAD("param0");
		code.VIRTUAL(AdvContext.class, "resolve")
			.return_(ConsumerWithException.class)
			.parameter(Object.class).INVOKE();
		code.STORE("eval_param0",Clazz.of(ConsumerWithException.class,Clazz.of(MethodCode.class)));

		code.LINE();
		code.LOAD("context");
		code.LOAD("this");
		code.VIRTUAL(AdvContext.class, "resolve")
			.return_(ConsumerWithException.class)
			.parameter(Object.class).INVOKE();
		code.STORE("objEval",Clazz.of(ConsumerWithException.class,Clazz.of(MethodCode.class)));

		code.LINE();
		code.LOAD("context");
		code.LOAD("objEval");
		code.LOAD("eval_param0");
		code.visitInvokeDynamicInsn("accept", "(Lcc1sj/tinyasm/ConsumerWithException;Lcc1sj/tinyasm/ConsumerWithException;)Lcc1sj/tinyasm/ConsumerWithException;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESTATIC, "cc1sj/tinyasm/advasmproxy/generic/GenericClassWithIdKeyAdvAsmProxy", "lambda$setT$1", "(Lcc1sj/tinyasm/ConsumerWithException;Lcc1sj/tinyasm/ConsumerWithException;Lcc1sj/tinyasm/MethodCode;)V", false), Type.getType("(Lcc1sj/tinyasm/MethodCode;)V")});
		code.VIRTUAL(AdvContext.class, "execLine")
			.parameter(ConsumerWithException.class).INVOKE();

		code.LINE();
		code.RETURN();

		code.END();
	}

	protected void _getPojoClassChildSample(ClassBody classBody) {
		MethodCode code = classBody.public_().method("getPojoClassChildSample")
			.return_(PojoClassChild.class ).begin();

		code.LINE();
		code.LOAD("this");
		code.GETFIELD_OF_THIS("_contextThreadLocal");
		code.VIRTUAL(ThreadLocal.class, "get")
			.return_(Object.class).INVOKE();
		code.CHECKCAST(AdvContext.class);
		code.STORE("context",AdvContext.class);

		code.LINE();
		code.LOAD("context");
		code.LOAD("this");
		code.VIRTUAL(AdvContext.class, "resolve")
			.return_(ConsumerWithException.class)
			.parameter(Object.class).INVOKE();
		code.STORE("objEval",Clazz.of(ConsumerWithException.class,Clazz.of(MethodCode.class)));

		code.LINE();
		code.LOAD("context");
		code.LOADConst(Type.getType("Lcc1sj/tinyasm/advasmproxy/simple/PojoClassChild;"));
		code.LOAD("objEval");
		code.visitInvokeDynamicInsn("accept", "(Lcc1sj/tinyasm/ConsumerWithException;)Lcc1sj/tinyasm/ConsumerWithException;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESTATIC, "cc1sj/tinyasm/advasmproxy/generic/GenericClassWithIdKeyAdvAsmProxy", "lambda$getPojoClassChildSample$2", "(Lcc1sj/tinyasm/ConsumerWithException;Lcc1sj/tinyasm/MethodCode;)V", false), Type.getType("(Lcc1sj/tinyasm/MethodCode;)V")});
		code.VIRTUAL(AdvContext.class, "push")
			.return_(byte.class)
			.parameter(Class.class)
			.parameter(ConsumerWithException.class).INVOKE();
		code.STORE("codeIndex",byte.class);

		code.LINE();
		code.LOADConst(80);
		code.LOAD("codeIndex");
		code.ADD();
		code.CONVERTTO(byte.class);
		code.STORE("magicNumber",byte.class);

		code.LINE();
		code.LOADConst(Type.getType("Lcc1sj/tinyasm/advasmproxy/simple/PojoClassChild;"));
		code.STATIC(Adv.class, "canProxy")
			.return_(boolean.class)
			.parameter(Class.class).INVOKE();
		Label label5OfIFEQ = new Label();
		code.IFEQ(label5OfIFEQ);

		code.LINE();
		code.LOADConst(Type.getType("Lcc1sj/tinyasm/advasmproxy/simple/PojoClassChild;"));
		code.LOAD("magicNumber");
		code.STATIC(Adv.class, "buildProxyClass")
			.return_(Object.class)
			.parameter(Class.class)
			.parameter(byte.class).INVOKE();
		code.CHECKCAST(PojoClassChild.class);
		code.RETURNTop();

		code.visitLabel(label5OfIFEQ);

		code.LINE();
		code.LOADConstNULL();
		code.RETURNTop();

		code.END();
	}

	protected void _setPojoClassChildSample(ClassBody classBody) {
		MethodCode code = classBody.public_().method("setPojoClassChildSample")
			.parameter("param0",PojoClassChild.class).begin();

		code.LINE();
		code.LOAD("this");
		code.GETFIELD_OF_THIS("_contextThreadLocal");
		code.VIRTUAL(ThreadLocal.class, "get")
			.return_(Object.class).INVOKE();
		code.CHECKCAST(AdvContext.class);
		code.STORE("context",AdvContext.class);

		code.LINE();
		code.LOAD("context");
		code.LOAD("param0");
		code.VIRTUAL(AdvContext.class, "resolve")
			.return_(ConsumerWithException.class)
			.parameter(Object.class).INVOKE();
		code.STORE("eval_param0",Clazz.of(ConsumerWithException.class,Clazz.of(MethodCode.class)));

		code.LINE();
		code.LOAD("context");
		code.LOAD("this");
		code.VIRTUAL(AdvContext.class, "resolve")
			.return_(ConsumerWithException.class)
			.parameter(Object.class).INVOKE();
		code.STORE("objEval",Clazz.of(ConsumerWithException.class,Clazz.of(MethodCode.class)));

		code.LINE();
		code.LOAD("context");
		code.LOAD("objEval");
		code.LOAD("eval_param0");
		code.visitInvokeDynamicInsn("accept", "(Lcc1sj/tinyasm/ConsumerWithException;Lcc1sj/tinyasm/ConsumerWithException;)Lcc1sj/tinyasm/ConsumerWithException;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESTATIC, "cc1sj/tinyasm/advasmproxy/generic/GenericClassWithIdKeyAdvAsmProxy", "lambda$setPojoClassChildSample$3", "(Lcc1sj/tinyasm/ConsumerWithException;Lcc1sj/tinyasm/ConsumerWithException;Lcc1sj/tinyasm/MethodCode;)V", false), Type.getType("(Lcc1sj/tinyasm/MethodCode;)V")});
		code.VIRTUAL(AdvContext.class, "execLine")
			.parameter(ConsumerWithException.class).INVOKE();

		code.LINE();
		code.RETURN();

		code.END();
	}

	protected void _bridge_setT(ClassBody classBody) {
		MethodCode code = classBody.method(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setT")
			.parameter("var1",WithIdKey.class).begin();

		code.LINE();
		code.LOAD("this");
		code.LOAD("var1");
		code.CHECKCAST(PojoClassWithIdKey.class);
		code.VIRTUAL("setT")
			.parameter(PojoClassWithIdKey.class).INVOKE();
		code.RETURN();

		code.END();
	}

	protected void _bridge_getT(ClassBody classBody) {
		MethodCode code = classBody.method(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getT")
			.return_(WithIdKey.class ).begin();

		code.LINE();
		code.LOAD("this");
		code.VIRTUAL("getT")
			.return_(PojoClassWithIdKey.class).INVOKE();
		code.RETURNTop();

		code.END();
	}

	protected void _bridge_setT_Object_void(ClassBody classBody) {
		MethodCode code = classBody.method(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setT")
			.parameter("var1",Object.class).begin();

		code.LINE();
		code.LOAD("this");
		code.LOAD("var1");
		code.CHECKCAST(PojoClassWithIdKey.class);
		code.VIRTUAL("setT")
			.parameter(PojoClassWithIdKey.class).INVOKE();
		code.RETURN();

		code.END();
	}

	protected void _bridge_getT_Object(ClassBody classBody) {
		MethodCode code = classBody.method(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getT")
			.return_(Object.class ).begin();

		code.LINE();
		code.LOAD("this");
		code.VIRTUAL("getT")
			.return_(PojoClassWithIdKey.class).INVOKE();
		code.RETURNTop();

		code.END();
	}

	protected void _lambda$setPojoClassChildSample$3(ClassBody classBody) {
		MethodCode code = classBody.staticMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$setPojoClassChildSample$3")
			.throws_(Exception.class )
			.parameter("objEval",ConsumerWithException.class)
			.parameter("eval_param0",ConsumerWithException.class)
			.parameter("c",MethodCode.class).begin();

		code.LINE();
		code.LOAD("objEval");
		code.LOAD("c");
		code.INTERFACE(ConsumerWithException.class, "accept")
			.parameter(Object.class).INVOKE();

		code.LINE();
		code.LOAD("eval_param0");
		code.LOAD("c");
		code.INTERFACE(ConsumerWithException.class, "accept")
			.parameter(Object.class).INVOKE();

		code.LINE();
		code.LOAD("c");
		code.LOADConst(Type.getType("Lcc1sj/tinyasm/advasmproxy/generic/GenericClassWithIdKey;"));
		code.LOADConst("setPojoClassChildSample");
		code.VIRTUAL(MethodCode.class, "VIRTUAL")
			.return_(MethodCaller.class)
			.parameter(Class.class)
			.parameter(String.class).INVOKE();
		code.LOADConst(Type.getType("Lcc1sj/tinyasm/advasmproxy/simple/PojoClassChild;"));
		code.INTERFACE(MethodCaller.class, "parameter")
			.return_(MethodCaller.class)
			.parameter(Class.class).INVOKE();
		code.INTERFACE(MethodCaller.class, "INVOKE").INVOKE();

		code.LINE();
		code.RETURN();

		code.END();
	}

	protected void _lambda$getPojoClassChildSample$2(ClassBody classBody) {
		MethodCode code = classBody.staticMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$getPojoClassChildSample$2")
			.throws_(Exception.class )
			.parameter("objEval",ConsumerWithException.class)
			.parameter("c",MethodCode.class).begin();

		code.LINE();
		code.LOAD("objEval");
		code.LOAD("c");
		code.INTERFACE(ConsumerWithException.class, "accept")
			.parameter(Object.class).INVOKE();

		code.LINE();
		code.LOAD("c");
		code.LOADConst(Type.getType("Lcc1sj/tinyasm/advasmproxy/generic/GenericClassWithIdKey;"));
		code.LOADConst("getPojoClassChildSample");
		code.VIRTUAL(MethodCode.class, "VIRTUAL")
			.return_(MethodCaller.class)
			.parameter(Class.class)
			.parameter(String.class).INVOKE();
		code.LOADConst(Type.getType("Lcc1sj/tinyasm/advasmproxy/simple/PojoClassChild;"));
		code.INTERFACE(MethodCaller.class, "return_")
			.return_(MethodCaller.class)
			.parameter(Class.class).INVOKE();
		code.INTERFACE(MethodCaller.class, "INVOKE").INVOKE();

		code.LINE();
		code.RETURN();

		code.END();
	}

	protected void _lambda$setT$1(ClassBody classBody) {
		MethodCode code = classBody.staticMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$setT$1")
			.throws_(Exception.class )
			.parameter("objEval",ConsumerWithException.class)
			.parameter("eval_param0",ConsumerWithException.class)
			.parameter("c",MethodCode.class).begin();

		code.LINE();
		code.LOAD("objEval");
		code.LOAD("c");
		code.INTERFACE(ConsumerWithException.class, "accept")
			.parameter(Object.class).INVOKE();

		code.LINE();
		code.LOAD("eval_param0");
		code.LOAD("c");
		code.INTERFACE(ConsumerWithException.class, "accept")
			.parameter(Object.class).INVOKE();

		code.LINE();
		code.LOAD("c");
		code.LOADConst(Type.getType("Lcc1sj/tinyasm/advasmproxy/generic/GenericClassWithIdKey;"));
		code.LOADConst("setT");
		code.VIRTUAL(MethodCode.class, "VIRTUAL")
			.return_(MethodCaller.class)
			.parameter(Class.class)
			.parameter(String.class).INVOKE();
		code.LOADConst(Type.getType("Lcc1sj/tinyasm/advmagicbuilder/WithIdKey;"));
		code.INTERFACE(MethodCaller.class, "parameter")
			.return_(MethodCaller.class)
			.parameter(Class.class).INVOKE();
		code.INTERFACE(MethodCaller.class, "INVOKE").INVOKE();

		code.LINE();
		code.RETURN();

		code.END();
	}

	protected void _lambda$getT$0(ClassBody classBody) {
		MethodCode code = classBody.staticMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$getT$0")
			.throws_(Exception.class )
			.parameter("objEval",ConsumerWithException.class)
			.parameter("c",MethodCode.class).begin();

		code.LINE();
		code.LOAD("objEval");
		code.LOAD("c");
		code.INTERFACE(ConsumerWithException.class, "accept")
			.parameter(Object.class).INVOKE();

		code.LINE();
		code.LOAD("c");
		code.LOADConst(Type.getType("Lcc1sj/tinyasm/advasmproxy/generic/GenericClassWithIdKey;"));
		code.LOADConst("getT");
		code.VIRTUAL(MethodCode.class, "VIRTUAL")
			.return_(MethodCaller.class)
			.parameter(Class.class)
			.parameter(String.class).INVOKE();
		code.LOADConst(Type.getType("Lcc1sj/tinyasm/advmagicbuilder/WithIdKey;"));
		code.INTERFACE(MethodCaller.class, "return_")
			.return_(MethodCaller.class)
			.parameter(Class.class).INVOKE();
		code.INTERFACE(MethodCaller.class, "INVOKE").INVOKE();

		code.LINE();
		code.LOAD("c");
		code.LOADConst(Type.getType("Lcc1sj/tinyasm/advasmproxy/generic/PojoClassWithIdKey;"));
		code.VIRTUAL(MethodCode.class, "CHECKCAST")
			.parameter(Class.class).INVOKE();

		code.LINE();
		code.RETURN();

		code.END();
	}

}