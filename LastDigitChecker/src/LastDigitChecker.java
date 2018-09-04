public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c){
        if (a<10 || a>1000 || b<10 || b>1000 || c<10 || c>1000 ){
            return false;
        }
        int la=a%10;
        int lb=b%10;
        int lc=c%10;
        if (la==lb||lb==lc||la==lc){
            return true;
        }
        return false;
    }
}
