package domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;

@Entity
@XmlAccessorType(XmlAccessType.FIELD)
public class Notifikazioa implements Serializable {
    
   
    @Id 
    @GeneratedValue
    
    private Integer id;
    private String mezua;
    private Date data;
    private boolean irakurrita; // true si ya lo ha visto, false si es nuevo
    
    @ManyToOne
    private Registered hartzailea; // Quien recibe el mensaje

    public Notifikazioa(String mezua, Registered hartzailea) {
        this.mezua = mezua;
        this.hartzailea = hartzailea;
        this.data = new Date();
        this.irakurrita = false; // Al crearse, siempre está sin leer
    }
    public Notifikazioa() {super();}

    public void setId(Integer id) {
		this.id = id;
	}
	public void setMezua(String mezua) {
		this.mezua = mezua;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public void setHartzailea(Registered hartzailea) {
		this.hartzailea = hartzailea;
	}
	// Getters y Setters
    public Integer getId() { return id; }
    public String getMezua() { return mezua; }
    public Date getData() { return data; }
    public boolean isIrakurrita() { return irakurrita; }
    public void setIrakurrita(boolean irakurrita) { this.irakurrita = irakurrita; }
    public Registered getHartzailea() { return hartzailea; }
    
}