/*
 *  find the current month name from the given number of the switch case
 */

public class SwitchCase {

    public static void main(String[] args) {
        // Initialize variable for current month and assign value to the variable
        int currentMonth = 15;

        // Pass the current_month variable in Switch expression
        switch (currentMonth) {
            case 1:
                System.out.println("Current month is January");
                break;
            case 2:
                System.out.println("Current month is February");
                break;
            case 3:
                System.out.println("Current month is March");
                break;
            case 4:
                System.out.println("Current month is April");
                break;
            case 5:
                System.out.println("Current month is May");
                break;
            case 6:
                System.out.println("Current month is June");
                break;
            case 7:
                System.out.println("Current month is July");
                break;
            case 8:
                System.out.println("Current month is Augest");
                break;
            case 9:
                System.out.println("Current month is September");
                break;
            case 10:
                System.out.println("Current month is October");
                break;
            case 11:
                System.out.println("Current month is November");
                break;
            case 12:
                System.out.println("Current month is December");
                break;
            default:
                System.out.println("Please Enter Valid month No!");
        }
    }

}
