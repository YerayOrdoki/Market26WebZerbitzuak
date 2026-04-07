package businessLogic;

import java.io.File;
import java.util.Date;
import java.util.List;

import domain.BoughtSale;
import domain.DisputaMezua;
import domain.Erreklamazioa;
import domain.Registered;
import domain.Salaketa;
import domain.Sale;
import domain.SaleSellerBoughtContainer;
import domain.User;
import domain.Mugimendua;
import domain.Notifikazioa;
import exceptions.ErreklamazioaAlreadyExistException;
import exceptions.FileNotUploadedException;
import exceptions.MustBeLaterThanTodayException;
import exceptions.SaleAlreadyExistException;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.EntityExistsException;

import java.awt.image.BufferedImage;
import java.awt.Image;


/**
 * Interface that specifies the business logic.
 */
@WebService
public interface BLFacade  {
	  

	/**
	 * This method creates/adds a product to a seller
	 * 
	 * @param title of the product
	 * @param description of the product
	 * @param status 
	 * @param selling price
	 * @param category of a product
	 * @param publicationDate
	 * @return Sale
	 */
   @WebMethod
	public Sale createSale(String title, String description, int status, float price, Date pubDate, String sellerEmail, File file) throws  FileNotUploadedException, MustBeLaterThanTodayException, SaleAlreadyExistException;
   
	
	/**
	 * This method retrieves the products that contain desc
	 * 
	 * @param desc the text to search
	 * @return collection of sales that contain desc 
	 */
	@WebMethod public List<Sale> getSales(String desc);
	
	/**
	 * 	 * This method retrieves the products that contain a desc text in a title and the publicationDate today or before
	 * 
	 * @param desc the text to search
	 * @param pubDate the date  of the publication date
	 * @return collection of sales that contain desc and published before pubDate
	 */
	@WebMethod public List<Sale> getPublishedSales(String desc, Date pubDate);

	
	/**
	 * This method calls the data access to initialize the database with some sellers and products.
	 * It is only invoked  when the option "initialize" is declared in the tag dataBaseOpenMode of resources/config.xml file
	 */	
	@WebMethod public void initializeBD();
	
		
	@WebMethod public Image downloadImage(String imageName);
	
	@WebMethod public User isLogged(String email,String pass);
	
	@WebMethod public Registered erabiltzaileaSortu(String email,String erabiltzailea,String pass)throws EntityExistsException;
	
	//@WebMethod public boolean faboritoaEguneratu(Sale faboritoa, Seller saltzaile);
	
	@WebMethod public Registered getSellerByName(String s);
	
	@WebMethod public List<Sale> getFaboritoak (String saltzaileaId);
	
	@WebMethod public List<BoughtSale> getErositakoak(String saltzaileaId);

	@WebMethod public boolean produktoaErosi(Integer produktoaNumber, String saltzaileaId);
	
	@WebMethod BoughtSale lortuErositakoSalmenta(String erosleEmail, String title);
	
	@WebMethod public boolean faboritoaDa(Integer produktoaNumber, String saltzaileaId) ;
	
	@WebMethod public boolean faboritoaGehitu(Integer produktoaNumber, String saltzaileaId);
	
	@WebMethod public void erositakoaGehitu(Integer produktoaNumber, String saltzaileaId);
	
	@WebMethod public boolean faboritoaEzabatu(Integer produktoaNumber, String saltzaileaId);

	@WebMethod public Registered getSellerByEmail(String e);
	
	@WebMethod public List<Sale> getSalesBySeller(String saltzaileaId,String query, Date date);
	
	@WebMethod public boolean removeSale(Integer produktoaNumber, String saltzaileaId);

	@WebMethod public boolean diruaAtera (Double kantitatea, String userId);
	
	@WebMethod public void diruaSartu (Double kantitatea, String userId);
	
	@WebMethod public List<BoughtSale> getSoldBySeller(String saltzaileaId,String query, Date date);

	@WebMethod public List<Mugimendua> getMugimenduakBySeller(String saltzaileaId,String query, Date date);
	
	@WebMethod public void erreklamazioaSortu(String title, String deskribapena, String sortzaileEmaila, String jasotzaileEmaila, Date pubDate, BoughtSale produktoa) throws MustBeLaterThanTodayException, ErreklamazioaAlreadyExistException;
	
	@WebMethod public Erreklamazioa lortuErreklamazioa(String erosleEmail, String title);
	
	@WebMethod public Erreklamazioa disputaMezuaGehitu(Integer idErreklamazioa, String emailEmisor, String texto);

	@WebMethod public Erreklamazioa erreklamazioaEgoeraAldatu(Integer idErreklamazioa, int egoeraBerria);
	
	@WebMethod public List<Erreklamazioa> getErreklamazioEskalatuak();
	
	@WebMethod public void notifikazioaBidali(String email, String mezua);
	
	@WebMethod boolean badituIrakurriGabekoak(String email);
	
	@WebMethod public void markatuIrakurrita(String email);
	
	@WebMethod public List<Notifikazioa> getNotifikazioak(String email);
	
	@WebMethod public void  salaketaSortu(String mota, Integer numProduktoa, Date pubDate, Registered salatzailea) throws  MustBeLaterThanTodayException, ErreklamazioaAlreadyExistException;
	
	@WebMethod public void salaketaEgoeraAldatu(Integer idErreklamazioa, int egoeraBerria);
	
	@WebMethod public boolean salatutaDago(Integer produktoaNumber, String saltzaileaId);
	
	@WebMethod public List<Salaketa> getSalaketak();
	
	@WebMethod public void produktoaEzabatu(Integer produktoaNumber, String saltzaileaId);

	@WebMethod public void kontuaBaneatu(String registeredId);
	
	@WebMethod public void kontuaDesbaneatu(String registeredId);
	
	@WebMethod public List<Registered> getRegisteredUsers(String desc);
	
	@WebMethod public SaleSellerBoughtContainer getSaleSellerBoughtContainer(Integer saleNumber);
	
	@WebMethod public User getSellerByErreklamazioa(Erreklamazioa dm);
	
	@WebMethod public User getBuyerByErreklamazioa(Erreklamazioa dm);
	
	@WebMethod public User getSalatzaileaBySalaketa(Salaketa sal);
	
	@WebMethod public User getIgorleaByDM(DisputaMezua dm);
	
	@WebMethod public Erreklamazioa lortuErreklamazioById(Integer kexaNumber);
}
