import java.util.Scanner;
public class Main {
    static void mergeSort(int[] prices, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(prices, left, mid);
            mergeSort(prices, mid + 1, right);
            merge(prices, left, mid, right);
        }
    }
    static void merge(int[] prices, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++)
            L[i] = prices[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = prices[mid + 1 + j];
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j])
                prices[k++] = L[i++];
            else
                prices[k++] = R[j++];
        }
        while (i < n1)
            prices[k++] = L[i++];

        while (j < n2)
            prices[k++] = R[j++];
    }
    static void quickSort(int[] prices, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(prices, low, high);

            quickSort(prices, low, pivotIndex - 1);
            quickSort(prices, pivotIndex + 1, high);
        }
    }
    static int partition(int[] prices, int low, int high) {
        int pivot = prices[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (prices[j] <= pivot) {
                i++;

                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }
        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
    }
    static void display(int[] prices) {
        for (int price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid number of products.");
            sc.close();
            return;
        }
        int[] prices = new int[n];
        System.out.println("Enter product prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        int choice;
        do {
            System.out.println("\n--- SORTING MENU ---");
            System.out.println("1. Merge Sort");
            System.out.println("2. Quick Sort");
            System.out.println("3. Compare Both Sorts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    int[] arr = prices.clone();
                    mergeSort(arr, 0, n - 1);

                    System.out.println("Sorted using Merge Sort:");
                    display(arr);
                    break;
                }
                case 2: {
                    int[] arr = prices.clone();
                    quickSort(arr, 0, n - 1);

                    System.out.println("Sorted using Quick Sort:");
                    display(arr);
                    break;
                }
                case 3: {
                    int[] mergeArr = prices.clone();
                    int[] quickArr = prices.clone();

                    mergeSort(mergeArr, 0, n - 1);
                    quickSort(quickArr, 0, n - 1);

                    System.out.println("Merge Sort Output:");
                    display(mergeArr);

                    System.out.println("Quick Sort Output:");
                    display(quickArr);

                    break;
                }
                case 4:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);
        sc.close();
    }
}
