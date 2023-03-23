/**
 * 
 */
package bldea_tiny;

/**
 * @author New User
 *
 */
import java.util.Arrays;
public class Arraycode7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub1,
		int arr1[]= {10,30,2,68,40,15,90,78};
		int arr2[]= {90,78,10,30,2,144,72,35};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(arr1.length==arr2.length) {
			for(int i=0;i<arr1.length;i++)
			{
				if(arr1[i]!=arr2[i]) {
					System.out.println("Arrays not equal");
					System.exit(0);
					
				}
				
		} 
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays not equal");
		}

	}

}
