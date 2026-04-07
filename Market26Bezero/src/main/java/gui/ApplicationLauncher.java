package gui;

import java.awt.Color;
import java.net.URL;
import java.util.Locale;

import javax.swing.UIManager;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import configuration.ConfigXML;
import service.*;

public class ApplicationLauncher { 
	
	
	
	public static void main(String[] args) {

		ConfigXML c=ConfigXML.getInstance();		
		Locale.setDefault(new Locale(c.getLocale()));
		
		MainGUI a=new MainGUI(null);
		a.setVisible(true);


		try {
			
			BLFacade appFacadeInterface;
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
			
			
			
				
				 String serviceName= "http://"+c.getBusinessLogicNode() +":"+ c.getBusinessLogicPort()+"/ws/"+c.getBusinessLogicName()+"?wsdl";	 
				 URL url = new URL(serviceName);

		 
		        //1st argum ent refers to wsdl document above
				//2nd argument is service name, refer to wsdl document above
		        QName qname = new QName("http://businessLogic/", "BLFacadeImplementationService");
		 
		        Service service = Service.create(url, qname);

		        appFacadeInterface = service.getPort(BLFacade.class);
			
			
			MainGUI.setBussinessLogic(appFacadeInterface);
			//ErreklamatuGUI g=new ErreklamatuGUI();
			//g.setVisible(true);
			
		}catch (Exception e) {
			a.aukeratuEtiketa.setText("Error: "+e.toString());
			a.aukeratuEtiketa.setForeground(Color.RED);	
			
			System.out.println("Error in ApplicationLauncher: "+e.toString());
		}


	}

}
