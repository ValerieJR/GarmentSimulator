package org.example.garmentsimulator;

public class ProfessionalBuilder implements  GarmentBuilder {
    Professional professional;
    public ProfessionalBuilder() { this.professional = new Professional(); }
    @Override
    public GarmentBuilder setTopStyle(String topStyle) { professional.setTopStyle(topStyle); return this; }
    @Override
    public GarmentBuilder setBottomStyle(String bottomStyle) { professional.setBottomStyle(bottomStyle); return this; }
    @Override
    public GarmentBuilder setShoeStyle(String shoeStyle) { professional.setShoeStyle(shoeStyle); return this; }

    @Override
    public Garment build() { return professional; }
}
