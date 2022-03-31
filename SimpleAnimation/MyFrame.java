package SimpleAnimation;

import javax.swing.*;

public class MyFrame extends JFrame {

    ImageIcon logo = new ImageIcon("fenix16x.png");
    MyPanel panel;

    MyFrame(){

        panel = new MyPanel();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("PHOENIX CODE -- Mars attack");
        this.setIconImage(logo.getImage());
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
