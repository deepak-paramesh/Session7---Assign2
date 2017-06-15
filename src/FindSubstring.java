import java.util.Scanner;


public class FindSubstring {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println("Enter the string to be searched");
		String search = sc.next();
		
		
		if(str.contains(search) == true)
		{
			System.out.println("Substring found");
		}
		else{
			System.out.println("Substring not found");
		}
	}

}
