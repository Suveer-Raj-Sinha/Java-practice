public class Pattern11 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            int spaces = n - i;
            for (int a = 1; a <= spaces; a++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {

                System.out.print("x");
            }
            System.out.println();
        }
    }

}
