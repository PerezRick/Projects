import java.util.Scanner;
public class Main {
	public static void main(String[] args){
boolean Loop = true;
	 	 Scanner sc = new Scanner (System.in);
	 do{
	String Username = "Perez";
	int Password = 12345;
	System.out.println("Enter Username");	String typeUsername = sc.next();
	if (typeUsername.equals(Username)){
	 System.out.print("Enter Password");       int typePassword = sc.nextInt();
	 if (typePassword==(Password)){

	   
	   System.out.println("Enter x");
	   double x = sc.nextDouble();	    	         System.out.println("Enter y");
	   double y = sc.nextDouble();
	   System.out.println("Enter Operation (+,-,/,*)");    
	   char Operation = sc.next().charAt(0);       double Total;
	    switch (Operation) {
	      case '+':      
	      Total = x + y;
	      break;  
	      case '-':      
	      Total = x - y;
	      break;  
	      case '*':      
	      Total = x * y;
	      break;  
	      case '/':      
	      if (y==0){ 
	       System.out.println("Error");
	      }Total = x/y;
	      break;
	      default:
	      System.out.println("Invalid");
	      return;
	       } System.out.println(Total);
	         
	          	         	    	 
	          	         	    	  	         	    	      System.out.println("Do you want to try again? yes/no");
	   String answer = sc.next();
	      if (answer.equalsIgnoreCase("Yes")){
	       }else{        	    	  	         	    	       	  System.out.println("Alright!");      	    	 Loop = false;          	         	    	  	         	    	       	         	    	          	         }	    	  	         	   
	     	         	    	  	         	    	       	         	    	           	         	    	  	         	    	       	         	    	          	         	    	  	         	   
	          	         	    	  	         	    	       	         	    	      
	       }   else { System.out.println("Error");
	       
	       	
	           }
	       
	       
	       } else { System.out.println("Error");
	        
		} 
	 }while (Loop);          
	}
}