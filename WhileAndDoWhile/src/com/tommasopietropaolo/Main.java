package com.tommasopietropaolo;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
            System.out.println("count value is " + count);
            count++;
        }

        System.out.println("*****************************************");


        //is the same of while
        for (count = 1; count != 6; count++) {
            System.out.println("count value is " + count);
        }

        System.out.println("++++++++++++++++++++++++++++++++++++");

        count = 1;
        while (true) {
            if (count == 5) {
                break;
            }
            System.out.println("count value is " + count);
            count++;
        }

//    count = 6;
//    do {
//        System.out.println("count value is " + count);
//        count++;
//
//        if (count > 100) {
//            break;
//        }
//        while (count != 6) ;
//
//
//    }
        System.out.println("_______________________________________________");

//        int number=4;
//        int finishNumber=20;
//        while(number <= finishNumber){
//            number++;
//            if(!isEvenNumber(number)){
//                continue;
//
//            }
//            System.out.println("even number " + number);
//        }
    // modify the while code above
    //make it also record the total number of even numbers it has found
    //and break once 5 are found
    //and at the end, display the total number of even numbers found

        int number=4;
        int finishNumber=20;
        int evenNumbersFound=0;

        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("even number " + number);

            evenNumbersFound ++;
            if (evenNumbersFound>=5){
                break;
            }


        }

        System.out.println("total even numbers found = " + evenNumbersFound);



    }

    //create a method called isEvenNumber that takes a parameter of type int
    //its purpose is to determine if the argument passed to the method is
    //an even number or not.
    //return true if an even number, otherwise return false;

    public static boolean isEvenNumber(int number) {
        if (number > 0 && number % 2 == 0) {
            return true;
        }
        return false;
    }
}
