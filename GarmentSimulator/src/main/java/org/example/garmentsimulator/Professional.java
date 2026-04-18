package org.example.garmentsimulator;

public class Professional extends Garment {
    public Professional() {
        this.topStyle = "Button-up";
        this.bottomStyle = "Trouser";
        this.shoeStyle = "Oxford";
        this.gender = "Male";
    }

    @Override
    public String toString() {
        String description;
        description =this.gender + " Garments\nTop: " + this.topStyle + "\nBottom: " + this.bottomStyle + "\nShoe: " + this.shoeStyle;
        return description;
    }
}
