package model;

import java.util.Arrays;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.TableGenerator;

@Entity
public class FilmTanimi {

	@Id
	@TableGenerator(name = "Film_ID")
	@GeneratedValue(generator = "Film_ID")
	private int id;

	private String filmAd;

	private String filmYayinYili;
	private String filmTur;
	private String filmAciklama;
	
	@Lob
	@Basic(fetch = FetchType.LAZY)
	private byte[] filmMedya;

	private String[] filmDilSecenegi;
	private boolean edit;

	public boolean isEdit() {
		return edit;
	}

	public void setEdit(boolean edit) {
		this.edit = edit;
	}

	@OneToMany
	private List<FilmOyuncuBilgileri> oyuncular;

	public List<FilmOyuncuBilgileri> getOyuncular() {
		return oyuncular;
	}

	public void setOyuncular(List<FilmOyuncuBilgileri> oyuncular) {
		this.oyuncular = oyuncular;
	}

	public FilmTanimi() {
	}

	public FilmTanimi(String filmYayinYili) {
		super();
		this.filmYayinYili = filmYayinYili;
	}

	public FilmTanimi(String filmAd, String filmTur) {
		super();
		this.filmAd = filmAd;
		this.filmTur = filmTur;
	}

	public FilmTanimi(String filmAd, String filmYayinYili, String filmTur, String filmAciklama, byte[] filmMedya) {
		super();
		this.filmAd = filmAd;
		this.filmYayinYili = filmYayinYili;
		this.filmTur = filmTur;
		this.filmAciklama = filmAciklama;
		this.filmMedya = filmMedya;
	}

	public FilmTanimi(String filmAd, String filmYayinYili, String filmTur, String filmAciklama, byte[] filmMedya,
			String[] filmDilSecenegi) {
		super();
		this.filmAd = filmAd;
		this.filmYayinYili = filmYayinYili;
		this.filmTur = filmTur;
		this.filmAciklama = filmAciklama;
		this.filmMedya = filmMedya;
		this.filmDilSecenegi = filmDilSecenegi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFilmAd() {
		return filmAd;
	}

	public void setFilmAd(String filmAd) {
		this.filmAd = filmAd;
	}

	public String getFilmYayinYili() {
		return filmYayinYili;
	}

	public void setFilmYayinYili(String filmYayinYili) {
		this.filmYayinYili = filmYayinYili;
	}

	public String getFilmTur() {
		return filmTur;
	}

	public void setFilmTur(String filmTur) {
		this.filmTur = filmTur;
	}

	public String getFilmAciklama() {
		return filmAciklama;
	}

	public void setFilmAciklama(String filmAciklama) {
		this.filmAciklama = filmAciklama;
	}

	public byte[] getFilmMedya() {
		return filmMedya;
	}

	public void setFilmMedya(byte[] filmMedya) {
		this.filmMedya = filmMedya;
	}

	public String[] getFilmDilSecenegi() {
		return filmDilSecenegi;
	}

	public void setFilmDilSecenegi(String[] filmDilSecenegi) {
		this.filmDilSecenegi = filmDilSecenegi;
	}

	@Override
	public String toString() {
		return "FilmTanimi [id=" + id + ", filmAd=" + filmAd + ", filmYayinYili=" + filmYayinYili + ", filmTur="
				+ filmTur + ", filmAciklama=" + filmAciklama + ", filmMedya=" + filmMedya + ", filmDilSecenegi="
				+ Arrays.toString(filmDilSecenegi) + "]";
	}

}
