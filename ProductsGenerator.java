import java.util.Scanner;
public class ProductsGenerator {
	// Recursive method to calculate the product of an array of numbers
	public static int productGenerator(int[] price, int index) {
		if(index == price.length - 1) {
			return price[index];
		} else {
			return price[index] * productGenerator(price, index + 1);
		}
	}
	public static void main(String[] args) {
		int[] price = new int[5];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter five numbers : ");
		
		for(int i=0; i<price.length; i++) {
			System.out.println("Enter "+(i+1)+" number : ");
			price[i] = scanner.nextInt();
			}
		int product = productGenerator(price, 0);
		System.out.println("The product of the number is : " + product);
		scanner.close();
	}
}
