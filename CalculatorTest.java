public class CalculatorTest {

    public static void main(String[] args) {

        Calculator cal = new Calculator();
        if (cal.add(2, 3) == 5) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        if (cal.subtract(5, 2) == 3) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        if (cal.multiply(2, 3) == 6) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        if (cal.divide(6, 2) == 3) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
        try {
            cal.divide(6, 0);
            System.out.println("Test failed");
        } catch (IllegalArgumentException e) {
            System.out.println("Test passed");
        }

    }

}
