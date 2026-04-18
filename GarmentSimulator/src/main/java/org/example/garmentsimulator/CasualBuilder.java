package org.example.garmentsimulator;

public class CasualBuilder implements GarmentBuilder{
    Casual casual;
    public CasualBuilder() { this.casual = new Casual(); }
    @Override
    public GarmentBuilder setTopStyle(String topStyle) { casual.setTopStyle(topStyle); return this; }
    @Override
    public GarmentBuilder setBottomStyle(String bottomStyle) { casual.setBottomStyle(bottomStyle); return this; }
    @Override
    public GarmentBuilder setShoeStyle(String shoeStyle) { casual.setShoeStyle(shoeStyle); return this; }
    @Override
    public GarmentBuilder setGender(String gender) {casual.setGender(gender); return this; }

    @Override
    public Garment build() { return casual; }

}
