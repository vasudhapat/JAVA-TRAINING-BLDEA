/**
 * 
 */
package trainingcodes;

/**
 * @author New User
 *
 */
import java.util.Scanner;
public class Program6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
				System.out.println("Enter the value of n:");
		int n= sc.nextInt();
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(j==(n-1)||i==j||i+j==(n-1)+(n/2))
						{
					System.out.print("* ");
		}
				else
				{
					System.out.print("  ");
				}
			}
				System.out.println();
				
				}
			}
	}

	


