package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import model.FilmOyuncuBilgileri;
import model.FilmTanimi;
import model.GirisKullanici;
import model.KullaniciKayit;
import utility.JPAUtility;

public class KullaniciKayitDAOImpl implements KullaniciKayitDAO{

	public EntityManager entityManager;
	
	public KullaniciKayitDAOImpl() {
		EntityManagerFactory emf = JPAUtility.getEntityManagerFactory();
		if (entityManager == null) {
			entityManager = emf.createEntityManager();
		}
	}
	
	@Override
	public KullaniciKayit kullaniciKayit(KullaniciKayit kullaniciKayit) {
		entityManager.getTransaction().begin();
		entityManager.persist(kullaniciKayit);
		entityManager.getTransaction().commit();
		
		return kullaniciKayit;
	}
	
	@Override
	public void girisKullanici(GirisKullanici girisKullanici) {
		entityManager.getTransaction().begin();
		entityManager.persist(girisKullanici);
		entityManager.getTransaction().commit();
		
	}

	
	@Override
	public void GirisKayit(KullaniciKayit kayit, GirisKullanici girisKullanici) {
		entityManager.getTransaction().begin();
		girisKullanici.setKayit(kayit);
		entityManager.getTransaction().commit();
	}
	
	public FilmTanimi filmTanimi(FilmTanimi filmTanimi) {
		entityManager.getTransaction().begin();
		entityManager.persist(filmTanimi);
		entityManager.getTransaction().commit();
		
		return filmTanimi;
	}
	
	public FilmOyuncuBilgileri filmOyuncuBilgisi(FilmOyuncuBilgileri oyuncuBilgileri) {
		entityManager.getTransaction().begin();
		entityManager.persist(oyuncuBilgileri);
		entityManager.getTransaction().commit();
		
		return oyuncuBilgileri;
	}

													
	public KullaniciKayit getKullaniciKayit(String kullaniciAdi, String password) {
		Query query = entityManager.createQuery("SELECT u FROM KullaniciKayit u WHERE u.kullaniciAdi = :login AND u.password = :pass");
		
		query.setParameter("login", kullaniciAdi);
		query.setParameter("pass", password);
		
		return (KullaniciKayit) query.getSingleResult();
	}

	@Override
	public void FilmOyuncuKayit(FilmTanimi filmTanimi, FilmOyuncuBilgileri filmOyuncuBilgileri) {
		entityManager.getTransaction().begin();
		filmTanimi.getOyuncular().add(filmOyuncuBilgileri);;
		entityManager.getTransaction().commit();
	}

	@Override
	public FilmTanimi tanimiId(int id) {
		return entityManager.find(FilmTanimi.class, id);
	}

	@Override
	public List<FilmTanimi> FindlistFilmTanimi() {
		TypedQuery<FilmTanimi> query = entityManager.createQuery("Select e from FilmTanimi e", FilmTanimi.class);
		return  query.getResultList();
	}

	@Override
	public List<FilmOyuncuBilgileri> FindfilmOyuncuBilgileris() {
		TypedQuery<FilmOyuncuBilgileri> query = entityManager.createQuery("Select e from FilmOyuncuBilgileri e", FilmOyuncuBilgileri.class);
		return query.getResultList();
	}
	
	@Override
	public FilmOyuncuBilgileri filmOyuncuBilgileriId(int id) {
		return entityManager.find(FilmOyuncuBilgileri.class, id);
	}

	@Override
	public void filmRemove(int id) {
		FilmTanimi filmTanimi = tanimiId(id);
		entityManager.getTransaction().begin();
		entityManager.remove(filmTanimi);
		entityManager.getTransaction().commit();
	}

	@Override
	public void filmOyuncuBilgileriRemove(int id) {
		FilmOyuncuBilgileri filmOyuncuBilgileri = filmOyuncuBilgileriId(id);
		entityManager.getTransaction().begin();
		entityManager.remove(filmOyuncuBilgileri);
		entityManager.getTransaction().commit();

	}

	//
	@Override
	public void updateFilmTanimi(int id, FilmTanimi filmTanimi ) {
		filmTanimi = tanimiId(id);
		entityManager.getTransaction().begin();
		filmTanimi.setFilmAd(filmTanimi.getFilmAd());
		filmTanimi.setFilmYayinYili(filmTanimi.getFilmYayinYili());
		filmTanimi.setFilmTur(filmTanimi.getFilmTur());
		filmTanimi.setFilmAciklama(filmTanimi.getFilmAciklama());
		filmTanimi.setFilmMedya(filmTanimi.getFilmMedya());
		entityManager.getTransaction().commit();
	}

	@Override
	public List<FilmTanimi> getFilmTanimiFilmAdAndFilmTur(String filmAd) {
		List<FilmTanimi> details = new ArrayList<>();

		TypedQuery<FilmTanimi> query = entityManager.createQuery("Select e FROM FilmTanimi e WHERE e.filmAd = :kelime", FilmTanimi.class);
		query.setParameter("kelime", filmAd);
		details =  query.getResultList();

		return details;
	}
	@Override
	public List<FilmTanimi> getFilmTurArama(String filmTur){
		List<FilmTanimi> details = new ArrayList<>();
		TypedQuery<FilmTanimi> query = entityManager.createQuery("Select e FROM FilmTanimi e WHERE e.filmTur = :kelime", FilmTanimi.class);
		query.setParameter("kelime", filmTur);
		details =  query.getResultList();
		return details;
	}

	@Override
	public List<FilmOyuncuBilgileri> getOyuncuAdiArama(String filmOyuncuAd) {
		TypedQuery<FilmOyuncuBilgileri> query = entityManager.createQuery("Select e FROM FilmOyuncuBilgileri e WHERE e.filmOyuncuAd = :kelime ", FilmOyuncuBilgileri.class);
		query.setParameter("kelime", filmOyuncuAd );
		return query.getResultList();
	}
	@Override
	public List<FilmTanimi> getfilmYayinYiliSiralama(String filmYayinYili){
		TypedQuery<FilmTanimi> query = entityManager.createQuery("Select e.filmYayinYili  FROM FilmTanimi e ORDER BY e.filmYayinYili DESC", FilmTanimi.class);
		return query.getResultList();
	}
	
}
