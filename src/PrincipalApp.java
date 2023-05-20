import java.util.Scanner;

public class PrincipalApp {

	public static void main(String[] args) {
		//numero consonantes
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingresa una frase: ");
	        String frase = scanner.nextLine();

	        NumeroConsonantes contador = new NumeroConsonantes();
	        int numeroConsonantes = contador.numeroConsonantes();
	        System.out.println("Número de consonantes: " + numeroConsonantes);

	}

}
