 class Circle extends Shape{
    double radius;

    Circle(double r) {
      this .radius  = r;
    }

    @Override
            double calculateArea(){
               return Math.PI * radius * radius;
            }


}
