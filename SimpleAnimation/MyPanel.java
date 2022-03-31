package SimpleAnimation;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {

    final int P_WIDTH = 1200;
    final int P_HEIGHT = 700;
    Image foe1;
    Image backGround;
    Timer timer;
    int xSpeed = 3;
    int ySpeed = 5;
    int x = 0;
    int y = 0;

    MyPanel() {
        this.setPreferredSize(new Dimension(P_WIDTH, P_HEIGHT));
        this.setBackground(Color.black);
        backGround = new ImageIcon("Earth.jpg").getImage();
        foe1 = new ImageIcon("spaceship.png").getImage();
        timer = new Timer(1, this);
        timer.start();
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(backGround, 0, 0, null);
        g2D.drawImage(foe1, x, y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (x > P_WIDTH - foe1.getWidth(null) || x < 0) {
            xSpeed = xSpeed * -1;
        }

        x = x + xSpeed;

        if (y > P_HEIGHT - foe1.getHeight(null) || y < 0) {
            ySpeed = ySpeed * -1;
        }

        y = y + ySpeed;
        repaint();
    }
}
