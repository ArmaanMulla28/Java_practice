public class PriorityScheduling {
    public static void main(String[] args) {
        int[] bt = {10, 5, 8, 6};
        int[] priority = {3, 1, 4, 2};
        int n = bt.length;
        int[] wt = new int[n];
        int[] tat = new int[n];
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (priority[i] > priority[j]) {
                    int temp = priority[i];
                    priority[i] = priority[j];
                    priority[j] = temp;
                    temp = bt[i];
                    bt[i] = bt[j];
                    bt[j] = temp;
                }
            }
        }
        wt[0] = 0;
        for (int i = 1; i < n; i++)
            wt[i] = wt[i - 1] + bt[i - 1];
        System.out.println("Process\tBT\tPriority\tWT\tTAT");
        for (int i = 0; i < n; i++) {
            tat[i] = bt[i] + wt[i];
            System.out.println("P" + (i + 1) + "\t" + bt[i]
                + "\t" + priority[i] + "\t\t"
                + wt[i] + "\t" + tat[i]);
        }
    }
}

