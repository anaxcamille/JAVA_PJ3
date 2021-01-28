import java.io.*;

public class findmissing{
	public static void main (String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int[] arr = {1,2,4,5,6,7,9,10};
		int [] another = {1,2,3,4,5,6,7,8,9,10};
		int missing[]= new int[10];
		int num1=0,num2=0;
		for (int x=0; x<arr.length; x++){
			num1 += arr[x];
		}
		for(int x=0; x<another.length; x++){
			num2 += another[x];
		}
		int total = num2-num1;
		System.out.print("Missing number is : " + total);	
	}
}