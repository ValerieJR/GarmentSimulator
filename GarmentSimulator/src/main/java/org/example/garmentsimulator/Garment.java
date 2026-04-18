package org.example.garmentsimulator;

public abstract class Garment {
    protected String topStyle;
    protected String bottomStyle;
    protected String shoeStyle;
    protected String gender;

    public String getBottomStyle() {
        return bottomStyle;
    }

    public String getTopStyle() {
        return topStyle;
    }

    public String getShoeStyle() {
        return shoeStyle;
    }

    public void setBottomStyle(String bottomStyle) {
        this.bottomStyle = bottomStyle;
    }

    public void setShoeStyle(String shoeStyle) {
        this.shoeStyle = shoeStyle;
    }

    public void setTopStyle(String topStyle) {
        this.topStyle = topStyle;
    }

    public void setGender(String gender) { this.gender = gender;}

    @Override
    public String toString() {
        String description;
        description =this.gender + " Garments\nTop: " + this.topStyle + "\nBottom: " + this.bottomStyle + "\nShoe: " + this.shoeStyle;
        return description;
    }
}
