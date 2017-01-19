package lesson1;

/**
 * Created by ${yleanavlaun} on ${01/10/2012}.
 */
public class MyClass {
    //classes in Java can be extended, creating a new class which keep the characteristics of the base class.
    //in this exercise the base class will be "Polygon"
    // whenever using inheritance, all properties of the base class(in this case "Polygon" are made available
    //to the derived class in this case "Rectangle" & "Triangle" class.
    //The methods are extended from the "Polygon" class to the "Rectangle" and "Triangle" classes.

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Triangle tri = new Triangle();

        rec.setValues(10, 10);
        tri.setValues(10, 10);

        System.out.println("The area of the rectangle is = " + rec.area());
        System.out.println("The area of the triangle is = " + tri.area());

    }
}
