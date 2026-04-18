package org.example.garmentsimulator;

public class Casual extends Garment{
    public Casual(){
        this.topStyle = "Short-sleeve";
        this.bottomStyle = "Sweatpants";
        this.shoeStyle = "Sneakers";
        this.gender = "Female";
    }

    @Override
    public String toString() {
        String description;
        description =this.gender + " Garments\nTop: " + this.topStyle + "\nBottom: " + this.bottomStyle + "\nShoe: " + this.shoeStyle;
        return description;
    }
}
