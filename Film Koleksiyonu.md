# Film Koleksiyonu



JFS , JPA, Maven kullanılarak geliştirilen web uygulaması

Diğer Teknolojiler  :

- **Java Version 10.0.1**
- **Dynamic Web Module 3.1**
- **JavaServer Faces 2.2.13**
- **Apache Tomcat v8.5**
- **EclipseLink 2.5.0**
- **MySql Server 8.0.13**
- **Primefaces 7.0**



## Uygulamanın Çalıştırılması

​	Program maven projesi olarak geliştirildi. İlk yapmanız gereken projeyi indirdikten sonra maven'ı update etmektir. Gerekli jar. dosyaları projeye indirilecektir. 

​	Src -> META-INF -> Persistence.xml dosyasında bulunan mysql şifre, kullanıcı adı ve veritabanı ismini düzenlemelisiniz.  MySQL Workbench'de veritabanı oluşturun ve aşağıdaki resimde 

value ="jdbc:mysql://localhost:3306/***VERİTABANI İSMİ***  ?serverTimezone=UTC " /

Veritabanı ismi yazan yere veritabanı isminizi giriniz.

​	![persistence.xml](https://github.com/Brkcan/FilmKoleksiyonu/blob/master/images/persistence.png)

​	

# Gmail ile giriş

Program'da WebContent -> index.jsp dosyasında bulanan  <meta name="google-signin-client_id"  content="   Buraya google'dan  alınan istemci kimliğini yazınız.  ">

![Gmail](https://github.com/Brkcan/FilmKoleksiyonu/blob/master/images/index.png)



 #  Programın Özellikleri

Kullanıcının kişisel olarak kullanabileceği film koleksiyon uygulamasıdır. Kullanıcı kayit olması gerekmekte bu sayede her kullanıcı kendi filmlerini girebilmektedir. 

## Başlıca özellikleri : 

1. Kullanıcı kayit ekrani
2. Giriş Ekrani 
3. Gmail ile giriş yapmadan direk kayit olabilmektedir.
4. Film Tanimlayabilir. 
5. Filmlerinin tüümünü görebileceği sayfa ve burada **delete update ** yapabilmektedir
6. Filmleri arasında **arama ** yapabilmektedir.
7. Filmlerin oyuncularını girebilir.
8. Bir filmin istediği kadar oyuncu girebilir.
9. Bu oyuncularda **arama ** yapabilir.



# Film Tanımlama Sayfası

Filmlerinizi Tanımlayabilir istediğiniz kadar oyuncu girebilirsiniz.

![Film Tanimlamaya bir örnek](https://github.com/Brkcan/FilmKoleksiyonu/blob/master/images/filmlerim.png)

## Film Anasayfası

Filmler silinebilir güncellenebilir ve filmler arasında arama yapılabilir.

![](https://github.com/Brkcan/FilmKoleksiyonu/blob/master/images/filmlerimAnasayfas%C4%B1.png)

## Kayit Ekrani

Kullanıcılar kayit sırasında kullanıcı adı veya gmail ile kayit olabilir.

![](https://github.com/Brkcan/FilmKoleksiyonu/blob/master/images/KayitEkrani.png)



## Giris Ekrani





![](https://github.com/Brkcan/FilmKoleksiyonu/blob/master/images/GirisEkrani.png)





##  Arama Ekrani

Film adı, Film Turu, Oyuncu Adı ile arama yapılabilir.

![](https://github.com/Brkcan/FilmKoleksiyonu/blob/master/images/Arama.png)





​	















