package javaDersi17;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);
		
		System.out.println("Eleman sayisi : "+mesaj.length()); //Eleman sayısını gösterir.
		System.out.println("10. eleman : "+mesaj.charAt(9));   //istediğimiz elemanı ekrana yazdırır.
		System.out.println(mesaj.concat(" Yaşasın!"));		   //İki stringi birleştirir.
		System.out.println(mesaj.startsWith("B"));			   //Başlangıç karakterini kontrol eder.(Boolean)
		System.out.println(mesaj.endsWith("."));			   //Bitiş karakterini kontrol eder.(Boolean)
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);				   //Bir dizinin her hangi bir yerindeki karakterleri..
		System.out.println(karakterler);					   //..yeni bir dizi oluşturup oraya atamaya yarar.
		System.out.println(mesaj.indexOf('a'));				   //Yazılan karakterin veya stringin dizide kaçıncı eleman olduğunu bulur.
		System.out.println(mesaj.lastIndexOf('g'));
		
	}

}
