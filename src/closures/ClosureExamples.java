package closures;

public class ClosureExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		
		int b=20;
		
//		doProcess( a, new Process(){
//
//			@Override
//			public void process(int i) {
//
//				
//				System.out.println(a+b); re writing it as a lambda
//				
//			}
//			
//		});
		
		doProcess( a, i -> System.out.println(a+b));
		
		

	}

	public static void doProcess(int i, Process p) {

		p.process(i);

	}

}

interface Process {

	void process(int i);
}
