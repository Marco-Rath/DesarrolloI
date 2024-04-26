/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package botonessuma;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonesSuma extends JFrame {
    private JLabel labelSuma;

    public BotonesSuma() {
        setTitle("Suma de Botones");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear los botones
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");

        // Crear el label
        labelSuma = new JLabel("0");
        labelSuma.setFont(new Font("Arial", Font.BOLD, 24));
        labelSuma.setHorizontalAlignment(SwingConstants.CENTER);

        // Crear el panel y establecer el layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 3));

        // Agregar los botones al panel
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);

        // Agregar el panel y el label al frame
        add(panel, BorderLayout.CENTER);
        add(labelSuma, BorderLayout.SOUTH);

        // Agregar los listeners a los botones
        btn1.addActionListener(new BotonListener(1));
        btn2.addActionListener(new BotonListener(2));
        btn3.addActionListener(new BotonListener(3));
        btn4.addActionListener(new BotonListener(4));
        btn5.addActionListener(new BotonListener(5));
        btn6.addActionListener(new BotonListener(6));

        // Establecer el tamaño y hacer visible el frame
        setSize(300, 200);
        setVisible(true);
    }

    // Clase interna para manejar los eventos de los botones
    private class BotonListener implements ActionListener {
        private int valor;

        public BotonListener(int valor) {
            this.valor = valor;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // Obtener el valor actual del label
            int sumaActual = Integer.parseInt(labelSuma.getText());

            // Calcular la nueva suma
            int nuevaSuma = sumaActual + valor;

            // Actualizar el label con la nueva suma
            labelSuma.setText(String.valueOf(nuevaSuma));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new BotonesSuma();
            }
        });
    }
}






