public class LargestPrime {
    public static void main(String[] args) {
        int largest=getLargestPrime(45);
        System.out.println(largest);
    }
    public static int getLargestPrime(int number){
        if (number<=1){
            return -1;
    }
    int primeTotal = 1;
    int primeNumber = 2;

    for (int i = primeNumber ; i <= number; i++) {
        if (number % i == 0) {
            number /= i;
            primeTotal = primeTotal * i;

            if (number % i == 0){
                number /=1;
                primeTotal = primeTotal * i;
        }
    }
        if (primeTotal / number == primeTotal){
            if (i == 4){
                return 2;
            }
            return i;
        }
    }
    return-1;

}
}

