package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JTextArea;

public class FrmManEspecialidad extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtT;
	private JTextField txtCardiologia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmManEspecialidad frame = new FrmManEspecialidad();
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
	public FrmManEspecialidad() {
		setClosable(true);
		setResizable(true);
		setMaximizable(true);
		setIconifiable(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mantenimiento de Especialidades");
		lblNewLabel.setBounds(0, 0, 434, 31);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		getContentPane().add(lblNewLabel);
		
		txtT = new JTextField();
		txtT.setText("Traumatología");
		txtT.setBounds(51, 89, 114, 18);
		getContentPane().add(txtT);
		txtT.setColumns(10);
		
		txtCardiologia = new JTextField();
		txtCardiologia.setText("Cardiologia");
		txtCardiologia.setBounds(51, 154, 114, 18);
		getContentPane().add(txtCardiologia);
		txtCardiologia.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(236, 113, 124, 31);
		getContentPane().add(btnNewButton);

	}
}
