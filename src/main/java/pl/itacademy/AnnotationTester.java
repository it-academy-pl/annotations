package pl.itacademy;

import java.lang.reflect.*;

public class AnnotationTester {

	private AnnotatedClass object = new AnnotatedClass();

	public static void main(String[] args) throws Exception {

		AnnotationTester tester = new AnnotationTester();
		tester.executeAnnotatedMethods();

	}

	private void executeAnnotatedMethods() throws Exception {
		Method[] methods = object.getClass().getDeclaredMethods();
		for (Method method : methods) {
			Execute[] annotationList = method.getAnnotationsByType(Execute.class);
			if (annotationList != null && annotationList.length != 0) {
				int repetition = annotationList[0].times();
				if (repetition > 0) {
					executeMethod(method, repetition);
				}
			}
		}
	}

	private void executeMethod(Method method, int repetition) throws Exception {
		int numberOfParams = method.getParameterCount();
		for (int i = 0; i < repetition; i++) {
			switch (numberOfParams) {
			case 0:
				method.invoke(object);
				break;
			case 1:
				method.invoke(object, "my string");
				break;
			case 2:
				method.invoke(object, "my other string", 123);
				break;
			}
		}
	}

}
