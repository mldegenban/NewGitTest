package com.ml.java;

import java.util.Random;

public class RandomTest2 {
	public static void main(String[] args) {
		Random rand1 = new Random();
		Random rand2 = new Random();
		while(true){
			int x = rand1.nextInt(10);
			int y = rand2.nextInt(10);
			if(x<y){
				System.out.println(x + " < " + y);
			}
			else if(x > y){
				System.out.println(x + " > " + y);
			} 
			else System.out.println(x + " = " + y);
		}
		
		
		
		
		
/*		for(int i = 0; i < 25; i++) {//int ��Χ�ڵ������
			int x = rand1.nextInt();
			int y = rand2.nextInt();
			if(x<y){
				System.out.println(x + " < " + y);
			}
			else if(x > y){
				System.out.println(x + " > " + y);
			} 
			else System.out.p1rintln(x + " = " + y);
		}
		Random rand3 = new Random();
		Random rand4 = new Random();
		
		
		for(int i = 0; i < 25; i++) {    //0-10֮����������
			int x = rand3.nextInt(10);
			int y = rand4.nextInt(10);
			if(x<y){
				System.out.println(x + " < " + y);
			}
			else if(x > y){
				System.out.println(x + " > " + y);
			} 
			else System.out.println(x + " = " + y);
		}*/
	}
}
