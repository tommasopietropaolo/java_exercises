package com.tommasopietropaolo;

import java.awt.*;

public class Case {
    private String model;
    private String manifacture;
    private String powerSupply;
    private Dimensions dimensions;

    public Case(String model, String manifacture, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manifacture = manifacture;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton(){
        System.out.println("Power button is on");
    }

    public String getModel() {
        return model;
    }

    public String getManifacture() {
        return manifacture;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
