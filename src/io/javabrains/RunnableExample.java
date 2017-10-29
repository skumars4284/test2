package io.javabrains;

public class RunnableExample {

	public static void main(String[] args) {

		Thread mythread = new Thread(new Runnable() { // inner class with runnable

			public void run() {

				System.out.println("Hello world");

			}

		});

		mythread.run();

		Thread mythreadLambda = new Thread(() -> System.out.println("printed inside lambad expression"));

		mythreadLambda.run();
	}

}
