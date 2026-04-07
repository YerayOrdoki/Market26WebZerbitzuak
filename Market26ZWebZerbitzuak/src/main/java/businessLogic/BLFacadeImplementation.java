package businessLogic;
import java.io.File;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.EntityExistsException;

import dataAccess.DataAccess;
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

import java.awt.image.BufferedImage;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.io.IOException;


/**
 * It implements the business logic as a web service.
 */
@WebService(endpointInterface = "businessLogic.BLFacade")
public class BLFacadeImplementation  implements BLFacade {
	 private static final int baseSize = 160;

		private static final String basePath="src/main/resources/images/";
	DataAccess dbManager;

	public BLFacadeImplementation()  {		
		System.out.println("Creating BLFacadeImplementation instance");
		dbManager=new DataAccess();		
	}
	
    public BLFacadeImplementation(DataAccess da)  {
		System.out.println("Creating BLFacadeImplementation instance with DataAccess parameter");
		dbManager=da;		
	}
    

	/**
	 * {@inheritDoc}
	 */
   @WebMethod
	public Sale createSale(String title, String description,int status, float price, Date pubDate, String sellerEmail, File file) throws  FileNotUploadedException, MustBeLaterThanTodayException, SaleAlreadyExistException {
		dbManager.open();
		Sale product=dbManager.createSale(title, description, status, price, pubDate, sellerEmail, file);		
		dbManager.close();
		return product;
   };
   @WebMethod
   public void erreklamazioaSortu(String title, String deskribapena, String sortzaileEmaila, String jasotzaileEmaila, Date pubDate, BoughtSale produktoa) throws MustBeLaterThanTodayException, ErreklamazioaAlreadyExistException {
       dbManager.open();
       dbManager.ErreklamazioaSortu(title, deskribapena, sortzaileEmaila, jasotzaileEmaila, pubDate, produktoa);
       dbManager.close();
   }
	
   /**
    * {@inheritDoc}
    */
	@WebMethod 
	public List<Sale> getSales(String desc){
		dbManager.open();
		List<Sale>  rides=dbManager.getSales(desc);
		dbManager.close();
		return rides;
	}
	
	/**
	    * {@inheritDoc}
	    */
		@WebMethod 
		public List<Sale> getPublishedSales(String desc, Date pubDate) {
			dbManager.open();
			List<Sale>  rides=dbManager.getPublishedSales(desc,pubDate);
			dbManager.close();
			return rides;
		}
	/**
	    * {@inheritDoc}
	    */
	@WebMethod public BufferedImage getFile(String fileName) {
		return dbManager.getFile(fileName);
	}

    
	public void close() {
		DataAccess dB4oManager=new DataAccess();
		dB4oManager.close();

	}

