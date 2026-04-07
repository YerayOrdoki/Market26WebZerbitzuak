
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ErreklamazioaAlreadyExistException_QNAME = new QName("http://businessLogic/", "ErreklamazioaAlreadyExistException");
    private final static QName _FileNotUploadedException_QNAME = new QName("http://businessLogic/", "FileNotUploadedException");
    private final static QName _MustBeLaterThanTodayException_QNAME = new QName("http://businessLogic/", "MustBeLaterThanTodayException");
    private final static QName _SaleAlreadyExistException_QNAME = new QName("http://businessLogic/", "SaleAlreadyExistException");
    private final static QName _BadituIrakurriGabekoak_QNAME = new QName("http://businessLogic/", "badituIrakurriGabekoak");
    private final static QName _BadituIrakurriGabekoakResponse_QNAME = new QName("http://businessLogic/", "badituIrakurriGabekoakResponse");
    private final static QName _CreateSale_QNAME = new QName("http://businessLogic/", "createSale");
    private final static QName _CreateSaleResponse_QNAME = new QName("http://businessLogic/", "createSaleResponse");
    private final static QName _DiruaAtera_QNAME = new QName("http://businessLogic/", "diruaAtera");
    private final static QName _DiruaAteraResponse_QNAME = new QName("http://businessLogic/", "diruaAteraResponse");
    private final static QName _DiruaSartu_QNAME = new QName("http://businessLogic/", "diruaSartu");
    private final static QName _DiruaSartuResponse_QNAME = new QName("http://businessLogic/", "diruaSartuResponse");
    private final static QName _DisputaMezuaGehitu_QNAME = new QName("http://businessLogic/", "disputaMezuaGehitu");
    private final static QName _DisputaMezuaGehituResponse_QNAME = new QName("http://businessLogic/", "disputaMezuaGehituResponse");
    private final static QName _DownloadImage_QNAME = new QName("http://businessLogic/", "downloadImage");
    private final static QName _DownloadImageResponse_QNAME = new QName("http://businessLogic/", "downloadImageResponse");
    private final static QName _ErabiltzaileaSortu_QNAME = new QName("http://businessLogic/", "erabiltzaileaSortu");
    private final static QName _ErabiltzaileaSortuResponse_QNAME = new QName("http://businessLogic/", "erabiltzaileaSortuResponse");
    private final static QName _ErositakoaGehitu_QNAME = new QName("http://businessLogic/", "erositakoaGehitu");
    private final static QName _ErositakoaGehituResponse_QNAME = new QName("http://businessLogic/", "erositakoaGehituResponse");
    private final static QName _ErreklamazioaEgoeraAldatu_QNAME = new QName("http://businessLogic/", "erreklamazioaEgoeraAldatu");
    private final static QName _ErreklamazioaEgoeraAldatuResponse_QNAME = new QName("http://businessLogic/", "erreklamazioaEgoeraAldatuResponse");
    private final static QName _ErreklamazioaSortu_QNAME = new QName("http://businessLogic/", "erreklamazioaSortu");
    private final static QName _ErreklamazioaSortuResponse_QNAME = new QName("http://businessLogic/", "erreklamazioaSortuResponse");
    private final static QName _FaboritoaDa_QNAME = new QName("http://businessLogic/", "faboritoaDa");
    private final static QName _FaboritoaDaResponse_QNAME = new QName("http://businessLogic/", "faboritoaDaResponse");
    private final static QName _FaboritoaEzabatu_QNAME = new QName("http://businessLogic/", "faboritoaEzabatu");
    private final static QName _FaboritoaEzabatuResponse_QNAME = new QName("http://businessLogic/", "faboritoaEzabatuResponse");
    private final static QName _FaboritoaGehitu_QNAME = new QName("http://businessLogic/", "faboritoaGehitu");
    private final static QName _FaboritoaGehituResponse_QNAME = new QName("http://businessLogic/", "faboritoaGehituResponse");
    private final static QName _GetBuyerByErreklamazioa_QNAME = new QName("http://businessLogic/", "getBuyerByErreklamazioa");
    private final static QName _GetBuyerByErreklamazioaResponse_QNAME = new QName("http://businessLogic/", "getBuyerByErreklamazioaResponse");
    private final static QName _GetErositakoak_QNAME = new QName("http://businessLogic/", "getErositakoak");
    private final static QName _GetErositakoakResponse_QNAME = new QName("http://businessLogic/", "getErositakoakResponse");
    private final static QName _GetErreklamazioEskalatuak_QNAME = new QName("http://businessLogic/", "getErreklamazioEskalatuak");
    private final static QName _GetErreklamazioEskalatuakResponse_QNAME = new QName("http://businessLogic/", "getErreklamazioEskalatuakResponse");
    private final static QName _GetFaboritoak_QNAME = new QName("http://businessLogic/", "getFaboritoak");
    private final static QName _GetFaboritoakResponse_QNAME = new QName("http://businessLogic/", "getFaboritoakResponse");
    private final static QName _GetIgorleaByDM_QNAME = new QName("http://businessLogic/", "getIgorleaByDM");
    private final static QName _GetIgorleaByDMResponse_QNAME = new QName("http://businessLogic/", "getIgorleaByDMResponse");
    private final static QName _GetMugimenduakBySeller_QNAME = new QName("http://businessLogic/", "getMugimenduakBySeller");
    private final static QName _GetMugimenduakBySellerResponse_QNAME = new QName("http://businessLogic/", "getMugimenduakBySellerResponse");
    private final static QName _GetNotifikazioak_QNAME = new QName("http://businessLogic/", "getNotifikazioak");
    private final static QName _GetNotifikazioakResponse_QNAME = new QName("http://businessLogic/", "getNotifikazioakResponse");
    private final static QName _GetPublishedSales_QNAME = new QName("http://businessLogic/", "getPublishedSales");
    private final static QName _GetPublishedSalesResponse_QNAME = new QName("http://businessLogic/", "getPublishedSalesResponse");
    private final static QName _GetRegisteredUsers_QNAME = new QName("http://businessLogic/", "getRegisteredUsers");
    private final static QName _GetRegisteredUsersResponse_QNAME = new QName("http://businessLogic/", "getRegisteredUsersResponse");
    private final static QName _GetSalaketak_QNAME = new QName("http://businessLogic/", "getSalaketak");
    private final static QName _GetSalaketakResponse_QNAME = new QName("http://businessLogic/", "getSalaketakResponse");
    private final static QName _GetSalatzaileaBySalaketa_QNAME = new QName("http://businessLogic/", "getSalatzaileaBySalaketa");
    private final static QName _GetSalatzaileaBySalaketaResponse_QNAME = new QName("http://businessLogic/", "getSalatzaileaBySalaketaResponse");
    private final static QName _GetSaleSellerBoughtContainer_QNAME = new QName("http://businessLogic/", "getSaleSellerBoughtContainer");
    private final static QName _GetSaleSellerBoughtContainerResponse_QNAME = new QName("http://businessLogic/", "getSaleSellerBoughtContainerResponse");
    private final static QName _GetSales_QNAME = new QName("http://businessLogic/", "getSales");
    private final static QName _GetSalesBySeller_QNAME = new QName("http://businessLogic/", "getSalesBySeller");
    private final static QName _GetSalesBySellerResponse_QNAME = new QName("http://businessLogic/", "getSalesBySellerResponse");
    private final static QName _GetSalesResponse_QNAME = new QName("http://businessLogic/", "getSalesResponse");
    private final static QName _GetSellerByEmail_QNAME = new QName("http://businessLogic/", "getSellerByEmail");
    private final static QName _GetSellerByEmailResponse_QNAME = new QName("http://businessLogic/", "getSellerByEmailResponse");
    private final static QName _GetSellerByErreklamazioa_QNAME = new QName("http://businessLogic/", "getSellerByErreklamazioa");
    private final static QName _GetSellerByErreklamazioaResponse_QNAME = new QName("http://businessLogic/", "getSellerByErreklamazioaResponse");
    private final static QName _GetSellerByName_QNAME = new QName("http://businessLogic/", "getSellerByName");
    private final static QName _GetSellerByNameResponse_QNAME = new QName("http://businessLogic/", "getSellerByNameResponse");
    private final static QName _GetSoldBySeller_QNAME = new QName("http://businessLogic/", "getSoldBySeller");
    private final static QName _GetSoldBySellerResponse_QNAME = new QName("http://businessLogic/", "getSoldBySellerResponse");
    private final static QName _InitializeBD_QNAME = new QName("http://businessLogic/", "initializeBD");
    private final static QName _InitializeBDResponse_QNAME = new QName("http://businessLogic/", "initializeBDResponse");
    private final static QName _IsLogged_QNAME = new QName("http://businessLogic/", "isLogged");
    private final static QName _IsLoggedResponse_QNAME = new QName("http://businessLogic/", "isLoggedResponse");
    private final static QName _KontuaBaneatu_QNAME = new QName("http://businessLogic/", "kontuaBaneatu");
    private final static QName _KontuaBaneatuResponse_QNAME = new QName("http://businessLogic/", "kontuaBaneatuResponse");
    private final static QName _KontuaDesbaneatu_QNAME = new QName("http://businessLogic/", "kontuaDesbaneatu");
    private final static QName _KontuaDesbaneatuResponse_QNAME = new QName("http://businessLogic/", "kontuaDesbaneatuResponse");
    private final static QName _LortuErositakoSalmenta_QNAME = new QName("http://businessLogic/", "lortuErositakoSalmenta");
    private final static QName _LortuErositakoSalmentaResponse_QNAME = new QName("http://businessLogic/", "lortuErositakoSalmentaResponse");
    private final static QName _LortuErreklamazioById_QNAME = new QName("http://businessLogic/", "lortuErreklamazioById");
    private final static QName _LortuErreklamazioByIdResponse_QNAME = new QName("http://businessLogic/", "lortuErreklamazioByIdResponse");
    private final static QName _LortuErreklamazioa_QNAME = new QName("http://businessLogic/", "lortuErreklamazioa");
    private final static QName _LortuErreklamazioaResponse_QNAME = new QName("http://businessLogic/", "lortuErreklamazioaResponse");
    private final static QName _MarkatuIrakurrita_QNAME = new QName("http://businessLogic/", "markatuIrakurrita");
    private final static QName _MarkatuIrakurritaResponse_QNAME = new QName("http://businessLogic/", "markatuIrakurritaResponse");
    private final static QName _NotifikazioaBidali_QNAME = new QName("http://businessLogic/", "notifikazioaBidali");
    private final static QName _NotifikazioaBidaliResponse_QNAME = new QName("http://businessLogic/", "notifikazioaBidaliResponse");
    private final static QName _ProduktoaErosi_QNAME = new QName("http://businessLogic/", "produktoaErosi");
    private final static QName _ProduktoaErosiResponse_QNAME = new QName("http://businessLogic/", "produktoaErosiResponse");
    private final static QName _ProduktoaEzabatu_QNAME = new QName("http://businessLogic/", "produktoaEzabatu");
    private final static QName _ProduktoaEzabatuResponse_QNAME = new QName("http://businessLogic/", "produktoaEzabatuResponse");
    private final static QName _RemoveSale_QNAME = new QName("http://businessLogic/", "removeSale");
    private final static QName _RemoveSaleResponse_QNAME = new QName("http://businessLogic/", "removeSaleResponse");
    private final static QName _SalaketaEgoeraAldatu_QNAME = new QName("http://businessLogic/", "salaketaEgoeraAldatu");
    private final static QName _SalaketaEgoeraAldatuResponse_QNAME = new QName("http://businessLogic/", "salaketaEgoeraAldatuResponse");
    private final static QName _SalaketaSortu_QNAME = new QName("http://businessLogic/", "salaketaSortu");
    private final static QName _SalaketaSortuResponse_QNAME = new QName("http://businessLogic/", "salaketaSortuResponse");
    private final static QName _SalatutaDago_QNAME = new QName("http://businessLogic/", "salatutaDago");
    private final static QName _SalatutaDagoResponse_QNAME = new QName("http://businessLogic/", "salatutaDagoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ErreklamazioaAlreadyExistException }
     * 
     */
    public ErreklamazioaAlreadyExistException createErreklamazioaAlreadyExistException() {
        return new ErreklamazioaAlreadyExistException();
    }

    /**
     * Create an instance of {@link FileNotUploadedException }
     * 
     */
    public FileNotUploadedException createFileNotUploadedException() {
        return new FileNotUploadedException();
    }

    /**
     * Create an instance of {@link MustBeLaterThanTodayException }
     * 
     */
    public MustBeLaterThanTodayException createMustBeLaterThanTodayException() {
        return new MustBeLaterThanTodayException();
    }

    /**
     * Create an instance of {@link SaleAlreadyExistException }
     * 
     */
    public SaleAlreadyExistException createSaleAlreadyExistException() {
        return new SaleAlreadyExistException();
    }

    /**
     * Create an instance of {@link BadituIrakurriGabekoak }
     * 
     */
    public BadituIrakurriGabekoak createBadituIrakurriGabekoak() {
        return new BadituIrakurriGabekoak();
    }

    /**
     * Create an instance of {@link BadituIrakurriGabekoakResponse }
     * 
     */
    public BadituIrakurriGabekoakResponse createBadituIrakurriGabekoakResponse() {
        return new BadituIrakurriGabekoakResponse();
    }

    /**
     * Create an instance of {@link CreateSale }
     * 
     */
    public CreateSale createCreateSale() {
        return new CreateSale();
    }

    /**
     * Create an instance of {@link CreateSaleResponse }
     * 
     */
    public CreateSaleResponse createCreateSaleResponse() {
        return new CreateSaleResponse();
    }

    /**
     * Create an instance of {@link DiruaAtera }
     * 
     */
    public DiruaAtera createDiruaAtera() {
        return new DiruaAtera();
    }

    /**
     * Create an instance of {@link DiruaAteraResponse }
     * 
     */
    public DiruaAteraResponse createDiruaAteraResponse() {
        return new DiruaAteraResponse();
    }

    /**
     * Create an instance of {@link DiruaSartu }
     * 
     */
    public DiruaSartu createDiruaSartu() {
        return new DiruaSartu();
    }

    /**
     * Create an instance of {@link DiruaSartuResponse }
     * 
     */
    public DiruaSartuResponse createDiruaSartuResponse() {
        return new DiruaSartuResponse();
    }

    /**
     * Create an instance of {@link DisputaMezuaGehitu }
     * 
     */
    public DisputaMezuaGehitu createDisputaMezuaGehitu() {
        return new DisputaMezuaGehitu();
    }

    /**
     * Create an instance of {@link DisputaMezuaGehituResponse }
     * 
     */
    public DisputaMezuaGehituResponse createDisputaMezuaGehituResponse() {
        return new DisputaMezuaGehituResponse();
    }

    /**
     * Create an instance of {@link DownloadImage }
     * 
     */
    public DownloadImage createDownloadImage() {
        return new DownloadImage();
    }

    /**
     * Create an instance of {@link DownloadImageResponse }
     * 
     */
    public DownloadImageResponse createDownloadImageResponse() {
        return new DownloadImageResponse();
    }

    /**
     * Create an instance of {@link ErabiltzaileaSortu }
     * 
     */
    public ErabiltzaileaSortu createErabiltzaileaSortu() {
        return new ErabiltzaileaSortu();
    }

    /**
     * Create an instance of {@link ErabiltzaileaSortuResponse }
     * 
     */
    public ErabiltzaileaSortuResponse createErabiltzaileaSortuResponse() {
        return new ErabiltzaileaSortuResponse();
    }

    /**
     * Create an instance of {@link ErositakoaGehitu }
     * 
     */
    public ErositakoaGehitu createErositakoaGehitu() {
        return new ErositakoaGehitu();
    }

    /**
     * Create an instance of {@link ErositakoaGehituResponse }
     * 
     */
    public ErositakoaGehituResponse createErositakoaGehituResponse() {
        return new ErositakoaGehituResponse();
    }

    /**
     * Create an instance of {@link ErreklamazioaEgoeraAldatu }
     * 
     */
    public ErreklamazioaEgoeraAldatu createErreklamazioaEgoeraAldatu() {
        return new ErreklamazioaEgoeraAldatu();
    }

    /**
     * Create an instance of {@link ErreklamazioaEgoeraAldatuResponse }
     * 
     */
    public ErreklamazioaEgoeraAldatuResponse createErreklamazioaEgoeraAldatuResponse() {
        return new ErreklamazioaEgoeraAldatuResponse();
    }

    /**
     * Create an instance of {@link ErreklamazioaSortu }
     * 
     */
    public ErreklamazioaSortu createErreklamazioaSortu() {
        return new ErreklamazioaSortu();
    }

    /**
     * Create an instance of {@link ErreklamazioaSortuResponse }
     * 
     */
    public ErreklamazioaSortuResponse createErreklamazioaSortuResponse() {
        return new ErreklamazioaSortuResponse();
    }

    /**
     * Create an instance of {@link FaboritoaDa }
     * 
     */
    public FaboritoaDa createFaboritoaDa() {
        return new FaboritoaDa();
    }

    /**
     * Create an instance of {@link FaboritoaDaResponse }
     * 
     */
    public FaboritoaDaResponse createFaboritoaDaResponse() {
        return new FaboritoaDaResponse();
    }

    /**
     * Create an instance of {@link FaboritoaEzabatu }
     * 
     */
    public FaboritoaEzabatu createFaboritoaEzabatu() {
        return new FaboritoaEzabatu();
    }

    /**
     * Create an instance of {@link FaboritoaEzabatuResponse }
     * 
     */
    public FaboritoaEzabatuResponse createFaboritoaEzabatuResponse() {
        return new FaboritoaEzabatuResponse();
    }

    /**
     * Create an instance of {@link FaboritoaGehitu }
     * 
     */
    public FaboritoaGehitu createFaboritoaGehitu() {
        return new FaboritoaGehitu();
    }

    /**
     * Create an instance of {@link FaboritoaGehituResponse }
     * 
     */
    public FaboritoaGehituResponse createFaboritoaGehituResponse() {
        return new FaboritoaGehituResponse();
    }

    /**
     * Create an instance of {@link GetBuyerByErreklamazioa }
     * 
     */
    public GetBuyerByErreklamazioa createGetBuyerByErreklamazioa() {
        return new GetBuyerByErreklamazioa();
    }

    /**
     * Create an instance of {@link GetBuyerByErreklamazioaResponse }
     * 
     */
    public GetBuyerByErreklamazioaResponse createGetBuyerByErreklamazioaResponse() {
        return new GetBuyerByErreklamazioaResponse();
    }

    /**
     * Create an instance of {@link GetErositakoak }
     * 
     */
    public GetErositakoak createGetErositakoak() {
        return new GetErositakoak();
    }

    /**
     * Create an instance of {@link GetErositakoakResponse }
     * 
     */
    public GetErositakoakResponse createGetErositakoakResponse() {
        return new GetErositakoakResponse();
    }

    /**
     * Create an instance of {@link GetErreklamazioEskalatuak }
     * 
     */
    public GetErreklamazioEskalatuak createGetErreklamazioEskalatuak() {
        return new GetErreklamazioEskalatuak();
    }

    /**
     * Create an instance of {@link GetErreklamazioEskalatuakResponse }
     * 
     */
    public GetErreklamazioEskalatuakResponse createGetErreklamazioEskalatuakResponse() {
        return new GetErreklamazioEskalatuakResponse();
    }

    /**
     * Create an instance of {@link GetFaboritoak }
     * 
     */
    public GetFaboritoak createGetFaboritoak() {
        return new GetFaboritoak();
    }

    /**
     * Create an instance of {@link GetFaboritoakResponse }
     * 
     */
    public GetFaboritoakResponse createGetFaboritoakResponse() {
        return new GetFaboritoakResponse();
    }

    /**
     * Create an instance of {@link GetIgorleaByDM }
     * 
     */
    public GetIgorleaByDM createGetIgorleaByDM() {
        return new GetIgorleaByDM();
    }

    /**
     * Create an instance of {@link GetIgorleaByDMResponse }
     * 
     */
    public GetIgorleaByDMResponse createGetIgorleaByDMResponse() {
        return new GetIgorleaByDMResponse();
    }

    /**
     * Create an instance of {@link GetMugimenduakBySeller }
     * 
     */
    public GetMugimenduakBySeller createGetMugimenduakBySeller() {
        return new GetMugimenduakBySeller();
    }

    /**
     * Create an instance of {@link GetMugimenduakBySellerResponse }
     * 
     */
    public GetMugimenduakBySellerResponse createGetMugimenduakBySellerResponse() {
        return new GetMugimenduakBySellerResponse();
    }

    /**
     * Create an instance of {@link GetNotifikazioak }
     * 
     */
    public GetNotifikazioak createGetNotifikazioak() {
        return new GetNotifikazioak();
    }

    /**
     * Create an instance of {@link GetNotifikazioakResponse }
     * 
     */
    public GetNotifikazioakResponse createGetNotifikazioakResponse() {
        return new GetNotifikazioakResponse();
    }

    /**
     * Create an instance of {@link GetPublishedSales }
     * 
     */
    public GetPublishedSales createGetPublishedSales() {
        return new GetPublishedSales();
    }

    /**
     * Create an instance of {@link GetPublishedSalesResponse }
     * 
     */
    public GetPublishedSalesResponse createGetPublishedSalesResponse() {
        return new GetPublishedSalesResponse();
    }

    /**
     * Create an instance of {@link GetRegisteredUsers }
     * 
     */
    public GetRegisteredUsers createGetRegisteredUsers() {
        return new GetRegisteredUsers();
    }

    /**
     * Create an instance of {@link GetRegisteredUsersResponse }
     * 
     */
    public GetRegisteredUsersResponse createGetRegisteredUsersResponse() {
        return new GetRegisteredUsersResponse();
    }

    /**
     * Create an instance of {@link GetSalaketak }
     * 
     */
    public GetSalaketak createGetSalaketak() {
        return new GetSalaketak();
    }

    /**
     * Create an instance of {@link GetSalaketakResponse }
     * 
     */
    public GetSalaketakResponse createGetSalaketakResponse() {
        return new GetSalaketakResponse();
    }

    /**
     * Create an instance of {@link GetSalatzaileaBySalaketa }
     * 
     */
    public GetSalatzaileaBySalaketa createGetSalatzaileaBySalaketa() {
        return new GetSalatzaileaBySalaketa();
    }

    /**
     * Create an instance of {@link GetSalatzaileaBySalaketaResponse }
     * 
     */
    public GetSalatzaileaBySalaketaResponse createGetSalatzaileaBySalaketaResponse() {
        return new GetSalatzaileaBySalaketaResponse();
    }

    /**
     * Create an instance of {@link GetSaleSellerBoughtContainer }
     * 
     */
    public GetSaleSellerBoughtContainer createGetSaleSellerBoughtContainer() {
        return new GetSaleSellerBoughtContainer();
    }

    /**
     * Create an instance of {@link GetSaleSellerBoughtContainerResponse }
     * 
     */
    public GetSaleSellerBoughtContainerResponse createGetSaleSellerBoughtContainerResponse() {
        return new GetSaleSellerBoughtContainerResponse();
    }

    /**
     * Create an instance of {@link GetSales }
     * 
     */
    public GetSales createGetSales() {
        return new GetSales();
    }

    /**
     * Create an instance of {@link GetSalesBySeller }
     * 
     */
    public GetSalesBySeller createGetSalesBySeller() {
        return new GetSalesBySeller();
    }

    /**
     * Create an instance of {@link GetSalesBySellerResponse }
     * 
     */
    public GetSalesBySellerResponse createGetSalesBySellerResponse() {
        return new GetSalesBySellerResponse();
    }

    /**
     * Create an instance of {@link GetSalesResponse }
     * 
     */
    public GetSalesResponse createGetSalesResponse() {
        return new GetSalesResponse();
    }

    /**
     * Create an instance of {@link GetSellerByEmail }
     * 
     */
    public GetSellerByEmail createGetSellerByEmail() {
        return new GetSellerByEmail();
    }

    /**
     * Create an instance of {@link GetSellerByEmailResponse }
     * 
     */
    public GetSellerByEmailResponse createGetSellerByEmailResponse() {
        return new GetSellerByEmailResponse();
    }

    /**
     * Create an instance of {@link GetSellerByErreklamazioa }
     * 
     */
    public GetSellerByErreklamazioa createGetSellerByErreklamazioa() {
        return new GetSellerByErreklamazioa();
    }

    /**
     * Create an instance of {@link GetSellerByErreklamazioaResponse }
     * 
     */
    public GetSellerByErreklamazioaResponse createGetSellerByErreklamazioaResponse() {
        return new GetSellerByErreklamazioaResponse();
    }

    /**
     * Create an instance of {@link GetSellerByName }
     * 
     */
    public GetSellerByName createGetSellerByName() {
        return new GetSellerByName();
    }

    /**
     * Create an instance of {@link GetSellerByNameResponse }
     * 
     */
    public GetSellerByNameResponse createGetSellerByNameResponse() {
        return new GetSellerByNameResponse();
    }

    /**
     * Create an instance of {@link GetSoldBySeller }
     * 
     */
    public GetSoldBySeller createGetSoldBySeller() {
        return new GetSoldBySeller();
    }

    /**
     * Create an instance of {@link GetSoldBySellerResponse }
     * 
     */
    public GetSoldBySellerResponse createGetSoldBySellerResponse() {
        return new GetSoldBySellerResponse();
    }

    /**
     * Create an instance of {@link InitializeBD }
     * 
     */
    public InitializeBD createInitializeBD() {
        return new InitializeBD();
    }

    /**
     * Create an instance of {@link InitializeBDResponse }
     * 
     */
    public InitializeBDResponse createInitializeBDResponse() {
        return new InitializeBDResponse();
    }

    /**
     * Create an instance of {@link IsLogged }
     * 
     */
    public IsLogged createIsLogged() {
        return new IsLogged();
    }

    /**
     * Create an instance of {@link IsLoggedResponse }
     * 
     */
    public IsLoggedResponse createIsLoggedResponse() {
        return new IsLoggedResponse();
    }

    /**
     * Create an instance of {@link KontuaBaneatu }
     * 
     */
    public KontuaBaneatu createKontuaBaneatu() {
        return new KontuaBaneatu();
    }

    /**
     * Create an instance of {@link KontuaBaneatuResponse }
     * 
     */
    public KontuaBaneatuResponse createKontuaBaneatuResponse() {
        return new KontuaBaneatuResponse();
    }

    /**
     * Create an instance of {@link KontuaDesbaneatu }
     * 
     */
    public KontuaDesbaneatu createKontuaDesbaneatu() {
        return new KontuaDesbaneatu();
    }

    /**
     * Create an instance of {@link KontuaDesbaneatuResponse }
     * 
     */
    public KontuaDesbaneatuResponse createKontuaDesbaneatuResponse() {
        return new KontuaDesbaneatuResponse();
    }

    /**
     * Create an instance of {@link LortuErositakoSalmenta }
     * 
     */
    public LortuErositakoSalmenta createLortuErositakoSalmenta() {
        return new LortuErositakoSalmenta();
    }

    /**
     * Create an instance of {@link LortuErositakoSalmentaResponse }
     * 
     */
    public LortuErositakoSalmentaResponse createLortuErositakoSalmentaResponse() {
        return new LortuErositakoSalmentaResponse();
    }

    /**
     * Create an instance of {@link LortuErreklamazioById }
     * 
     */
    public LortuErreklamazioById createLortuErreklamazioById() {
        return new LortuErreklamazioById();
    }

    /**
     * Create an instance of {@link LortuErreklamazioByIdResponse }
     * 
     */
    public LortuErreklamazioByIdResponse createLortuErreklamazioByIdResponse() {
        return new LortuErreklamazioByIdResponse();
    }

    /**
     * Create an instance of {@link LortuErreklamazioa }
     * 
     */
    public LortuErreklamazioa createLortuErreklamazioa() {
        return new LortuErreklamazioa();
    }

    /**
     * Create an instance of {@link LortuErreklamazioaResponse }
     * 
     */
    public LortuErreklamazioaResponse createLortuErreklamazioaResponse() {
        return new LortuErreklamazioaResponse();
    }

    /**
     * Create an instance of {@link MarkatuIrakurrita }
     * 
     */
    public MarkatuIrakurrita createMarkatuIrakurrita() {
        return new MarkatuIrakurrita();
    }

    /**
     * Create an instance of {@link MarkatuIrakurritaResponse }
     * 
     */
    public MarkatuIrakurritaResponse createMarkatuIrakurritaResponse() {
        return new MarkatuIrakurritaResponse();
    }

    /**
     * Create an instance of {@link NotifikazioaBidali }
     * 
     */
    public NotifikazioaBidali createNotifikazioaBidali() {
        return new NotifikazioaBidali();
    }

    /**
     * Create an instance of {@link NotifikazioaBidaliResponse }
     * 
     */
    public NotifikazioaBidaliResponse createNotifikazioaBidaliResponse() {
        return new NotifikazioaBidaliResponse();
    }

    /**
     * Create an instance of {@link ProduktoaErosi }
     * 
     */
    public ProduktoaErosi createProduktoaErosi() {
        return new ProduktoaErosi();
    }

    /**
     * Create an instance of {@link ProduktoaErosiResponse }
     * 
     */
    public ProduktoaErosiResponse createProduktoaErosiResponse() {
        return new ProduktoaErosiResponse();
    }

    /**
     * Create an instance of {@link ProduktoaEzabatu }
     * 
     */
    public ProduktoaEzabatu createProduktoaEzabatu() {
        return new ProduktoaEzabatu();
    }

    /**
     * Create an instance of {@link ProduktoaEzabatuResponse }
     * 
     */
    public ProduktoaEzabatuResponse createProduktoaEzabatuResponse() {
        return new ProduktoaEzabatuResponse();
    }

    /**
     * Create an instance of {@link RemoveSale }
     * 
     */
    public RemoveSale createRemoveSale() {
        return new RemoveSale();
    }

    /**
     * Create an instance of {@link RemoveSaleResponse }
     * 
     */
    public RemoveSaleResponse createRemoveSaleResponse() {
        return new RemoveSaleResponse();
    }

    /**
     * Create an instance of {@link SalaketaEgoeraAldatu }
     * 
     */
    public SalaketaEgoeraAldatu createSalaketaEgoeraAldatu() {
        return new SalaketaEgoeraAldatu();
    }

    /**
     * Create an instance of {@link SalaketaEgoeraAldatuResponse }
     * 
     */
    public SalaketaEgoeraAldatuResponse createSalaketaEgoeraAldatuResponse() {
        return new SalaketaEgoeraAldatuResponse();
    }

    /**
     * Create an instance of {@link SalaketaSortu }
     * 
     */
    public SalaketaSortu createSalaketaSortu() {
        return new SalaketaSortu();
    }

    /**
     * Create an instance of {@link SalaketaSortuResponse }
     * 
     */
    public SalaketaSortuResponse createSalaketaSortuResponse() {
        return new SalaketaSortuResponse();
    }

    /**
     * Create an instance of {@link SalatutaDago }
     * 
     */
    public SalatutaDago createSalatutaDago() {
        return new SalatutaDago();
    }

    /**
     * Create an instance of {@link SalatutaDagoResponse }
     * 
     */
    public SalatutaDagoResponse createSalatutaDagoResponse() {
        return new SalatutaDagoResponse();
    }

    /**
     * Create an instance of {@link DisputaMezua }
     * 
     */
    public DisputaMezua createDisputaMezua() {
        return new DisputaMezua();
    }

    /**
     * Create an instance of {@link Admin }
     * 
     */
    public Admin createAdmin() {
        return new Admin();
    }

    /**
     * Create an instance of {@link Registered }
     * 
     */
    public Registered createRegistered() {
        return new Registered();
    }

    /**
     * Create an instance of {@link Sale }
     * 
     */
    public Sale createSale() {
        return new Sale();
    }

    /**
     * Create an instance of {@link Erreklamazioa }
     * 
     */
    public Erreklamazioa createErreklamazioa() {
        return new Erreklamazioa();
    }

    /**
     * Create an instance of {@link BoughtSale }
     * 
     */
    public BoughtSale createBoughtSale() {
        return new BoughtSale();
    }

    /**
     * Create an instance of {@link Salaketa }
     * 
     */
    public Salaketa createSalaketa() {
        return new Salaketa();
    }

    /**
     * Create an instance of {@link SaleSellerBoughtContainer }
     * 
     */
    public SaleSellerBoughtContainer createSaleSellerBoughtContainer() {
        return new SaleSellerBoughtContainer();
    }

    /**
     * Create an instance of {@link Mugimendua }
     * 
     */
    public Mugimendua createMugimendua() {
        return new Mugimendua();
    }

    /**
     * Create an instance of {@link Notifikazioa }
     * 
     */
    public Notifikazioa createNotifikazioa() {
        return new Notifikazioa();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErreklamazioaAlreadyExistException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErreklamazioaAlreadyExistException }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "ErreklamazioaAlreadyExistException")
    public JAXBElement<ErreklamazioaAlreadyExistException> createErreklamazioaAlreadyExistException(ErreklamazioaAlreadyExistException value) {
        return new JAXBElement<ErreklamazioaAlreadyExistException>(_ErreklamazioaAlreadyExistException_QNAME, ErreklamazioaAlreadyExistException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileNotUploadedException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FileNotUploadedException }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "FileNotUploadedException")
    public JAXBElement<FileNotUploadedException> createFileNotUploadedException(FileNotUploadedException value) {
        return new JAXBElement<FileNotUploadedException>(_FileNotUploadedException_QNAME, FileNotUploadedException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MustBeLaterThanTodayException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MustBeLaterThanTodayException }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "MustBeLaterThanTodayException")
    public JAXBElement<MustBeLaterThanTodayException> createMustBeLaterThanTodayException(MustBeLaterThanTodayException value) {
        return new JAXBElement<MustBeLaterThanTodayException>(_MustBeLaterThanTodayException_QNAME, MustBeLaterThanTodayException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaleAlreadyExistException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaleAlreadyExistException }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "SaleAlreadyExistException")
    public JAXBElement<SaleAlreadyExistException> createSaleAlreadyExistException(SaleAlreadyExistException value) {
        return new JAXBElement<SaleAlreadyExistException>(_SaleAlreadyExistException_QNAME, SaleAlreadyExistException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BadituIrakurriGabekoak }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BadituIrakurriGabekoak }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "badituIrakurriGabekoak")
    public JAXBElement<BadituIrakurriGabekoak> createBadituIrakurriGabekoak(BadituIrakurriGabekoak value) {
        return new JAXBElement<BadituIrakurriGabekoak>(_BadituIrakurriGabekoak_QNAME, BadituIrakurriGabekoak.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BadituIrakurriGabekoakResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BadituIrakurriGabekoakResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "badituIrakurriGabekoakResponse")
    public JAXBElement<BadituIrakurriGabekoakResponse> createBadituIrakurriGabekoakResponse(BadituIrakurriGabekoakResponse value) {
        return new JAXBElement<BadituIrakurriGabekoakResponse>(_BadituIrakurriGabekoakResponse_QNAME, BadituIrakurriGabekoakResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSale }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateSale }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "createSale")
    public JAXBElement<CreateSale> createCreateSale(CreateSale value) {
        return new JAXBElement<CreateSale>(_CreateSale_QNAME, CreateSale.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSaleResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateSaleResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "createSaleResponse")
    public JAXBElement<CreateSaleResponse> createCreateSaleResponse(CreateSaleResponse value) {
        return new JAXBElement<CreateSaleResponse>(_CreateSaleResponse_QNAME, CreateSaleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiruaAtera }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DiruaAtera }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "diruaAtera")
    public JAXBElement<DiruaAtera> createDiruaAtera(DiruaAtera value) {
        return new JAXBElement<DiruaAtera>(_DiruaAtera_QNAME, DiruaAtera.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiruaAteraResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DiruaAteraResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "diruaAteraResponse")
    public JAXBElement<DiruaAteraResponse> createDiruaAteraResponse(DiruaAteraResponse value) {
        return new JAXBElement<DiruaAteraResponse>(_DiruaAteraResponse_QNAME, DiruaAteraResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiruaSartu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DiruaSartu }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "diruaSartu")
    public JAXBElement<DiruaSartu> createDiruaSartu(DiruaSartu value) {
        return new JAXBElement<DiruaSartu>(_DiruaSartu_QNAME, DiruaSartu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiruaSartuResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DiruaSartuResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "diruaSartuResponse")
    public JAXBElement<DiruaSartuResponse> createDiruaSartuResponse(DiruaSartuResponse value) {
        return new JAXBElement<DiruaSartuResponse>(_DiruaSartuResponse_QNAME, DiruaSartuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisputaMezuaGehitu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DisputaMezuaGehitu }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "disputaMezuaGehitu")
    public JAXBElement<DisputaMezuaGehitu> createDisputaMezuaGehitu(DisputaMezuaGehitu value) {
        return new JAXBElement<DisputaMezuaGehitu>(_DisputaMezuaGehitu_QNAME, DisputaMezuaGehitu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisputaMezuaGehituResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DisputaMezuaGehituResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "disputaMezuaGehituResponse")
    public JAXBElement<DisputaMezuaGehituResponse> createDisputaMezuaGehituResponse(DisputaMezuaGehituResponse value) {
        return new JAXBElement<DisputaMezuaGehituResponse>(_DisputaMezuaGehituResponse_QNAME, DisputaMezuaGehituResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadImage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DownloadImage }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "downloadImage")
    public JAXBElement<DownloadImage> createDownloadImage(DownloadImage value) {
        return new JAXBElement<DownloadImage>(_DownloadImage_QNAME, DownloadImage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadImageResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DownloadImageResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "downloadImageResponse")
    public JAXBElement<DownloadImageResponse> createDownloadImageResponse(DownloadImageResponse value) {
        return new JAXBElement<DownloadImageResponse>(_DownloadImageResponse_QNAME, DownloadImageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErabiltzaileaSortu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErabiltzaileaSortu }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "erabiltzaileaSortu")
    public JAXBElement<ErabiltzaileaSortu> createErabiltzaileaSortu(ErabiltzaileaSortu value) {
        return new JAXBElement<ErabiltzaileaSortu>(_ErabiltzaileaSortu_QNAME, ErabiltzaileaSortu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErabiltzaileaSortuResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErabiltzaileaSortuResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "erabiltzaileaSortuResponse")
    public JAXBElement<ErabiltzaileaSortuResponse> createErabiltzaileaSortuResponse(ErabiltzaileaSortuResponse value) {
        return new JAXBElement<ErabiltzaileaSortuResponse>(_ErabiltzaileaSortuResponse_QNAME, ErabiltzaileaSortuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErositakoaGehitu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErositakoaGehitu }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "erositakoaGehitu")
    public JAXBElement<ErositakoaGehitu> createErositakoaGehitu(ErositakoaGehitu value) {
        return new JAXBElement<ErositakoaGehitu>(_ErositakoaGehitu_QNAME, ErositakoaGehitu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErositakoaGehituResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErositakoaGehituResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "erositakoaGehituResponse")
    public JAXBElement<ErositakoaGehituResponse> createErositakoaGehituResponse(ErositakoaGehituResponse value) {
        return new JAXBElement<ErositakoaGehituResponse>(_ErositakoaGehituResponse_QNAME, ErositakoaGehituResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErreklamazioaEgoeraAldatu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErreklamazioaEgoeraAldatu }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "erreklamazioaEgoeraAldatu")
    public JAXBElement<ErreklamazioaEgoeraAldatu> createErreklamazioaEgoeraAldatu(ErreklamazioaEgoeraAldatu value) {
        return new JAXBElement<ErreklamazioaEgoeraAldatu>(_ErreklamazioaEgoeraAldatu_QNAME, ErreklamazioaEgoeraAldatu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErreklamazioaEgoeraAldatuResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErreklamazioaEgoeraAldatuResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "erreklamazioaEgoeraAldatuResponse")
    public JAXBElement<ErreklamazioaEgoeraAldatuResponse> createErreklamazioaEgoeraAldatuResponse(ErreklamazioaEgoeraAldatuResponse value) {
        return new JAXBElement<ErreklamazioaEgoeraAldatuResponse>(_ErreklamazioaEgoeraAldatuResponse_QNAME, ErreklamazioaEgoeraAldatuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErreklamazioaSortu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErreklamazioaSortu }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "erreklamazioaSortu")
    public JAXBElement<ErreklamazioaSortu> createErreklamazioaSortu(ErreklamazioaSortu value) {
        return new JAXBElement<ErreklamazioaSortu>(_ErreklamazioaSortu_QNAME, ErreklamazioaSortu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErreklamazioaSortuResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErreklamazioaSortuResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "erreklamazioaSortuResponse")
    public JAXBElement<ErreklamazioaSortuResponse> createErreklamazioaSortuResponse(ErreklamazioaSortuResponse value) {
        return new JAXBElement<ErreklamazioaSortuResponse>(_ErreklamazioaSortuResponse_QNAME, ErreklamazioaSortuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaboritoaDa }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaboritoaDa }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "faboritoaDa")
    public JAXBElement<FaboritoaDa> createFaboritoaDa(FaboritoaDa value) {
        return new JAXBElement<FaboritoaDa>(_FaboritoaDa_QNAME, FaboritoaDa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaboritoaDaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaboritoaDaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "faboritoaDaResponse")
    public JAXBElement<FaboritoaDaResponse> createFaboritoaDaResponse(FaboritoaDaResponse value) {
        return new JAXBElement<FaboritoaDaResponse>(_FaboritoaDaResponse_QNAME, FaboritoaDaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaboritoaEzabatu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaboritoaEzabatu }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "faboritoaEzabatu")
    public JAXBElement<FaboritoaEzabatu> createFaboritoaEzabatu(FaboritoaEzabatu value) {
        return new JAXBElement<FaboritoaEzabatu>(_FaboritoaEzabatu_QNAME, FaboritoaEzabatu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaboritoaEzabatuResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaboritoaEzabatuResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "faboritoaEzabatuResponse")
    public JAXBElement<FaboritoaEzabatuResponse> createFaboritoaEzabatuResponse(FaboritoaEzabatuResponse value) {
        return new JAXBElement<FaboritoaEzabatuResponse>(_FaboritoaEzabatuResponse_QNAME, FaboritoaEzabatuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaboritoaGehitu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaboritoaGehitu }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "faboritoaGehitu")
    public JAXBElement<FaboritoaGehitu> createFaboritoaGehitu(FaboritoaGehitu value) {
        return new JAXBElement<FaboritoaGehitu>(_FaboritoaGehitu_QNAME, FaboritoaGehitu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaboritoaGehituResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaboritoaGehituResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "faboritoaGehituResponse")
    public JAXBElement<FaboritoaGehituResponse> createFaboritoaGehituResponse(FaboritoaGehituResponse value) {
        return new JAXBElement<FaboritoaGehituResponse>(_FaboritoaGehituResponse_QNAME, FaboritoaGehituResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBuyerByErreklamazioa }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBuyerByErreklamazioa }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getBuyerByErreklamazioa")
    public JAXBElement<GetBuyerByErreklamazioa> createGetBuyerByErreklamazioa(GetBuyerByErreklamazioa value) {
        return new JAXBElement<GetBuyerByErreklamazioa>(_GetBuyerByErreklamazioa_QNAME, GetBuyerByErreklamazioa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBuyerByErreklamazioaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBuyerByErreklamazioaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getBuyerByErreklamazioaResponse")
    public JAXBElement<GetBuyerByErreklamazioaResponse> createGetBuyerByErreklamazioaResponse(GetBuyerByErreklamazioaResponse value) {
        return new JAXBElement<GetBuyerByErreklamazioaResponse>(_GetBuyerByErreklamazioaResponse_QNAME, GetBuyerByErreklamazioaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetErositakoak }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetErositakoak }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getErositakoak")
    public JAXBElement<GetErositakoak> createGetErositakoak(GetErositakoak value) {
        return new JAXBElement<GetErositakoak>(_GetErositakoak_QNAME, GetErositakoak.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetErositakoakResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetErositakoakResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getErositakoakResponse")
    public JAXBElement<GetErositakoakResponse> createGetErositakoakResponse(GetErositakoakResponse value) {
        return new JAXBElement<GetErositakoakResponse>(_GetErositakoakResponse_QNAME, GetErositakoakResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetErreklamazioEskalatuak }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetErreklamazioEskalatuak }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getErreklamazioEskalatuak")
    public JAXBElement<GetErreklamazioEskalatuak> createGetErreklamazioEskalatuak(GetErreklamazioEskalatuak value) {
        return new JAXBElement<GetErreklamazioEskalatuak>(_GetErreklamazioEskalatuak_QNAME, GetErreklamazioEskalatuak.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetErreklamazioEskalatuakResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetErreklamazioEskalatuakResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getErreklamazioEskalatuakResponse")
    public JAXBElement<GetErreklamazioEskalatuakResponse> createGetErreklamazioEskalatuakResponse(GetErreklamazioEskalatuakResponse value) {
        return new JAXBElement<GetErreklamazioEskalatuakResponse>(_GetErreklamazioEskalatuakResponse_QNAME, GetErreklamazioEskalatuakResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFaboritoak }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFaboritoak }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getFaboritoak")
    public JAXBElement<GetFaboritoak> createGetFaboritoak(GetFaboritoak value) {
        return new JAXBElement<GetFaboritoak>(_GetFaboritoak_QNAME, GetFaboritoak.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFaboritoakResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFaboritoakResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getFaboritoakResponse")
    public JAXBElement<GetFaboritoakResponse> createGetFaboritoakResponse(GetFaboritoakResponse value) {
        return new JAXBElement<GetFaboritoakResponse>(_GetFaboritoakResponse_QNAME, GetFaboritoakResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIgorleaByDM }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetIgorleaByDM }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getIgorleaByDM")
    public JAXBElement<GetIgorleaByDM> createGetIgorleaByDM(GetIgorleaByDM value) {
        return new JAXBElement<GetIgorleaByDM>(_GetIgorleaByDM_QNAME, GetIgorleaByDM.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIgorleaByDMResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetIgorleaByDMResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getIgorleaByDMResponse")
    public JAXBElement<GetIgorleaByDMResponse> createGetIgorleaByDMResponse(GetIgorleaByDMResponse value) {
        return new JAXBElement<GetIgorleaByDMResponse>(_GetIgorleaByDMResponse_QNAME, GetIgorleaByDMResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMugimenduakBySeller }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMugimenduakBySeller }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getMugimenduakBySeller")
    public JAXBElement<GetMugimenduakBySeller> createGetMugimenduakBySeller(GetMugimenduakBySeller value) {
        return new JAXBElement<GetMugimenduakBySeller>(_GetMugimenduakBySeller_QNAME, GetMugimenduakBySeller.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMugimenduakBySellerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMugimenduakBySellerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getMugimenduakBySellerResponse")
    public JAXBElement<GetMugimenduakBySellerResponse> createGetMugimenduakBySellerResponse(GetMugimenduakBySellerResponse value) {
        return new JAXBElement<GetMugimenduakBySellerResponse>(_GetMugimenduakBySellerResponse_QNAME, GetMugimenduakBySellerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNotifikazioak }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetNotifikazioak }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getNotifikazioak")
    public JAXBElement<GetNotifikazioak> createGetNotifikazioak(GetNotifikazioak value) {
        return new JAXBElement<GetNotifikazioak>(_GetNotifikazioak_QNAME, GetNotifikazioak.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNotifikazioakResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetNotifikazioakResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getNotifikazioakResponse")
    public JAXBElement<GetNotifikazioakResponse> createGetNotifikazioakResponse(GetNotifikazioakResponse value) {
        return new JAXBElement<GetNotifikazioakResponse>(_GetNotifikazioakResponse_QNAME, GetNotifikazioakResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPublishedSales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPublishedSales }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getPublishedSales")
    public JAXBElement<GetPublishedSales> createGetPublishedSales(GetPublishedSales value) {
        return new JAXBElement<GetPublishedSales>(_GetPublishedSales_QNAME, GetPublishedSales.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPublishedSalesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPublishedSalesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getPublishedSalesResponse")
    public JAXBElement<GetPublishedSalesResponse> createGetPublishedSalesResponse(GetPublishedSalesResponse value) {
        return new JAXBElement<GetPublishedSalesResponse>(_GetPublishedSalesResponse_QNAME, GetPublishedSalesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRegisteredUsers }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRegisteredUsers }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getRegisteredUsers")
    public JAXBElement<GetRegisteredUsers> createGetRegisteredUsers(GetRegisteredUsers value) {
        return new JAXBElement<GetRegisteredUsers>(_GetRegisteredUsers_QNAME, GetRegisteredUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRegisteredUsersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRegisteredUsersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getRegisteredUsersResponse")
    public JAXBElement<GetRegisteredUsersResponse> createGetRegisteredUsersResponse(GetRegisteredUsersResponse value) {
        return new JAXBElement<GetRegisteredUsersResponse>(_GetRegisteredUsersResponse_QNAME, GetRegisteredUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSalaketak }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSalaketak }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getSalaketak")
    public JAXBElement<GetSalaketak> createGetSalaketak(GetSalaketak value) {
        return new JAXBElement<GetSalaketak>(_GetSalaketak_QNAME, GetSalaketak.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSalaketakResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSalaketakResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getSalaketakResponse")
    public JAXBElement<GetSalaketakResponse> createGetSalaketakResponse(GetSalaketakResponse value) {
        return new JAXBElement<GetSalaketakResponse>(_GetSalaketakResponse_QNAME, GetSalaketakResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSalatzaileaBySalaketa }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSalatzaileaBySalaketa }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getSalatzaileaBySalaketa")
    public JAXBElement<GetSalatzaileaBySalaketa> createGetSalatzaileaBySalaketa(GetSalatzaileaBySalaketa value) {
        return new JAXBElement<GetSalatzaileaBySalaketa>(_GetSalatzaileaBySalaketa_QNAME, GetSalatzaileaBySalaketa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSalatzaileaBySalaketaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSalatzaileaBySalaketaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getSalatzaileaBySalaketaResponse")
    public JAXBElement<GetSalatzaileaBySalaketaResponse> createGetSalatzaileaBySalaketaResponse(GetSalatzaileaBySalaketaResponse value) {
        return new JAXBElement<GetSalatzaileaBySalaketaResponse>(_GetSalatzaileaBySalaketaResponse_QNAME, GetSalatzaileaBySalaketaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSaleSellerBoughtContainer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSaleSellerBoughtContainer }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getSaleSellerBoughtContainer")
    public JAXBElement<GetSaleSellerBoughtContainer> createGetSaleSellerBoughtContainer(GetSaleSellerBoughtContainer value) {
        return new JAXBElement<GetSaleSellerBoughtContainer>(_GetSaleSellerBoughtContainer_QNAME, GetSaleSellerBoughtContainer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSaleSellerBoughtContainerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSaleSellerBoughtContainerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getSaleSellerBoughtContainerResponse")
    public JAXBElement<GetSaleSellerBoughtContainerResponse> createGetSaleSellerBoughtContainerResponse(GetSaleSellerBoughtContainerResponse value) {
        return new JAXBElement<GetSaleSellerBoughtContainerResponse>(_GetSaleSellerBoughtContainerResponse_QNAME, GetSaleSellerBoughtContainerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSales }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getSales")
    public JAXBElement<GetSales> createGetSales(GetSales value) {
        return new JAXBElement<GetSales>(_GetSales_QNAME, GetSales.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSalesBySeller }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSalesBySeller }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getSalesBySeller")
    public JAXBElement<GetSalesBySeller> createGetSalesBySeller(GetSalesBySeller value) {
        return new JAXBElement<GetSalesBySeller>(_GetSalesBySeller_QNAME, GetSalesBySeller.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSalesBySellerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSalesBySellerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getSalesBySellerResponse")
    public JAXBElement<GetSalesBySellerResponse> createGetSalesBySellerResponse(GetSalesBySellerResponse value) {
        return new JAXBElement<GetSalesBySellerResponse>(_GetSalesBySellerResponse_QNAME, GetSalesBySellerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSalesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSalesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getSalesResponse")
    public JAXBElement<GetSalesResponse> createGetSalesResponse(GetSalesResponse value) {
        return new JAXBElement<GetSalesResponse>(_GetSalesResponse_QNAME, GetSalesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSellerByEmail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSellerByEmail }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getSellerByEmail")
    public JAXBElement<GetSellerByEmail> createGetSellerByEmail(GetSellerByEmail value) {
        return new JAXBElement<GetSellerByEmail>(_GetSellerByEmail_QNAME, GetSellerByEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSellerByEmailResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSellerByEmailResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getSellerByEmailResponse")
    public JAXBElement<GetSellerByEmailResponse> createGetSellerByEmailResponse(GetSellerByEmailResponse value) {
        return new JAXBElement<GetSellerByEmailResponse>(_GetSellerByEmailResponse_QNAME, GetSellerByEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSellerByErreklamazioa }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSellerByErreklamazioa }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getSellerByErreklamazioa")
    public JAXBElement<GetSellerByErreklamazioa> createGetSellerByErreklamazioa(GetSellerByErreklamazioa value) {
        return new JAXBElement<GetSellerByErreklamazioa>(_GetSellerByErreklamazioa_QNAME, GetSellerByErreklamazioa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSellerByErreklamazioaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSellerByErreklamazioaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getSellerByErreklamazioaResponse")
    public JAXBElement<GetSellerByErreklamazioaResponse> createGetSellerByErreklamazioaResponse(GetSellerByErreklamazioaResponse value) {
        return new JAXBElement<GetSellerByErreklamazioaResponse>(_GetSellerByErreklamazioaResponse_QNAME, GetSellerByErreklamazioaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSellerByName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSellerByName }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getSellerByName")
    public JAXBElement<GetSellerByName> createGetSellerByName(GetSellerByName value) {
        return new JAXBElement<GetSellerByName>(_GetSellerByName_QNAME, GetSellerByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSellerByNameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSellerByNameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getSellerByNameResponse")
    public JAXBElement<GetSellerByNameResponse> createGetSellerByNameResponse(GetSellerByNameResponse value) {
        return new JAXBElement<GetSellerByNameResponse>(_GetSellerByNameResponse_QNAME, GetSellerByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSoldBySeller }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSoldBySeller }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getSoldBySeller")
    public JAXBElement<GetSoldBySeller> createGetSoldBySeller(GetSoldBySeller value) {
        return new JAXBElement<GetSoldBySeller>(_GetSoldBySeller_QNAME, GetSoldBySeller.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSoldBySellerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSoldBySellerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getSoldBySellerResponse")
    public JAXBElement<GetSoldBySellerResponse> createGetSoldBySellerResponse(GetSoldBySellerResponse value) {
        return new JAXBElement<GetSoldBySellerResponse>(_GetSoldBySellerResponse_QNAME, GetSoldBySellerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitializeBD }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InitializeBD }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "initializeBD")
    public JAXBElement<InitializeBD> createInitializeBD(InitializeBD value) {
        return new JAXBElement<InitializeBD>(_InitializeBD_QNAME, InitializeBD.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitializeBDResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InitializeBDResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "initializeBDResponse")
    public JAXBElement<InitializeBDResponse> createInitializeBDResponse(InitializeBDResponse value) {
        return new JAXBElement<InitializeBDResponse>(_InitializeBDResponse_QNAME, InitializeBDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsLogged }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IsLogged }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "isLogged")
    public JAXBElement<IsLogged> createIsLogged(IsLogged value) {
        return new JAXBElement<IsLogged>(_IsLogged_QNAME, IsLogged.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsLoggedResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IsLoggedResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "isLoggedResponse")
    public JAXBElement<IsLoggedResponse> createIsLoggedResponse(IsLoggedResponse value) {
        return new JAXBElement<IsLoggedResponse>(_IsLoggedResponse_QNAME, IsLoggedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KontuaBaneatu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KontuaBaneatu }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "kontuaBaneatu")
    public JAXBElement<KontuaBaneatu> createKontuaBaneatu(KontuaBaneatu value) {
        return new JAXBElement<KontuaBaneatu>(_KontuaBaneatu_QNAME, KontuaBaneatu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KontuaBaneatuResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KontuaBaneatuResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "kontuaBaneatuResponse")
    public JAXBElement<KontuaBaneatuResponse> createKontuaBaneatuResponse(KontuaBaneatuResponse value) {
        return new JAXBElement<KontuaBaneatuResponse>(_KontuaBaneatuResponse_QNAME, KontuaBaneatuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KontuaDesbaneatu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KontuaDesbaneatu }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "kontuaDesbaneatu")
    public JAXBElement<KontuaDesbaneatu> createKontuaDesbaneatu(KontuaDesbaneatu value) {
        return new JAXBElement<KontuaDesbaneatu>(_KontuaDesbaneatu_QNAME, KontuaDesbaneatu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KontuaDesbaneatuResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KontuaDesbaneatuResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "kontuaDesbaneatuResponse")
    public JAXBElement<KontuaDesbaneatuResponse> createKontuaDesbaneatuResponse(KontuaDesbaneatuResponse value) {
        return new JAXBElement<KontuaDesbaneatuResponse>(_KontuaDesbaneatuResponse_QNAME, KontuaDesbaneatuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LortuErositakoSalmenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LortuErositakoSalmenta }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "lortuErositakoSalmenta")
    public JAXBElement<LortuErositakoSalmenta> createLortuErositakoSalmenta(LortuErositakoSalmenta value) {
        return new JAXBElement<LortuErositakoSalmenta>(_LortuErositakoSalmenta_QNAME, LortuErositakoSalmenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LortuErositakoSalmentaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LortuErositakoSalmentaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "lortuErositakoSalmentaResponse")
    public JAXBElement<LortuErositakoSalmentaResponse> createLortuErositakoSalmentaResponse(LortuErositakoSalmentaResponse value) {
        return new JAXBElement<LortuErositakoSalmentaResponse>(_LortuErositakoSalmentaResponse_QNAME, LortuErositakoSalmentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LortuErreklamazioById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LortuErreklamazioById }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "lortuErreklamazioById")
    public JAXBElement<LortuErreklamazioById> createLortuErreklamazioById(LortuErreklamazioById value) {
        return new JAXBElement<LortuErreklamazioById>(_LortuErreklamazioById_QNAME, LortuErreklamazioById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LortuErreklamazioByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LortuErreklamazioByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "lortuErreklamazioByIdResponse")
    public JAXBElement<LortuErreklamazioByIdResponse> createLortuErreklamazioByIdResponse(LortuErreklamazioByIdResponse value) {
        return new JAXBElement<LortuErreklamazioByIdResponse>(_LortuErreklamazioByIdResponse_QNAME, LortuErreklamazioByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LortuErreklamazioa }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LortuErreklamazioa }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "lortuErreklamazioa")
    public JAXBElement<LortuErreklamazioa> createLortuErreklamazioa(LortuErreklamazioa value) {
        return new JAXBElement<LortuErreklamazioa>(_LortuErreklamazioa_QNAME, LortuErreklamazioa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LortuErreklamazioaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LortuErreklamazioaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "lortuErreklamazioaResponse")
    public JAXBElement<LortuErreklamazioaResponse> createLortuErreklamazioaResponse(LortuErreklamazioaResponse value) {
        return new JAXBElement<LortuErreklamazioaResponse>(_LortuErreklamazioaResponse_QNAME, LortuErreklamazioaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarkatuIrakurrita }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MarkatuIrakurrita }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "markatuIrakurrita")
    public JAXBElement<MarkatuIrakurrita> createMarkatuIrakurrita(MarkatuIrakurrita value) {
        return new JAXBElement<MarkatuIrakurrita>(_MarkatuIrakurrita_QNAME, MarkatuIrakurrita.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarkatuIrakurritaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MarkatuIrakurritaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "markatuIrakurritaResponse")
    public JAXBElement<MarkatuIrakurritaResponse> createMarkatuIrakurritaResponse(MarkatuIrakurritaResponse value) {
        return new JAXBElement<MarkatuIrakurritaResponse>(_MarkatuIrakurritaResponse_QNAME, MarkatuIrakurritaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotifikazioaBidali }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NotifikazioaBidali }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "notifikazioaBidali")
    public JAXBElement<NotifikazioaBidali> createNotifikazioaBidali(NotifikazioaBidali value) {
        return new JAXBElement<NotifikazioaBidali>(_NotifikazioaBidali_QNAME, NotifikazioaBidali.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotifikazioaBidaliResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NotifikazioaBidaliResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "notifikazioaBidaliResponse")
    public JAXBElement<NotifikazioaBidaliResponse> createNotifikazioaBidaliResponse(NotifikazioaBidaliResponse value) {
        return new JAXBElement<NotifikazioaBidaliResponse>(_NotifikazioaBidaliResponse_QNAME, NotifikazioaBidaliResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProduktoaErosi }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProduktoaErosi }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "produktoaErosi")
    public JAXBElement<ProduktoaErosi> createProduktoaErosi(ProduktoaErosi value) {
        return new JAXBElement<ProduktoaErosi>(_ProduktoaErosi_QNAME, ProduktoaErosi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProduktoaErosiResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProduktoaErosiResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "produktoaErosiResponse")
    public JAXBElement<ProduktoaErosiResponse> createProduktoaErosiResponse(ProduktoaErosiResponse value) {
        return new JAXBElement<ProduktoaErosiResponse>(_ProduktoaErosiResponse_QNAME, ProduktoaErosiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProduktoaEzabatu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProduktoaEzabatu }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "produktoaEzabatu")
    public JAXBElement<ProduktoaEzabatu> createProduktoaEzabatu(ProduktoaEzabatu value) {
        return new JAXBElement<ProduktoaEzabatu>(_ProduktoaEzabatu_QNAME, ProduktoaEzabatu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProduktoaEzabatuResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProduktoaEzabatuResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "produktoaEzabatuResponse")
    public JAXBElement<ProduktoaEzabatuResponse> createProduktoaEzabatuResponse(ProduktoaEzabatuResponse value) {
        return new JAXBElement<ProduktoaEzabatuResponse>(_ProduktoaEzabatuResponse_QNAME, ProduktoaEzabatuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveSale }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveSale }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "removeSale")
    public JAXBElement<RemoveSale> createRemoveSale(RemoveSale value) {
        return new JAXBElement<RemoveSale>(_RemoveSale_QNAME, RemoveSale.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveSaleResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveSaleResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "removeSaleResponse")
    public JAXBElement<RemoveSaleResponse> createRemoveSaleResponse(RemoveSaleResponse value) {
        return new JAXBElement<RemoveSaleResponse>(_RemoveSaleResponse_QNAME, RemoveSaleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalaketaEgoeraAldatu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SalaketaEgoeraAldatu }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "salaketaEgoeraAldatu")
    public JAXBElement<SalaketaEgoeraAldatu> createSalaketaEgoeraAldatu(SalaketaEgoeraAldatu value) {
        return new JAXBElement<SalaketaEgoeraAldatu>(_SalaketaEgoeraAldatu_QNAME, SalaketaEgoeraAldatu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalaketaEgoeraAldatuResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SalaketaEgoeraAldatuResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "salaketaEgoeraAldatuResponse")
    public JAXBElement<SalaketaEgoeraAldatuResponse> createSalaketaEgoeraAldatuResponse(SalaketaEgoeraAldatuResponse value) {
        return new JAXBElement<SalaketaEgoeraAldatuResponse>(_SalaketaEgoeraAldatuResponse_QNAME, SalaketaEgoeraAldatuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalaketaSortu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SalaketaSortu }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "salaketaSortu")
    public JAXBElement<SalaketaSortu> createSalaketaSortu(SalaketaSortu value) {
        return new JAXBElement<SalaketaSortu>(_SalaketaSortu_QNAME, SalaketaSortu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalaketaSortuResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SalaketaSortuResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "salaketaSortuResponse")
    public JAXBElement<SalaketaSortuResponse> createSalaketaSortuResponse(SalaketaSortuResponse value) {
        return new JAXBElement<SalaketaSortuResponse>(_SalaketaSortuResponse_QNAME, SalaketaSortuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalatutaDago }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SalatutaDago }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "salatutaDago")
    public JAXBElement<SalatutaDago> createSalatutaDago(SalatutaDago value) {
        return new JAXBElement<SalatutaDago>(_SalatutaDago_QNAME, SalatutaDago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalatutaDagoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SalatutaDagoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "salatutaDagoResponse")
    public JAXBElement<SalatutaDagoResponse> createSalatutaDagoResponse(SalatutaDagoResponse value) {
        return new JAXBElement<SalatutaDagoResponse>(_SalatutaDagoResponse_QNAME, SalatutaDagoResponse.class, null, value);
    }

}
