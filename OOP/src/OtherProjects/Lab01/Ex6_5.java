package OtherProjects.Lab01;
import java.util.Scanner;
import java.util.Arrays;
public class Ex6_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        int sum = 0;
        for(int a : arr){
           sum += a;
        }
        double average = (double)sum / (double)arr.length;
        
        System.out.println("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nSum: " + sum + "\nAverage: " + average);
	}
}
