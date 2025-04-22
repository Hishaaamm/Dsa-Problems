public class Main {
    public static void main(String[] args) { 
        int[] arr = {12, 35, 1, 10, 34, 1};  // Fixed array declaration
        int largest = -1;
        int secondlargest = -1;
        int n = arr.length;

        for (int i = 0; i < n; i++) {  // Fixed typo: 'o' to '0'
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
            }
        }

        System.out.println("Second largest element: " + secondlargest);
    }
}
