import java.util.Scanner;

public class AtmUygulamasi {

	public static void main(String[] args) {
		
		
		try (//Emir Uzun : İBAN TR1265 0708 127 985 345 13 89
				//Emirin kullanıcı adı ve şifresi 
				//Kullanıcı Adı: emir123 Şifre: 444412
				//Habibe Elma : İBAN TR1234 5678 901 234 567 89 01
				//Kullanıcı Adı: habibe345 Şifre: 121212
				/*
				 * Bakiye Görüntülemek için 1
				 * Para çekmek için 2 
				 * Farklı Hesaba Para Yatırmak İçin 3
				 * Uygulamadan Çıkmak İçin q
				 */
		Scanner scanner = new Scanner(System.in)) {
			String islemler = "Bakiye Goruntulemek Icin Lutfen 1 i Tuslayiniz \n" + 
		"Para Cekme Icin Lutfen 2 yi Tuslayiniz \n" 
					+ "Farkli Hesaba Para Yatirmak Icin Lutfen 3 u Tuslayiniz \n" 
		+ "Uygulamadan Cikmak Icin 4 u tuslayiniz \n";
			double emirBakiye = 3000;
			String emiriban = "TR1265 0708 127 985 345 13 89";
			String kullaniciAdiemir = "emir123";
			String kullaniciSifre = "444412";
			
			double habibeBakiye = 2300;
			String habibeiban = "TR1234 5678 901 234 567 89 01";
			String kullaniciAdiHabibe = "habibe345";
			String kullaniciSifrehabibe = "121212";
			
			System.out.print("Lutfen kullanici adinizi giriniz: ");
			String isim = scanner.nextLine();
			
			
			System.out.print("Lutfen kullanici sifrenizi giriniz: ");
			String sifre = scanner.nextLine();
			
			if (isim.equals("emir123") && sifre.equals("444412")) {
				System.out.println("Emir Uzun sisteme giris yapti!");
				System.out.println(islemler);
				System.out.print("Lutfen Isleminiz Icin Sayi Giriniz: ");
				
				int sayi = scanner.nextInt();
				switch (sayi){
				case 1:
					System.out.println(emirBakiye);
					break;
					
				case 2:
				System.out.print("Cekmek istediginiz tutari giriniz: ");
				int cekme = scanner.nextInt();
				if (emirBakiye>=cekme) {
					int cekilmis = (int) (emirBakiye-cekme);
					System.out.println("Islem basarili!!!");
					System.out.println("Kalan Bakiyeniz: " + cekilmis);
					
				}else {
					System.out.println("Bakiyeniz Yetersiz!!!");
				}
				break;
				
				case 3:
					System.out.print("Ne Kadar Yatirmak Istiyorsunuz :");
					int yatirilacakTutar = scanner.nextInt();
					if (yatirilacakTutar<=emirBakiye) {
						System.out.println("Iban Giriniz: ");
						scanner.nextLine();
						String yatirilacakIban = scanner.nextLine();
						if (yatirilacakIban.equals(habibeiban)) {
							System.out.println("Para Habibe Nur Elma Adli Kisiye Yatiriliyor...");
							int yenibakiye = (int) (emirBakiye-=yatirilacakTutar);
							habibeBakiye+=yatirilacakTutar;
							System.out.println("Islem Basarili Yeni Bakiyeniz: " + yenibakiye);
						}
					} else {
						System.out.println("Bakiyeniz Yetersiz!!!");
					}

				
					break;
					
				case 4:
					System.out.println("Cikis Yapiliyor....");
					System.out.println("Sistemden Cikisiniz Yapilmistir...");
				}
				
			}
			else if (isim.equals("habibe345")&& sifre.equals("121212")) {
				System.out.println("Habibe Elma Sisteme Giris Yapti!");
				System.out.println(islemler);
				System.out.print("Lutfen Isleminiz Icin Sayi Giriniz: ");
				
				int sayi = scanner.nextInt();
				switch (sayi){
				case 1:
					System.out.println(habibeBakiye);
					break;
					
				case 2:
				System.out.print("Cekmek istediginiz tutari giriniz: ");
				int cekme = scanner.nextInt();
				if (habibeBakiye>=cekme) {
					int cekilmis = (int) (habibeBakiye-cekme);
					System.out.println("Islem basarili!!!");
					System.out.println("Kalan Bakiyeniz: " + cekilmis);
					
				}else {
					System.out.println("Bakiyeniz Yetersiz!!!");
				}
				break;
				
				case 3:
					System.out.print("Ne Kadar Yatirmak Istiyorsunuz :");
					int yatirilacakTutar = scanner.nextInt();
					if (yatirilacakTutar<=emirBakiye) {
						System.out.println("Iban Giriniz: ");
						scanner.nextLine();
						String yatirilacakIban = scanner.nextLine();
						if (yatirilacakIban.equals(emiriban)) {
							System.out.println("Para Habibe Nur Elma Adli Kisiye Yatiriliyor...");
							int yenibakiye = (int) (habibeBakiye-=yatirilacakTutar);
							emirBakiye+=yatirilacakTutar;
							System.out.println("Islem Basarili Yeni Bakiyeniz: " + yenibakiye);
						}
					} else {
						System.out.println("Bakiyeniz Yetersiz!!!");
					}

				
					break;
					
				case 4:
					System.out.println("Cikis Yapiliyor....");
					System.out.println("Sistemden Cikisiniz Yapilmistir...");
				}
				
			} else {
				System.out.println("Kullanici adi veya sifre hatali!!!");
			}
		} 
		}
		
				
		
		
		

	}


