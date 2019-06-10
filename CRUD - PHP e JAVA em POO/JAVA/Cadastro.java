package br.com.meuprojeto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Cadastro extends JFrame {

	private JPanel contentPane;
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
					Cadastro frame = new Cadastro();
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
	public Cadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 363, 247);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNome = new JTextField();
		textNome.setToolTipText("nome");
		textNome.setBounds(74, 52, 217, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		textDesc = new JTextField();
		textDesc.setBounds(74, 83, 217, 20);
		contentPane.add(textDesc);
		textDesc.setColumns(10);
		
		textMarca = new JTextField();
		textMarca.setBounds(74, 113, 217, 20);
		contentPane.add(textMarca);
		textMarca.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

					produto prod = new produto();
					prod.cadastrar(textNome.getText(),textDesc.getText(),textMarca.getText());
					
					textNome.setText("");
					textDesc.setText("");
					textMarca.setText("");

			}
		});
		btnNewButton.setBounds(74, 149, 82, 43);
		contentPane.add(btnNewButton);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 54, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o:");
		lblDescrio.setBounds(10, 85, 59, 14);
		contentPane.add(lblDescrio);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setBounds(10, 115, 46, 14);
		contentPane.add(lblMarca);
		
		JButton btnNewButton_1 = new JButton("Buscar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Buscar b = new Buscar();
				b.setVisible(true);
				
			}
		});
		btnNewButton_1.setBounds(196, 149, 89, 43);
		contentPane.add(btnNewButton_1);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
