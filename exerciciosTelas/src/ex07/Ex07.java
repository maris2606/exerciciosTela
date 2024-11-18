package ex07;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Ex07 {

    private JFrame frame;
    private JTextField textFieldTarefa;
    private JList<String> listTarefas;
    private DefaultListModel<String> listModel;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Ex07 window = new Ex07();
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
    public Ex07() {
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

        // Campo de texto para adicionar tarefas
        textFieldTarefa = new JTextField();
        textFieldTarefa.setBounds(10, 10, 250, 25);
        frame.getContentPane().add(textFieldTarefa);
        textFieldTarefa.setColumns(10);

        // Botão para adicionar tarefa
        JButton btnAdicionar = new JButton("Adicionar");
        btnAdicionar.setBackground(new Color(222, 184, 135));
        btnAdicionar.setBounds(270, 10, 100, 25);
        frame.getContentPane().add(btnAdicionar);

        // Modelo para a lista de tarefas
        listModel = new DefaultListModel<>();

        // Lista para exibir as tarefas
        listTarefas = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(listTarefas);
        scrollPane.setBounds(10, 50, 360, 150);
        frame.getContentPane().add(scrollPane);

        // Botão para remover tarefa selecionada
        JButton btnRemover = new JButton("Remover");
        btnRemover.setBackground(new Color(222,  184, 135));
        btnRemover.setBounds(10, 210, 100, 25);
        frame.getContentPane().add(btnRemover);

        // Adiciona ação ao botão Adicionar
        btnAdicionar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String tarefa = textFieldTarefa.getText().trim();
                if (!tarefa.isEmpty()) {
                    listModel.addElement(tarefa);
                    textFieldTarefa.setText("");
                }
            }
        });

        // Adiciona ação ao botão Remover
        btnRemover.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = listTarefas.getSelectedIndex();
                if (selectedIndex != -1) {
                    listModel.remove(selectedIndex);
                }
            }
        });
    }
}
