package com.ml.ja;

public class Test {
    public static boolean checkPerfectNumber(int num) {
        int n = (int)Math.sqrt(num);
        System.out.println(n);
        int count=0;
        int temp=0;
        for(int i=1;i<=n;i++){
            if(num%i==0){
                temp=i+num/i;
                count +=temp;
                System.out.println(count);
            }
            temp=0;
        }

        if(count==2*num){
            return true;
        }
        System.out.println(count);
        return false;
    }
    public static void main(String[] args) {
    	boolean b = checkPerfectNumber(4);
    	System.out.println(b);
	}
}
