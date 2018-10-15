public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal <0){
            return false;
        }
        int fiveKgBags = goal/5;
        return (((fiveKgBags>bigCount)?(bigCount*5) : (fiveKgBags*5)) + smallCount)>= goal;

    }
}
