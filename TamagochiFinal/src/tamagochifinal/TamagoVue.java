/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamagochifinal;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Patri
 */
public class TamagoVue extends javax.swing.JFrame {

    /**
     * Creates new form TamagoVue
     */
    Tamagochi kiki;

    public TamagoVue() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        start = new javax.swing.JButton();
        mange = new javax.swing.JButton();
        boire = new javax.swing.JButton();
        dormir = new javax.swing.JButton();
        jouer = new javax.swing.JButton();
        sport = new javax.swing.JButton();
        texte = new javax.swing.JTextField();
        faimSlide = new javax.swing.JProgressBar();
        labelFaim = new javax.swing.JLabel();
        faimAffiche = new javax.swing.JTextField();
        labelSoif = new javax.swing.JLabel();
        soifAffiche = new javax.swing.JTextField();
        soifSlide = new javax.swing.JProgressBar();
        labelBonheu = new javax.swing.JLabel();
        bonheurAffiche = new javax.swing.JTextField();
        bonheurSlide = new javax.swing.JProgressBar();
        labelEnergie = new javax.swing.JLabel();
        energieSlide = new javax.swing.JProgressBar();
        energieAffiche = new javax.swing.JTextField();
        labelPoid = new javax.swing.JLabel();
        poidSlide = new javax.swing.JProgressBar();
        poidAffiche = new javax.swing.JTextField();
        ancre = new javax.swing.JPanel();
        labelPoid1 = new javax.swing.JLabel();
        ageSlide = new javax.swing.JProgressBar();
        ageAffiche = new javax.swing.JTextField();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        start.setText("Démarrer");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        mange.setText("Manger");
        mange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mangeActionPerformed(evt);
            }
        });

        boire.setText("Boire");
        boire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boireActionPerformed(evt);
            }
        });

        dormir.setText("Dormir");
        dormir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dormirActionPerformed(evt);
            }
        });

        jouer.setText("Jouer");
        jouer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jouerActionPerformed(evt);
            }
        });

        sport.setText("Sport");
        sport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sportActionPerformed(evt);
            }
        });

        texte.setText("Tamagochi version Finale ");
        texte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texteActionPerformed(evt);
            }
        });

        faimSlide.setMaximum(10);
        faimSlide.setValue(10);

        labelFaim.setText("Faim");

        faimAffiche.setText("10");

        labelSoif.setText("Soif");

        soifAffiche.setText("10");

        soifSlide.setMaximum(10);
        soifSlide.setValue(10);

        labelBonheu.setText("Bonheur");

        bonheurAffiche.setText("10");

        bonheurSlide.setMaximum(10);
        bonheurSlide.setValue(10);

        labelEnergie.setText("Energie");

        energieSlide.setMaximum(10);
        energieSlide.setValue(10);

        energieAffiche.setText("10");

        labelPoid.setText("Poid");

        poidSlide.setMaximum(15);
        poidSlide.setValue(10);

        poidAffiche.setText("10");
        poidAffiche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poidAfficheActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ancreLayout = new javax.swing.GroupLayout(ancre);
        ancre.setLayout(ancreLayout);
        ancreLayout.setHorizontalGroup(
            ancreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        ancreLayout.setVerticalGroup(
            ancreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        labelPoid1.setText("Age");

        ageAffiche.setText("0");
        ageAffiche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageAfficheActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(texte, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelFaim, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(faimAffiche, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(faimSlide, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mange)
                        .addGap(50, 50, 50)
                        .addComponent(boire)
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ancre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(285, 285, 285)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(soifSlide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelSoif, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(soifAffiche, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(energieSlide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelEnergie, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(energieAffiche, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(labelPoid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(27, 27, 27)
                                        .addComponent(poidAffiche, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(poidSlide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelBonheu, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bonheurAffiche, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(bonheurSlide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dormir)
                                .addGap(50, 50, 50)
                                .addComponent(jouer)
                                .addGap(50, 50, 50)
                                .addComponent(sport)
                                .addGap(119, 119, 119)
                                .addComponent(start)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelPoid1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(27, 27, 27)
                        .addComponent(ageAffiche, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ageSlide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(texte, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelFaim)
                            .addComponent(faimAffiche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(faimSlide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSoif)
                    .addComponent(soifAffiche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(soifSlide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBonheu)
                    .addComponent(bonheurAffiche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bonheurSlide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelEnergie)
                            .addComponent(energieAffiche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(energieSlide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPoid)
                            .addComponent(poidAffiche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(ancre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(poidSlide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPoid1)
                    .addComponent(ageAffiche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ageSlide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(start)
                    .addComponent(mange)
                    .addComponent(boire)
                    .addComponent(dormir)
                    .addComponent(jouer)
                    .addComponent(sport))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void texteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texteActionPerformed

    private void poidAfficheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poidAfficheActionPerformed

    }//GEN-LAST:event_poidAfficheActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed

        kiki = new Tamagochi(10, 10, 10, 10, 10, 10, 0, true);
        texte.setText("Bienvenue dans Tamagochi v 2.0 !    Kiki est impatient que vous vous occupiez de lui !");
        faimAffiche.setText(kiki.getFaimAffiche());
        soifAffiche.setText(kiki.getSoifAffiche());
        energieAffiche.setText(kiki.getEnergieAffiche());
        poidAffiche.setText(kiki.getPoidAffiche());
        JFrame frame = new JFrame("animation");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(ancre);
        frame.setVisible(true);
        String imgUrl = "base.gif";
        ImageIcon icone = new ImageIcon(imgUrl);
        JLabel jlabel = new JLabel(icone, JLabel.CENTER);
        frame.getContentPane().add(jlabel);
        frame.validate();

    }//GEN-LAST:event_startActionPerformed

    private void dormirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dormirActionPerformed
        if (kiki != null) {
            kiki.dort();
            texte.setText("hummmf grrrrr!! (Kiki à bien dormi il est totalement reposé)");
            majAffiche();
            if (!kiki.checkAlive()) {
                texte.setText(kiki.causeDc());
                kiki = null;
                majAffiche();
                mort();
            }
            if (kiki!= null) {
                JFrame frame = new JFrame("animation");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setSize(500, 400);
                frame.setLocationRelativeTo(ancre);
                frame.setVisible(true);
                String imgUrl = "dort.gif";
                ImageIcon icone = new ImageIcon(imgUrl);
                JLabel jlabel = new JLabel(icone, JLabel.CENTER);
                frame.getContentPane().add(jlabel);
                frame.validate();
            }
        } else {
            texte.setText("cliquez sur le bouton démarrer pour lancer une partie !");
        }
    }//GEN-LAST:event_dormirActionPerformed

    private void boireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boireActionPerformed
        if (kiki != null) {
            kiki.bois();
            texte.setText("hummmf grrrrr!! (Kiki à bien bu il n'a plus soif)");
            majAffiche();
            if (!kiki.checkAlive()) {
                texte.setText(kiki.causeDc());
                kiki = null;
                majAffiche();
                mort();
            }
            if (kiki!= null) {
                JFrame frame = new JFrame("animation");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setSize(500, 400);
                frame.setLocationRelativeTo(ancre);
                frame.setVisible(true);
                String imgUrl = "boire.gif";
                ImageIcon icone = new ImageIcon(imgUrl);
                JLabel jlabel = new JLabel(icone, JLabel.CENTER);
                frame.getContentPane().add(jlabel);
                frame.validate();
            }
        } else {
            texte.setText("cliquez sur le bouton démarrer pour lancer une partie !");
        }
    }//GEN-LAST:event_boireActionPerformed

    private void mangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mangeActionPerformed
        if (kiki != null) {
            kiki.mange();
            texte.setText("hummmf grrrrr!! (Kiki à bien mangé il n'a plus faim)");
            majAffiche();
            if (!kiki.checkAlive()) {
                texte.setText(kiki.causeDc());
                kiki = null;
                majAffiche();
                mort();

            }
            if (kiki!= null) {
                JFrame frame = new JFrame("animation");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setSize(500, 400);
                frame.setLocationRelativeTo(ancre);
                frame.setVisible(true);
                String imgUrl = "mange.gif";
                ImageIcon icone = new ImageIcon(imgUrl);
                JLabel jlabel = new JLabel(icone, JLabel.CENTER);
                frame.getContentPane().add(jlabel);
                frame.validate();
            }
        } else {
            texte.setText("cliquez sur le bouton démarrer pour lancer une partie !");
        }
    }//GEN-LAST:event_mangeActionPerformed

    private void sportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sportActionPerformed
        if (kiki != null) {
            kiki.sport();
            texte.setText("hummmf grrrrr!! (Kiki c'est bien dépensé, il a perdu du poid)");
            majAffiche();
            if (!kiki.checkAlive()) {
                texte.setText(kiki.causeDc());
                kiki = null;
                majAffiche();
                mort();
            }
            if (kiki!= null) {
                JFrame frame = new JFrame("animation");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setSize(500, 400);
                frame.setLocationRelativeTo(ancre);
                frame.setVisible(true);
                String imgUrl = "sport.gif";
                ImageIcon icone = new ImageIcon(imgUrl);
                JLabel jlabel = new JLabel(icone, JLabel.CENTER);
                frame.getContentPane().add(jlabel);
                frame.validate();
            }
        } else {
            texte.setText("cliquez sur le bouton démarrer pour lancer une partie !");
        }
    }//GEN-LAST:event_sportActionPerformed

    private void jouerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jouerActionPerformed
        if (kiki != null) {
            kiki.joue();
            texte.setText("hummmf grrrrr!! (Kiki c'est bien amusé, il est très heureux)");
            majAffiche();
            if (!kiki.checkAlive()) {
                texte.setText(kiki.causeDc());
                kiki = null;
                majAffiche();
                mort();
            }
            if (kiki!= null) {
                JFrame frame = new JFrame("animation");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setSize(500, 400);
                frame.setLocationRelativeTo(ancre);
                frame.setVisible(true);
                String imgUrl = "jouer.gif";
                ImageIcon icone = new ImageIcon(imgUrl);
                JLabel jlabel = new JLabel(icone, JLabel.CENTER);
                frame.getContentPane().add(jlabel);
                frame.validate();
            }
        } else {
            texte.setText("cliquez sur le bouton démarrer pour lancer une partie !");
        }
    }//GEN-LAST:event_jouerActionPerformed

    private void ageAfficheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageAfficheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageAfficheActionPerformed

    //mise a jour des info numérique 
    private void majAffiche() {
        if (kiki != null) {
            faimAffiche.setText(kiki.getFaimAffiche());
            soifAffiche.setText(kiki.getSoifAffiche());
            energieAffiche.setText(kiki.getEnergieAffiche());
            poidAffiche.setText(kiki.getPoidAffiche());
            ageAffiche.setText(kiki.getAgeAffiche());
            bonheurAffiche.setText(kiki.getBonheurAffiche());
            //mise a jour des barre d'état
            majSlide();
        } else {
            faimAffiche.setText("perdu");
            soifAffiche.setText("perdu");
            energieAffiche.setText("perdu");
            poidAffiche.setText("perdu");
            ageAffiche.setText("perdu");
            bonheurAffiche.setText("perdu");
        }
    }

    void mort() {
        JFrame frame = new JFrame("animation");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(ancre);
        frame.setVisible(true);
        String imgUrl = "mort.gif";
        ImageIcon icone = new ImageIcon(imgUrl);
        JLabel jlabel = new JLabel(icone, JLabel.CENTER);
        frame.getContentPane().add(jlabel);
        frame.validate();
    }

    void majSlide() {
        faimSlide.setValue(kiki.getFaim());
        soifSlide.setValue(kiki.getSoif());
        bonheurSlide.setValue(kiki.getBonheur());
        energieSlide.setValue(kiki.getEnergie());
        ageSlide.setValue(kiki.getAge());
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TamagoVue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageAffiche;
    private javax.swing.JProgressBar ageSlide;
    private javax.swing.JPanel ancre;
    private javax.swing.JButton boire;
    private javax.swing.JTextField bonheurAffiche;
    private javax.swing.JProgressBar bonheurSlide;
    private javax.swing.JButton dormir;
    private javax.swing.JTextField energieAffiche;
    private javax.swing.JProgressBar energieSlide;
    private javax.swing.JTextField faimAffiche;
    private javax.swing.JProgressBar faimSlide;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JButton jouer;
    private javax.swing.JLabel labelBonheu;
    private javax.swing.JLabel labelEnergie;
    private javax.swing.JLabel labelFaim;
    private javax.swing.JLabel labelPoid;
    private javax.swing.JLabel labelPoid1;
    private javax.swing.JLabel labelSoif;
    private javax.swing.JButton mange;
    private javax.swing.JTextField poidAffiche;
    private javax.swing.JProgressBar poidSlide;
    private javax.swing.JTextField soifAffiche;
    private javax.swing.JProgressBar soifSlide;
    private javax.swing.JButton sport;
    private javax.swing.JButton start;
    private javax.swing.JTextField texte;
    // End of variables declaration//GEN-END:variables
}
