//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape a = new Circle(4);
        Shape b = new Rectangle(2,4);
        Shape c = new Triangle(5,5);

        System.out.println("Circle Area:" + a.calculateArea());
        System.out.println("Rectangle Area:" +b.calculateArea());
        System.out.println("Triangle Area:" +c.calculateArea());
    }
}