public class SpiderMan extends Heroes{
    private boolean hasString;

    public SpiderMan(String name, String color, boolean hasString){
        super(name, color);
        this.hasString = hasString;
    }
    public boolean isHasString() {
        return hasString;
    }

    public void climb(){
        System.out.println(getName() + " has climbed the building!");
    }
}
