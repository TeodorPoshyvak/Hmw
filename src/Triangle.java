public class Triangle extends Shape{
    public String triangle;

    public Triangle(String triangle){
        this.triangle = triangle;
    }

    @Override
    public String getName() {
       return triangle;
    }
}
