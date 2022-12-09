public class ForLoop {
    public static void main(String[] args) {
        /*
         * define for loop and initialize i value in for loop condition
         * and iterate the value and print the star
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
