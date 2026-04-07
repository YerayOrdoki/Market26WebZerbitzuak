package gui;

/**
 * @author Software Engineering teachers
 */

import javax.swing.*;

import service.*;
import extra.BotoiBorobila;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Locale;
import java.util.ResourceBundle;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Erabiltzailearen profilaren leiho nagusia.
 * Hemendik buzoia, historiala (erositakoak/saldutakoak) eta diru-kudeaketa atzitu ditzake.
 */
public class PerfilaGUI extends JFrame {
	
	private static final long serialVersionUID = 1L;

    // --- ATRIBUTUAK ---
    private static BLFacade appFacadeInterface;
	private BLFacade facade;
	
    private String saltzaileEmaila;
	private JPanel edukiPanela = null;
	
	// Botoi batzuk jatorrizko kodean definituta zeuden arren ez dira zuzenean erabiltzen edo ezkutatuta daude
	private BotoiBorobila botoiBerria = null;
	private BotoiBorobila erositakoakBotoia;
	private BotoiBorobila saldutakoakBotoia;
	private BotoiBorobila saioaItxiBotoia;
	private BotoiBorobila diruaSartuAteraBotoia;
	private BotoiBorobila atzeraBotoia;
	private BotoiBorobila mugimenduakBotoia;
	private BotoiBorobila buzoiaBotoia;
	
	private JRadioButton ingelesItzulpenBotoia;
	private JRadioButton euskaraItzulpenBotoia;
	private JRadioButton gaztelaniaItzulpenBotoia;
	
	private JPanel panela;
	private final ButtonGroup botoiTaldea = new ButtonGroup();
	private JPanel panela4;
	private JPanel panela3;
	private JPanel panela2;
	
	private JLabel profilIzenburuEtiketa;
	
	// Gainerako leihoetarako erreferentziak
	private JFrame leihoNagusia = null;
	private JFrame erositakoakLeihoa = null;
	private JFrame diruaKudeatuLeihoa = null;
	private JFrame saldutakoakLeihoa = null;
	private JFrame mugimenduakLeihoa = null;
	
	// lblSaldoa izena mantendu da DiruaKudeatuGUI klaseak zuzenean erabiltzen duelako
	JLabel lblSaldoa;
	JLabel alertaGorriEtiketa = new JLabel("!!");
	private JLabel historialaIzenburuEtiketa;
	private JLabel diruKudeaketaIzenburuEtiketa;
    // --- ERAIKITZAILEA ---

