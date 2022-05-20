package Task6;

public class Test {

    public static double divide(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            throw new CannotDivideBy0Exception();
        }
        return (double) firstNumber/secondNumber;


    }

    public static void main(String[] args) {
        System.out.println(divide(10,0));

    }

}
