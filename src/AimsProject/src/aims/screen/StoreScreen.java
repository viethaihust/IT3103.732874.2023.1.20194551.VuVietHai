package AimsProject.src.aims.screen;

import java.awt.*;
import javax.swing.*;

import AimsProject.src.aims.media.Book;
import AimsProject.src.aims.media.CompactDisc;
import AimsProject.src.aims.media.DigitalVideoDisc;
import AimsProject.src.aims.media.Media;
import AimsProject.src.aims.media.Track;
import AimsProject.src.aims.Cart;
import AimsProject.src.aims.Store;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StoreScreen extends JFrame {
	private Store store;
	private static Cart cart;
	
    JPanel createNorth() {
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }
    
    JMenuBar createMenuBar() {

        JMenu menu = new JMenu("Options");

        JMenu smUpdateStore = new JMenu("Update Store");
        smUpdateStore.add(new JMenuItem("Add Book"));
        smUpdateStore.add(new JMenuItem("Add CD"));
        smUpdateStore.add(new JMenuItem("Add DVD"));

        menu.add(smUpdateStore);
        menu.add(new JMenuItem("View store"));
        menu.add(new JMenuItem("View cart"));

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);

        return menuBar;
    }
    
    JPanel createHeader() {

        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.CYAN);

        JButton cart = new JButton("View cart");
        cart.setPreferredSize(new Dimension(100, 50));
        cart.setMaximumSize(new Dimension(100, 50));

        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(cart);
        header.add(Box.createRigidArea(new Dimension(10, 10)));

        return header;
    }
    
    JPanel createCenter() {

        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3, 3, 2, 2));

        ArrayList<Media> mediaInStore = store.getItemsInStore();
        for (int i = 0; i < mediaInStore.size(); i++) {
            MediaStore cell = new MediaStore(mediaInStore.get(i));
            center.add(cell);
        }

        return center;
    }
    
    public StoreScreen(Store store, Cart cart) {
        this.store = store;
        this.cart = cart;
        
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);

        setVisible(true);
        setTitle("Store");
        setSize(1024, 768);
    }
    
    public static Cart getCart() {
        return cart;
    }
    
    private class btnListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if(command.equals("View Cart")) {
                new CartScreen(cart);
                dispose();
            }
            if(command.equals("View Store")) {
                new StoreScreen(store, cart);
                dispose();
            }
        }
    }
    
    public static void main(String[] args) {
        Store store = new Store();
        Cart cart = new Cart();
        
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("DVD Title 1", "Category 1", "Director 1", 10,  15.0f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("DVD Title 2", "Category 2", "Director 2", 15, 20.0f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("DVD Title 3", "Category 3", "Director 3", 30, 25.0f);

        CompactDisc cd1 = new CompactDisc("CD Title 1", "Category 1", 12.0f, "Artist 1");
        CompactDisc cd2 = new CompactDisc("CD Title 2", "Category 2", 18.0f, "Artist 2");
        CompactDisc cd3 = new CompactDisc("CD Title 3", "Category 3", 22.0f, "Artist 3");

        Book book1 = new Book("Book Title 1", "Category 1", 8.0f);
        Book book2 = new Book("Book Title 2", "Category 2", 10.0f);
        Book book3 = new Book("Book Title 3", "Category 3", 14.0f);
        Book book4 = new Book("Book Title 4", "Category 4", 16.0f);

        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);
        store.addMedia(cd1);
        store.addMedia(cd2);
        store.addMedia(cd3);
        store.addMedia(book1);
        store.addMedia(book2);
        store.addMedia(book3);
        store.addMedia(book4);
        
        new StoreScreen(store, cart);
    }
}
