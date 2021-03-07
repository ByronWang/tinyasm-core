package cc1sj.tinyasm.hero.advasmproxy;
import org.objectweb.asm.Label;
import cc1sj.tinyasm.ClassBody;
import cc1sj.tinyasm.ClassBuilder;
import cc1sj.tinyasm.MethodCode;

import org.objectweb.asm.Type;
import static org.objectweb.asm.Opcodes.*;
import cc1sj.tinyasm.Annotation;
import cc1sj.tinyasm.Clazz;

import java.lang.Short;
import java.lang.Object;
import java.lang.String;
@SuppressWarnings("unused")
public class ContactHelloTinyAsmDump {

	public static byte[] dump () throws Exception {
		return new ContactHelloTinyAsmDump().dump("cc1sj.tinyasm.hero.helperclass.ContactHello");
	}

	public byte[] dump(String className) throws Exception {
		ClassBody classBody = ClassBuilder.make(className)
			.access(ACC_PUBLIC | ACC_SUPER).body();

		__init_(classBody);
		_say(classBody);

		return classBody.end().toByteArray();
	}

	protected void __init_(ClassBody classBody) {
		MethodCode code = classBody.publicMethod("<init>").begin();

		code.LINE();
		code.LOAD("this");
		code.SPECIAL(Object.class, "<init>").INVOKE();
		code.RETURN();

		code.END();
	}

	protected void _say(ClassBody classBody) {
		MethodCode code = classBody.publicMethod("say").begin();

		code.LINE();
		code.NEW(PojoSample.class);
		code.DUP();
		code.SPECIAL(PojoSample.class, "<init>").INVOKE();
		code.STORE("hello",PojoSample.class);

		code.LINE();
		code.LOAD("hello");
		code.LOADConst("wangshilian");
		code.VIRTUAL(PojoSample.class, "setName")
			.parameter(String.class).INVOKE();

		code.LINE();
		code.LOAD("hello");
		code.VIRTUAL(PojoSample.class, "getName")
			.reTurn(String.class).INVOKE();
		code.STORE("name",String.class);

		code.LINE();
		code.LOAD("hello");
		code.LOAD("name");
		code.VIRTUAL(PojoSample.class, "setName")
			.parameter(String.class).INVOKE();

		code.LINE();
		code.LOAD("hello");
		code.LOADConst(10);
		code.VIRTUAL(PojoSample.class, "setAgeShort")
			.parameter(short.class).INVOKE();

		code.LINE();
		code.LOAD("hello");
		code.VIRTUAL(PojoSample.class, "getAgeShort")
			.reTurn(short.class).INVOKE();
		code.STORE("age",short.class);

		code.LINE();
		code.LOAD("hello");
		code.LOAD("age");
		code.VIRTUAL(PojoSample.class, "setAgeShort")
			.parameter(short.class).INVOKE();

		code.LINE();
		code.LOAD("age");
		code.LOADConst(10);
		code.ADD();
		code.CONVERTTO(short.class);
		code.STORE("age2",short.class);

		code.LINE();
		code.LOAD("hello");
		code.LOAD("age2");
		code.VIRTUAL(PojoSample.class, "setAgeShort")
			.parameter(short.class).INVOKE();

		code.LINE();
		code.LOAD("hello");
		code.LOADConst(10);
		code.STATIC(Short.class, "valueOf")
			.reTurn(Short.class)
			.parameter(short.class).INVOKE();
		code.VIRTUAL(PojoSample.class, "setAgeShort2")
			.parameter(Short.class).INVOKE();

		code.LINE();
		code.LOAD("hello");
		code.VIRTUAL(PojoSample.class, "getAgeShort2")
			.reTurn(Short.class).INVOKE();
		code.STORE("ageShort2",Short.class);

		code.LINE();
		code.LOAD("hello");
		code.LOAD("ageShort2");
		code.VIRTUAL(PojoSample.class, "setAgeShort2")
			.parameter(Short.class).INVOKE();

		code.LINE();
		code.RETURN();

		code.END();
	}

}