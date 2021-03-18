package cn.sj1.tinyasm.core.advasmproxy.simple;
import org.objectweb.asm.Label;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Opcodes;
import cn.sj1.tinyasm.core.ClassBody;
import cn.sj1.tinyasm.core.ClassBuilder;
import cn.sj1.tinyasm.core.MethodCode;
import org.objectweb.asm.Type;
import static org.objectweb.asm.Opcodes.*;
import cn.sj1.tinyasm.core.Annotation;
import cn.sj1.tinyasm.core.Clazz;
import cn.sj1.tinyasm.core.ConsumerWithException;
import java.lang.ThreadLocal;
import cn.sj1.tinyasm.core.MethodCode;
import cn.sj1.tinyasm.core.advasmproxy.simple.SimplePojoClassUsingSampleMagicBuilder;
import java.lang.Object;
import cn.sj1.tinyasm.core.AdvContext;
import java.lang.String;
import cn.sj1.tinyasm.core.AdvMagicRuntime;
import cn.sj1.tinyasm.core.MethodCaller;
import java.lang.Exception;
import cn.sj1.tinyasm.core.Clazz;
@SuppressWarnings("unused")
public class SimplePojoClassSampleUsingSampleMagicBuilderAdvAsmProxyTinyAsmDump {

	public static byte[] dump () throws Exception {
		return new SimplePojoClassSampleUsingSampleMagicBuilderAdvAsmProxyTinyAsmDump().dump("cn.sj1.tinyasm.core.advasmproxy.simple.SimplePojoClassSampleUsingSampleMagicBuilderAdvAsmProxy");
	}

	public byte[] dump(String className) throws Exception {
		ClassBody classBody = ClassBuilder.class_(className, SimplePojoClassUsingSampleMagicBuilder.class, AdvMagicRuntime.class)
			.access(ACC_PUBLIC | ACC_SUPER).body();

classBody.referInnerClass(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "java.lang.invoke.MethodHandles", "Lookup");

		classBody.private_().field("_magicNumber", Clazz.of(byte.class));
		classBody.private_().field("_contextThreadLocal",Clazz.of(ThreadLocal.class,Clazz.of(AdvContext.class)));
		classBody.private_().field("_targetClazz", Clazz.of(Clazz.class));
		__init_(classBody);
		_get__MagicNumber(classBody);
		_set__MagicNumber(classBody);
		_set__Context(classBody);
		_set__TargetClazz(classBody);
		_get__TargetClazz(classBody);
		_sayHello(classBody);
		_$_sayHello(classBody);
		_lambda$sayHello$0(classBody);

		return classBody.end().toByteArray();
	}

	protected void __init_(ClassBody classBody) {
		MethodCode code = classBody.public_().method("<init>").begin();

		code.LINE();
		code.LOAD("this");
		code.SPECIAL(SimplePojoClassUsingSampleMagicBuilder.class, "<init>").INVOKE();
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

	protected void _set__TargetClazz(ClassBody classBody) {
		MethodCode code = classBody.public_().method("set__TargetClazz")
			.parameter("_targetClazz",Clazz.class).begin();

		code.LINE();
		code.LOAD("this");
		code.LOAD("_targetClazz");
		code.PUTFIELD_OF_THIS("_targetClazz");

		code.LINE();
		code.RETURN();

		code.END();
	}

	protected void _get__TargetClazz(ClassBody classBody) {
		MethodCode code = classBody.public_().method("get__TargetClazz")
			.return_(Clazz.class ).begin();

		code.LINE();
		code.LOAD("this");
		code.GETFIELD_OF_THIS("_targetClazz");
		code.RETURNTop();

		code.END();
	}

	protected void _sayHello(ClassBody classBody) {
		MethodCode code = classBody.public_().method("sayHello").begin();

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
		code.LOAD("this");
		code.LOAD("objEval");
		code.visitInvokeDynamicInsn("accept", "(Lcn/sj1/tinyasm/core/advasmproxy/simple/SimplePojoClassSampleUsingSampleMagicBuilderAdvAsmProxy;Lcn/sj1/tinyasm/core/ConsumerWithException;)Lcn/sj1/tinyasm/core/ConsumerWithException;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESPECIAL, "cn/sj1/tinyasm/core/advasmproxy/simple/SimplePojoClassSampleUsingSampleMagicBuilderAdvAsmProxy", "lambda$sayHello$0", "(Lcn/sj1/tinyasm/core/ConsumerWithException;Lcn/sj1/tinyasm/core/MethodCode;)V", false), Type.getType("(Lcn/sj1/tinyasm/core/MethodCode;)V")});
		code.VIRTUAL(AdvContext.class, "execLine")
			.parameter(ConsumerWithException.class).INVOKE();

		code.LINE();
		code.RETURN();

		code.END();
	}

	protected void _$_sayHello(ClassBody classBody) {
		MethodCode code = classBody.public_().method("$_sayHello").begin();

		code.LINE();
		code.LOAD("this");
		code.SPECIAL(SimplePojoClassUsingSampleMagicBuilder.class, "sayHello").INVOKE();

		code.LINE();
		code.RETURN();

		code.END();
	}

	protected void _lambda$sayHello$0(ClassBody classBody) {
		MethodCode code = classBody.method(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$sayHello$0")
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
		code.LOAD("this");
		code.GETFIELD_OF_THIS("_targetClazz");
		code.LOADConst("sayHello");
		code.VIRTUAL(MethodCode.class, "VIRTUAL")
			.return_(MethodCaller.class)
			.parameter(Clazz.class)
			.parameter(String.class).INVOKE();
		code.INTERFACE(MethodCaller.class, "INVOKE").INVOKE();

		code.LINE();
		code.RETURN();

		code.END();
	}

}