import java.util.Scanner;

public class Demo069 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of all elements in the array: " + sum);
    }
}