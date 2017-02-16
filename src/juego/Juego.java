/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Diego
 */
public class Juego extends Frame implements ActionListener {

    private Button b1, b2, b3;

    public Juego() {

        super("Menu");

        setLayout(new GridLayout(3, 0));
        b1 = new Button("EMPEZAR");
        add(b1);
        b1.addActionListener(this);
        b2 = new Button("HISTORIA");
        add(b2);
        b3 = new Button("SALIR");
        add(b3);
        b3.addActionListener(this);

        setSize(300, 400);
        setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Juego menu = new Juego();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b3) {
            System.exit(0);
        }else if(e.getSource() == b1){
            Interface inter = new Interface();
            inter.show();
            dispose();
        }
        
    }

}
