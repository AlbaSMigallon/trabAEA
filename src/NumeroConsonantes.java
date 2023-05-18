import java.util.*;
public class NumeroConsonantes {
	private String frase;
	
	 public int numeroConsonantes() {
	        String consonantes = "bcdfghjklmnpqrstvwxyz";
	        int numeroConsonantes = 0;

	        
	        for (int i = 0; i < frase.length(); i++) {
	            char c = frase.charAt(i);
	            if (consonantes.indexOf(c) != -1) {
	                numeroConsonantes++;
	            }
	        }

	        return numeroConsonantes;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingresa una frase: ");
	        String frase = scanner.nextLine();

	        NumeroConsonantes contador = new NumeroConsonantes();
	        int numeroConsonantes = contador.numeroConsonantes();
	        System.out.println("Número de consonantes: " + numeroConsonantes);
	    }
	}
	

	








