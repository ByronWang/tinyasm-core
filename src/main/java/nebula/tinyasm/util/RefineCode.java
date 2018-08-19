package nebula.tinyasm.util;

public class RefineCode {

	public static String excludeLineNumber(String input) {
		input = input.replaceAll("mv.visitParameter[^\\n]*;\\n", "");
		input = input.replaceAll("mv.visitLocalVariable[^\\n]*;\\n", "");
		input = input.replaceAll("LineNumber\\([0-9]*\\,", "LineNumber(1,");

		input = input.replaceAll("Label l1 = new Label\\(\\)[^\\n]*;\\n", "");
		input = input.replaceAll("mv.visitLabel\\(l1\\)[^\\n]*;\\n", "");
		
		
		input = input.replaceAll("mv.visitMaxs[^\\n]*;\\n", "");
		
		
		return input;
	}

	public static String skipToString(String input) {
		input = input.replaceAll("\\n", "<br/>");
		input = input.replaceAll("(\\{<br/>mv = cw.visitMethod\\()", "\n<method>$1");
		input = input.replaceAll("(mv.visitEnd\\(\\);<br/>})", "$1</method>\n");

		input = input.replaceAll("(<method>\\{<br/>mv = cw.visitMethod\\(ACC_PUBLIC, \"toString\",[^\\n]*)", "");

		input = input.replaceAll("\\n<method>", "");
		input = input.replaceAll("</method>\\n", "");
		input = input.replaceAll("<br/>", "\n");
		return input;
	}

	public static String refineCode(String input) {

		// match by line
		input = input.replaceAll("Label (l\\d*) = new Label\\(\\);\\s*\\n", "Label $1 = mv.codeNewLabel();");
		input = input.replaceAll("mv.visitLabel\\((l\\d*)\\);", "mv.codeAccessLabel\\($1\\);");
		input = input.replaceAll("mv.visitLineNumber\\(\\d, \\w\\d\\);\\s*\\n", "");

		input = input.replaceAll("mv.visitInsn\\(LCMP\\);", "mv.CMP();");
		input = input.replaceAll("mv.visitInsn\\((?:D|F)CMPG\\);", "mv.CMPG();");
		input = input.replaceAll("mv.visitInsn\\((?:D|F)CMPL\\);", "mv.CMPL();");

		input = input.replaceAll("mv.visitInsn\\(\\wRETURN\\);", "mv.RETURNTop();");
		input = input.replaceAll("mv.visitVarInsn\\(\\wLOAD, (\\d*)\\);", "mv.LOAD($1);");
		input = input.replaceAll("mv.visitInsn\\(\\wALOAD\\);", "mv.ARRAYLOAD();");
		input = input.replaceAll("mv.visitInsn\\(\\wASTORE\\);", "mv.ARRAYSTORE();");
		input = input.replaceAll("mv.visitFieldInsn\\(GETFIELD, \"[^\"]*\", (\"[^\"]*\")[^\\n]*;\\n",
				"mv.GETFIELD($1);");
		input = input.replaceAll("mv.visitFieldInsn\\(PUTFIELD, \"[^\"]*\", (\"[^\"]*\")[^\\n]*;\\n",
				"mv.PUTFIELD($1);");

		input = input.replaceAll("mv.visitLdcInsn(\\([^;]*)[^\\n]*;\\n", "mv.LOADConst$1;");

		input = input.replaceAll("mv.visitJumpInsn\\((\\w+), (l\\d+)\\);", "mv.$1($2);");

		input = input.replaceAll("mv.visitLocalVariable\\(\"([\\d\\w]*)\", \"(\\w+)\"[^;]+;",
				"<def>mv.define(\"$1\",\"$2\"\\);</def>");
		input = input.replaceAll("mv.visitLocalVariable\\(\\\"this\\\"[^\\n]*\\n", "");
		input = input.replaceAll("mv.visitFrame[^;]*;\\s*\\n", "");
		input = input.replaceAll("mv.visitMaxs[^;]*;\\s*\\n", "");
		input = input.replaceAll("mv.visitInsn\\(ICONST_(\\d)\\);", "mv.LOADConst($1);");
		

		input = input.replaceAll("mv.visitTypeInsn\\(CHECKCAST,", "mv.CHECKCAST(");
		input = input.replaceAll("mv.visitMethodInsn\\(INVOKE(\\w*),([^,]*),([^,]*),([^,]*), \\w*\\);", "mv.$1\\($2,$3/*$4*/);");

		input = input.replaceAll("mv.visitInsn\\(DUP\\);", "mv.DUP();");
		input = input.replaceAll("mv.visitTypeInsn\\(NEW, ([^\\)]*)\\);", "mv.NEW($1);");

		
		// match by method
		input = input.replaceAll("\\n", "");
		input = input.replaceAll("\\{(mv = cw.visitMethod\\()", "\n<method>$1");
		input = input.replaceAll("(mv.visitCode\\(\\);)", "<code>");
		input = input.replaceAll("(mv.visitEnd\\(\\);})", "</code></method>\n");

		input = input.replaceAll(";(<def>.*)(?:;</def></code>)", ";<defs>$1;</def></defs></code>");
		input = input.replaceAll("#def#", ";");

		input = input.replaceAll("(<code>)(.*)(<defs>.*</defs>)", "$1$3$2");
		
		input = input.replaceAll("</?def>", "");
		input = input.replaceAll("<defs>(.*)</defs>", "$1");

		input = input.replaceAll("mv = cw.visitMethod\\(([^\\n]*);", "cw.method($1");
		input = input.replaceAll("<method>(.*)</method>", "$1");
		input = input.replaceAll("<code>(.*)</code>", ".code(mv -> {\n\t$1});");

		// reformater by line
		input = input.replaceAll("\\);", ");\n");

		input = input.replaceAll("mv = cw.visitMethod\\(([^,],), (\"[^\"]*\"), \"\\(([^\\)]*)\\)([^\"]*)\",[^;]*;",
				"\tcw.method($1, $2)/*$4 $3*/");

		input = input.replaceAll("(?:\\})?\\{fv = cw.visitField\\(([^,],), \"([^\"]*)\", \"([^\"]*)\",[^;]*;",
				"cw.field($1, \"$2\", \"$3\");");
		input = input.replaceAll("fv.visitEnd\\(\\);", "");
		
		input = input.replaceAll("/\\* \"\\(\\)V\" \\*/", "");
		return input;
	}
}
