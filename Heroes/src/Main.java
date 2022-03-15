public class Main {
    public static void main(String[] arg){
        Heroes hero1 = new Heroes("Kayla", "Purple");
        System.out.println(hero1.getName());
        System.out.println(hero1.getColor());
        hero1.speak();

        CaptainAmerica cap1 = new CaptainAmerica("Rob", "Blue", true);
        System.out.println(cap1.getName());
        System.out.println(cap1.getColor());
        System.out.println(cap1.isHasShield());
        cap1.block();

        SpiderMan spi1 = new SpiderMan("Peter", "Red", false);
        System.out.println(spi1.getName());
        System.out.println(spi1.getColor());
        System.out.println(spi1.isHasString());
        spi1.climb();
    }

}
