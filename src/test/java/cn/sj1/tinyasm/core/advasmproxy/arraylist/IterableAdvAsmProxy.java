package cn.sj1.tinyasm.core.advasmproxy.arraylist;

import static cn.sj1.tinyasm.core.Adv.MAGIC_CODES_NUMBER;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

import cn.sj1.tinyasm.core.Adv;
import cn.sj1.tinyasm.core.AdvContext;
import cn.sj1.tinyasm.core.AdvRuntimeReferNameObject;
import cn.sj1.tinyasm.core.Clazz;
import cn.sj1.tinyasm.core.ConsumerWithException;
import cn.sj1.tinyasm.core.MethodCode;
import cn.sj1.tinyasm.core.advasmproxy.simple.PojoClass;

public class IterableAdvAsmProxy implements Iterable<PojoClass>, AdvRuntimeReferNameObject {
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
		return Clazz.of(Iterable.class);
	}
	
	@Override
	public Iterator<PojoClass> iterator() {
		AdvContext context = _contextThreadLocal.get();
		ConsumerWithException<MethodCode> objEval = context.resolve(this);
		byte codeIndex = context.push(Iterator.class, c -> {
			objEval.accept(c);
			c.INTERFACE(Iterable.class, "iterator").return_(Iterator.class).INVOKE();
		});
		

		byte magicNumber = (byte) (MAGIC_CODES_NUMBER + codeIndex);

		if (Adv.canProxy(Iterator.class)) {
			return Adv.buildProxyClass(Iterator.class, PojoClass.class, magicNumber);
		} else {
			return null;
		}
	}

	@Override
	public void forEach(Consumer<? super PojoClass> param0) {
		AdvContext context = _contextThreadLocal.get();
		ConsumerWithException<MethodCode> eval_param0 = context.resolve(param0);
		ConsumerWithException<MethodCode> objEval = context.resolve(this);
		context.execLine(c -> {
			objEval.accept(c);
			eval_param0.accept(c);
			c.INTERFACE(Iterable.class, "forEach").parameter(Consumer.class).INVOKE();
		});
	}

	@Override
	public Spliterator<PojoClass> spliterator() {
		AdvContext context = _contextThreadLocal.get();
		ConsumerWithException<MethodCode> objEval = context.resolve(this);
		byte codeIndex = context.push(Spliterator.class, c -> {
			objEval.accept(c);
			c.INTERFACE(Iterable.class, "spliterator").return_(Spliterator.class).INVOKE();
		});

		byte magicNumber = (byte) (MAGIC_CODES_NUMBER + codeIndex);

		if (Adv.canProxy(Spliterator.class)) {
			return Adv.buildProxyClass(Spliterator.class, PojoClass.class, magicNumber);
		} else {
			return null;
		}
	}

}