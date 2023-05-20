import java.util.*;

public class SinVocales {

	public static String sinVocales(String frase) {
		String fraseSinVocales = "";
		for (int i = 0; i < frase.length(); i++) {
			char c = frase.charAt(i);
			if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
				fraseSinVocales += c;
			}
		}

		return fraseSinVocales;
	}
}// en el main se puede utilizar el método quitarVocales de la clase SinVocales
