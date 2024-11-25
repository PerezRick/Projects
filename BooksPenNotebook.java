public class Main {
	public static void main(String[] args) {
		int book = 150;
		int pen = 10;
		int noteBook = 25;
		double total = (book * 2 + pen * 5 + noteBook * 3);
		double discount = 63.75;
		
		System.out.println("2 Books");
		System.out.println("5 pens");
		System.out.println("3 noteBooks");
		System.out.println("total: " + total);
		
		if (total>=350){
		    System.out.println("You have discount 15%");
		    System.out.println("total - 15%");
		    
		    System.out.println(total-63.75);
		    
		    }else{
		        System.out.println(total);
		}        
	}
}