package AimsProject.src.aims.screen;

import AimsProject.src.aims.media.Book;
import AimsProject.src.aims.media.CompactDisc;
import AimsProject.src.aims.media.DigitalVideoDisc;
import AimsProject.src.aims.media.Media;
import AimsProject.src.aims.media.Track;
import AimsProject.src.aims.Cart;
import AimsProject.src.aims.Store;

import javax.swing.*;
import java.awt.*;

public class AddBookToStore extends AddMediaToStoreScreen{
    // Constructor
    public AddBookToStore(Store store, Cart cart) {
        super(store, cart, "Add Book to store", "ADD BOOK TO STORE");
    }

    JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout (new GridLayout(4, 2, 2, 2));
        addInputRow(center, "Id", tfId);
        addInputRow(center, "Title", tfTitle);
        addInputRow(center, "Category", tfCategory);
        addInputRow(center, "Cost", tfCost);
        return center;
    }

    public Media createMedia() {
        return new Book(tfTitle.getText(), tfCategory.getText(), Float.parseFloat(tfCost.getText()));
    }
}