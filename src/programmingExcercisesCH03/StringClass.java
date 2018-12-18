package programmingExcercisesCH03;

public class StringClass {

	public static void main(String[] args) {
		
		//length() function / method
		String word = "airplane";
		int wordUzunluk = word.length(); // length() uzunlugu verir
		System.out.println(wordUzunluk);  // output is 8
		System.out.println(word.charAt(2) ); // output is 'r'	

		
		// concat() function / method
		String name = "THY";
		System.out.println(name.concat(" is flying to Houston today at 8:00pm"));
		// output THY is flying to Houston today at 8:00pm
		
		
		// replace() function / method
		String esya = "Tabak";
		System.out.println(esya);  
		System.out.println(esya.replace("T", "K")); // replace function / method
		
	
		// substring(baslangicIndex, bitisIndex) function / method
		String name2 = "Adsiz";
		// index 0=A, 1=d, 2=s, 3=i, 4=z
		System.out.println(name2.substring(0,3)); // Index 0 Included til index 3 (not icluded)
		// output is Ads
		
		
		// trim() function / method
		String bosluklar = "  ali  "; // trim methodu ile basta ve sondaki bosluklar silinir
		System.out.println(bosluklar);
		System.out.println(bosluklar.trim());
		
		// contains() function / method
		String icerirMiIcermezMi = "Bayram";
		System.out.println(icerirMiIcermezMi);
		System.out.println(icerirMiIcermezMi.contains("Java")); 
		// Bayram Java icerir mi? Icermedigi icin sonuc false cikicak
		System.out.println(icerirMiIcermezMi.contains("B")); 
		// Bayram B icerir mi? Icerdigi icin sonuc true cikicak
		
		// indexOf() function / method
		String day1 = "Monday";
		System.out.println("Day is "+day1);
		System.out.println("D harfinin index numarasi: "+day1.indexOf("d"));
		System.out.println("a harfinin index numarasi: "+day1.indexOf("a"));
		
		// charAt() fucntion / method
		String day2 = "Tuesday";
		System.out.println("Day is "+day2);
		System.out.println("Index 0 daki karakter: "+day2.charAt(0));
		// index 0 dan baslar. dolayisiyla index 0 demek 1 INCI karaketer demektir
		System.out.println("Index 2 deki karakter: "+day2.charAt(2));
		// index 0 dan baslar. dolayisiyla index 2 demek 3 uncu karaketer demektir
		
		// equals() function / method
		String day3 = "Wednesday";
		System.out.println("Is Wednesday equal to Tuesday? ==> "+day3.equals("Tuesday"));
		// day3 yani Wednesday Tueday e esit mi. Esit olmadigi icin false cikicak
		System.out.println("Is Wednesday equal to Wednesday? ==> "+day3.equals("Wednesday"));
		// day3 yani Wednesday Wednesday e esit mi. Esit oldugu icin true cikicak
		
		
		// toLowerCase()  and toUpperCase() function / method
		String day4 = "ThuRsday";
		System.out.println("Output is: "+day4.toLowerCase());
		System.out.println("Output is: "+day4.toUpperCase());
	
		// day4. diye yazdiginizda bayagi bir method gorursunuz. Yukardakile en cok kullanilanalar
		
		
		
		
		
	}

}
