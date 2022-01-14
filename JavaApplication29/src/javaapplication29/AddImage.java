/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AddImage {

 public static void main(String[] args) {
  
     //Création de JFrame
     JFrame frame = new JFrame("JLabel Test");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(530,600);
     frame.setLocationRelativeTo(null);
     frame.setVisible(true);
          //URL de l'image
     String imgUrl="test.png";
     ImageIcon icone = new ImageIcon(imgUrl);
       //Création de JLable avec un alignement gauche
     JLabel jlabel = new JLabel(icone, JLabel.CENTER);
       //ajouter les deux JLabel a JFrame
     frame.getContentPane().add(jlabel);
     frame.validate();
 }
}
