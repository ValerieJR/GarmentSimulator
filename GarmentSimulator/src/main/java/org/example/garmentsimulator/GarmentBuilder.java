package org.example.garmentsimulator;

public interface GarmentBuilder {
    GarmentBuilder setTopStyle(String topStyle);
    GarmentBuilder setBottomStyle(String bottomStyle);
    GarmentBuilder setShoeStyle(String leftStyle);

    Garment build();


}
