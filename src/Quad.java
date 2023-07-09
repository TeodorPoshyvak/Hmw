public class Quad extends Shape{
    public String quad;

    public Quad(String quad){
        this.quad = quad;
    }

    @Override
    public String getName() {
        return quad;
    }
}
