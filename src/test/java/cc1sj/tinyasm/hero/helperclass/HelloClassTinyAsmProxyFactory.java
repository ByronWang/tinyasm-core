package cc1sj.tinyasm.hero.helperclass;

import cc1sj.tinyasm.MethodCode;
import cc1sj.tinyasm.hero.TinyAsmProxyRuntimeProxyFactory;

public class HelloClassTinyAsmProxyFactory implements TinyAsmProxyRuntimeProxyFactory {
	@Override
	public Object build(MethodCode code, String __referName) {
		return new HelloClassTinyAsmProxy(code, __referName);
	}

}
