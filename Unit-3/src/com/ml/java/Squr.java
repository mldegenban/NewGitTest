package com.ml.java;

public class Squr {
	public static void main(String[] args) {
		int tem = 97;
		int t1=95;
		int t2 = 16;
		Squr s1 = new Squr();
		System.out.println(s1.sur(tem));
		
		System.out.println(s1.sur(t1));
		System.out.println(s1.sur(t2));
	}
	public int sur(int x){
		int temp = 0;
		for(int i=2;i<Math.sqrt(x);i++){
			if(x%i==0){
				temp++;
			}
		};
		if(temp<1){
			System.out.println(temp);
			System.out.println(x+" is prime");
			return x;
		}
		System.out.println(x +"is not prime");
		return 0;
		
		
	}
}
