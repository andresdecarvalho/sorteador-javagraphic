package Sorteador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Random;
import java.awt.event.ActionEvent;

public class SorteadorG extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumero;
	private JButton btnLimpar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SorteadorG frame = new SorteadorG();
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
	public SorteadorG() {
		setTitle("Sorteador");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 289, 186);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(89, 85, 94, 20);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		JButton btnSortear = new JButton("Sorteador");
		btnSortear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sortear();
			}
		});
		btnSortear.setBounds(35, 51, 94, 23);
		contentPane.add(btnSortear);
		
		JLabel lblCliqueParaSortear = new JLabel("Clique para sortear um numero");
		lblCliqueParaSortear.setBounds(59, 25, 241, 14);
		contentPane.add(lblCliqueParaSortear);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setBounds(153, 51, 89, 23);
		contentPane.add(btnLimpar);
	}
		private void sortear() {
			Random random = new Random(); 
			DecimalFormat formatador= new DecimalFormat();
			int intervalo_randomico = random.nextInt(300)+1; 
			//intervalo_randomico = Integer.parseInt(txtNumero.getText());
			txtNumero.setText(formatador.format(intervalo_randomico)); 
		}
		
		private void limpar() {
			txtNumero.setText(null);
		}
}
