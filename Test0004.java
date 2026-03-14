public class Test0004 {
    public static void main(String[] args) {

        int n = 4;
        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                int top = i;
                int left = j;
                int right = size - 1 - j;
                int bottom = size - 1 - i;

                int min = Math.min(Math.min(top, left), Math.min(right, bottom));

                System.out.print((n - min) + " ");
            }

            System.out.println();
        }
    }
}
