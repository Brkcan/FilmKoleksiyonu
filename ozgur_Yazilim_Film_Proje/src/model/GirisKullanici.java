package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.TableGenerator;

@Entity
public class GirisKullanici {

	@Id
	@TableGenerator(name = "Giris_ID")
	@GeneratedValue(generator = "Giris_ID")
	private int id;
	
	private String kullaniciAdi;
	private String password;
	
	@OneToOne
	//@JoinColumn(name="kayit_id", unique=true)
	private KullaniciKayit kayit;
	  
	
	public KullaniciKayit getKayit() {
		return kayit; 
	}

	public void setKayit(KullaniciKayit kayit) {
		this.kayit = kayit;
	}

	public GirisKullanici() {
		super();
	}

	public GirisKullanici(String kullaniciAdi, String password) {
		super();
		this.kullaniciAdi = kullaniciAdi;
		this.password = password;
	}

	public String getKullaniciAdi() {
		return kullaniciAdi;
	}

	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "GirisKullanici [id=" + id + ", kullaniciAdi=" + kullaniciAdi + ", password=" + password + "]";
	}
	
	
}
