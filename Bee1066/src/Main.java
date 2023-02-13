
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		int valores, qPares = 0, qImpares = 0, qPositivos = 0, qNegativos = 0;
		Scanner teclado = new Scanner(System.in);
		
		for(int i = 1; i < 6 ; i++) {
			
			valores = teclado.nextInt();
			
			
			if(valores % 2 == 0) {
				qPares += 1;
				if(valores > 0) {
					qPositivos += 1;
				} else if(valores < 0){
					qNegativos += 1;
				}
			} else {
				qImpares += 1;
				if(valores > 0) {
					qPositivos += 1;
				} else if(valores < 0){
					qNegativos += 1;
				}
			}
			
			
		}
		
		
		System.out.println(qPares + " valor(es) par(es)");
		System.out.println(qImpares + " valor(es) impar(es)");
		System.out.println(qPositivos + " valor(es) positivo(s)");
		System.out.println(qNegativos + " valor(es) negativo(s)");
	}
	
}
