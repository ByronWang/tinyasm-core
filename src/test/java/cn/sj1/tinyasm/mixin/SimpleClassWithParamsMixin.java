package cn.sj1.tinyasm.mixin;

public class SimpleClassWithParamsMixin extends SimpleClass {
	@Override
	public String getName(String name) {
		name = new StringBuffer(name).append("++").toString();
		return name;
	}
}
