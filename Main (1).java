/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    int n= sc.nextInt();
	     int arr[]=new int [n];
	     for(int i=0;i<n;i++){
	         arr[i]=sc.nextInt();
	     }
	     int sum=0;
	     int ans[]=new int[n];
	     for(int i=0;i<n;i++){
	         sum+=arr[i];
	     }
	     for(int i=0;i<n;i++){
	         ans[i]=sum-arr[i];
	     
	     System.out.print(ans[i]+" ");
	}
	}
}