package gui;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import service.*;
import extra.BotoiBorobila;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

/**
 * Erabiltzaile berriak sisteman erregistratzeko interfaze grafikoa.
 */
public class RegisterGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	
	// --- ATRIBUTUAK ---
	private JPanel edukiPanela;
	private JTextField postaEremua;
	private JTextField erabiltzaileTestuEremua;
	private JPasswordField pasahitzEremua1;
	private JPasswordField pasahitzEremua2;
	private MainGUI gurasoa;

	// --- ERAIKITZAILEA ---

	/**
	 * RegisterGUI klasearen eraikitzailea.
	 * Erregistro inprimakiaren elementuak eta gertaerak konfiguratzen ditu.
	 * @param gurasoa Aurreko leihoa (Nagusia), atzera egitean berriro erakusteko.
	 */
	public RegisterGUI(MainGUI gurasoa) {
		this.gurasoa = gurasoa;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		if (gurasoa != null) {
	        this.setLocation(gurasoa.getLocation());
	    }
		
		this.setTitle(ResourceBundle.getBundle("Etiquetas").getString("RegisterGUI.Title"));

		setBounds(100, 100, 800, 600);
		edukiPanela = new JPanel();
		edukiPanela.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(edukiPanela);
		edukiPanela.setLayout(null);
		
		postaEremua = new JTextField();
		postaEremua.setBounds(356, 154, 115, 31);
		edukiPanela.add(postaEremua);
		postaEremua.setColumns(10);
		
		erabiltzaileTestuEremua = new JTextField();
		erabiltzaileTestuEremua.setBounds(356, 217, 115, 31);
		edukiPanela.add(erabiltzaileTestuEremua);
		erabiltzaileTestuEremua.setColumns(10);
		
		pasahitzEremua1 = new JPasswordField();
		pasahitzEremua1.setBounds(356, 284, 115, 31);
		edukiPanela.add(pasahitzEremua1);
		
		pasahitzEremua2 = new JPasswordField();
		pasahitzEremua2.setBounds(357, 341, 114, 31);
		edukiPanela.add(pasahitzEremua2);
		
		JLabel postaEtiketa = new JLabel(ResourceBundle.getBundle("Etiquetas").getString("RegisterGUI.Email"));
		postaEtiketa.setFont(new Font("Tahoma", Font.PLAIN, 12));
		postaEtiketa.setBounds(143, 161, 114, 14);
		edukiPanela.add(postaEtiketa);
		
		JLabel erabiltzaileEtiketa = new JLabel(ResourceBundle.getBundle("Etiquetas").getString("RegisterGUI.User"));
		erabiltzaileEtiketa.setFont(new Font("Tahoma", Font.PLAIN, 12));
		erabiltzaileEtiketa.setBounds(143, 224, 157, 14);
		edukiPanela.add(erabiltzaileEtiketa);
		
		JLabel pasahitzEtiketa1 = new JLabel(ResourceBundle.getBundle("Etiquetas").getString("RegisterGUI.Pass1"));
		pasahitzEtiketa1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pasahitzEtiketa1.setBounds(143, 291, 145, 14);
		edukiPanela.add(pasahitzEtiketa1);
		
		JLabel pasahitzEtiketa2 = new JLabel(ResourceBundle.getBundle("Etiquetas").getString("RegisterGUI.Pass2"));
		pasahitzEtiketa2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pasahitzEtiketa2.setBounds(143, 345, 157, 23);
		edukiPanela.add(pasahitzEtiketa2);
		
		JLabel izenburuEtiketa = new JLabel(ResourceBundle.getBundle("Etiquetas").getString("RegisterGUI.Title")); //$NON-NLS-1$ //$NON-NLS-2$
		izenburuEtiketa.setFont(new Font("Tahoma", Font.BOLD, 18));
		izenburuEtiketa.setHorizontalAlignment(SwingConstants.CENTER);
		izenburuEtiketa.setBounds(149, 41, 456, 37);
		edukiPanela.add(izenburuEtiketa);
		
		BotoiBorobila erregistratuBotoia = new BotoiBorobila(ResourceBundle.getBundle("Etiquetas").getString("RegisterGUI.Button"));
		
		// --- ERREGISTROAREN LOGIKA ---
		erregistratuBotoia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(pasahitzEremua1.getPassword());
				System.out.println(pasahitzEremua2.getPassword());
				
				// Egiaztatu sartutako bi pasahitzak berdinak direla
				if (new String(pasahitzEremua1.getPassword()).compareTo(new String(pasahitzEremua2.getPassword())) == 0) {
					BLFacade facade = MainGUI.getBusinessLogic();
					
					// Datu-baseari dei egiten diogu erabiltzailea sortzeko. Dagoeneko existitzen bada, null itzuliko du.
					String pasahitza = new String(pasahitzEremua1.getPassword());
					Registered sortutakoErabiltzailea = facade.erabiltzaileaSortu(postaEremua.getText(), erabiltzaileTestuEremua.getText(), pasahitza);
					
					if (sortutakoErabiltzailea != null) {
						RegisterGUI.this.setVisible(false);
						new MainGUIerregistratua(sortutakoErabiltzailea, RegisterGUI.this).setVisible(true);
					} else {
						// Erabiltzailea edo posta jadanik existitzen bada errorea erakutsi
						JOptionPane.showMessageDialog(null,
								ResourceBundle.getBundle("Etiquetas").getString("RegisterGUI.Error1"), "ERROR",
								JOptionPane.WARNING_MESSAGE);
					}
					
				} else {
					// Pasahitzak ez badira berdinak errorea erakutsi
					JOptionPane.showMessageDialog(null,
							ResourceBundle.getBundle("Etiquetas").getString("RegisterGUI.Error2"), "ERROR",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		erregistratuBotoia.setBounds(166, 441, 262, 50);
		edukiPanela.add(erregistratuBotoia);
		
		BotoiBorobila atzeraBotoia = new BotoiBorobila(ResourceBundle.getBundle("Etiquetas").getString("RegisterGUI.btnAtzera")); //$NON-NLS-1$ //$NON-NLS-2$
		atzeraBotoia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterGUI.this.setVisible(false);
				gurasoa.setVisible(true);
			}
		});
		atzeraBotoia.setBounds(627, 480, 114, 37);
		edukiPanela.add(atzeraBotoia);
		
		JSeparator goikoBereizlea = new JSeparator();
		goikoBereizlea.setBounds(30, 117, 725, 52);
		edukiPanela.add(goikoBereizlea);
		
		JSeparator behekoBereizlea = new JSeparator();
		behekoBereizlea.setBounds(30, 407, 725, 52);
		edukiPanela.add(behekoBereizlea);
	}
}