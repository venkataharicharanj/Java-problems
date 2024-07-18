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
	     int count=0;
	     for(int i=0;i<n;i++){
	         if(arr[i]>count){
	             count=i;
	         }
	         }
	         int smax=Integer.MIN_VALUE;
	         for(int i=0;i<n;i++){
	             if(i!=count&&arr[i]>smax){
	                 smax=arr[i];
	             }
	         }
	     
	         System.out.println(count +" "+smax);
	}
}