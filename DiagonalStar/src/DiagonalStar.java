public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int r = 1; r <= number; r++) {

                for (int c = 1; c <= number; c++) {

                    if (r == 1 || c == 1 || c == number || r == number || r == c || (c == number - r + 1)) {
                        System.out.println("*");
                    } else {
                        System.out.println(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
