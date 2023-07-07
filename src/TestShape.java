public class TestShape {
    public static void main(String[] args) {
         PrintFigureConsole printFigureConsole = new PrintFigureConsole();
         Shape shape = new Shape();
         Shape circle = new Circle();
         Shape diamond = new Diamond();
         Shape quad = new Quad();
         Shape trapezium = new Trapezium();
         Shape triangle = new Triangle();

         printFigureConsole.printFigureVar(shape);
         printFigureConsole.printFigureVar(circle);
         printFigureConsole.printFigureVar(diamond);
         printFigureConsole.printFigureVar(quad);
         printFigureConsole.printFigureVar(trapezium);
         printFigureConsole.printFigureVar(triangle);


    }
}
