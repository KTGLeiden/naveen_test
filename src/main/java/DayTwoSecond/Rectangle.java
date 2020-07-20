package DayTwoSecond;

public class Rectangle {

    private int height, width;
    private String color = "No Color";

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(int height, int width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public Rectangle(){
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void calculateSurface(){
        System.out.println("Surface of the rectangle : " + this.height*this.width);
    }

    public void calculateCircumference(){
        System.out.println("Circumference of the rectangle : " + (2*this.height)+(2*this.width));
    }

}
