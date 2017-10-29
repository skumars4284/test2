package io.javabrains;

public class Greeter {

	public void greet(Greeting greet) {

		greet.perform();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Greeter greeter = new Greeter();

		Greeting helloWorldGreeting = new HelloWorldGreeting();

		// greeter.greet();

		Greeting LambdaGreeting = () -> System.out.println("Hello World");

		Greeting greeting = new Greeting() { // annoymous inner class

			public void perform() {

				System.out.println("Hello World");

			}

		};

		greeter.greet(LambdaGreeting);
		greeter.greet(helloWorldGreeting);
	}

}