	/**
	 * PerfilaGUI klasearen eraikitzailea.
	 * @param erabiltzailea Saioa hasi duen erabiltzaile erregistratua.
	 * @param gurasoa       Aurreko leihoa (nondik gatozen), atzera egiterakoan erakusteko.
	 */
	public PerfilaGUI(Registered erabiltzailea, JFrame gurasoa) {
		super();

		this.saltzaileEmaila = erabiltzailea.getEmail();
		
        System.out.println("Ez zaude erregistratuta");
			
		this.facade = gui.MainGUI.getBusinessLogic();
		this.setSize(800, 600);
		
		if (gurasoa != null) {
	        this.setLocation(gurasoa.getLocation());
	    }
		
		// --- HIZKUNTZA BOTOIAK ---
		ingelesItzulpenBotoia = new JRadioButton("English");
		ingelesItzulpenBotoia.setFont(new Font("Tahoma", Font.PLAIN, 13));
		ingelesItzulpenBotoia.setBounds(601, 55, 146, 23);
		ingelesItzulpenBotoia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Locale.setDefault(new Locale("en"));
				paintAgain();				
            }
		});
		botoiTaldea.add(ingelesItzulpenBotoia);
		
		euskaraItzulpenBotoia = new JRadioButton("Euskara");
		euskaraItzulpenBotoia.setFont(new Font("Tahoma", Font.PLAIN, 13));
		euskaraItzulpenBotoia.setBounds(197, 55, 159, 23);
		euskaraItzulpenBotoia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Locale.setDefault(new Locale("eus"));
				paintAgain();				
            }
		});
		botoiTaldea.add(euskaraItzulpenBotoia);
		
		gaztelaniaItzulpenBotoia = new JRadioButton("Castellano");
		gaztelaniaItzulpenBotoia.setFont(new Font("Tahoma", Font.PLAIN, 13));
		gaztelaniaItzulpenBotoia.setBounds(379, 55, 191, 23);
		gaztelaniaItzulpenBotoia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Locale.setDefault(new Locale("es"));
				paintAgain();
			}
		});
		botoiTaldea.add(gaztelaniaItzulpenBotoia);
	
		panela = new JPanel();
		panela.setLayout(null);
		panela.add(euskaraItzulpenBotoia);
		panela.add(gaztelaniaItzulpenBotoia);
		panela.add(ingelesItzulpenBotoia);
		
		edukiPanela = new JPanel();
		edukiPanela.setLayout(new GridLayout(4, 1, 0, 0));
		
		panela4 = new JPanel();
		panela4.setEnabled(true);
		edukiPanela.add(panela4);
		panela4.setLayout(null);
		
		saioaItxiBotoia = new BotoiBorobila(ResourceBundle.getBundle("Etiquetas").getString("MainGUIerregistratua.Logout")); 
		saioaItxiBotoia.setFont(new Font("Tahoma", Font.PLAIN, 12));
		saioaItxiBotoia.setColourRED();
		saioaItxiBotoia.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				PerfilaGUI.this.setVisible(false);
				if(leihoNagusia == null) {
					leihoNagusia = new MainGUI(null); 
					leihoNagusia.setVisible(true);
				} else {
					leihoNagusia.setVisible(true);
				}
			}
		});
		saioaItxiBotoia.setBounds(611, 18, 165, 36);
		panela4.add(saioaItxiBotoia);
		
		panela3 = new JPanel();
		panela3.setLayout(null);
		
		panela2 = new JPanel();
		panela2.setLayout(null);
		edukiPanela.add(panela4);
		
		profilIzenburuEtiketa = new JLabel(erabiltzailea.getName());
		profilIzenburuEtiketa.setHorizontalAlignment(SwingConstants.CENTER);
		profilIzenburuEtiketa.setForeground(Color.BLACK);
		profilIzenburuEtiketa.setFont(new Font("Tahoma", Font.BOLD, 18));
		profilIzenburuEtiketa.setBounds(109, 54, 546, 55);
		panela4.add(profilIzenburuEtiketa);
		
		alertaGorriEtiketa.setBounds(747, 66, 29, 30);
		alertaGorriEtiketa.setForeground(Color.RED);
		panela4.add(alertaGorriEtiketa);
		
        // --- BUZOIAREN ALERTA GORRIA ---
		boolean berririkDaude = facade.badituIrakurriGabekoak(saltzaileEmaila);
        alertaGorriEtiketa.setFont(new Font("Tahoma", Font.PLAIN, 18));
        alertaGorriEtiketa.setVisible(berririkDaude);
		
		buzoiaBotoia = new BotoiBorobila(ResourceBundle.getBundle("Etiquetas").getString("PerfilaGUI.Buzoia"));
		buzoiaBotoia.setBounds(611, 64, 165, 36);
		panela4.add(buzoiaBotoia);
		buzoiaBotoia.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		       PerfilaGUI.this.setVisible(false);
		       new BuzoiaGUI(erabiltzailea, PerfilaGUI.this).setVisible(true);
		    }
		});
		edukiPanela.add(panela3);
		
		erositakoakBotoia = new BotoiBorobila(ResourceBundle.getBundle("Etiquetas").getString("PerfilaGUI.Erositakoak"));
		erositakoakBotoia.setBounds(147, 39, 209, 91);
		panela3.add(erositakoakBotoia);
		
		saldutakoakBotoia = new BotoiBorobila(ResourceBundle.getBundle("Etiquetas").getString("PerfilaGUI.Saldutakoak"));
		saldutakoakBotoia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saldutakoakLeihoa = new SaldutakoakGUI(erabiltzailea, PerfilaGUI.this);  
				saldutakoakLeihoa.setVisible(true);
			}
		});
		saldutakoakBotoia.setBounds(424, 39, 209, 91);
		panela3.add(saldutakoakBotoia);
		
		historialaIzenburuEtiketa = new JLabel(ResourceBundle.getBundle("Etiquetas").getString("PerfilaGUI.Historialak")); 
		historialaIzenburuEtiketa.setBounds(113, -13, 546, 55);
		panela3.add(historialaIzenburuEtiketa);
		historialaIzenburuEtiketa.setHorizontalAlignment(SwingConstants.CENTER);
		historialaIzenburuEtiketa.setForeground(Color.BLACK);
		historialaIzenburuEtiketa.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		erositakoakBotoia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PerfilaGUI.this.setVisible(false);
				if(erositakoakLeihoa == null) {
					erositakoakLeihoa = new ErositakoakGUI(erabiltzailea, PerfilaGUI.this);  
					erositakoakLeihoa.setVisible(true);
				} else {
					erositakoakLeihoa.setVisible(true);
				}
			}
		});
		edukiPanela.add(panela2);
        
        // Datu-basea berriro egiaztatzen dugu alerta gorria erakutsi ala ez jakiteko
        berririkDaude = facade.badituIrakurriGabekoak(saltzaileEmaila);
		
		diruaSartuAteraBotoia = new BotoiBorobila(ResourceBundle.getBundle("Etiquetas").getString("PerfilaGUI.DiruaSartuAtera"));
		diruaSartuAteraBotoia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PerfilaGUI.this.setVisible(false);
				new DiruaKudeatuGUI(erabiltzailea, PerfilaGUI.this).setVisible(true); 

			}
		});
		diruaSartuAteraBotoia.setBounds(147, 39, 209, 91);
		panela2.add(diruaSartuAteraBotoia);
		
		mugimenduakBotoia = new BotoiBorobila(ResourceBundle.getBundle("Etiquetas").getString("PerfilaGUI.Mugimenduak"));
		mugimenduakBotoia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mugimenduakLeihoa = new MugimenduakGUI(erabiltzailea, PerfilaGUI.this);
				mugimenduakLeihoa.setVisible(true);
			}
		});
		mugimenduakBotoia.setBounds(424, 39, 209, 91);
		panela2.add(mugimenduakBotoia);
		
		diruKudeaketaIzenburuEtiketa = new JLabel(ResourceBundle.getBundle("Etiquetas").getString("PerfilaGUI.DiruKudeaketa"));
		diruKudeaketaIzenburuEtiketa.setHorizontalAlignment(SwingConstants.CENTER);
		diruKudeaketaIzenburuEtiketa.setForeground(Color.BLACK);
		diruKudeaketaIzenburuEtiketa.setFont(new Font("Tahoma", Font.BOLD, 18));
		diruKudeaketaIzenburuEtiketa.setBounds(118, -10, 546, 55);
		panela2.add(diruKudeaketaIzenburuEtiketa);
		edukiPanela.add(panela);
		
		atzeraBotoia = new BotoiBorobila(ResourceBundle.getBundle("Etiquetas").getString("QuerySalesGUI.btnAtzera")); 
		atzeraBotoia.setBounds(38, 55, 101, 37);
		panela.add(atzeraBotoia);
		
		lblSaldoa = new JLabel(ResourceBundle.getBundle("Etiquetas").getString("PerfilaGUI.Saldo") + " : " + facade.getSellerByEmail(saltzaileEmaila).getSaldoa() + "€");
		lblSaldoa.setBounds(178, 0, 159, 28);
		panela.add(lblSaldoa);
		
		atzeraBotoia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PerfilaGUI.this.setVisible(false);				
	               
				((MainGUIerregistratua) gurasoa).eguneratuBuzoia(); 
	            gurasoa.setVisible(true);
			}
		});
		setContentPane(edukiPanela);
		setTitle(ResourceBundle.getBundle("Etiquetas").getString("PerfilaGUI.MainTitle"));
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(1);
			}
		});
	}
	
    // --- METODOAK ---

	/**
	 * Buzoian mezu berririk badago alerta gorria eguneratzen duen metodoa.
	 * Kanpotik (adibidez BuzoiaGUI leihotik) deitua izan ohi da.
	 */
	public void eguneratuBuzoia() {
		boolean berririkDaude = facade.badituIrakurriGabekoak(saltzaileEmaila);
		alertaGorriEtiketa.setVisible(berririkDaude);
	}
	
	/**
	 * Hizkuntza aldatzen denean interfazearen testuak berriz kargatzeko metodoa.
	 */
	private void paintAgain() {
		ResourceBundle.clearCache();
		historialaIzenburuEtiketa.setText(ResourceBundle.getBundle("Etiquetas").getString("PerfilaGUI.Historialak"));
		erositakoakBotoia.setText(ResourceBundle.getBundle("Etiquetas").getString("PerfilaGUI.Erositakoak"));
		saldutakoakBotoia.setText(ResourceBundle.getBundle("Etiquetas").getString("PerfilaGUI.Saldutakoak"));
		diruKudeaketaIzenburuEtiketa.setText(ResourceBundle.getBundle("Etiquetas").getString("PerfilaGUI.DiruKudeaketa"));
		mugimenduakBotoia.setText(ResourceBundle.getBundle("Etiquetas").getString("PerfilaGUI.Mugimenduak"));
		diruaSartuAteraBotoia.setText(ResourceBundle.getBundle("Etiquetas").getString("PerfilaGUI.DiruaSartuAtera"));
		atzeraBotoia.setText(ResourceBundle.getBundle("Etiquetas").getString("QuerySalesGUI.btnAtzera"));
		mugimenduakBotoia.setText(ResourceBundle.getBundle("Etiquetas").getString("PerfilaGUI.Mugimenduak"));
		saioaItxiBotoia.setText(ResourceBundle.getBundle("Etiquetas").getString("MainGUIerregistratua.Logout"));
		lblSaldoa.setText(ResourceBundle.getBundle("Etiquetas").getString("PerfilaGUI.Saldo") + " : " + facade.getSellerByEmail(saltzaileEmaila).getSaldoa() + "€");
		buzoiaBotoia.setText(ResourceBundle.getBundle("Etiquetas").getString("PerfilaGUI.Buzoia"));
		this.setTitle(ResourceBundle.getBundle("Etiquetas").getString("PerfilaGUI.MainTitle"));
	}
}