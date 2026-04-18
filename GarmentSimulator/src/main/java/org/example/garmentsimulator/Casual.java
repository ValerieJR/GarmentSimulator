package org.example.garmentsimulator;

public class Casual extends Garment{
    public Casual(){
        this.topStyle = "Short-sleeve";
        this.bottomStyle = "Sweatpants";
        this.shoeStyle = "Sneakers";
    }

    @Override
    public String toString() {
        String description;
        description = "Top: " + this.topStyle + "\nBottom: " + this.bottomStyle + "\nShoe: " + this.shoeStyle;
        return description;
    }
}
