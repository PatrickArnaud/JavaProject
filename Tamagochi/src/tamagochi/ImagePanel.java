/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamagochi;

import javax.swing.*;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class ImagePanel {

    ImagePanel() {
        try {
            JFrame f = new JFrame("Ajouter une image dans JPanel");
            JPanel panel = new JPanel();
            panel.setBounds(50, 50, 250, 250);
            BufferedImage img = ImageIO.read(new File("test.png"));
            JLabel pic = new JLabel(new ImageIcon(img));
            panel.add(pic);
            f.add(panel);
            f.setSize(400, 400);
            f.setLayout(null);
            f.setVisible(true);
        } catch (IOException e) {
        }
    }

    public static void main(String args[]) {
        new ImagePanel();
    }
}
