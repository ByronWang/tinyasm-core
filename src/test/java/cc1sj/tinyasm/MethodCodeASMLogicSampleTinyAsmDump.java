package cc1sj.tinyasm;
import org.objectweb.asm.Label;
import cc1sj.tinyasm.ClassBody;
import cc1sj.tinyasm.ClassBuilder;
import cc1sj.tinyasm.MethodCode;
import org.objectweb.asm.Type;
import static org.objectweb.asm.Opcodes.*;
import cc1sj.tinyasm.Annotation;
import cc1sj.tinyasm.Clazz;
import java.lang.Object;
@SuppressWarnings("unused")
public class MethodCodeASMLogicSampleTinyAsmDump {

public static byte[] dump () throws Exception {

ClassBody classBody = ClassBuilder.make("cc1sj.tinyasm.MethodCodeASMLogicSample").access(ACC_PUBLIC | ACC_SUPER).body();

{
	MethodCode code = classBody.method("<init>").begin();

	code.LINE(3);
	code.LOAD("this");
	code.SPECIAL(Object.class, "<init>").INVOKE();
	code.RETURN();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "eq")
	.parameter("x",byte.class)
	.parameter("y",byte.class).begin();

	code.LINE(6);
	code.LOAD("x");
	code.LOAD("y");
	Label label1OfIF_ICMPNE = new Label();
	code.IF_ICMPNE(label1OfIF_ICMPNE);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIF_ICMPNE);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "ne")
	.parameter("x",byte.class)
	.parameter("y",byte.class).begin();

	code.LINE(10);
	code.LOAD("x");
	code.LOAD("y");
	Label label1OfIF_ICMPEQ = new Label();
	code.IF_ICMPEQ(label1OfIF_ICMPEQ);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIF_ICMPEQ);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "ge")
	.parameter("x",byte.class)
	.parameter("y",byte.class).begin();

	code.LINE(14);
	code.LOAD("x");
	code.LOAD("y");
	Label label1OfIF_ICMPLT = new Label();
	code.IF_ICMPLT(label1OfIF_ICMPLT);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIF_ICMPLT);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "le")
	.parameter("x",byte.class)
	.parameter("y",byte.class).begin();

	code.LINE(18);
	code.LOAD("x");
	code.LOAD("y");
	Label label1OfIF_ICMPGT = new Label();
	code.IF_ICMPGT(label1OfIF_ICMPGT);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIF_ICMPGT);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "gt")
	.parameter("x",byte.class)
	.parameter("y",byte.class).begin();

	code.LINE(22);
	code.LOAD("x");
	code.LOAD("y");
	Label label1OfIF_ICMPLE = new Label();
	code.IF_ICMPLE(label1OfIF_ICMPLE);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIF_ICMPLE);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "lt")
	.parameter("x",byte.class)
	.parameter("y",byte.class).begin();

	code.LINE(26);
	code.LOAD("x");
	code.LOAD("y");
	Label label1OfIF_ICMPGE = new Label();
	code.IF_ICMPGE(label1OfIF_ICMPGE);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIF_ICMPGE);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "eq")
	.parameter("x",char.class)
	.parameter("y",char.class).begin();

	code.LINE(30);
	code.LOAD("x");
	code.LOAD("y");
	Label label1OfIF_ICMPNE = new Label();
	code.IF_ICMPNE(label1OfIF_ICMPNE);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIF_ICMPNE);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "ne")
	.parameter("x",char.class)
	.parameter("y",char.class).begin();

	code.LINE(34);
	code.LOAD("x");
	code.LOAD("y");
	Label label1OfIF_ICMPEQ = new Label();
	code.IF_ICMPEQ(label1OfIF_ICMPEQ);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIF_ICMPEQ);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "ge")
	.parameter("x",char.class)
	.parameter("y",char.class).begin();

	code.LINE(38);
	code.LOAD("x");
	code.LOAD("y");
	Label label1OfIF_ICMPLT = new Label();
	code.IF_ICMPLT(label1OfIF_ICMPLT);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIF_ICMPLT);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "le")
	.parameter("x",char.class)
	.parameter("y",char.class).begin();

	code.LINE(42);
	code.LOAD("x");
	code.LOAD("y");
	Label label1OfIF_ICMPGT = new Label();
	code.IF_ICMPGT(label1OfIF_ICMPGT);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIF_ICMPGT);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "gt")
	.parameter("x",char.class)
	.parameter("y",char.class).begin();

	code.LINE(46);
	code.LOAD("x");
	code.LOAD("y");
	Label label1OfIF_ICMPLE = new Label();
	code.IF_ICMPLE(label1OfIF_ICMPLE);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIF_ICMPLE);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "lt")
	.parameter("x",char.class)
	.parameter("y",char.class).begin();

	code.LINE(50);
	code.LOAD("x");
	code.LOAD("y");
	Label label1OfIF_ICMPGE = new Label();
	code.IF_ICMPGE(label1OfIF_ICMPGE);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIF_ICMPGE);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "eq")
	.parameter("x",short.class)
	.parameter("y",short.class).begin();

	code.LINE(54);
	code.LOAD("x");
	code.LOAD("y");
	Label label1OfIF_ICMPNE = new Label();
	code.IF_ICMPNE(label1OfIF_ICMPNE);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIF_ICMPNE);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "ne")
	.parameter("x",short.class)
	.parameter("y",short.class).begin();

	code.LINE(58);
	code.LOAD("x");
	code.LOAD("y");
	Label label1OfIF_ICMPEQ = new Label();
	code.IF_ICMPEQ(label1OfIF_ICMPEQ);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIF_ICMPEQ);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "ge")
	.parameter("x",short.class)
	.parameter("y",short.class).begin();

	code.LINE(62);
	code.LOAD("x");
	code.LOAD("y");
	Label label1OfIF_ICMPLT = new Label();
	code.IF_ICMPLT(label1OfIF_ICMPLT);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIF_ICMPLT);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "le")
	.parameter("x",short.class)
	.parameter("y",short.class).begin();

	code.LINE(66);
	code.LOAD("x");
	code.LOAD("y");
	Label label1OfIF_ICMPGT = new Label();
	code.IF_ICMPGT(label1OfIF_ICMPGT);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIF_ICMPGT);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "gt")
	.parameter("x",short.class)
	.parameter("y",short.class).begin();

	code.LINE(70);
	code.LOAD("x");
	code.LOAD("y");
	Label label1OfIF_ICMPLE = new Label();
	code.IF_ICMPLE(label1OfIF_ICMPLE);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIF_ICMPLE);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "lt")
	.parameter("x",short.class)
	.parameter("y",short.class).begin();

	code.LINE(74);
	code.LOAD("x");
	code.LOAD("y");
	Label label1OfIF_ICMPGE = new Label();
	code.IF_ICMPGE(label1OfIF_ICMPGE);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIF_ICMPGE);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "eq")
	.parameter("x",int.class)
	.parameter("y",int.class).begin();

	code.LINE(78);
	code.LOAD("x");
	code.LOAD("y");
	Label label1OfIF_ICMPNE = new Label();
	code.IF_ICMPNE(label1OfIF_ICMPNE);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIF_ICMPNE);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "ne")
	.parameter("x",int.class)
	.parameter("y",int.class).begin();

	code.LINE(82);
	code.LOAD("x");
	code.LOAD("y");
	Label label1OfIF_ICMPEQ = new Label();
	code.IF_ICMPEQ(label1OfIF_ICMPEQ);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIF_ICMPEQ);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "ge")
	.parameter("x",int.class)
	.parameter("y",int.class).begin();

	code.LINE(86);
	code.LOAD("x");
	code.LOAD("y");
	Label label1OfIF_ICMPLT = new Label();
	code.IF_ICMPLT(label1OfIF_ICMPLT);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIF_ICMPLT);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "le")
	.parameter("x",int.class)
	.parameter("y",int.class).begin();

	code.LINE(90);
	code.LOAD("x");
	code.LOAD("y");
	Label label1OfIF_ICMPGT = new Label();
	code.IF_ICMPGT(label1OfIF_ICMPGT);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIF_ICMPGT);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "gt")
	.parameter("x",int.class)
	.parameter("y",int.class).begin();

	code.LINE(94);
	code.LOAD("x");
	code.LOAD("y");
	Label label1OfIF_ICMPLE = new Label();
	code.IF_ICMPLE(label1OfIF_ICMPLE);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIF_ICMPLE);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "lt")
	.parameter("x",int.class)
	.parameter("y",int.class).begin();

	code.LINE(98);
	code.LOAD("x");
	code.LOAD("y");
	Label label1OfIF_ICMPGE = new Label();
	code.IF_ICMPGE(label1OfIF_ICMPGE);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIF_ICMPGE);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "eq")
	.parameter("x",long.class)
	.parameter("y",long.class).begin();

	code.LINE(102);
	code.LOAD("x");
	code.LOAD("y");
	code.LCMP();
	Label label1OfIFNE = new Label();
	code.IFNE(label1OfIFNE);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIFNE);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "ne")
	.parameter("x",long.class)
	.parameter("y",long.class).begin();

	code.LINE(106);
	code.LOAD("x");
	code.LOAD("y");
	code.LCMP();
	Label label1OfIFEQ = new Label();
	code.IFEQ(label1OfIFEQ);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIFEQ);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "ge")
	.parameter("x",long.class)
	.parameter("y",long.class).begin();

	code.LINE(110);
	code.LOAD("x");
	code.LOAD("y");
	code.LCMP();
	Label label1OfIFLT = new Label();
	code.IFLT(label1OfIFLT);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIFLT);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "le")
	.parameter("x",long.class)
	.parameter("y",long.class).begin();

	code.LINE(114);
	code.LOAD("x");
	code.LOAD("y");
	code.LCMP();
	Label label1OfIFGT = new Label();
	code.IFGT(label1OfIFGT);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIFGT);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "gt")
	.parameter("x",long.class)
	.parameter("y",long.class).begin();

	code.LINE(118);
	code.LOAD("x");
	code.LOAD("y");
	code.LCMP();
	Label label1OfIFLE = new Label();
	code.IFLE(label1OfIFLE);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIFLE);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "lt")
	.parameter("x",long.class)
	.parameter("y",long.class).begin();

	code.LINE(122);
	code.LOAD("x");
	code.LOAD("y");
	code.LCMP();
	Label label1OfIFGE = new Label();
	code.IFGE(label1OfIFGE);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIFGE);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "eq")
	.parameter("x",float.class)
	.parameter("y",float.class).begin();

	code.LINE(126);
	code.LOAD("x");
	code.LOAD("y");
	code.CMPL();
	Label label1OfIFNE = new Label();
	code.IFNE(label1OfIFNE);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIFNE);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "ne")
	.parameter("x",float.class)
	.parameter("y",float.class).begin();

	code.LINE(130);
	code.LOAD("x");
	code.LOAD("y");
	code.CMPL();
	Label label1OfIFEQ = new Label();
	code.IFEQ(label1OfIFEQ);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIFEQ);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "ge")
	.parameter("x",float.class)
	.parameter("y",float.class).begin();

	code.LINE(134);
	code.LOAD("x");
	code.LOAD("y");
	code.CMPL();
	Label label1OfIFLT = new Label();
	code.IFLT(label1OfIFLT);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIFLT);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "le")
	.parameter("x",float.class)
	.parameter("y",float.class).begin();

	code.LINE(138);
	code.LOAD("x");
	code.LOAD("y");
	code.CMPG();
	Label label1OfIFGT = new Label();
	code.IFGT(label1OfIFGT);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIFGT);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "gt")
	.parameter("x",float.class)
	.parameter("y",float.class).begin();

	code.LINE(142);
	code.LOAD("x");
	code.LOAD("y");
	code.CMPL();
	Label label1OfIFLE = new Label();
	code.IFLE(label1OfIFLE);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIFLE);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "lt")
	.parameter("x",float.class)
	.parameter("y",float.class).begin();

	code.LINE(146);
	code.LOAD("x");
	code.LOAD("y");
	code.CMPG();
	Label label1OfIFGE = new Label();
	code.IFGE(label1OfIFGE);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIFGE);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "eq")
	.parameter("x",double.class)
	.parameter("y",double.class).begin();

	code.LINE(150);
	code.LOAD("x");
	code.LOAD("y");
	code.CMPL();
	Label label1OfIFNE = new Label();
	code.IFNE(label1OfIFNE);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIFNE);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "ne")
	.parameter("x",double.class)
	.parameter("y",double.class).begin();

	code.LINE(154);
	code.LOAD("x");
	code.LOAD("y");
	code.CMPL();
	Label label1OfIFEQ = new Label();
	code.IFEQ(label1OfIFEQ);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIFEQ);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "ge")
	.parameter("x",double.class)
	.parameter("y",double.class).begin();

	code.LINE(158);
	code.LOAD("x");
	code.LOAD("y");
	code.CMPL();
	Label label1OfIFLT = new Label();
	code.IFLT(label1OfIFLT);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIFLT);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "le")
	.parameter("x",double.class)
	.parameter("y",double.class).begin();

	code.LINE(162);
	code.LOAD("x");
	code.LOAD("y");
	code.CMPG();
	Label label1OfIFGT = new Label();
	code.IFGT(label1OfIFGT);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIFGT);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "gt")
	.parameter("x",double.class)
	.parameter("y",double.class).begin();

	code.LINE(166);
	code.LOAD("x");
	code.LOAD("y");
	code.CMPL();
	Label label1OfIFLE = new Label();
	code.IFLE(label1OfIFLE);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIFLE);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

{
	MethodCode code = classBody.method(boolean.class, "lt")
	.parameter("x",double.class)
	.parameter("y",double.class).begin();

	code.LINE(170);
	code.LOAD("x");
	code.LOAD("y");
	code.CMPG();
	Label label1OfIFGE = new Label();
	code.IFGE(label1OfIFGE);
	code.LOADConst(1);
	code.RETURNTop();

	code.visitLabel(label1OfIFGE);
	code.LOADConst(0);
	code.RETURNTop();
	code.END();
}

return classBody.end().toByteArray();
}
}