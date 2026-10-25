public class Pattern8 {
    public static void main(String[] args){
        int n = 5;
        int number = 1;

        for(int i=1; i<=n; i++){
            if (i%2==0) {
                number = 0;
            }else{
                number = 1;
            }
            for(int j=1; j<=i; j++){
                System.out.print(number + " ");
                if (number%2==0) {
                    number = 1;
                }else{
                    number = 0;
                }
            }
            System.out.println();
        }
    }
}
