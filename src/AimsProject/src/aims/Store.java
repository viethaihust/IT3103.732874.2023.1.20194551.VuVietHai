package AimsProject.src.aims;

import java.util.ArrayList;

import AimsProject.src.aims.media.Media;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<>();

    public void addMedia(Media media) {
        if(itemsInStore.size() < 100) {
            itemsInStore.add(media);
            System.out.println("The media has been added");
        } else {
            System.out.println("The store is almost full");
        }
    }

    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println("The media has been removed");
        } else {
            System.out.println("The media is not in the store");
        }
    }
    
    public void printStore(){
        System.out.println("*******************************Store*******************************");
        for(Media media:itemsInStore){
            System.out.println(media.toString());
        }
        System.out.println("*******************************************************************");
    }
    
    public Media searchStore(String title){
        for(Media media: itemsInStore){
        	if(media.getTitle() != null) {
        		if(media.getTitle().equals(title)) return media;
        	}
        }
        return null;
    }
}
