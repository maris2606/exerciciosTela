package ex02;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ex02 {

    private JFrame frame;
    private JTextField textFieldNum1;
    private JTextField textFieldNum2;
    private JLabel lblResultado;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Ex02 window = new Ex02();
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
    public Ex02() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(250, 240, 230));
        frame.setBounds(200, 200, 400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNum1 = new JLabel("Número 1:");
        lblNum1.setBounds(10, 30, 80, 14);
        frame.getContentPane().add(lblNum1);

        textFieldNum1 = new JTextField();
        textFieldNum1.setBounds(100, 27, 250, 20);
        frame.getContentPane().add(textFieldNum1);
        textFieldNum1.setColumns(10);

        JLabel lblNum2 = new JLabel("Número 2:");
        lblNum2.setBounds(10, 80, 80, 14);
        frame.getContentPane().add(lblNum2);

        textFieldNum2 = new JTextField();
        textFieldNum2.setBounds(100, 77, 250, 20);
        frame.getContentPane().add(textFieldNum2);
        textFieldNum2.setColumns(10);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBackground(new Color(222, 184, 135));
        btnCalcular.setBounds(150, 130, 100, 30);
        frame.getContentPane().add(btnCalcular);

        lblResultado = new JLabel("Resultado: ");
        lblResultado.setBounds(10, 180, 340, 20);
        frame.getContentPane().add(lblResultado);

        // Adiciona o evento ao botão
        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Obtém os números dos campos de texto
                    double num1 = Double.parseDouble(textFieldNum1.getText());
                    double num2 = Double.parseDouble(textFieldNum2.getText());

                    // Calcula a soma
                    double soma = num1 + num2;

                    // Exibe o resultado
                    lblResultado.setText("Resultado: " + soma);
                } catch (NumberFormatException ex) {
                    lblResultado.setText("Por favor, insira números válidos!");
                }
            }
        });
    }
}
