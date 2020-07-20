package DayTwoSecond;

public class Main {


    public static void main(String[] args) {
        Rectangle one = new Rectangle();
        one.setHeight(3);
        one.setWidth(19);
        System.out.println("Color before Override : " + one.getColor());
        one.setColor("Black");
        System.out.println("Color after Override : " + one.getColor());
        one.calculateSurface();
        one.calculateCircumference();

        Rectangle two = new Rectangle(5,6);
        two.calculateSurface();
        two.calculateCircumference();
    }
}
