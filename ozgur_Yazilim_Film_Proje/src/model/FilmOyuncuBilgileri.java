package model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class FilmOyuncuBilgileri {

	@Id
	@TableGenerator(name = "Oyuncu_ID")
	@GeneratedValue(generator = "Oyuncu_ID")
	private int id;

	private String filmOyuncuAd;
	private String filmOyuncuSoyad;
	private String filmOyuncuRol;
	private boolean oyuncuEdit;

	public boolean isOyuncuEdit() {
		return oyuncuEdit;
	}

	public void setOyuncuEdit(boolean oyuncuEdit) {
		this.oyuncuEdit = oyuncuEdit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public FilmOyuncuBilgileri() {
		super();
	}

	public FilmOyuncuBilgileri(String filmOyuncuAd) {
		super();
		this.filmOyuncuAd = filmOyuncuAd;
	}

	public FilmOyuncuBilgileri(String filmOyuncuAd, String filmOyuncuSoyad, String filmOyuncuRol) {
		super();
		this.filmOyuncuAd = filmOyuncuAd;
		this.filmOyuncuSoyad = filmOyuncuSoyad;
		this.filmOyuncuRol = filmOyuncuRol;
	}

	public String getFilmOyuncuAd() {
		return filmOyuncuAd;
	}

	public void setFilmOyuncuAd(String filmOyuncuAd) {
		this.filmOyuncuAd = filmOyuncuAd;
	}

	public String getFilmOyuncuSoyad() {
		return filmOyuncuSoyad;
	}

	public void setFilmOyuncuSoyad(String filmOyuncuSoyad) {
		this.filmOyuncuSoyad = filmOyuncuSoyad;
	}

	public String getFilmOyuncuRol() {
		return filmOyuncuRol;
	}

	public void setFilmOyuncuRol(String filmOyuncuRol) {
		this.filmOyuncuRol = filmOyuncuRol;
	}

	@Override
	public String toString() {
		return "FilmOyuncuBilgileri [id=" + id + ", filmOyuncuAd=" + filmOyuncuAd + ", filmOyuncuSoyad="
				+ filmOyuncuSoyad + ", filmOyuncuRol=" + filmOyuncuRol + "]";
	}

}
