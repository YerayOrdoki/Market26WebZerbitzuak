package gui;

/**
 * @author Software Engineering teachers
 */

import javax.swing.*;

import service.*;
import extra.BotoiBorobila;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Locale;
import java.util.ResourceBundle;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Erregistratutako erabiltzaile baten leiho nagusia. 
 * Hemendik produktuak sortu, bilatu, faboritoak ikusi, profila kudeatu 
 * eta bere salmentak ikus ditzake.
 */
public class MainGUIerregistratua extends JFrame {
	
	private static final long serialVersionUID = 1L;

    // --- ATRIBUTUAK ---
    private static BLFacade appFacadeInterface;

    private String saltzaileEmaila;
	private BLFacade facade;
	
	private JPanel edukiPanela = null;
	private BotoiBorobila salmentaSortuBotoia = null;
	private BotoiBorobila faboritoakBotoia = null; 
	private BotoiBorobila kontsultakEginBotoia = null;
	private BotoiBorobila botoiBerria = null; // Jatorrizkoan zegoen
	private BotoiBorobila profilaBotoia;
	private BotoiBorobila zureSalmentakBotoia = null;
	private BotoiBorobila saioaItxiBotoia;

	protected JLabel aukeratuEtiketa;
	JLabel alertaGorriEtiketa = new JLabel("!!");
	
	private JRadioButton ingelesItzulpenBotoia;
	private JRadioButton euskaraItzulpenBotoia;
	private JRadioButton gaztelaniaItzulpenBotoia;
	
	private final ButtonGroup botoiTaldea = new ButtonGroup();
	private JPanel panela;
	private JPanel panela4;
	private JPanel panela3;
	private JPanel panela2;
	private JPanel panela1;
	
	// Nabigaziorako leihoak
	private JFrame salmentaSortuLeihoa = null;
	private JFrame kontsultaLeihoa = null;
	private JFrame faboritoLeihoa = null;
	private JFrame leihoNagusia = null;
	private JFrame profilaLeihoa = null;
	private JFrame zureSalmentakLeihoa = null;
	
    // --- ERAIKITZAILEA ---

