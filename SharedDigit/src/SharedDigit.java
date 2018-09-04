public class SharedDigit {
    public static boolean hasSharedDigit(int a,int b){
        if (a<10 || a>99 || b<10 || b>99){
            return false;
        }
        int fa=a/10;
        int sa=a%10;
        int fb=b/10;
        int sb=b%10;
        if (fa==fb||fa==sb||sa==fb||sa==sb){
            return true;
        }return false;

    }
}
