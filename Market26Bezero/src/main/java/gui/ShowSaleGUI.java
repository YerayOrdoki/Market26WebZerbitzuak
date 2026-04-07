package gui;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.text.SimpleDateFormat;
import java.awt.image.BufferedImage;
import java.awt.geom.GeneralPath;

import service.*;
import extra.BotoiBorobila;
import extra.EstrellitaButton;

public class ShowSaleGUI extends JFrame {

    File targetFile;
    BufferedImage targetImg;
    public JPanel panel_1;
    private static final int baseSize = 320;
    private static final String basePath="src/main/resources/images/";

    private static final long serialVersionUID = 1L;

    private JTextField fieldTitle=new JTextField();
    private JTextField fieldDescription=new JTextField();

    JLabel labelStatus = new JLabel(); 
    private JLabel jLabelDescription = new JLabel(ResourceBundle.getBundle("Etiquetas").getString("CreateSaleGUI.Description")); 
    private JLabel jLabelProductStatus = new JLabel(ResourceBundle.getBundle("Etiquetas").getString("CreateSaleGUI.Status"));
    private JTextField fieldPrice = new JTextField();
    private File selectedFile;
    private String irudia;

    private JScrollPane scrollPaneEvents = new JScrollPane();
    DefaultComboBoxModel<String> statusOptions = new DefaultComboBoxModel<String>();
    private BotoiBorobila jButtonClose = new BotoiBorobila(ResourceBundle.getBundle("Etiquetas").getString("Close"));
    private JLabel jLabelMsg = new JLabel();
    private JLabel jLabelError = new JLabel();
    private JLabel statusField=new JLabel();
    private JFrame thisFrame;
    private JFrame parent;
    private BLFacade facade;
    Salaketa salaketa;
    BotoiBorobila btnSalatu;
    boolean salatutaDago = true;

