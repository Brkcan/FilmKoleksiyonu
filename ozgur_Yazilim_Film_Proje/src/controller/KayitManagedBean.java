package controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.KullaniciKayitDAO;
import dao.KullaniciKayitDAOImpl;
import model.FilmOyuncuBilgileri;
import model.FilmTanimi;
import model.GirisKullanici;
import model.KullaniciKayit;

@ManagedBean
@SessionScoped
public class KayitManagedBean {

	// kayit bilgileri
	private String kullaniciAdi;
	private String password;

	// Giris
	private GirisKullanici girisKullanici;

	// film tanimi
	private String filmAd;
	private String filmYayinYili;
	private String filmTur;
	private String filmAciklama;
	private byte[] filmMedya;
	private String[] filmDilSecenegi;
	private boolean edit;

	// Oyuncu bilgileri
	private String filmOyuncuAd;
	private String filmOyuncuSoyad;
	private String filmOyuncuRol;
	private boolean oyuncuEdit;

	private FilmOyuncuBilgileri filmOyuncuBilgileri;

	public FilmOyuncuBilgileri getFilmOyuncuBilgileri() {
		return filmOyuncuBilgileri;
	}

	public void setFilmOyuncuBilgileri(FilmOyuncuBilgileri filmOyuncuBilgileri) {
		this.filmOyuncuBilgileri = filmOyuncuBilgileri;
	}

	private List<FilmOyuncuBilgileri> oyuncular;
	private List<FilmTanimi> filmTanimis = new ArrayList<>();
	private List<FilmTanimi> filmTanimis2 = new ArrayList<>();

	// Giris model
	public GirisKullanici getGirisKullanici() {
		return girisKullanici;
	}

	public void setGirisKullanici(GirisKullanici girisKullanici) {
		this.girisKullanici = girisKullanici;
	}
	// Giris model end

	public boolean isEdit() {
		return edit;
	}

	public boolean isOyuncuEdit() {
		return oyuncuEdit;
	}

	public void setOyuncuEdit(boolean oyuncuEdit) {
		this.oyuncuEdit = oyuncuEdit;
	}

	public List<FilmTanimi> getFilmTanimis2() {
		return filmTanimis2;
	}

	public void setFilmTanimis2(List<FilmTanimi> filmTanimis2) {
		this.filmTanimis2 = filmTanimis2;
	}

	public void setEdit(boolean edit) {
		this.edit = edit;
	}

	public List<FilmTanimi> getFilmTanimis() {
		return filmTanimis;
	}

	public void setFilmTanimis(List<FilmTanimi> filmTanimis) {
		this.filmTanimis = filmTanimis;
	}

	@PostConstruct
	public void init() {

	}

	public List<FilmOyuncuBilgileri> getOyuncular() {
		return oyuncular;
	}

