import java.util.Scanner;
public class LoginValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int attempt = 0;
		
		while (attempt < 5){
		    System.out.println("Enter Username: ");
		    String username = sc.nextLine();
		    System.out.println("Enter Passwrd: ");
		    String password = sc.nextLine();
 String status=LoginValidation(username,password);
	    if (status.equals("success")){
	     System.out.println("Login Successfully");
	     break;
	     	   }else if(status.equals("failed")){
	     	     System.out.println("Login Failed");
	     	     attempt++;  
	     	     System.out.println("Attempt: " + attempt);
	  	       }
			    }
		   if (attempt== 5 ){
		       System.out.println("You've reached 5 attempts, Please try again latter");
		 sc.close();      
		       }
	}
    public static String LoginValidation(String username, String password){
        
       String defaultUsername = "Rick";
       String defaultPassword = "123";
       
       if (username.equals (defaultUsername) &&password.equals (defaultPassword)){
        System.out.println("Correct Username and Password");  
        return "success";
        }else{
            return "failed";
            }
        
        
        }
}