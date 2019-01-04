public class Main {
    public static void main(String[] args) {
        int k = 10;
        int n[] = new int[k];
        Queue q = new Queue(n.length);


        int ops[] = new int[k];

        System.out.println("Random Decisions");
        for (int i = 0; i < k; i++){
            ops[i] = (Math.random() < 0.5) ? 0 : 1;
            System.out.print(ops[i]);
    }
            final long timeStart = System.currentTimeMillis();
            for (int i = 0; i < k; i++) {
                if (ops[i] == 0) {
                    q.insert(2);
                } else {
                    q.delete();
                }
            }
            final long endTime = System.currentTimeMillis();
            System.out.println();
            q.print();
            System.out.println();
               System.out.println("Total execution time: " + (endTime - timeStart));

    }
}