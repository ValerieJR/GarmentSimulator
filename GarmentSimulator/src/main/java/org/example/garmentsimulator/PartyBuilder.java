package org.example.garmentsimulator;

public class PartyBuilder implements GarmentBuilder {
    Party party;
    public PartyBuilder() { this.party = new Party(); }
    @Override
    public GarmentBuilder setTopStyle(String topStyle) { party.setTopStyle(topStyle); return this; }
    @Override
    public GarmentBuilder setBottomStyle(String bottomStyle) { party.setBottomStyle(bottomStyle); return this; }
    @Override
    public GarmentBuilder setShoeStyle(String shoeStyle) { party.setShoeStyle(shoeStyle); return this; }
    @Override
    public GarmentBuilder setGender(String gender) { party.setGender(gender); return this; }

    @Override
    public Garment build() { return party; }
}
