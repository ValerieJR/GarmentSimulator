package org.example.garmentsimulator;

public class Party extends Garment{
    public Party() {
        this.topStyle = "Sequin";
        this.bottomStyle = "Mini skirt";
        this.shoeStyle = "Kitten heels";
        this.gender = "Female";
    }

    @Override
    public String toString() {
        String description;
        description = this.gender + " Garments\nTop: " + this.topStyle + "\nBottom: " + this.bottomStyle + "\nShoe: " + this.shoeStyle;
        return description;
    }
}
