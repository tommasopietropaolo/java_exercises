public class NumberToWords {
    public static int getDigitCount(int digit) {
        if (digit < 0) {
            return -1;
        }
        int count = 0;
        while (digit >0) {
            digit/=10;
            count++;
        }
        if (count == 0) {
            count++;
        }
        return count;
    }

    public static int reverse(int number){
        int lastDigit= 0;
        int reverseNumber=0;

        while(number!=0){
            lastDigit= number%10;
            reverseNumber=reverseNumber*10 + lastDigit;
            number/=10;
    }return reverseNumber;
    }

    public static void numberToWords(int number) {
        int reversedNumber = reverse(number);
        int digitCount = getDigitCount(number);

        if (number<0 || reversedNumber <0 || digitCount<0){
            System.out.println("Invalid Value");
        }else{
            int lastDigit =0;
            for (int i = 1; i<= digitCount; i++){
             lastDigit = reversedNumber%10;
             reversedNumber/=10;
        switch (lastDigit) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;


        }
    }
}
}
}