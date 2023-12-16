package AimsProject.src.aims.screen;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;
import AimsProject.src.aims.media.Media;
import AimsProject.src.aims.Cart;
import AimsProject.src.aims.media.Playable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MediaStore extends JPanel{

    private Media media;
    
    public MediaStore(Media media) {

        this.media = media;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel title = new JLabel(media.getTitle());
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
        title.setAlignmentX(CENTER_ALIGNMENT);

        JLabel cost = new JLabel(""+media.getCost()+" $");
        cost.setAlignmentX(CENTER_ALIGNMENT);

        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton addButton = new JButton("Add to cart");
        container.add(addButton);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	StoreScreen.getCart().addMedia(media);
            }
        });
        if(media instanceof Playable) {
        	JButton playButton = new JButton("Play");
            container.add(playButton);
            playButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                	new PlayMedia(media);
                }
            });
        }

        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(Box.createVerticalGlue());
        this.add(container);

        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

}
