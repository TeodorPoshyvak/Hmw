public class Diamond extends Shape{
    public String diamond;

    public Diamond(String diamond){
        this.diamond = diamond;
    }

    @Override
    public String getName() {
        return diamond;
    }
}
