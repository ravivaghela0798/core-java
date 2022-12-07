public class SwitchCase {
    public static void main(String[] args) {
        //Initialize variable for current month and assign value to the variable
        int current_Month = 15;
        
        // Pass the current_month variable in Switch expression  
        switch(current_Month) {
            case 1:
                System.out.println("Current Month is January");
                break;
            case 2:
                System.out.println("Current Month is February");
                break;
            case 3:
                System.out.println("Current Month is March");
                break;
            case 4:
                System.out.println("Current Month is April");
                break;  
            case 5:
                System.out.println("Current Month is May");
                break;
            case 6:
                System.out.println("Current Month is June");
                break;
            case 7:
                System.out.println("Current Month is July");
                break;
            case 8:
                System.out.println("Current Month is Augest");
                break;
            case 9:
                System.out.println("Current Month is September");
                break;
            case 10:
                System.out.println("Current Month is October");
                break;
            case 11:
                System.out.println("Current Month is November");
                break;
            case 12:
                System.out.println("Current Month is December");
                break;
            default:
                System.out.println("Please Enter Valid Month No!");
        }

    }
    
}
