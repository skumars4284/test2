package io.javabrains;

public class TypeInference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getLenght(s -> s.length());

	}

	public static void getLenght(StringLambdaLength l) {

		System.out.println(l.getLenght("Hello World"));

	}

	interface StringLambdaLength {

		int getLenght(String s);
	}

}
