package org.example.garmentsimulator;

public class Professional extends Garment {
    public Professional() {
        this.topStyle = "Button-up";
        this.bottomStyle = "Trouser";
        this.shoeStyle = "Oxford";
    }

    @Override
    public String toString() {
        String description;
        description = "Top: " + this.topStyle + "\nBottom: " + this.bottomStyle + "\nShoe: " + this.shoeStyle;
        return description;
    }
}
