/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prycalculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pryCalculadoraSwing {
    // Variables para los números
    private static double numero1 = 0;
    private static double numero2 = 0;
    
    // Componentes de la interfaz
    private static JTextField txtNumero1;
    private static JTextField txtNumero2;
    private static JTextField txtResultado;
    
    public static void main(String[] args) {
        // Crear la ventana principal
        JFrame frame = new JFrame("Calculadora Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());
        
        // Panel para los campos de entrada
        JPanel panelEntrada = new JPanel(new GridLayout(3, 2, 5, 5));
        
        panelEntrada.add(new JLabel("Número 1:"));
        txtNumero1 = new JTextField();
        panelEntrada.add(txtNumero1);
        
        panelEntrada.add(new JLabel("Número 2:"));
        txtNumero2 = new JTextField();
        panelEntrada.add(txtNumero2);
        
        panelEntrada.add(new JLabel("Resultado:"));
        txtResultado = new JTextField();
        txtResultado.setEditable(false);
        panelEntrada.add(txtResultado);
        
        // Panel para los botones de operaciones
        JPanel panelBotones = new JPanel(new GridLayout(1, 4, 5, 5));
        
        JButton btnSuma = new JButton("Suma");
        JButton btnResta = new JButton("Resta");
        JButton btnMultiplicacion = new JButton("Multiplicación");
        JButton btnDivision = new JButton("División");
        
        panelBotones.add(btnSuma);
        panelBotones.add(btnResta);
        panelBotones.add(btnMultiplicacion);
        panelBotones.add(btnDivision);
        
        // Agregar paneles a la ventana
        frame.add(panelEntrada, BorderLayout.CENTER);
        frame.add(panelBotones, BorderLayout.SOUTH);
        
        // Manejadores de eventos para los botones
        btnSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(validarEntradas()) {
                    double resultado = numero1 + numero2;
                    txtResultado.setText(String.valueOf(resultado));
                }
            }
        });
        
        btnResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(validarEntradas()) {
                    double resultado = numero1 - numero2;
                    txtResultado.setText(String.valueOf(resultado));
                }
            }
        });
        
        btnMultiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(validarEntradas()) {
                    double resultado = numero1 * numero2;
                    txtResultado.setText(String.valueOf(resultado));
                }
            }
        });
        
        btnDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(validarEntradas()) {
                    if(numero2 == 0) {
                        JOptionPane.showMessageDialog(frame, "Error: No se puede dividir por cero", 
                            "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        double resultado = numero1 / numero2;
                        txtResultado.setText(String.valueOf(resultado));
                    }
                }
            }
        });
        
        // Mostrar la ventana
        frame.setVisible(true);
    }
    
    // Método para validar las entradas
    private static boolean validarEntradas() {
        try {
            numero1 = Double.parseDouble(txtNumero1.getText());
            numero2 = Double.parseDouble(txtNumero2.getText());
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese números válidos", 
                "Error de entrada", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}