    // Izarrak behar dituen bariableak
    private EstrellitaButton faboritoak;
    private boolean isFavorito;
    private final JLabel sortutakoDataLabel = new JLabel(ResourceBundle.getBundle("Etiquetas").getString("CreateSaleGUI.PublicationDate"));


    
    public ShowSaleGUI(Sale sale, User saltzaile, JFrame parent, Salaketa salaketa) { 
        this.salaketa=salaketa;
    	thisFrame=this; 
        this.parent=parent;
        
        if (parent != null) {
            this.setLocation(parent.getLocation());
        }
		
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(new Dimension(800, 600));
        this.facade = MainGUI.getBusinessLogic();
        System.out.println(saltzaile);
        SaleSellerBoughtContainer unekoSale=facade.getSaleSellerBoughtContainer(sale.getSaleNumber() );


        getContentPane().setLayout(null);
        
        if (saltzaile instanceof Registered) {
			salatutaDago = facade.salatutaDago(unekoSale.getSale() .getSaleNumber(), saltzaile.getEmail());
		}
     // faboritoaDa hasieraketa
        if(saltzaile instanceof Registered) {
            isFavorito = facade.faboritoaDa(unekoSale.getSale().getSaleNumber(), saltzaile.getEmail());
        } else {
            isFavorito = false;
        }
        faboritoak = new EstrellitaButton(isFavorito);  // Estatu zuzenera pasa
        
        faboritoak.setBounds(unekoSale.getSale().getTitle().length()+200, 21, 168, 30);
        faboritoak.setVisible(saltzaile!=null && !(saltzaile instanceof Admin));
        faboritoak.setOpaque(false);
        faboritoak.setContentAreaFilled(false);
        faboritoak.setBorderPainted(false);
        faboritoak.setFocusPainted(false);
        
        faboritoak.addActionListener(e -> {
            if(isFavorito) {
            	isFavorito=false;
            	facade.faboritoaEzabatu(unekoSale.getSale().getSaleNumber(), saltzaile.getEmail());
            } else {
            	isFavorito=true;
            	facade.faboritoaGehitu(unekoSale.getSale().getSaleNumber(), saltzaile.getEmail());
            }
            faboritoak.setFavorito(isFavorito);  // Estrellitaren metodoa erabili
        });
        getContentPane().add(faboritoak);

        fieldTitle.setBounds(37, 21, 370, 26);
        fieldTitle.setBorder(null);
        fieldTitle.setText(unekoSale.getSale().getTitle());
        fieldTitle.setEditable(false);
        fieldTitle.setColumns(10);
        fieldTitle.setFont(new Font("Tahoma", Font.BOLD, 20));
        fieldTitle.setHorizontalAlignment(SwingConstants.LEFT);
        fieldTitle.setEditable(false);
        fieldTitle.setHighlighter(null);
        fieldTitle.setFocusable(false);
        getContentPane().add(fieldTitle);
        jLabelDescription.setFont(new Font("Tahoma", Font.BOLD, 15));

        jLabelDescription.setBounds(37, 66, 109, 16);
        getContentPane().add(jLabelDescription);
        fieldDescription.setFont(new Font("Tahoma", Font.PLAIN, 13));

        fieldDescription.setBounds(37, 98, 701, 95);
        fieldDescription.setText(unekoSale.getSale().getDescription());
        fieldDescription.setEditable(false);
        fieldDescription.setBackground(Color.LIGHT_GRAY);
        fieldDescription.setColumns(10);
        getContentPane().add(fieldDescription);

        fieldPrice.setBounds(636, 21, 102, 27);
        fieldPrice.setFont(new Font("Arial", Font.BOLD, 19));
        fieldPrice.setSelectedTextColor(new Color(0,128,128));
        fieldPrice.setForeground(new Color(0,128,128));
        fieldPrice.setBorder(null);
        fieldPrice.setText(Float.toString(unekoSale.getSale().getPrice())+"€");
        fieldPrice.setEditable(false);
        fieldPrice.setHighlighter(null);
        fieldPrice.setFocusable(false);
        getContentPane().add(fieldPrice);
        jLabelProductStatus.setFont(new Font("Tahoma", Font.BOLD, 15));

        jLabelProductStatus.setBounds(37, 234, 140, 25);
        getContentPane().add(jLabelProductStatus);

        labelStatus.setBounds(200, 281, 289, 16);
        labelStatus.setText(new SimpleDateFormat("dd-MM-yyyy").format(unekoSale.getSale().getPubDate().toGregorianCalendar().getTime()));
        labelStatus.setFont(new Font("Dialog", Font.PLAIN, 15));
        getContentPane().add(labelStatus);
        jLabelError.setFont(new Font("Tahoma", Font.PLAIN, 13));

        jLabelError.setBounds(56, 261, 320, 20);
        jLabelError.setForeground(Color.red);
        getContentPane().add(jLabelError);

        scrollPaneEvents.setBounds(new Rectangle(25, 44, 346, 116));

        panel_1 = new JPanel();
        panel_1.setBounds(426, 261, 312, 230);
        getContentPane().add(panel_1);
        panel_1.add(jLabelMsg);
        jLabelMsg.setForeground(Color.red);
        
        

        jButtonClose.setBounds(16, 512, 114, 30);
        jButtonClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                thisFrame.setVisible(false);
                parent.setVisible(true);
            }
        });
        getContentPane().add(jButtonClose);

        BLFacade facadeLocal = MainGUI.getBusinessLogic();
        String file = unekoSale.getSale().getFileName();
        panel_1.removeAll();
        panel_1.setLayout(new BorderLayout(0, 0)); 

        if (file != null && !file.isEmpty()) {
         /*   Image img = facadeLocal.downloadImage(file);
            if (img != null) {
                targetImg = rescale((BufferedImage)img);
                panel_1.add(new JLabel(new ImageIcon(targetImg)), BorderLayout.CENTER);
            }*/
        	  java.net.URL imgURL = getClass().getResource("/images/default.jpg");
              
              if (imgURL != null) {
                  ImageIcon defaultIcon = new ImageIcon(imgURL);
                  Image scaledDefault = defaultIcon.getImage().getScaledInstance(baseSize, baseSize, Image.SCALE_SMOOTH);
                  panel_1.add(new JLabel(new ImageIcon(scaledDefault)), BorderLayout.CENTER);
              } else {
                  System.err.println("ez da default.jpg argazkia aurkitu");
                  panel_1.setBackground(Color.GRAY);
              }
        } else {
            jLabelMsg.setText(ResourceBundle.getBundle("Etiquetas").getString("ShowSaleGUI.ImageError"));
            jLabelMsg.setHorizontalAlignment(SwingConstants.CENTER);
            panel_1.add(jLabelMsg, BorderLayout.NORTH);

            try {
                java.net.URL imgURL = getClass().getResource("/images/default.jpg");
                
                if (imgURL != null) {
                    ImageIcon defaultIcon = new ImageIcon(imgURL);
                    Image scaledDefault = defaultIcon.getImage().getScaledInstance(baseSize, baseSize, Image.SCALE_SMOOTH);
                    panel_1.add(new JLabel(new ImageIcon(scaledDefault)), BorderLayout.CENTER);
                } else {
                    System.err.println("ez da default.jpg argazkia aurkitu");
                    panel_1.setBackground(Color.GRAY);
                }
            } catch (Exception e) {
                e.printStackTrace();
                panel_1.setBackground(Color.GRAY);
            }
        }
        
        panel_1.revalidate();
        panel_1.repaint();

        System.out.println("status: "+unekoSale.getSale().getStatus());
        statusField = new JLabel(Utils.getStatus(unekoSale.getSale().getStatus()));
        statusField.setFont(new Font("Tahoma", Font.PLAIN, 15));
        statusField.setBounds(190, 231, 138, 30);
        getContentPane().add(statusField);

        JSeparator separator = new JSeparator();
        separator.setBounds(16, 56, 721, 16);
        getContentPane().add(separator);
       
        sortutakoDataLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        sortutakoDataLabel.setBounds(37, 281, 200, 16);
        
        getContentPane().add(sortutakoDataLabel);
        
        btnSalatu = new BotoiBorobila(ResourceBundle.getBundle("Etiquetas").getString("SalaketaGUI.Reportar"));
        btnSalatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!unekoSale.getUser().getEmail().equals(saltzaile.getEmail())) {
					new SalaketaGUI(sale, saltzaile, ShowSaleGUI.this).setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, ResourceBundle.getBundle("Etiquetas").getString("ShowSaleGUI.ProductIsYoursReport"), ResourceBundle.getBundle("Etiquetas").getString("ShowSaleGUI.ReportProductTitle"),
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
        btnSalatu.setBounds(636, 512, 114, 30);
        btnSalatu.setVisible(saltzaile instanceof Registered);
        btnSalatu.setEnabled(salatutaDago);
        if(!salatutaDago) {
        	btnSalatu.setText(ResourceBundle.getBundle("Etiquetas").getString("ShowSaleGUI.Reported"));
        }
        btnSalatu.setColourRED();
        getContentPane().add(btnSalatu);
        
        BotoiBorobila btnSaleDelete = new BotoiBorobila(ResourceBundle.getBundle("Etiquetas").getString("ShowSaleGUI.DeleteProduct")); //$NON-NLS-1$ //$NON-NLS-2$
        btnSaleDelete.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
				if (salaketa != null) {
					facade.salaketaEgoeraAldatu(salaketa.getKexaNumber(), 2);
				}
        		facade.produktoaEzabatu(unekoSale.getSale().getSaleNumber(), saltzaile.getEmail());
        		JOptionPane.showMessageDialog(null, 
 						ResourceBundle.getBundle("Etiquetas").getString("ShowSaleGUI.ProductDeleted"), 
 						ResourceBundle.getBundle("Etiquetas").getString("ShowSaleGUI.DeleteProductTitle"), 
 				        JOptionPane.INFORMATION_MESSAGE);
        		ShowSaleGUI.this.setVisible(false);
        		if (parent instanceof ShowRegisteredGUI) {
        				((ShowRegisteredGUI) parent).refreshTable();
        		}
        		if (parent instanceof SalaketakAdminGUI) {
                    ((SalaketakAdminGUI) parent).kargatuDatuak();
                }
                parent.setVisible(true);
                
        	}
        });
        btnSaleDelete.setBounds(157, 407, 179, 42);
        btnSaleDelete.setColourRED();
        btnSaleDelete.setVisible(saltzaile instanceof Admin);
        getContentPane().add(btnSaleDelete);
        
        /*BotoiBorobila btnUserProfile = new BotoiBorobila(""); //$NON-NLS-1$ //$NON-NLS-2$
        btnUserProfile.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
				new ShowRegisteredGUI(unekoSale.getUser(), (Admin) saltzaile,  ShowSaleGUI.this).setVisible(true);
                ShowSaleGUI.this.setVisible(false);
        	}
        });
        btnUserProfile.setBounds(157, 336, 179, 42);
        btnUserProfile.setColourRED();
        btnUserProfile.setVisible(saltzaile instanceof Admin);
        getContentPane().add(btnUserProfile);*/
        
        BotoiBorobila salaketaEzeztatu = new BotoiBorobila(ResourceBundle.getBundle("Etiquetas").getString("ShowSaleGUI.CancelReport")); //$NON-NLS-1$ //$NON-NLS-2$
        salaketaEzeztatu.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		facade.salaketaEgoeraAldatu(salaketa.getKexaNumber(), 1);
        		ShowSaleGUI.this.setVisible(false);
        		if (parent instanceof SalaketakAdminGUI) {
                    ((SalaketakAdminGUI) parent).kargatuDatuak();
                }
        		parent.setVisible(true);
        	}
        });
        salaketaEzeztatu.setVisible(saltzaile instanceof Admin && salaketa != null);
        salaketaEzeztatu.setBounds(157, 472, 179, 42);
        getContentPane().add(salaketaEzeztatu);
        
                BotoiBorobila erosiBotoia = new BotoiBorobila(ResourceBundle.getBundle("Etiquetas").getString("ShowSaleGUI.Buy"));
                erosiBotoia.setFont(new Font("Tahoma", Font.PLAIN, 16));
                boolean zureaDA = (saltzaile != null && unekoSale.getUser().getEmail().equals(saltzaile.getEmail()));
                erosiBotoia.setEnabled(!zureaDA);
                if(zureaDA) {
                	erosiBotoia.setText(ResourceBundle.getBundle("Etiquetas").getString("ShowSaleGUI.BuyError"));
                }
                erosiBotoia.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if(!zureaDA) {//produktua iada nire sales zerrendan dagoen komprobatze dugu
                        	if(!facade.produktoaErosi(unekoSale.getSale().getSaleNumber(), saltzaile.getEmail())){
                                JOptionPane.showMessageDialog(null, 
    						ResourceBundle.getBundle("Etiquetas").getString("ShowSaleGUI.NotBoughtMessage"), 
    						ResourceBundle.getBundle("Etiquetas").getString("ShowSaleGUI.Buy"), 
    				        JOptionPane.INFORMATION_MESSAGE);
                            } else {
                            JOptionPane.showMessageDialog(null, 
    						ResourceBundle.getBundle("Etiquetas").getString("ShowSaleGUI.BuyMessage"), 
    						ResourceBundle.getBundle("Etiquetas").getString("ShowSaleGUI.BuyTitle"), 
    				        JOptionPane.INFORMATION_MESSAGE);
    				        }
                            if (parent instanceof QuerySalesGUI) {
                                ((QuerySalesGUI) parent).jButtonSearch.doClick(); 
                            }

                            ShowSaleGUI.this.setVisible(false);
                            parent.setVisible(true);
                        }else {
                            JOptionPane.showMessageDialog(null, 
    						ResourceBundle.getBundle("Etiquetas").getString("ShowSaleGUI.BuyError"), 
    						ResourceBundle.getBundle("Etiquetas").getString("ShowSaleGUI.BuyErrorTitle"), 
    				        JOptionPane.INFORMATION_MESSAGE);
                            
                        }
                        	

                    }
                });
                erosiBotoia.setBounds(90, 353, 265, 81);
                erosiBotoia.setVisible(saltzaile instanceof Registered);
                getContentPane().add(erosiBotoia);
                erosiBotoia.setVisible(saltzaile!=null && !(saltzaile instanceof Admin));
        
    } 

    public BufferedImage rescale(BufferedImage originalImage) {
        BufferedImage resizedImage = new BufferedImage(baseSize, baseSize, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(originalImage, 0, 0, baseSize, baseSize, null);
        g.dispose();
        return resizedImage;
    }
    
    
    public void desactivarBotonReclamar() {
        if (btnSalatu != null) {
        	btnSalatu.setEnabled(false);
        	btnSalatu.setText(ResourceBundle.getBundle("Etiquetas").getString("ShowSaleGUI.Reported")); // Aukerakoa: erabiltzaileak zergatik dagoen grisez jakin dezan
        }
    }
}