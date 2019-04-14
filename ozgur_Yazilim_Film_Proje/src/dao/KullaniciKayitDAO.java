package dao;

import java.util.List;

import model.FilmOyuncuBilgileri;
import model.FilmTanimi;
import model.GirisKullanici;
import model.KullaniciKayit;

public interface KullaniciKayitDAO {

	public KullaniciKayit kullaniciKayit(KullaniciKayit kullaniciKayit);
	
	public KullaniciKayit getKullaniciKayit(String kullaniciAdi, String password);
	
	public void GirisKayit(KullaniciKayit kayit, GirisKullanici girisKullanici);
	
	public  void girisKullanici(GirisKullanici girisKullanici);
		
	public FilmTanimi filmTanimi(FilmTanimi filmTanimi);
	
	public FilmOyuncuBilgileri filmOyuncuBilgisi(FilmOyuncuBilgileri oyuncuBilgileri);
	
	public void FilmOyuncuKayit(FilmTanimi filmTanimi, FilmOyuncuBilgileri filmOyuncuBilgileri);
	
	public FilmTanimi tanimiId(int id);
	
	public List<FilmTanimi> FindlistFilmTanimi();
	
	public FilmOyuncuBilgileri filmOyuncuBilgileriId(int id);
	
	public List<FilmTanimi> getFilmTanimiFilmAdAndFilmTur(String filmAd);
	
	
	public List<FilmTanimi> getFilmTurArama(String filmTur);
	
	public List<FilmOyuncuBilgileri> getOyuncuAdiArama(String filmOyuncuAd);
	
	public List<FilmTanimi> getfilmYayinYiliSiralama(String filmYayinYili);
	
	public void filmRemove(int id);
	
	public void filmOyuncuBilgileriRemove(int id);
	
	public void updateFilmTanimi(int id, FilmTanimi filmTanimi );
	
	public List<FilmOyuncuBilgileri> FindfilmOyuncuBilgileris();
	
	
}
