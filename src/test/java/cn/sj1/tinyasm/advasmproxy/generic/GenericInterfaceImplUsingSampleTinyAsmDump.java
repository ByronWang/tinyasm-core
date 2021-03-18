package cn.sj1.tinyasm.advasmproxy.generic;
import static org.objectweb.asm.Opcodes.ACC_PUBLIC;
import static org.objectweb.asm.Opcodes.ACC_SUPER;

import cn.sj1.tinyasm.ClassBody;
import cn.sj1.tinyasm.ClassBuilder;
import cn.sj1.tinyasm.MethodCode;
import cn.sj1.tinyasm.advasmproxy.simple.PojoClass;
import cn.sj1.tinyasm.advasmproxy.simple.PojoClassChild;
@SuppressWarnings("unused")
public class GenericInterfaceImplUsingSampleTinyAsmDump {

	public static byte[] dump () throws Exception {
		return new GenericInterfaceImplUsingSampleTinyAsmDump().dump("cn.sj1.tinyasm.advasmproxy.generic.GenericInterfaceImplUsingSample");
	}

	public byte[] dump(String className) throws Exception {
		ClassBody classBody = ClassBuilder.class_(className)
			.access(ACC_PUBLIC | ACC_SUPER).body();

		__init_(classBody);
		_say(classBody);

		return classBody.end().toByteArray();
	}

	protected void __init_(ClassBody classBody) {
		MethodCode code = classBody.public_().method("<init>").begin();

		code.LINE();
		code.LOAD("this");
		code.SPECIAL(Object.class, "<init>").INVOKE();
		code.RETURN();

		code.END();
	}

	protected void _say(ClassBody classBody) {
		MethodCode code = classBody.public_().method("say").begin();

		code.LINE();
		code.NEW(GenericInterfaceImpl.class);
		code.DUP();
		code.SPECIAL(GenericInterfaceImpl.class, "<init>").INVOKE();
		code.STORE("pp",GenericInterfaceImpl.class);

		code.LINE();
		code.NEW(PojoClass.class);
		code.DUP();
		code.SPECIAL(PojoClass.class, "<init>").INVOKE();
		code.STORE("pojoClassSample",PojoClass.class);

		code.LINE();
		code.LOAD("pp");
		code.LOAD("pojoClassSample");
		code.VIRTUAL(GenericInterfaceImpl.class, "setT")
			.parameter(PojoClass.class).INVOKE();

		code.LINE();
		code.LOAD("pp");
		code.VIRTUAL(GenericInterfaceImpl.class, "getT")
			.return_(PojoClass.class).INVOKE();
		code.STORE("pojoClassSample2",PojoClass.class);

		code.LINE();
		code.LOAD("pp");
		code.VIRTUAL(GenericInterfaceImpl.class, "getPojoClassChildSample")
			.return_(PojoClassChild.class).INVOKE();
		code.STORE("pojoClassChildSample",PojoClassChild.class);

		code.LINE();
		code.LOAD("pp");
		code.LOAD("pojoClassChildSample");
		code.VIRTUAL(GenericInterfaceImpl.class, "setPojoClassChildSample")
			.parameter(PojoClassChild.class).INVOKE();

		code.LINE();
		code.RETURN();

		code.END();
	}

}