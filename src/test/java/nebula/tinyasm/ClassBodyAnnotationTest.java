package nebula.tinyasm;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.objectweb.asm.Label;

import nebula.tinyasm.data.Annotation;
import nebula.tinyasm.data.ClassBody;
import nebula.tinyasm.sample.ClassBody.ParameterAnnotationSample;
import nebula.tinyasm.sample.ClassBody.TestAnnotation;

public class ClassBodyAnnotationTest extends TestBase {

	String clazz = ParameterAnnotationSample.class.getName();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMath() throws Exception {
		ClassBody cw = ClassBuilder.make(clazz)
			.annotation(TestAnnotation.class, new String[] { "name", "secondName" },
					new Object[] { "name", "secondName" })
			.body();

		cw.field(TestAnnotation.class, "annotation", String.class);
		cw.field(Annotation.annotation(TestAnnotation.class, "value"), "annotationWithDefaultValue", String.class);
		cw.field(Annotation.annotation(TestAnnotation.class, new String[] { "value", "name" },
				new Object[] { "value", "name" }), "annotationWithDefaultValueAndNamedValue", String.class);
		cw.field(
				Annotation.annotation(TestAnnotation.class, new String[] { "name", "secondName" },
						new Object[] { "name", "secondName" }),
				"annotationWithDefaultValueAndNamedValue2", String.class);

		cw.constructerEmpty();

//		Opcodes.NULL
		cw.privateMethod(String.class, "annotationMethod").annotation(TestAnnotation.class).code(mv -> {
			mv.line();

			mv.LOADConstNULL();
			mv.RETURNTop();
			Label l1 = mv.codeNewLabel();
			mv.visitLabel(l1);
		});

		cw.privateMethod(String.class, "annotationWithDefaultValue")
			.annotation(TestAnnotation.class, "value")
			.code(mv -> {
				mv.line();

				mv.LOADConstNULL();
				mv.RETURNTop();
				Label l1 = mv.codeNewLabel();
				mv.visitLabel(l1);
			});

		cw.privateMethod(String.class, "annotationWithDefaultValueAndNamedValue")
			.annotation(TestAnnotation.class, new String[] { "value", "name" }, new Object[] { "value", "name" })
			.code(mv -> {
				mv.line();

				mv.LOADConstNULL();
				mv.RETURNTop();
				Label l1 = mv.codeNewLabel();
				mv.visitLabel(l1);
			});

		cw.privateMethod(String.class, "annotationWithDefaultValueAndNamedValue2")
			.annotation(TestAnnotation.class, new String[] { "name", "secondName" },
					new Object[] { "name", "secondName" })
			.code(mv -> {
				mv.line();

				mv.LOADConstNULL();
				mv.RETURNTop();
				Label l1 = mv.codeNewLabel();
				mv.visitLabel(l1);
			});

		cw.method("method")
			.parameter(TestAnnotation.class, "annotation", String.class)
			.parameter(Annotation.annotation(TestAnnotation.class, "value"), "annotationWithDefaultValue", String.class)
			.parameter(Annotation.annotation(TestAnnotation.class, new String[] { "value", "name" },
					new Object[] { "value", "name" }), "annotationWithDefaultValueAndNamedValue", String.class)
			.parameter(
					Annotation.annotation(TestAnnotation.class, new String[] { "name", "secondName" },
							new Object[] { "name", "secondName" }),
					"annotationWithDefaultValueAndNamedValue2", String.class)
			.code(mv -> {
				mv.line();

				mv.LOADConst("annotation");
				mv.STORE("annotation");
				mv.line();
				mv.LOADConst("annotationWithDefaultValue");
				mv.STORE("annotationWithDefaultValue");
				mv.line();
				mv.LOADConst("annotationWithDefaultValueAndNamedValue");
				mv.STORE("annotationWithDefaultValueAndNamedValue");
				mv.line();
				mv.LOADConst("annotationWithDefaultValueAndNamedValue2");
				mv.STORE("annotationWithDefaultValueAndNamedValue2");
				mv.line();
				mv.RETURN();
			});

		// @formatter:on

		String codeActual = toString(cw.end().toByteArray());
		String codeExpected = toString(clazz);
		assertEquals("Code", codeExpected, codeActual);
	}

//	@Test
//	public void printClass() throws IOException {
//		System.out.println(RefineCode.refineCode(toString(clazz)));
//	}

}