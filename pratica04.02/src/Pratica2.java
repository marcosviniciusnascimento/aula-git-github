import java.util.Scanner;

public class Pratica2 {

	public static void main(String[] args) {
		double l1, l2, l3;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite os lados do tri�ngulo: ");
		
		l1 = input.nextDouble();
		l2 = input.nextDouble();
		l3 = input.nextDouble();
		if (l1 == l2 && l2 == l3)
		System.out.println("Equil�tero");
		else if (l1 == l2 || l1 == l3 || l2 == l3)
		System.out.println("Is�sceles");
		else
		System.out.println("Escaleno");
	}

}
