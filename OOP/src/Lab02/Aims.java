package Lab02;

public class Aims {

	public static void main(String[] args) {
		Cart anOrder = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", "", 87, 19.95f);
        
		
		DigitalVideoDisc [] dvdList = {dvd1, dvd2, dvd3};
		anOrder.addDigitalVideoDisc(dvdList);
        anOrder.printCart();
		
	}

}
