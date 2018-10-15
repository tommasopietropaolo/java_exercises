package com.tommasopietropaolo;

public class Car {
    //object compose by STATE and BEHAVIOUR

    // this is the state compose by fields.
    //this is a setter
    private int doors;
    private int wheels;
    private String model;//this keywords to enter in this field
    private String engine;
    private String colour;

    public void setModel(String model){
        String validModel =model.toLowerCase();
        if(validModel.equals("testa rossa") || validModel.equals("commodore")){
            this.model=model;
        } else{
        this.model = "Unknown";
        }
    }
        // and now we create a getter
    public String getModel(){
        return this.model;
    }

}
