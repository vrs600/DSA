import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 9, 14, 18, 22, 27 };
        Scanner scanner = new Scanner(System.in);
        int target;
        int start = 0;
        int last = arr.length;
        int mid = (start + last) / 2;
        boolean found = false;
        System.out.print("Enter target element : ");
        target = scanner.nextInt();
        while (last > start && mid != start && mid != last) {
            if (arr[mid] == target) {
                found = true;
                break;
            } else {
                if (target > arr[mid]) {
                    start = mid;
                } else {
                    last = mid;
                }

                mid = (start + last) / 2;
            }
        }

        if (found) {
            System.err.print("Element found at index " + mid);
        } else {
            System.out.println("Target element does not exist in the array");
        }
    }
}
