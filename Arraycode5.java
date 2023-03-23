/**
 * 
 */
package bldea_tiny;

/**
 * @author New User
 *
 */
import java.util.Scanner;
public class Arraycode5 {

	/**
	 * @param args
	 */
	public static int LinearSearch(int arr[],int key) {
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key) {
				return(i+1);
				
			}
		}
		return 0;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the array element to be searched : ");
		int key=sc.nextInt();
		int arr[]= {10,20,30,40,50,60,70,80,79};
		int res=LinearSearch(arr,key);
		System.out.println("element found in position"+(res));
	}

	
		
	
	
		
	}
	

		

	



