package www.ml.com;

public class test2 {
	static int x=100;
	public static void main(String[] args) {
		test2 t1 = new test2();
		test2 t2 = new test2();
		test2 t3 = new test2();
		System.out.println(t1.x==t2.x);
		System.out.println(t2.x==t3.x);
	}
}
