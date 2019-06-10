package br.com.meuprojeto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Buscar extends JFrame {

	private JPanel contentPane;
	private JTextField textId;
	private JTextField textNome;
	private JTextField textDesc;
	private JTextField textMarca;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buscar frame = new Buscar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Buscar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 267, 265);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textId = new JTextField();
		textId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textId.setBackground(Color.WHITE);
		textId.setForeground(Color.RED);
		textId.setBounds(65, 33, 126, 33);
		contentPane.add(textId);
		textId.setColumns(10);
		
		textNome = new JTextField();
		textNome.setBounds(65, 77, 126, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		textDesc = new JTextField();
		textDesc.setBounds(65, 108, 126, 20);
		contentPane.add(textDesc);
		textDesc.setColumns(10);
		
		textMarca = new JTextField();
		textMarca.setBounds(65, 139, 126, 20);
		contentPane.add(textMarca);
		textMarca.setColumns(10);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				produto prod = new produto();
				prod.buscar(Integer.parseInt(textId.getText()));
				textNome.setText(prod.getNome());
				textDesc.setText(prod.desc);
				textMarca.setText(prod.marca);
			}
		});
		btnNewButton.setBounds(63, 170, 136, 44);
		contentPane.add(btnNewButton);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(9, 80, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblMarca = new JLabel("Descri\u00E7\u00E3o");
		lblMarca.setBounds(9, 111, 46, 14);
		contentPane.add(lblMarca);
		
		JLabel lblDescri = new JLabel("Marca");
		lblDescri.setBounds(9, 142, 46, 14);
		contentPane.add(lblDescri);
	}
}
