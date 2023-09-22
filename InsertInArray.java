import java.util.Arrays;
import java.util.Scanner;

public class InsertInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the element to be inserted
        System.out.print("Enter the element to be inserted: ");
        int elementToInsert = scanner.nextInt();

        // Input the index at which the element should be inserted
        System.out.print("Enter the index at which the element should be inserted: ");
        int index = scanner.nextInt();

        scanner.close();

        if (index < 0 || index > size) {
            System.out.println("Invalid index. The index should be between 0 and " + size);
        } else {
            // Shift elements to the right to create space for the new element
            for (int i = size - 1; i > index; i--) {
                array[i] = array[i - 1];
            }

            // Insert the new element at the specified index
            array[index] = elementToInsert;

            // Increase the size of the array
            size++;

            System.out.println("Array after inserting the element:");
            System.out.println(Arrays.toString(array));
        }
    }
}

