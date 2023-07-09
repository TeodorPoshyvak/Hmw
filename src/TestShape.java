public class TestShape {
    public static void main(String[] args) {
         Shape[] shapes = new Shape[5];
         shapes[0] =  new Circle("Circle");
         shapes[1] =  new Diamond("Diamond");
         shapes[2] =  new Quad("Quad");
         shapes[3] =  new Trapezium("Trapezium");
         shapes[4] =  new Triangle("Triangle");

         for(Shape figure : shapes){
              PrintFigureConsole.printFigure(figure);
         }
    }
}
