package org.example.garmentsimulator;

public abstract class Garment {
    protected String topStyle;
    protected String bottomStyle;
    protected String shoeStyle;




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

    @Override
    public String toString() {
        String description;
        description = "Top: " + this.topStyle + "\nBottom: " + this.bottomStyle + "\nShoe: " + this.shoeStyle;
        return description;
    }
}
