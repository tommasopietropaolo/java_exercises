package com.tommasopietropaolo;

public class Monitor {
    private String model;
    private String manifacture;
    private int size;
    private Resolution nativResolution;

    public Monitor(String model, String manifacture, int size, Resolution nativResolution) {
        this.model = model;
        this.manifacture = manifacture;
        this.size = size;
        this.nativResolution = nativResolution;
    }

    public void drawPixerlArt(int x, int y, String color){
        System.out.println("Drawing pixel at " + x +"," + y + " in colour " + color );
    }

    public String getModel() {
        return model;
    }

    public String getManifacture() {
        return manifacture;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativResolution() {
        return nativResolution;
    }
}

