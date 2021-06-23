package cn.sj1.tinyasm.core.sample.MethodCode;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import static org.objectweb.asm.Opcodes.*;

import cn.sj1.tinyasm.core.Annotation;
import cn.sj1.tinyasm.core.ClassBody;
import cn.sj1.tinyasm.core.ClassBuilder;
import cn.sj1.tinyasm.core.Clazz;
import cn.sj1.tinyasm.core.MethodCode;

import cn.sj1.tinyasm.core.sample.MethodCode.MethodCodePopSample;

@SuppressWarnings("unused")
public class MethedCodeInvokeSpecialTinyAsmDump {

	public static byte[] dump() throws Exception {
		return new MethedCodeInvokeSpecialTinyAsmDump().build("cn.sj1.tinyasm.core.sample.MethodCode.MethedCodeInvokeSpecial");
	}

	public byte[] build(String className) throws Exception {
		ClassBody classBody = ClassBuilder.class_(className, MethodCodePopSample.class).body();

		__init_(classBody);
		_getAll(classBody);

		return classBody.end().toByteArray();
	}

	protected void __init_(ClassBody classBody) {
		MethodCode code = classBody.public_().method("<init>").begin();

		code.LINE();
		code.LOAD("this");
		code.SPECIAL(MethodCodePopSample.class, "<init>").INVOKE();
		code.RETURN();

		code.END();
	}

	protected void _getAll(ClassBody classBody) {
		MethodCode code = classBody.public_().method("getAll").begin();

		code.LINE();
		code.LOAD("this");
		code.SPECIAL(MethodCodePopSample.class, "returnBoolean")
			.return_(boolean.class).INVOKE();
		code.POP();

		code.LINE();
		code.LOAD("this");
		code.SPECIAL(MethodCodePopSample.class, "returnByte")
			.return_(byte.class).INVOKE();
		code.POP();

		code.LINE();
		code.LOAD("this");
		code.SPECIAL(MethodCodePopSample.class, "returnChar")
			.return_(char.class).INVOKE();
		code.POP();

		code.LINE();
		code.LOAD("this");
		code.SPECIAL(MethodCodePopSample.class, "returnShort")
			.return_(short.class).INVOKE();
		code.POP();

		code.LINE();
		code.LOAD("this");
		code.SPECIAL(MethodCodePopSample.class, "returnInt")
			.return_(int.class).INVOKE();
		code.POP();

		code.LINE();
		code.LOAD("this");
		code.SPECIAL(MethodCodePopSample.class, "returnLong")
			.return_(long.class).INVOKE();
		code.POP();

		code.LINE();
		code.LOAD("this");
		code.SPECIAL(MethodCodePopSample.class, "returnFloat")
			.return_(float.class).INVOKE();
		code.POP();

		code.LINE();
		code.LOAD("this");
		code.SPECIAL(MethodCodePopSample.class, "returnDouble")
			.return_(double.class).INVOKE();
		code.POP();

		code.LINE();
		code.LOAD("this");
		code.SPECIAL(MethodCodePopSample.class, "returnString")
			.return_(String.class).INVOKE();
		code.POP();

		code.LINE();
		code.RETURN();

		code.END();
	}

}
