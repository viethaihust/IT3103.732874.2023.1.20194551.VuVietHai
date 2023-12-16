package AimsProject.src.aims;

import java.util.ArrayList;
import java.util.List;

import AimsProject.src.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;

    private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();

    public void addMedia(Media media) {
        if (itemsOrdered.size() < MAX_NUMBER_ORDERED) {
            if(itemsOrdered.contains(media)) {
                System.out.println("The media is already in the cart");
                return;
            }
            itemsOrdered.add(media);
            System.out.println("The media has been added");
        } else {
            System.out.println("The cart is almost full");
        }
    }

    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println("The media has been removed");
        } else {
            System.out.println("The media is not in the cart");
        }
    }

    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered items:");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.println(i + 1 + ". DVD - " + itemsOrdered.get(i).getTitle() + " - "
                    + itemsOrdered.get(i).getCategory() + ": " + itemsOrdered.get(i).getCost() + "$");
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }
    
    public ObservableList<Media> getItemOrdered() {
        return itemsOrdered;
    }
    
    public Media Search(String title){
        for(Media media: itemsOrdered){
            if(media.getTitle().equals(title)) return media;
        }
        return null;
    }

}