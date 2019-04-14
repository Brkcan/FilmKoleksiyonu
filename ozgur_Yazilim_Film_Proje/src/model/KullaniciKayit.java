 package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class KullaniciKayit {

	@Id
	@TableGenerator(name = "adminRegister")
	@GeneratedValue(generator = "adminRegister")
	private int id;
	
	private String kullaniciAdi;
	private String password;

	
	public KullaniciKayit() {
	}
	
	public KullaniciKayit(String kullaniciAdi, String password) {
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
		return "KullaniciKayit [id=" + id + ", kullaniciAdi=" + kullaniciAdi + ", password=" + password + "]";
	}
	
}
