package AimsProject.src.aims.screen;

import javax.swing.*;

import AimsProject.src.aims.media.Media;

import java.awt.*;

public class PlayMedia extends JFrame {
    public PlayMedia(Media media) {
        JDialog d = new JDialog(new JFrame(), "Play Media");
        
        JLabel l = new JLabel("Playing media: " + media.getTitle(), SwingConstants.CENTER);

        d.add(l);
        d.setSize(256, 192);
        d.setVisible(true);
    }
}
