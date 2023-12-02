package AimsProject.src.aims;

import java.util.ArrayList;
import java.util.List;

import AimsProject.src.aims.media.Book;
import AimsProject.src.aims.media.CompactDisc;
import AimsProject.src.aims.media.DigitalVideoDisc;
import AimsProject.src.aims.media.Media;

public class Aims {

	public static void main(String[] args) {
		List<Media> mediae = new ArrayList<>();

        CompactDisc cd1 = new CompactDisc("CD1");
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("DVD1");
        Book book1 = new Book("BOOK1");

        mediae.add(cd1);
        mediae.add(dvd1);
        mediae.add(book1);

        for (Media media : mediae) {
            System.out.println(media.toString());
        }
		
	}

}