	/**
	 * MainGUIerregistratua klasearen eraikitzailea.
	 * Saioa hasi duen erabiltzailearen aukera nagusiak prestatzen ditu.
	 * @param erabiltzailea Saioa hasi duen erabiltzaile erregistratua.
	 * @param gurasoa       Aurreko leihoa (nondik gatozen).
	 */
	public MainGUIerregistratua(Registered erabiltzailea, JFrame gurasoa) {
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
		ingelesItzulpenBotoia.setBounds(601, 35, 146, 23);
		ingelesItzulpenBotoia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Locale.setDefault(new Locale("en"));
				paintAgain();				
            }
		});
		botoiTaldea.add(ingelesItzulpenBotoia);
		
		euskaraItzulpenBotoia = new JRadioButton("Euskara");
		euskaraItzulpenBotoia.setFont(new Font("Tahoma", Font.PLAIN, 13));
		euskaraItzulpenBotoia.setBounds(116, 35, 159, 23);
		euskaraItzulpenBotoia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Locale.setDefault(new Locale("eus"));
				paintAgain();				
            }
		});
		botoiTaldea.add(euskaraItzulpenBotoia);
		
		gaztelaniaItzulpenBotoia = new JRadioButton("Castellano");
		gaztelaniaItzulpenBotoia.setFont(new Font("Tahoma", Font.PLAIN, 13));
		gaztelaniaItzulpenBotoia.setBounds(346, 35, 191, 23);
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
		
		// --- EKINTZA BOTOIAK ---
		salmentaSortuBotoia = new BotoiBorobila();
		salmentaSortuBotoia.setBounds(146, 11, 227, 91);
		salmentaSortuBotoia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		salmentaSortuBotoia.setText(ResourceBundle.getBundle("Etiquetas").getString("MainGUI.CreateSale"));
		salmentaSortuBotoia.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				MainGUIerregistratua.this.setVisible(false);
				
					salmentaSortuLeihoa = new CreateSaleGUI(erabiltzailea, MainGUIerregistratua.this);
					salmentaSortuLeihoa.setVisible(true);
			}
		});
		
		kontsultakEginBotoia = new BotoiBorobila();
		kontsultakEginBotoia.setBounds(146, 11, 494, 91);
		kontsultakEginBotoia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		kontsultakEginBotoia.setText(ResourceBundle.getBundle("Etiquetas").getString("MainGUI.QuerySales"));
		kontsultakEginBotoia.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				MainGUIerregistratua.this.setVisible(false);
			
				    kontsultaLeihoa = new QuerySalesGUI(erabiltzailea, null, MainGUIerregistratua.this);
				    kontsultaLeihoa.setVisible(true);

			}
		});
		
		faboritoakBotoia = new BotoiBorobila();  
		faboritoakBotoia.setBounds(146, 11, 494, 91);
		faboritoakBotoia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		faboritoakBotoia.setText(ResourceBundle.getBundle("Etiquetas").getString("MainGUI.Favorites"));  
		faboritoakBotoia.addActionListener(new java.awt.event.ActionListener() {
		    public void actionPerformed(java.awt.event.ActionEvent e) {
		    	MainGUIerregistratua.this.setVisible(false);
		    	
		    		faboritoLeihoa = new FaboritoGUI(erabiltzailea, MainGUIerregistratua.this);  
		    		faboritoLeihoa.setVisible(true);

		    }
		});
		
		edukiPanela = new JPanel();
		edukiPanela.setLayout(new GridLayout(5, 1, 0, 0));
		
		panela4 = new JPanel();
		panela4.setEnabled(true);
		edukiPanela.add(panela4);
		panela4.setLayout(null);
		
		aukeratuEtiketa = new JLabel(ResourceBundle.getBundle("Etiquetas").getString("MainGUI.SelectOption")); 
		aukeratuEtiketa.setFont(new Font("Tahoma", Font.BOLD, 18));
		aukeratuEtiketa.setForeground(Color.BLACK);
		aukeratuEtiketa.setHorizontalAlignment(SwingConstants.CENTER);
		aukeratuEtiketa.setBounds(121, 47, 546, 55);
		
		saioaItxiBotoia = new BotoiBorobila(ResourceBundle.getBundle("Etiquetas").getString("MainGUIerregistratua.Logout")); 
		saioaItxiBotoia.setFont(new Font("Tahoma", Font.PLAIN, 12));
		saioaItxiBotoia.setColourRED();
		saioaItxiBotoia.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				MainGUIerregistratua.this.setVisible(false);
				
					leihoNagusia = new MainGUI(null); 
					leihoNagusia.setVisible(true);

			}
		});
		saioaItxiBotoia.setBounds(611, 18, 165, 36);
		panela4.add(aukeratuEtiketa);
		panela4.add(saioaItxiBotoia);
		
		panela3 = new JPanel();
		panela3.setLayout(null);
		panela3.add(salmentaSortuBotoia);
		
		panela2 = new JPanel();
		panela2.setLayout(null);
		panela2.add(kontsultakEginBotoia);
		
		panela1 = new JPanel();
		panela1.setLayout(null);
		panela1.add(faboritoakBotoia);
		edukiPanela.add(panela4);
		
		profilaBotoia = new BotoiBorobila(ResourceBundle.getBundle("Etiquetas").getString("MainGUIerregistratua.Perfila")); 
		profilaBotoia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainGUIerregistratua.this.setVisible(false);
                profilaLeihoa = new PerfilaGUI(erabiltzailea, MainGUIerregistratua.this);
                profilaLeihoa.setVisible(true);
			}
		});
		
		// --- BUZOIAREN ALERTA GORRIA ---
		alertaGorriEtiketa.setBounds(133, 24, 29, 30);
		alertaGorriEtiketa.setForeground(Color.RED);
		panela4.add(alertaGorriEtiketa);
		alertaGorriEtiketa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		// Buzoian irakurri gabeko mezurik badago, alerta gorria pizten da (ikustarazten da)
		boolean berririkDaude = facade.badituIrakurriGabekoak(saltzaileEmaila);
		alertaGorriEtiketa.setVisible(berririkDaude);
		
		profilaBotoia.setBounds(10, 19, 158, 37);
		panela4.add(profilaBotoia);
		edukiPanela.add(panela3);
		
		zureSalmentakBotoia = new BotoiBorobila(ResourceBundle.getBundle("Etiquetas").getString("MainGUIerregistratua.YourSales")); 
		zureSalmentakBotoia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		zureSalmentakBotoia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainGUIerregistratua.this.setVisible(false);
				
					zureSalmentakLeihoa = new YourSalesGUI(erabiltzailea, null, MainGUIerregistratua.this);
					zureSalmentakLeihoa.setVisible(true);

			}
		});
		zureSalmentakBotoia.setBounds(406, 13, 227, 91);
		panela3.add(zureSalmentakBotoia);
		edukiPanela.add(panela2);
		edukiPanela.add(panela1);
		edukiPanela.add(panela);
		setContentPane(edukiPanela);
		setTitle(ResourceBundle.getBundle("Etiquetas").getString("MainGUI.MainTitle") + ": " + saltzaileEmaila);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(1);
			}
		});
	}
	
    // --- METODOAK ---

	/**
	 * Aplikazioaren negozio-logikaren interfazea itzultzen du.
	 * @return BLFacade negozio-logika.
	 */
	public static BLFacade getBusinessLogic() {
		return appFacadeInterface;
	}
	 
	/**
	 * Aplikazioaren negozio-logikaren interfazea ezartzen du.
	 * @param facade Ezartzeko negozio-logika.
	 */
	public static void setBussinessLogic(BLFacade facade) {
		appFacadeInterface = facade;
	}
	
	/**
	 * Buzoiaren alerta egoera eguneratzen du, profilaren leihotik itzultzerakoan adibidez.
	 */
	public void eguneratuBuzoia() {
		boolean berririkDaude = facade.badituIrakurriGabekoak(saltzaileEmaila);
		alertaGorriEtiketa.setVisible(berririkDaude);
	}
	
	/**
	 * Hizkuntza aldatzen denean interfazearen testuak eguneratzen ditu.
	 */
	private void paintAgain() {
		zureSalmentakBotoia.setText(ResourceBundle.getBundle("Etiquetas").getString("MainGUIerregistratua.YourSales"));
		profilaBotoia.setText(ResourceBundle.getBundle("Etiquetas").getString("PerfilaGUI.MainTitle"));
		saioaItxiBotoia.setText(ResourceBundle.getBundle("Etiquetas").getString("MainGUIerregistratua.Logout"));
		aukeratuEtiketa.setText(ResourceBundle.getBundle("Etiquetas").getString("MainGUI.SelectOption"));
		kontsultakEginBotoia.setText(ResourceBundle.getBundle("Etiquetas").getString("MainGUI.QuerySales"));
		salmentaSortuBotoia.setText(ResourceBundle.getBundle("Etiquetas").getString("MainGUI.CreateSale"));
		faboritoakBotoia.setText(ResourceBundle.getBundle("Etiquetas").getString("MainGUI.Favorites"));
		this.setTitle(ResourceBundle.getBundle("Etiquetas").getString("MainGUI.MainTitle") + ": " + saltzaileEmaila);
	}
}