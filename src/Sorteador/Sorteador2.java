package Sorteador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Sorteador2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtInicial;
	private JTextField txtFinal;
	private JTextField txtSorteado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sorteador2 frame = new Sorteador2();
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
	public Sorteador2() {
		setTitle("Sorteador");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 239);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSortear = new JLabel("Sorteador");
		lblSortear.setBounds(181, 11, 89, 14);
		contentPane.add(lblSortear);
		
		JLabel lblInicial = new JLabel("Digite o numero Inicial");
		lblInicial.setHorizontalAlignment(SwingConstants.LEFT);
		lblInicial.setBounds(43, 36, 152, 14);
		contentPane.add(lblInicial);
		
		txtInicial = new JTextField();
		txtInicial.setBounds(43, 61, 128, 20);
		contentPane.add(txtInicial);
		txtInicial.setColumns(10);
		
		JLabel lblFinal = new JLabel("Digite o numero Final");
		lblFinal.setHorizontalAlignment(SwingConstants.LEFT);
		lblFinal.setBounds(231, 36, 153, 14);
		contentPane.add(lblFinal);
		
		txtFinal = new JTextField();
		txtFinal.setBounds(231, 61, 128, 20);
		contentPane.add(txtFinal);
		txtFinal.setColumns(10);
		
		JLabel lblResultado = new JLabel("Numero Sorteado");
		lblResultado.setHorizontalAlignment(SwingConstants.LEFT);
		lblResultado.setBounds(142, 92, 147, 14);
		contentPane.add(lblResultado);
		
		txtSorteado = new JTextField();
		txtSorteado.setBounds(142, 117, 128, 20);
		contentPane.add(txtSorteado);
		txtSorteado.setColumns(10);
		
		JButton btnSortear = new JButton("Sortear");
		btnSortear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sortear();
			}
		});
		btnSortear.setBounds(161, 163, 89, 23);
		contentPane.add(btnSortear);
	}
	private void sortear() {
		int inf, sup;
		Random random = new Random(); 
		DecimalFormat formatador= new DecimalFormat();
		inf= Integer.parseInt(txtInicial.getText());
		sup= Integer.parseInt(txtFinal.getText());
		int intervalo_randomico = random.nextInt(inf)+random.nextInt(sup); 
		txtSorteado.setText(formatador.format(intervalo_randomico));
	}

}
