public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            // when i = 5 then skip 5 number
            if (i == 5) {
                continue;
            }
            System.out.println("Number " + i);
            // when i = 7 then break loop
            if (i == 7) {
                break;
            }
        }
    }

}
