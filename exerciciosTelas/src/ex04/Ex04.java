package ex04;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;

public class Ex04 {

	private JFrame frame;
	private JTextField textFieldNome;
	private JPasswordField textFieldSenha;
	private JLabel lblNome;
	private JLabel lblSenha;
	private JTextField textFieldEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex04 window = new Ex04();
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
	public Ex04() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(250, 240, 230));
		frame.setBounds(200, 200, 500, 431);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldNome = new JTextField();
		textFieldNome.setToolTipText("insira seu nome, apenas com caracteres");
		textFieldNome.setBounds(10, 49, 464, 20);
		frame.getContentPane().add(textFieldNome);
		textFieldNome.setColumns(10);
		
		textFieldSenha = new JPasswordField();
		textFieldSenha.setToolTipText("insira sua senha");
		textFieldSenha.setColumns(10);
		textFieldSenha.setBounds(10, 185, 464, 20);
		frame.getContentPane().add(textFieldSenha);
		
		lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 30, 46, 14);
		frame.getContentPane().add(lblNome);
		
		lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(10, 167, 46, 14);
		frame.getContentPane().add(lblSenha);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBackground(new Color(222, 184, 135));
		btnEnviar.setBounds(385, 226, 89, 23);
		frame.getContentPane().add(btnEnviar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBackground(new Color(222, 184, 135));
		btnLimpar.setBounds(282, 226, 89, 23);
		frame.getContentPane().add(btnLimpar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBackground(new Color(222, 184, 135));
		btnSair.setBounds(385, 284, 89, 23);
		frame.getContentPane().add(btnSair);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(10, 95, 46, 14);
		frame.getContentPane().add(lblEmail);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(10, 120, 464, 20);
		frame.getContentPane().add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		btnEnviar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String nome= textFieldNome.getText();
				String email = textFieldEmail.getText();
				String senha = textFieldSenha.getText();
				
				JOptionPane.showMessageDialog(null, "nome: " + nome +"\nemail: "+email+ "\nsenha: "+ senha);
			}
		});
		
		btnLimpar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				textFieldNome.setText("");
				textFieldEmail.setText("");
				textFieldSenha.setText("");
				
			}
		});
		
		btnSair.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}
