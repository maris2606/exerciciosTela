package ex03;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ex03 {

    private JFrame frame;
    private JTextField textFieldCelsius;
    private JLabel lblResultado;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Ex03 window = new Ex03();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Ex03() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(250, 240, 230));
        frame.setBounds(200, 200, 400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        // Label para instrução
        JLabel lblCelsius = new JLabel("Temperatura em Celsius:");
        lblCelsius.setBounds(10, 30, 150, 20);
        frame.getContentPane().add(lblCelsius);

        // Campo de texto para inserir temperatura em Celsius
        textFieldCelsius = new JTextField();
        textFieldCelsius.setBounds(170, 30, 100, 20);
        frame.getContentPane().add(textFieldCelsius);
        textFieldCelsius.setColumns(10);

        // Botão para converter
        JButton btnConverter = new JButton("Converter");
        btnConverter.setBackground(new Color(222, 184, 135));
        btnConverter.setBounds(280, 30, 100, 20);
        frame.getContentPane().add(btnConverter);

        // Label para exibir o resultado
        lblResultado = new JLabel("Resultado: ");
        lblResultado.setBounds(10, 80, 360, 20);
        frame.getContentPane().add(lblResultado);

        // Adiciona ação ao botão Converter
        btnConverter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Obtém a temperatura em Celsius
                    double celsius = Double.parseDouble(textFieldCelsius.getText());

                    // Converte para Fahrenheit
                    double fahrenheit = (celsius * 9 / 5) + 32;

                    // Exibe o resultado
                    lblResultado.setText("Resultado: " + fahrenheit + " °F");
                } catch (NumberFormatException ex) {
                    lblResultado.setText("Por favor, insira um valor válido!");
                }
            }
        });
    }
}
