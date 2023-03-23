/**
 * 
 */
package bldea_tiny;



/**
 * @author New User
 *
 */
import java.util.Scanner;
public class Arraycode4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the count of Mouse House:");
		Scanner sc=new Scanner(System.in);
	int MH=sc.nextInt();
	System.out.println("Enter count of theater:");
	int theater=sc.nextInt();
	System.out.println("Enter the count of screen:");
	int screen=sc.nextInt();
	int arr[][][]=new int[MH][theater][screen];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(" inside the MH no:"+(i+1));
	
			for(int j=0;j<arr[i].length;j++) {
			System.out.println("inside theater no:"+(j+1));
			
		for(int k=0;k<arr[i][j].length;k++)
			
		{
			System.out.println("Enter the capacity of screen no:"+(k+1));
			arr[i][j][k]=sc.nextInt();
		}
			
				

	}

}
	System.out.println("  ");
	for(int i=0;i<arr.length;i++)
	{
		System.out.println("inside the MH"+(i+1));
		for(int j=0;j<arr[i].length;j++)
		{
			System.out.println("Enter the theater"+(j+1));
		for(int k=0;k<arr[i][j].length;k++)
		{
			System.out.println("the fund collected from screen no:"+(k+1));
			int fund=arr[i][j][k]*350;
			System.out.println(fund);
			
		}
	}
	}
	}
}

