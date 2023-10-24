/**
 * Write a class with the name Wall. The class needs two fields (instance variables) with name width and height
 * of type double. The class needs to have two constructors. The first constructor does not have any parameters
 * (no-arg constructor). The second constructor has parameters width and height of type double and it needs to
 * initialize the fields. In case the width is less than 0 it needs to set the width field value to 0, in case
 * the height parameter is less than 0 it needs to set the height field value to 0. Write the following methods
 * (instance methods): Method named getWidth without any parameters, it needs to return the value of width field.
 * Method named getHeight without any parameters, it needs to return the value of height field.
 * Method named setWidth with one parameter of type double, it needs to set the value of the width field.
 * If the parameter is less than 0 it needs to set the width field value to 0.
 * Method named setHeight with one parameter of type double, it needs to set the value of the height field.
 * If the parameter is less than 0 it needs to set the height field value to 0.
 * Method named getArea without any parameters, it needs to return the area of the wall.
 * Expected Output: area= 20.0 width= 5.0 height= 0.0 area= 0.0
 * NOTE: All methods should be defined as public NOT public static.
 * NOTE: In total, you have to write 5 methods and 2 constructors.
 */
public class Programme_15_WallArea {
    // Instance variables
    double width;
    double height;
    // No-arg constructor
    public Programme_15_WallArea() {
        this.width = 0.0;
        this.height = 0.0;
    }
    // Constructor to determine height and width parameters
    public Programme_15_WallArea(double width, double height) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }
    // Getter for width and height
    public double getWidth() {
        return this.width;
    }
    public double getHeight() {
        return this.height;
    }
    // Setter method for width and height
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }
    // Calculation of wall area. Area = width * height
    public double getArea() {
        return this.width * this.height;
    }
    public static void main(String[] args) {
        // Creating wall object with data width 5 and height 4
        Programme_15_WallArea wall = new Programme_15_WallArea(5, 4);
        System.out.println("area= " + wall.getArea()); // Print initial area
        wall.setHeight(-1.5); // Set invalid height
        // Print width, height and area
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}