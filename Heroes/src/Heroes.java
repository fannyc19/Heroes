public class Heroes {
    private String color;
    private String name;

    public Heroes(String name, String color) {
        this.color = color;
        this.name = name;
    }


    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void speak(){
        System.out.println("Hello, I'm " + getName());
    }
}
