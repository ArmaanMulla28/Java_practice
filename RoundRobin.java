public class RoundRobin {
    public static void main(String[] args) {
        int[] bt = {10, 5, 8, 6};
        int n = bt.length;
        int quantum = 3;
        int[] rem = bt.clone();
        int[] wt = new int[n];
        int[] tat = new int[n];
        int time = 0;
        while (true) {
            boolean done = true;
            for (int i = 0; i < n; i++) {
                if (rem[i] > 0) {
                    done = false;
                    if (rem[i] > quantum) {
                        time += quantum;
                        rem[i] -= quantum;
                    } else {
                        time += rem[i];
                        wt[i] = time - bt[i];
                        rem[i] = 0;
                    }
                }
            }
            if (done)
                break;
        }
        System.out.println("Process\tBT\tWT\tTAT");
        for (int i = 0; i < n; i++) {
            tat[i] = bt[i] + wt[i];
            System.out.println("P" + (i + 1) + "\t"
                + bt[i] + "\t" + wt[i] + "\t" + tat[i]);
        }
    }
}
