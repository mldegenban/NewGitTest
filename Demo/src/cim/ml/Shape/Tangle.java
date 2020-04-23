package cim.ml.Shape;

public class Tangle {
	private static final char I = 0;
	public static void main(String[] args) {
		int[] diStringMatch = diStringMatch("IDIDID");
		for(int i=0;i<diStringMatch.length;i++){
			System.out.println(diStringMatch[i]);
		}
	}
    public static int[] diStringMatch(String S) {
    	char[] charArray = S.toCharArray();
    	String[] arr = new String[charArray.length];
    	System.out.println(charArray.length);
    	
		for(int i=0;i<charArray.length;i++){
			arr[i]=charArray[i]+"";
			System.out.println(charArray[i]);
		}
        int N = S.length();
        int k=0;
        int j=N;
        int[] arrout=new int[N];
        for(int i=0;i<arr.length;i++){
        	if(arr[i].equalsIgnoreCase("I")){
        		arrout[i]=k++;

        	}else{
        		arrout[i]=j--;
        	}
        }
		return arrout;
        
    }
}
