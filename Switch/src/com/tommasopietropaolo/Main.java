package com.tommasopietropaolo;

public class Main {

    public static void main(String[] args) {
//        int valu = 1;
//        if (valu == 1) {
//            System.out.println("value was 1");
//        } else if (valu == 2) {
//            System.out.println("value was 2");
//        } else {
//            System.out.println("was not 1 or 2");
//        }
        int switchValue = 3;
        switch (switchValue) {
            case 1:
                System.out.println("value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("was a 3, or 4 , or a 5");
                System.out.println("acctually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }
        //we test only one variables with switch.


        //test:
        //create a new switch statement using char instead of int
        //create a new char variable
        //create a switch statement testing for
        // A, B, C,D, or E
        //display a message if any of these are found and then break
        //add a default which displays a message saying not found

        char charValure = 'A';
        switch (charValure) {
            case 'A':
                System.out.println("it's A");
                break;

            case 'B':
                System.out.println("it's B");
                break;

            case 'C':
            case 'D':
            case 'E':
                System.out.println("it's " + charValure);
                break;


            default:
                System.out.println("not found");
                break;
        }
        String month= "JuNE";
        switch ((month.toLowerCase())){
            case"january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("not sure");
        }


    }
}
