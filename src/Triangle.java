public class Triangle extends Shape {
    double base, height;
    Triangle (double b, double c){
        this.base = b;
        this.height = c;
    };
    @Override

    double calculateArea(){
        return 0.5 * base * height;
    }
}
