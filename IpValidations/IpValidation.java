import java.util.regex.*;
import java.util.Scanner;

public class IpValidation 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter IP adress (IPv4) :        ");
		String string = scan.next();
		
		String regex = "^(25[0-5]\\.|2[0-4][0-9]\\.|[01]?[0-9][0-9]?\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$" ; 
		System.out.println(string.matches(regex));
		scan.close();
		
	}
	
}