	/**
	 * {@inheritDoc}
	 */
    @WebMethod	
	 public void initializeBD(){
    	dbManager.open();
		dbManager.initializeDB();
		dbManager.close();
	}
    /**
	 * {@inheritDoc}
	 */
    @WebMethod public Image downloadImage(String imageName) {
        File image = new File(basePath+imageName);
        try {
            return ImageIO.read(image);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
	@WebMethod public User isLogged(String email,String pass) {
		dbManager.open();
		User u = dbManager.isLogged(email,pass);
		dbManager.close();
		return u;
	}
	@WebMethod public Registered erabiltzaileaSortu(String email,String erabiltzailea,String pass) throws EntityExistsException{
		dbManager.open();
		Registered s=dbManager.erabiltzaileaSortu(email, erabiltzailea, pass);
		dbManager.close();
		return s;
	}

	@WebMethod public boolean faboritoaEzabatu(Integer produktoaNumber, String saltzaileaId) {
		dbManager.open();
		boolean ema=dbManager.faboritoaEzabatu(produktoaNumber, saltzaileaId);
		dbManager.close();
		return ema;
	}

	@WebMethod public boolean faboritoaGehitu(Integer produktoaNumber, String saltzaileaId) {
		dbManager.open();
		boolean ema=dbManager.faboritoaGehitu(produktoaNumber, saltzaileaId);
		dbManager.close();
		return ema;
	}
	
	@WebMethod public void erositakoaGehitu(Integer produktoaNumber, String saltzaileaId) {
		dbManager.open();
		boolean ema=dbManager.erositakoakGehitu(produktoaNumber, saltzaileaId);
		dbManager.close();
	}
	
	@WebMethod public boolean faboritoaDa(Integer produktoaNumber, String saltzaileaId) {
		dbManager.open();
		boolean ema=dbManager.faboritoaDa(produktoaNumber, saltzaileaId);
		dbManager.close();
		return ema;
	}

	@WebMethod public Registered getSellerByName(String s) {
		dbManager.open();
		Registered sel= dbManager.getSellerByName(s);
		dbManager.close();
		return sel;
	}
	@WebMethod public Registered getSellerByEmail(String e) {
    	dbManager.open();
    	Registered sel= dbManager.getSellerByEmail(e);
    	dbManager.close();
    	return sel;
    }
    
    
	@WebMethod public List<Sale> getFaboritoak (String saltzaileaId){
		dbManager.open();
		List<Sale> faboritoak= dbManager.getFaboritoLista(saltzaileaId);
		dbManager.close();
		return faboritoak;
	}
	
	@WebMethod public List<BoughtSale> getErositakoak(String saltzaileaId){
		dbManager.open();
		List<BoughtSale> erositakoak= dbManager.getErositakoLista(saltzaileaId);
		dbManager.close();
		return erositakoak;
	}
	
	@WebMethod public BoughtSale lortuErositakoSalmenta(String erosleEmail, String title) {
		dbManager.open();
		BoughtSale erositakoa= dbManager.lortuErositakoSalmenta(erosleEmail, title);
		dbManager.close();
		return erositakoa;
	}
	
	@WebMethod public boolean produktoaErosi(Integer produktoaNumber, String saltzaileaId) {
		dbManager.open();
		boolean itzuli= dbManager.produktoaErosi(produktoaNumber, saltzaileaId);
		dbManager.close();
		return itzuli;
	}
	@WebMethod
	public List<Sale>getSalesBySeller(String saltzaileaId,String query, Date date){
		dbManager.open();
		List<Sale> lista =dbManager.getSalesBySeller(saltzaileaId, query, date);
		dbManager.close();
		return lista;
	}
	@WebMethod
	public List<BoughtSale>getSoldBySeller(String saltzaileaId,String query, Date date){
		dbManager.open();
		List<BoughtSale> lista =dbManager.getSoldBySeller(saltzaileaId, query, date);
		dbManager.close();
		return lista;
	}
	@WebMethod
	public boolean removeSale(Integer produktoaNumber, String saltzaileaId) {
		dbManager.open();
		boolean eran =dbManager.removeSale(produktoaNumber, saltzaileaId);
		dbManager.close();
		return eran;
	}
	@WebMethod
	public boolean diruaAtera (Double kantitatea, String userId) {
		dbManager.open();
		boolean eran =dbManager.DiruaAtera(kantitatea, userId);
		dbManager.close();
		return eran;
	}
	@WebMethod
	public void diruaSartu (Double kantitatea, String userId) {
		dbManager.open();
		dbManager.DiruaSartu(kantitatea, userId);
		dbManager.close();
	}
	@WebMethod
	public List<Mugimendua> getMugimenduakBySeller(String saltzaileaId,String query, Date date){
		dbManager.open();
		List<Mugimendua> lista =dbManager.getMugimenduakBySeller(saltzaileaId, query, date);
		dbManager.close();
		return lista;
	}
	@WebMethod
	public Erreklamazioa lortuErreklamazioa(String erosleEmail, String title) {
		dbManager.open();
		Erreklamazioa eran =dbManager.lortuErreklamazioa(erosleEmail, title);
		dbManager.close();
		return eran;
	}
	
	@WebMethod
	public Erreklamazioa disputaMezuaGehitu(Integer idErreklamazioa, String emailEmisor, String texto) {
	    dbManager.open();
	    Erreklamazioa err = dbManager.disputaMezuaGehitu(idErreklamazioa, emailEmisor, texto);
	    dbManager.close();
	    return err;
	}

	@WebMethod
	public Erreklamazioa erreklamazioaEgoeraAldatu(Integer idErreklamazioa, int egoeraBerria) {
	    dbManager.open();
	    Erreklamazioa err = dbManager.erreklamazioaEgoeraAldatu(idErreklamazioa, egoeraBerria);
	    dbManager.close();
	    return err;
	}
	
	@WebMethod
	public List<Erreklamazioa> getErreklamazioEskalatuak() {
	    dbManager.open();
	    List<Erreklamazioa> lista = dbManager.getErreklamazioEskalatuak();
	    dbManager.close();
	    return lista;
	}
	
	@WebMethod
	public void notifikazioaBidali(String email, String mezua) {
		dbManager.open();
	    dbManager.notifikazioaBidali(email, mezua);
	    dbManager.close();
	}
	
	@WebMethod
	public boolean badituIrakurriGabekoak(String email) {
		dbManager.open();
		boolean eran =dbManager.badituIrakurriGabekoak(email);
		dbManager.close();
		return eran;
	}
	
	@WebMethod
	public void markatuIrakurrita(String email) {
		dbManager.open();
	    dbManager.markatuIrakurrita(email);
	    dbManager.close();
	}
	
	@WebMethod
	public List<Notifikazioa> getNotifikazioak(String email) {
	    dbManager.open();
	    List<Notifikazioa> lista = dbManager.getNotifikazioak(email);
	    dbManager.close();
	    return lista;
	}
	
	@WebMethod
	public void salaketaSortu(String mota, Integer numProduktoa, Date pubDate, Registered salatzailea)
			throws MustBeLaterThanTodayException, ErreklamazioaAlreadyExistException {
		dbManager.open();
		dbManager.salaketaSortu(mota, numProduktoa, pubDate, salatzailea);
		dbManager.close();
	};
	
	@WebMethod
	public List<Salaketa> getSalaketak() {
	    dbManager.open();
	    List<Salaketa> lista = dbManager.getSalaketak();
	    dbManager.close();
	    return lista;
	}
	
	@WebMethod
	public void produktoaEzabatu(Integer produktoaNumber, String saltzaileaId) {
		dbManager.open();
		dbManager.produktoaEzabatu(produktoaNumber, saltzaileaId);
		dbManager.close();
	}
	@WebMethod
	public void kontuaBaneatu(String registeredId) {
		dbManager.open();
		dbManager.kontuaBaneatu(registeredId);
		dbManager.close();
	}
	
	@WebMethod
	public void kontuaDesbaneatu(String registeredId) {
		dbManager.open();
		dbManager.kontuaDesbaneatu(registeredId);
		dbManager.close();
	}
	@WebMethod
	public List<Registered> getRegisteredUsers(String desc) {
		dbManager.open();
		List<Registered>  rides=dbManager.getRegisteredUsers(desc);
		dbManager.close();
		return rides;
	}
	
	@WebMethod 
	public void salaketaEgoeraAldatu(Integer idErreklamazioa, int egoeraBerria) {
		dbManager.open();
	    dbManager.salaketaEgoeraAldatu(idErreklamazioa, egoeraBerria);
	    dbManager.close();
	}
	
	@WebMethod public boolean salatutaDago(Integer produktoaNumber, String saltzaileaId) {
		dbManager.open();
		boolean ema=dbManager.salatutaDago(produktoaNumber, saltzaileaId);
		dbManager.close();
		return ema;
	}
	
	@WebMethod
	public SaleSellerBoughtContainer getSaleSellerBoughtContainer(Integer SaleNumber) {
		dbManager.open();
		SaleSellerBoughtContainer itzuli= dbManager.getSaleBoughtSale(SaleNumber);
		dbManager.close();
		return itzuli;
	}
	@WebMethod public User getSellerByErreklamazioa(Erreklamazioa dm) {
		dbManager.open();
		User itzuli=dbManager.getSellerByErreklamazioa(dm);
		dbManager.close();
		return itzuli;
	}
	
	@WebMethod public User getBuyerByErreklamazioa(Erreklamazioa dm) {
		dbManager.open();
		User itzuli=dbManager.getBuyerByErreklamazioa(dm);
		dbManager.close();
		return itzuli;
	}
	@WebMethod
	public User getSalatzaileaBySalaketa(Salaketa sal) {
		dbManager.open();
		User itzuli=dbManager.getSalatzaileaBySalaketa(sal);
		dbManager.close();
		return itzuli;
	}
	@WebMethod
	public User getIgorleaByDM(DisputaMezua dm) {
		dbManager.open();
		User itzuli=dbManager.getIgorleaByDM(dm);
		dbManager.close();
		
		return itzuli;
	}
	@WebMethod public Erreklamazioa lortuErreklamazioById(Integer kexaNumber) {
		dbManager.open();
		Erreklamazioa itzuli=dbManager.lortuErreklamazioById(kexaNumber);
		dbManager.close();
		return itzuli;
	}
    
}

