public class FullPyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {

            // for space
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // for star
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }
        for (int i = 1; i <= n-1; i++) {
            // for space
            for (int j = 1; j <=i ; j++) {
                System.out.print(" ");
            }

            // for star
            for (int k = (n*2-1); k >=  i; k--) {
                System.out.print("*");
            }
            System.out.print("\n");

        }
    }
}
