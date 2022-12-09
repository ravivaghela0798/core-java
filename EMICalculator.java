public class EMICalculator {
    public float getEMI(float principal, float rate, float time) {
        float emi;
        rate = rate / (12 * 100); // one month interest
        time = time * 12; // one month period
        emi = (principal * rate * (float) Math.pow(1 + rate, time)) / (float) (Math.pow(1 + rate, time) - 1);
        return emi;
    }

    public static void main(String[] args) {
        float principal, rate, time;
        principal = 500000;
        rate = 10;
        time = 2;

        EMICalculator emi = new EMICalculator();
        System.out.println("Monthly EMI is = " + emi.getEMI(principal, rate, time));
    }
}
