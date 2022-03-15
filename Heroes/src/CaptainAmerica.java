public class CaptainAmerica extends Heroes{
    private boolean hasShield;

    public CaptainAmerica(String name, String color, boolean hasShield){
        super(name, color);
        this.hasShield = hasShield;
    }
    public boolean isHasShield() {
        return hasShield;
    }

    public void block(){
        System.out.println(getName() + " has blocked all attacks.");
    }
}
