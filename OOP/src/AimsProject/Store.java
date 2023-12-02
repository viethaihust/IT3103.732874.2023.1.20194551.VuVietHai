package AimsProject;

public class Store {
    DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[100];
    int qtyInStore = 0;

    public void addDVD(DigitalVideoDisc disc) {
        if(qtyInStore < 100) {
            itemsInStore[qtyInStore] = disc;
            qtyInStore++;
            System.out.println("The disc has been added.");
        }
        else {
            System.out.println("The store is full. Cannot add more DVD.");
        }
    }

    public void removeDVD(DigitalVideoDisc disc) {
        for(int i = 0; i < qtyInStore; i++) {
            if(itemsInStore[i] == disc) {
                for(int j = i; j < qtyInStore; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                qtyInStore--;
                System.out.println("The disc has been removed.");
                return;
            }
        }
        System.out.println("The disc is not in the store.");
    }
}
