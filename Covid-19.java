import java.util.Scanner; 
public class Main {
	public static void main(String[] args) {
		boolean Loop = true;
		Scanner sc= new Scanner(System.in);
		do {
		    System.out.println("Do you have a Fever?");
		    String ans = sc.next();
		    System.out.println("Do you have cough?");
		    String ans1 = sc.next();
		    System.out.println("Do you have difficulty breathing");
		    String ans2 = sc.next();
		    
		    
		    if (ans.equalsIgnoreCase("Yes")||
		    ans1.equalsIgnoreCase("Yes") || ans2.equalsIgnoreCase("Yes")){
		        System.out.println("You may have COVID-19 symptoms, Please consult a healthcare professional");
		        } else{
		            System.out.println("You do not exhibits significance of COVID-19 symptoms, Stay Safe!");
	} System.out.println("Do you want consult again? yes/no");
		    String answer = sc.next();
		    if (answer.equalsIgnoreCase("Yes")) {
		        } else {
		            Loop = false;
		            }
		     
		} while (Loop);
}
}