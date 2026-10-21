import java.util.Scanner;
public class Segmentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, segment, offset;
        int[] base = new int[10];
        int[] limit = new int[10];
        System.out.print("Enter number of segments: ");
        n = sc.nextInt();
        if (n < 1 || n > 10) {
            System.out.println("Invalid number of segments!");
            sc.close();
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("Enter base address of segment " + i + ": ");
            base[i] = sc.nextInt();

            System.out.print("Enter limit of segment " + i + ": ");
            limit[i] = sc.nextInt();
        }
        System.out.print("Enter segment number: ");
        segment = sc.nextInt();
        System.out.print("Enter offset: ");
        offset = sc.nextInt();
        if (segment < 0 || segment >= n) {
            System.out.println("Invalid segment number!");
        } else if (offset < 0 || offset >= limit[segment]) {
            System.out.println("Invalid offset! Address out of bounds.");
        } else {
            int physical = base[segment] + offset;
            System.out.println("Physical Address = " + physical);
        }
        sc.close();
    }
}
