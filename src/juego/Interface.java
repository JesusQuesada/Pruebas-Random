/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Diego
 */
public class Interface extends Frame implements ActionListener {

    private Button btn_guardar, btn_salir, btn_inventario;
    private TextField v_general, v_accion;

    public Interface() {

        super("Juego");
        setLayout(new GridLayout(3, 4));

        v_general = new TextField();
        add(v_general);
        v_accion = new TextField();
        btn_inventario = new Button("Inventario");
        add(btn_inventario);
        btn_inventario.addActionListener(this);

        btn_guardar = new Button("Guardar");
        add(btn_guardar);
        btn_guardar.addActionListener(this);
        btn_salir = new Button("Salir");
        add(btn_salir);
        btn_salir.addActionListener(this);

        setSize(600, 600);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn_salir) {
            System.exit(0);
        } else if (e.getSource() == btn_guardar) {
            System.out.println("Guardar");
        } else if (e.getSource() == btn_inventario) {
            System.out.println("Mostrar Inventario");

        }
    }

}
