import java.util.Scanner;

public class M3_Ex2_DanielAmatMolina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables:
		int num1;
		int num2;
		float divisio;
		
		Scanner entrada = new Scanner(System.in);
		
		//Lógica:
		System.out.println("Si us plau, escriu un número sencer: ");
		num1 = entrada.nextInt();
		
		System.out.println("Si us plau, escriu un altre número sencer: ");
		num2 = entrada.nextInt();
		
		
		System.out.println("El resultat de la suma es: " + (num1 + num2));
		System.out.println("El resultat de la resta es: " + (num1 - num2));
		System.out.println("El resultat de la multiplicacio es: " + (num1 * 
				num2));
		
		//Casting a float: 
		float num3 = (float) num1;
		float num4 = (float) num2;
		
		//Un cop tenim assignats num1 i num2:
		divisio = (num3 / num4);
		
		System.out.println("El resultat de la divisió es: " + divisio);
		
		//Fin
	}

}
