public class rectangle3 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            // for space
            for (int j = 0; j < (n-1); j++) {
                System.out.print(" ");
            }
            // for star
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            // for space
            for (int j = 0; j < (n-1); j++) {
                System.out.print(" ");
            }

            System.out.print("\n");
        }

    }
}