public class Circle extends Shape{
    public String circle;

    public Circle(String circle){
        this.circle = circle;
    }
    @Override
    public String getName() {
        return circle;
    }
}
