import java.util.Scanner;

public class Pratica3 {

	public static void main(String[] args) {
		int nota1, nota2, nota3, media;
		Scanner input = new Scanner(System.in);
		System.out.println("Nota 1: ");
		nota1 = input.nextInt();
		System.out.println("Nota 2: ");
		nota2 = input.nextInt();
		System.out.println("Nota 3: ");
		nota3 = input.nextInt();
		media = (nota1 + nota2 + nota3)/3;
		
		if (media>= 0 && media<3)
			System.out.println("Reprovado");
		else if (media>=3 && media<7)
			System.out.println("Exame.");
		else if (media>=7 && media<=10)
		System.out.println("Aprovado!");
	}

}
