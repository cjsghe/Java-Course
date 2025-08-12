public class TestControl {

    public static void main(String[] args) {
        int n = 0;

        while (n < 10){

            System.out.println("n = " + n );
            System.out.println("n + 10 = " + (n+10));
            n++;
        }

        int j = 1;
        double result = 0;

        while (j < 10) {
            System.out.println("j = " + j );

            result = Math.pow(2,j);
            System.out.println("j to the power of 2 = " + result);

            System.out.println((result *= 2));
            j++;
        }
    }
}
