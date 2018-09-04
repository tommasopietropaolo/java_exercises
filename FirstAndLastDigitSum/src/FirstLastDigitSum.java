public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int lastNum = number % 10;
        int firstNum = number;

        while (firstNum >= 10) {
            firstNum = firstNum / 10;
        }
        int sum = firstNum + lastNum;
        return sum;
    }

}