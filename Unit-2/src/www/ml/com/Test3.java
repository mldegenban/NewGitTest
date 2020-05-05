package www.ml.com;

public class Test3 {
	public static void main(String[] args) {
		Computer c1 = new Computer();
		Computer c2 = new Computer();
		c1.price=1500;
		c2.price=2000;
		System.out.println(c1.price+"--------------->"+c2.price);
		c1 = c2;
		System.out.println(c1.price+"--------------->"+c2.price);
		c1.price=10000;
		System.out.println(c1.price+"--------------->"+c2.price);
		
		
		
	}
}
class Computer{
	int price;
}
