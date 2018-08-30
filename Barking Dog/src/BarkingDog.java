public class BarkingDog {
    public static void main(String[] args) {
        barkingDog(true, 9);
    }
    public static boolean barkingDog(boolean barking, int hourOfDay) {
            if (hourOfDay >= 0 && hourOfDay <= 24 && barking && (hourOfDay < 8 || hourOfDay > 22))
                return true;
            return false;
        }
    }
