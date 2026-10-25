public class Pattern16 {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i > 2 && i <= n) {
                    if (j == 1 || j == i) {
                        System.out.print("x");
                    } else {
                        System.out.print(" ");
                    }
                    System.out.print(" ");
                } else {
                    System.out.print("x");
                    System.out.print(" ");
                }
            }

            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                if (i > 2 && i <= n) {
                    if (j == 1 || j == i) {
                        System.out.print("x");
                    } else {
                        System.out.print(" ");
                    }
                    System.out.print(" ");
                } else {
                    System.out.print("x");
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (i > 2 && i <= n) {
                    if (j == 1 || j == i) {
                        System.out.print("x");
                    } else {
                        System.out.print(" ");
                    }
                    System.out.print(" ");
                } else {
                    System.out.print("x");
                    System.out.print(" ");
                }
            }

            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                if (i > 2 && i <= n) {
                    if (j == 1 || j == i) {
                        System.out.print("x");
                    } else {
                        System.out.print(" ");
                    }
                    System.out.print(" ");
                } else {
                    System.out.print("x");
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
