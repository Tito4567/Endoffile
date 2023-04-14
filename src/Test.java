import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test 
{


	public static void main(String[] args) throws FileNotFoundException 
	{
		boolean counter = true;
		String length = "";
		File fle = new File("HelloWorld.txt");
		Scanner scan = new Scanner(fle);
		int i = 1;
		do 
		{
			System.out.print(i+" ");
						
			length = (scan.nextLine());
			System.out.println(length);
			counter = (length.substring(0).contains("end-of-file.") == false);
			i++;
			
		}while (scan.hasNext() && counter);//(scn.nextLine().substring(0).contains("end-of-file.") != true);	
	}

}
