package AimsProject.Lab02;

public class CartTest {
    public static void main (String[] args) {

        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        cart.addDigitalVideoDisc(dvd3);

        cart.print();

        System.out.println("Search for a DVD with the ID 1: ");
        cart.isMatch(1);
        System.out.println("Search for a DVD with the ID 6: ");
        cart.isMatch(6);

        System.out.println("Search for a DVD with the title \"The Lion King\":");
        cart.isMatch("The Lion King");

        System.out.println("Search for a DVD with the title \"Hello\":");
        cart.isMatch("Hello");
    }

}
