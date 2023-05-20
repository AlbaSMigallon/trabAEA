import java.util.*;

public class NumeroConsonantes {
	// private String frase;

	public static int numeroConsonantes(String frase) {
		String consonantes = "bcdfghjklmnpqrstvwxyz";
		int numeroConsonantes = 0;

		for (int i = 0; i < frase.length(); i++) {
			frase.toLowerCase();
			char c = frase.charAt(i);

			if (consonantes.indexOf(c) != -1) {
				numeroConsonantes++;
			}
		}

		return numersoConsonantes;
	}

}
