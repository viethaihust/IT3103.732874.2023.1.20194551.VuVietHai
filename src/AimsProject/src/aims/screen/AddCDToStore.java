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

public class AddCDToStore extends AddMediaToStoreScreen{
    // Attribute
    protected JTextField tfDirector;
    protected JTextField tfLength;
    protected JTextField tfArtist;

    // Constructor

    public AddCDToStore(Store store, Cart cart) {
        super(store, cart, "Add CD to store", "ADD CD TO STORE");
    }

    JPanel createCenter() {
        JPanel center = new JPanel();
        tfDirector = new JTextField(10);
        tfLength = new JTextField(10);
        tfArtist = new JTextField(10);
        center.setLayout (new GridLayout(7, 2, 2, 2));
        addInputRow(center, "Id", tfId);
        addInputRow(center, "Title", tfTitle);
        addInputRow(center, "Category", tfCategory);
        addInputRow(center, "Cost", tfCost);
        addInputRow(center, "Director", tfDirector);
        addInputRow(center, "Length", tfLength);
        addInputRow(center, "Artist", tfArtist);
        return center;
    }

    public Media createMedia() {
        return new CompactDisc(tfTitle.getText(), tfCategory.getText(), Float.parseFloat(tfCost.getText()), tfArtist.getText());
    }
}
