/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacymanagement;

import java.awt.Dimension;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author akib1
 */
public class Search extends JFrame {

    public Search() {
        JLabel jLabel1 = new javax.swing.JLabel();
        TextField textField1 = new java.awt.TextField();
        JButton jButton1 = new javax.swing.JButton();
        JButton jButton3 = new javax.swing.JButton();
        JLabel jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Search Medicine");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, 43));

        textField1.setText("");
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });
        getContentPane().add(textField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 135, 386, 37));

        jButton1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                setVisible(false);
                String s = textField1.getText();
                if (s.toLowerCase().equals("surgel")) {
                    new Surgel();
                }
                else if(s.toLowerCase().equals("napa")){
                new Napa();
                }
                else if(s.toLowerCase().equals("ace")){
                new Ace();
                }
                 else if(s.toLowerCase().equals("tufnil")){
                new Tufnil();
                }
                 else if(s.toLowerCase().equals("tuska")){
                new Tuska();
                }
                  else if(s.toLowerCase().equals("seclo")){
                new Seclo();
                }
                  else{JOptionPane.showMessageDialog(null, "Product not available");}
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(832, 133, 43, -1));

        jButton3.setBackground(new java.awt.Color(0, 153, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jButton3.setText("Back");
        jButton3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                setVisible(false);
                new Homepage();
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 620, -1, -1));

        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 770));
        setSize(new Dimension(1081, 800));
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
