import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Please Enter a Letter or a Number");
	char input = sc.next().charAt(0);
	
	if ((input >= 'A' && input <= 'Z') || (input >= 'a' && input <= 'z')){
	    System.out.println( input + ": is a letter");
	    }else if(input >= '0' && input <= '9'){
	        System.out.println(input + ": is a number");
	     }else{
	            System.out.println(input + ": is not a number also not a letter");
	            }		
	}
}