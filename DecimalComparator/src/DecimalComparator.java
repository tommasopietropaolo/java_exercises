public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double first,double second){
        int decimalFirst=(int)(first *1000);
        int decimalSceond=(int)(second *1000);
      if (decimalFirst == decimalSceond){
          return true;
      }
      else{
          return false;
      }
    }

}
