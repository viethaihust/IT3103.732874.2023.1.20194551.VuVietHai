package Lab02;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private int qtyOrdered;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The disc has been added.");
		} else 
			System.out.println("The cart is full. Cannot add more DVDs.");
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for(int i = 0; i < qtyOrdered; i++) {
			if(itemsOrdered[i] == disc) {
				for(int j = i; j < qtyOrdered; j++) {
					itemsOrdered[j] = itemsOrdered[j + 1];
				}
				qtyOrdered--;
				System.out.println("The disc has been removed.");
				return;
			}
		}
		System.out.println("DVD is not found in the cart.");
	}
		
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
        if(qtyOrdered+dvdList.length <= MAX_NUMBERS_ORDERED){
            for(int i = 0; i < dvdList.length; i++) {
            	itemsOrdered[i] = dvdList[i];
            	qtyOrdered++;
    		}
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is full. Cannot add more DVDs.");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        if(qtyOrdered+2 <= MAX_NUMBERS_ORDERED){
            itemsOrdered[qtyOrdered]=dvd1;
            itemsOrdered[qtyOrdered+1]=dvd2;
            qtyOrdered=qtyOrdered+2;
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is full. Cannot add more DVDs.");
        }
    }
	
	public float totalCost() {
		float total = 0.0f;
		for(int i = 0; i < qtyOrdered; i++) {
			total += itemsOrdered[i].getCost();
		}
		return total;
	}
}
