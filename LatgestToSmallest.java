public class LargestToSmallest {
	public static void main(String[] args) {


        int[] numbers = {34, 56, 23, 89, 12, 78, 55, 21, 90, 11};
        
        int largest = numbers[0];
        int smallest = numbers[0];
        
        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        
        System.out.println("Largest number:" + largest);
        System.out.println("Smallest number:" + smallest);
    }
}
	
