package cn.sj1.tinyasm.advasmproxy.generic;

import static cn.sj1.tinyasm.Adv.MAGIC_CODES_NUMBER;

import cn.sj1.tinyasm.Adv;
import cn.sj1.tinyasm.AdvContext;
import cn.sj1.tinyasm.AdvRuntimeReferNameObject;
import cn.sj1.tinyasm.Clazz;
import cn.sj1.tinyasm.ConsumerWithException;
import cn.sj1.tinyasm.MethodCode;
import cn.sj1.tinyasm.advasmproxy.simple.PojoClass;
import cn.sj1.tinyasm.advasmproxy.simple.PojoClassChild;

public class GenericInterfaceImplAdvAsmProxy extends GenericInterfaceImpl implements AdvRuntimeReferNameObject {
	private byte _magicNumber;
	private ThreadLocal<AdvContext> _contextThreadLocal;

	@Override
	public byte get__MagicNumber() {
		return this._magicNumber;
	}

	@Override
	public void set__MagicNumber(byte _magicNumber) {
		this._magicNumber = _magicNumber;
	}

	@Override
	public void set__Context(ThreadLocal<AdvContext> _contextThreadLocal, byte _magicNumber) {
		this._contextThreadLocal = _contextThreadLocal;
		this._magicNumber = _magicNumber;
	}
	
	@Override
	public Clazz get__TargetClazz() {
		return Clazz.of(GenericInterfaceImpl.class);
	}

//	code.LINE();
//	code.LOAD("pp");
//	code.VIRTUAL(GenericInterfaceImpl.class, "getT")
//		.return_(PojoClass.class).INVOKE();
//	code.STORE("pojoClassSample2",PojoClass.class);
	@Override
	public PojoClass getT() {
		AdvContext context = _contextThreadLocal.get();
		ConsumerWithException<MethodCode> objEval = context.resolve(this);
		byte codeIndex = context.push(PojoClass.class, c -> {
			objEval.accept(c);
			c.VIRTUAL(GenericInterfaceImpl.class, "getT").return_(PojoClass.class).INVOKE();
		});

		byte magicNumber = (byte) (MAGIC_CODES_NUMBER + codeIndex);

		if (Adv.canProxy(PojoClass.class)) {
			return Adv.buildProxyClass(PojoClass.class, magicNumber);
		} else {
			return null;
		}
	}

	@Override
	public PojoClassChild getPojoClassChildSample() {
		AdvContext context = _contextThreadLocal.get();
		ConsumerWithException<MethodCode> objEval = context.resolve(this);
		byte codeIndex = context.push(PojoClassChild.class, c -> {
			objEval.accept(c);
			c.VIRTUAL(GenericInterfaceImpl.class, "getPojoClassChildSample").return_(PojoClassChild.class).INVOKE();
		});

		byte magicNumber = (byte) (MAGIC_CODES_NUMBER + codeIndex);

		if (Adv.canProxy(PojoClassChild.class)) {
			return Adv.buildProxyClass(PojoClassChild.class, magicNumber);
		} else {
			return null;
		}
	}

//	code.LINE();
//	code.LOAD("pp");
//	code.LOAD("pojoClassSample");
//	code.VIRTUAL(GenericInterfaceImpl.class, "setT")
//		.parameter(PojoClass.class).INVOKE();
	@Override
	public void setT(PojoClass param0) {
		AdvContext context = _contextThreadLocal.get();
		ConsumerWithException<MethodCode> eval_param0 = context.resolve(param0);
		ConsumerWithException<MethodCode> objEval = context.resolve(this);
		context.execLine(c -> {
			objEval.accept(c);
			eval_param0.accept(c);
			c.VIRTUAL(GenericInterfaceImpl.class, "setT").parameter(PojoClass.class).INVOKE();
		});
	}

	@Override
	public void setPojoClassChildSample(PojoClassChild param0) {
		AdvContext context = _contextThreadLocal.get();
		ConsumerWithException<MethodCode> eval_param0 = context.resolve(param0);
		ConsumerWithException<MethodCode> objEval = context.resolve(this);
		context.execLine(c -> {
			objEval.accept(c);
			eval_param0.accept(c);
			c.VIRTUAL(GenericInterfaceImpl.class, "setPojoClassChildSample").parameter(PojoClassChild.class).INVOKE();
		});

	}

}