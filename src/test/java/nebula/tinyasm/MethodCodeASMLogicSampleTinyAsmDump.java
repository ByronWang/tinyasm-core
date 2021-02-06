package nebula.tinyasm;
import org.objectweb.asm.Label;
import nebula.tinyasm.ClassBody;
import nebula.tinyasm.ClassBuilder;
import nebula.tinyasm.MethodCode;
public class MethodCodeASMLogicSampleTinyAsmDump {

public static byte[] dump () throws Exception {

ClassBody classWriter = ClassBuilder.make("nebula.tinyasm.MethodCodeASMLogicSample").body();

classWriter.method("<init>").code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(3);
	code.LOAD("this");
	code.SPECIAL(java.lang.Object.class, "<init>").INVOKE();
	code.RETURN();
Label label1 = new Label();
	code.visitLabel(label1);
});
classWriter.method(boolean.class, "eq").parameter("x",byte.class).parameter("y",byte.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(6);
	code.LOAD(1);
	code.LOAD(2);
Label label1 = new Label();
	code.IF_ICMPNE(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "ne").parameter("x",byte.class).parameter("y",byte.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(10);
	code.LOAD(1);
	code.LOAD(2);
Label label1 = new Label();
	code.IF_ICMPEQ(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "ge").parameter("x",byte.class).parameter("y",byte.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(14);
	code.LOAD(1);
	code.LOAD(2);
Label label1 = new Label();
	code.IF_ICMPLT(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "le").parameter("x",byte.class).parameter("y",byte.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(18);
	code.LOAD(1);
	code.LOAD(2);
Label label1 = new Label();
	code.IF_ICMPGT(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "gt").parameter("x",byte.class).parameter("y",byte.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(22);
	code.LOAD(1);
	code.LOAD(2);
Label label1 = new Label();
	code.IF_ICMPLE(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "lt").parameter("x",byte.class).parameter("y",byte.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(26);
	code.LOAD(1);
	code.LOAD(2);
Label label1 = new Label();
	code.IF_ICMPGE(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "eq").parameter("x",char.class).parameter("y",char.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(30);
	code.LOAD(1);
	code.LOAD(2);
Label label1 = new Label();
	code.IF_ICMPNE(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "ne").parameter("x",char.class).parameter("y",char.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(34);
	code.LOAD(1);
	code.LOAD(2);
Label label1 = new Label();
	code.IF_ICMPEQ(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "ge").parameter("x",char.class).parameter("y",char.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(38);
	code.LOAD(1);
	code.LOAD(2);
Label label1 = new Label();
	code.IF_ICMPLT(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "le").parameter("x",char.class).parameter("y",char.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(42);
	code.LOAD(1);
	code.LOAD(2);
Label label1 = new Label();
	code.IF_ICMPGT(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "gt").parameter("x",char.class).parameter("y",char.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(46);
	code.LOAD(1);
	code.LOAD(2);
Label label1 = new Label();
	code.IF_ICMPLE(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "lt").parameter("x",char.class).parameter("y",char.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(50);
	code.LOAD(1);
	code.LOAD(2);
Label label1 = new Label();
	code.IF_ICMPGE(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "eq").parameter("x",short.class).parameter("y",short.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(54);
	code.LOAD(1);
	code.LOAD(2);
Label label1 = new Label();
	code.IF_ICMPNE(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "ne").parameter("x",short.class).parameter("y",short.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(58);
	code.LOAD(1);
	code.LOAD(2);
Label label1 = new Label();
	code.IF_ICMPEQ(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "ge").parameter("x",short.class).parameter("y",short.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(62);
	code.LOAD(1);
	code.LOAD(2);
Label label1 = new Label();
	code.IF_ICMPLT(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "le").parameter("x",short.class).parameter("y",short.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(66);
	code.LOAD(1);
	code.LOAD(2);
Label label1 = new Label();
	code.IF_ICMPGT(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "gt").parameter("x",short.class).parameter("y",short.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(70);
	code.LOAD(1);
	code.LOAD(2);
Label label1 = new Label();
	code.IF_ICMPLE(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "lt").parameter("x",short.class).parameter("y",short.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(74);
	code.LOAD(1);
	code.LOAD(2);
Label label1 = new Label();
	code.IF_ICMPGE(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "eq").parameter("x",int.class).parameter("y",int.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(78);
	code.LOAD(1);
	code.LOAD(2);
Label label1 = new Label();
	code.IF_ICMPNE(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "ne").parameter("x",int.class).parameter("y",int.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(82);
	code.LOAD(1);
	code.LOAD(2);
Label label1 = new Label();
	code.IF_ICMPEQ(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "ge").parameter("x",int.class).parameter("y",int.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(86);
	code.LOAD(1);
	code.LOAD(2);
Label label1 = new Label();
	code.IF_ICMPLT(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "le").parameter("x",int.class).parameter("y",int.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(90);
	code.LOAD(1);
	code.LOAD(2);
Label label1 = new Label();
	code.IF_ICMPGT(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "gt").parameter("x",int.class).parameter("y",int.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(94);
	code.LOAD(1);
	code.LOAD(2);
Label label1 = new Label();
	code.IF_ICMPLE(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "lt").parameter("x",int.class).parameter("y",int.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(98);
	code.LOAD(1);
	code.LOAD(2);
Label label1 = new Label();
	code.IF_ICMPGE(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "eq").parameter("x",long.class).parameter("y",long.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(102);
	code.LOAD(1);
	code.LOAD(3);
	code.LCMP();
Label label1 = new Label();
	code.IFNE(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "ne").parameter("x",long.class).parameter("y",long.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(106);
	code.LOAD(1);
	code.LOAD(3);
	code.LCMP();
Label label1 = new Label();
	code.IFEQ(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "ge").parameter("x",long.class).parameter("y",long.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(110);
	code.LOAD(1);
	code.LOAD(3);
	code.LCMP();
Label label1 = new Label();
	code.IFLT(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "le").parameter("x",long.class).parameter("y",long.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(114);
	code.LOAD(1);
	code.LOAD(3);
	code.LCMP();
Label label1 = new Label();
	code.IFGT(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "gt").parameter("x",long.class).parameter("y",long.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(118);
	code.LOAD(1);
	code.LOAD(3);
	code.LCMP();
Label label1 = new Label();
	code.IFLE(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "lt").parameter("x",long.class).parameter("y",long.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(122);
	code.LOAD(1);
	code.LOAD(3);
	code.LCMP();
Label label1 = new Label();
	code.IFGE(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "eq").parameter("x",float.class).parameter("y",float.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(126);
	code.LOAD(1);
	code.LOAD(2);
	code.CMPL();
Label label1 = new Label();
	code.IFNE(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "ne").parameter("x",float.class).parameter("y",float.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(130);
	code.LOAD(1);
	code.LOAD(2);
	code.CMPL();
Label label1 = new Label();
	code.IFEQ(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "ge").parameter("x",float.class).parameter("y",float.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(134);
	code.LOAD(1);
	code.LOAD(2);
	code.CMPL();
Label label1 = new Label();
	code.IFLT(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "le").parameter("x",float.class).parameter("y",float.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(138);
	code.LOAD(1);
	code.LOAD(2);
	code.CMPG();
Label label1 = new Label();
	code.IFGT(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "gt").parameter("x",float.class).parameter("y",float.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(142);
	code.LOAD(1);
	code.LOAD(2);
	code.CMPL();
Label label1 = new Label();
	code.IFLE(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "lt").parameter("x",float.class).parameter("y",float.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(146);
	code.LOAD(1);
	code.LOAD(2);
	code.CMPG();
Label label1 = new Label();
	code.IFGE(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "eq").parameter("x",double.class).parameter("y",double.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(150);
	code.LOAD(1);
	code.LOAD(3);
	code.CMPL();
Label label1 = new Label();
	code.IFNE(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "ne").parameter("x",double.class).parameter("y",double.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(154);
	code.LOAD(1);
	code.LOAD(3);
	code.CMPL();
Label label1 = new Label();
	code.IFEQ(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "ge").parameter("x",double.class).parameter("y",double.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(158);
	code.LOAD(1);
	code.LOAD(3);
	code.CMPL();
Label label1 = new Label();
	code.IFLT(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "le").parameter("x",double.class).parameter("y",double.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(162);
	code.LOAD(1);
	code.LOAD(3);
	code.CMPG();
Label label1 = new Label();
	code.IFGT(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "gt").parameter("x",double.class).parameter("y",double.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(166);
	code.LOAD(1);
	code.LOAD(3);
	code.CMPL();
Label label1 = new Label();
	code.IFLE(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
classWriter.method(boolean.class, "lt").parameter("x",double.class).parameter("y",double.class).code(code -> {
Label label0 = new Label();
	code.visitLabel(label0);
	code.line(170);
	code.LOAD(1);
	code.LOAD(3);
	code.CMPG();
Label label1 = new Label();
	code.IFGE(label1);
	code.LOADConst(1);
	code.RETURNTop();
	code.visitLabel(label1);
	code.LOADConst(0);
	code.RETURNTop();
Label label2 = new Label();
	code.visitLabel(label2);
});
return classWriter.end().toByteArray();
}
}