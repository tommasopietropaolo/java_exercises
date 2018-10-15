package com.tommasopietropaolo;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("2208","Dell", "240", dimensions);

        Monitor theMonitor= new Monitor("27inch Beast", "Acer",27, new Resolution(2540,1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();


        //you can do also in this way with getter of pc class
        //        thePC.getMonitor().drawPixerlArt(1500,1200,"red");
        //        thePC.getMotherboard().loadProgramm("Windows 1.0");
        //        thePC.getTheCase().pressPowerButton();
        // without

//        public void powerUp() {
//            theCase.pressPowerButton();
//            drawLogo();
//        }


        // Create a single room of a house using composition.
        // Think about the things that should be included in the room.
        // Maybe physical parts of the house but furniture as well
        // Add at least one method to access an object via a getter and
        // then that objects public method as you saw in the previous video
        // then add at least one method to hide the object e.g. not using a getter
        // but to access the object used in composition within the main class
        // like you saw in this video.



        Wall wall1 = new Wall("west");
        Wall wall2 = new Wall("east");
        Wall wall3 = new Wall("south");
        Wall wall4 = new Wall("north");
        Ceiling ceiling = new Ceiling(12,55);
        Bed bed = new Bed("modern", 4, 3 ,2,1);
        Lamp lamp = new Lamp("classic", false, 75);

        Bedroom bedroom = new Bedroom("tommy",wall1,wall2,wall3,wall4,ceiling,bed,lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();






    }

}
