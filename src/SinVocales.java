
//SinVocales contendrá un método quitará las vocales de una frase. La frase será un atributo de
//la clase que se le dará valor en el constructor. No utilizar el método replace().
import java.util.*;

public class SinVocales {
	private String frase = "Hola este es nuestro trabajo";

	public String quitarVocales() {
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