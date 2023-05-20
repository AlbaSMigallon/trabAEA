import java.util.Scanner;

public class PrincipalApp {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Ingresa una frase: ");
		String frase = sc.nextLine();
		// numero consonantes
		int num = NumeroConsonantes.numeroConsonantes(frase);
		System.out.println(num);
		// sin vocales
		String soloConsonantes = SinVocales.sinVocales(frase);
		System.out.println(soloConsonantes);

	}

}
