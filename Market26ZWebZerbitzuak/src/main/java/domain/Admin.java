package domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@Entity
@XmlAccessorType(XmlAccessType.FIELD)

public class Admin extends User {

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Kexa> kexak = new ArrayList<Kexa>();
	
	
	public Admin(String email, String name, String pass) {super(email,name,pass);}

	public Admin() {super();}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Kexa> getKexak() {
		return kexak;
	}

	public void setKexak(List<Kexa> kexak) {
		this.kexak = kexak;
	}
	
}
