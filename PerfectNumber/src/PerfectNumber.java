public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        if (number > 1) {

            for (int i = 1; i <= number / 2; i++) {
                if (number % i != 0)
                    continue;
                sum += i;
            }
            return (sum == number);
        }
        return false;

    }
}
