public class NumberPalindrome {
    public static boolean isPalindrome (int number) {
        int reverse = 0;
        int a=number;
        while(number!=0){
            int lastDigit= number%10;
            reverse=reverse*10 + lastDigit;
            number=number/10;
        }
        if (reverse==a){
            return true;
        }

        return false;


    }
}
