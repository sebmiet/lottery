import java.util.Arrays;
import java.util.Scanner;

public class Losowanie {
	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Ile liczb wylosowaæ? ");
		int k = in.nextInt();
		System.out.print("Jaka jest najwiêksza liczba w losowaniu? ");
		int n = in.nextInt();
		
		// Zape³nianie tablicy
		int[] liczby = new int[n];
		for (int i =0; i < liczby.length; i++) {
			liczby[i] = i + 1;
		}
		// Losowanie liczb i zapisanie ich w drugiej tablicy
		int[] wynik = new int[k];
		for ( int i = 0; i < wynik.length; i++) {
			int r = (int) (Math.random() * n);
			wynik[i] = liczby[r];
			liczby[r] = liczby[n-1];
			n--;
			
		
		}
		Arrays.sort(wynik);
		System.out.print("Postaw na nastêpuj¹ce liczby: ");
		for( int r : wynik) System.out.print("{" + r + "}");
		System.out.println("");
		System.out.println("");
		System.out.print("!!!¯YCZÊ WYSOKIEJ WYGRANEJ!!!");
		
	}

}
