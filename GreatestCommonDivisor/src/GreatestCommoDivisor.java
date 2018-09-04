public class GreatestCommoDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        } else {
            int lower = (first < second) ? first : second;
            if (first % lower == 0 && second % lower == 0) {
                return lower;
            }

            for (int i = lower / 2; i > 0; i--) {
                if (first % i == 0 && second % i == 0) {
                    return i;
                }

            }
            return 1;

        }
    }
}