	public void setOyuncular(List<FilmOyuncuBilgileri> oyuncular) {
		this.oyuncular = oyuncular;
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

	public KayitManagedBean(String filmOyuncuAd, String filmOyuncuSoyad, String filmOyuncuRol) {
		super();
		this.filmOyuncuAd = filmOyuncuAd;
		this.filmOyuncuSoyad = filmOyuncuSoyad;
		this.filmOyuncuRol = filmOyuncuRol;
	}

	public KayitManagedBean(String kullaniciAdi, String password) {
		super();
		this.kullaniciAdi = kullaniciAdi;
		this.password = password;
	}

	public KayitManagedBean(String filmAd, String filmYayinYili, String filmTur, String filmAciklama,
			byte[] filmMedya) {
		super();
		this.filmAd = filmAd;
		this.filmYayinYili = filmYayinYili;
		this.filmTur = filmTur;
		this.filmAciklama = filmAciklama;
		this.filmMedya = filmMedya;
	}

	public KayitManagedBean(String filmYayinYili) {
		super();
		this.filmYayinYili = filmYayinYili;
	}

	public KayitManagedBean(String filmAd, String filmYayinYili, String filmTur, String filmAciklama, byte[] filmMedya,
			String[] filmDilSecenegi) {
		super();
		this.filmAd = filmAd;
		this.filmYayinYili = filmYayinYili;
		this.filmTur = filmTur;
		this.filmAciklama = filmAciklama;
		this.filmMedya = filmMedya;
		this.filmDilSecenegi = filmDilSecenegi;
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

	public String addYeniKullanici() {
		String flag = "failure";

		KullaniciKayitDAO kayitDAO = new KullaniciKayitDAOImpl();
		KullaniciKayit kayit = new KullaniciKayit(kullaniciAdi, password);
		GirisKullanici girisKullanici = new GirisKullanici(kullaniciAdi, password);

		kayitDAO.kullaniciKayit(kayit);
		kayitDAO.GirisKayit(kayit, girisKullanici);

		try {
			kayit = kayitDAO.getKullaniciKayit(kullaniciAdi, password);
			if (!kullaniciAdi.equalsIgnoreCase(kayit.getKullaniciAdi())
					&& !password.equalsIgnoreCase(kayit.getPassword())) {
				return flag;
			}
		} catch (Exception e) {
			return null;
		}
		if (kullaniciAdi != null && password != null) {
			return "girisEkrani?faces-redirect=true";
		}

		return "kullaniciAdi = " + kullaniciAdi;
	}

	public String gmailHesap() {
		return "index.jsp?faces-redirect=true";
	}

	public String girisEslesme() {
		String flag = "failure";
		KullaniciKayitDAO kullaniciKayitDAO = new KullaniciKayitDAOImpl();
		KullaniciKayit kullaniciGiris = new KullaniciKayit();
		GirisKullanici girisKullanici = new GirisKullanici(kullaniciAdi, password);
		try {
			kullaniciGiris = kullaniciKayitDAO.getKullaniciKayit(kullaniciAdi, password);
			if (kullaniciAdi.equalsIgnoreCase(kullaniciGiris.getKullaniciAdi())
					&& password.equals(kullaniciGiris.getPassword())) {
				kullaniciKayitDAO.GirisKayit(kullaniciGiris, girisKullanici);
				kullaniciKayitDAO.girisKullanici(girisKullanici);
				return "success";
			}
		} catch (Exception e) {
			return null;
		}
		return flag;
	}

	public String filmEkle() {
		// String flag = "failure";
		KullaniciKayitDAO kayitDAO = new KullaniciKayitDAOImpl();
		FilmTanimi filmTanimi = new FilmTanimi(filmAd, filmYayinYili, filmTur, filmAciklama, filmMedya,
				filmDilSecenegi);
		kayitDAO.filmTanimi(filmTanimi);
		filmTanimis = kayitDAO.FindlistFilmTanimi();
		oyuncular = kayitDAO.FindfilmOyuncuBilgileris();
		return "filmAnasayfasi?faces-redirect=true";
	}

	public void filmOyuncusuEkle() {
		KullaniciKayitDAO kullaniciKayitDAO = new KullaniciKayitDAOImpl();
		FilmOyuncuBilgileri filmOyuncuBilgileri = new FilmOyuncuBilgileri(filmOyuncuAd, filmOyuncuSoyad, filmOyuncuRol);
		kullaniciKayitDAO.filmOyuncuBilgisi(filmOyuncuBilgileri);

	}

	public void deleteFilmTanimi(int id) {
		KullaniciKayitDAO kullaniciKayitDAO = new KullaniciKayitDAOImpl();
		kullaniciKayitDAO.filmRemove(id);
		filmTanimis = kullaniciKayitDAO.FindlistFilmTanimi();
		// oyuncular = kullaniciKayitDAO.FindfilmOyuncuBilgileris();
	}

	public void deletefilmOyuncuBilgileri(int id) {
		KullaniciKayitDAO kullaniciKayitDAO = new KullaniciKayitDAOImpl();
		kullaniciKayitDAO.filmOyuncuBilgileriRemove(id);
		oyuncular = kullaniciKayitDAO.FindfilmOyuncuBilgileris();
	}

	public String guncellemeDurumu(FilmTanimi filmTanimi) {

		filmTanimi.setEdit(true);
		return null;
	}

	public String guncellemeDurumuFilmOyuncusu(FilmOyuncuBilgileri filmOyuncuBilgileri) {
		filmOyuncuBilgileri.setOyuncuEdit(true);
		return null;
	}

	private String kelime = "";

	public String getKelime() {
		return kelime;
	}

	public void setKelime(String kelime) {
		this.kelime = kelime;
	}

	public List<FilmOyuncuBilgileri> oyuncuDatails = new ArrayList<>();

	public List<FilmOyuncuBilgileri> getOyuncuDatails() {
		return oyuncuDatails;
	}

	public void setOyuncuDatails(List<FilmOyuncuBilgileri> oyuncuDatails) {
		this.oyuncuDatails = oyuncuDatails;
	}

	public List<FilmTanimi> details;

	public List<FilmTanimi> getDetails() {

		return details;
	}

	public void setDetails(List<FilmTanimi> details) {
		this.details = details;
	}

	public KayitManagedBean() {
		super();
	}

	@PostConstruct
	public List<FilmTanimi> SearchButton() {
		KullaniciKayitDAO dao = new KullaniciKayitDAOImpl();
		FilmTanimi filmTanimi = new FilmTanimi(filmAd, filmTur);
		FilmOyuncuBilgileri filmOyuncuBilgileri = new FilmOyuncuBilgileri(filmOyuncuAd);
		filmTanimis = dao.FindlistFilmTanimi();

		if (kelime.equalsIgnoreCase(filmTanimi.getFilmAd())) {
			details = dao.getFilmTanimiFilmAdAndFilmTur(filmAd);
		} else if (kelime.equalsIgnoreCase(filmTanimi.getFilmTur())) {
			details = dao.getFilmTurArama(filmTur);
		} else if (kelime.equalsIgnoreCase(filmOyuncuBilgileri.getFilmOyuncuAd())) {
			oyuncuDatails = dao.getOyuncuAdiArama(filmOyuncuAd);
		} else {
			kelime = "";
		}
		return details;
	}

	public String aramaSayfasi() {
		return "search?faces-redirect=true";
	}

	public String filmAnasayfa() {
		return "filmAnasayfasi?faces-redirect=true";
	}

	public String yeniFilmEkle() {
		return "filmTanimi?faces-redirect=true";
	}

	public String siralamaFilmYayinYili() {

		return null;
	}

	public String degisikligiKaydet() {
		for (FilmTanimi tara : filmTanimis) {
			tara.setEdit(false);
		}
		return null;
	}

	public String degisikligiKaydetFilmOyuncuListesi() {
		for (FilmOyuncuBilgileri bilgileri : oyuncular) {
			bilgileri.setOyuncuEdit(false);
		}
		return null;
	}
}
