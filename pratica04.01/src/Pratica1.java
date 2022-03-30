import java.util.Scanner;

public class Pratica1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota1, nota2, media;
		Scanner input = new Scanner(System.in);
		System.out.println("nota 1: ");
		nota1 = input.nextInt();
		System.out.println("nota 2: ");
		nota2 = input.nextInt();
		media = (nota1 + nota2)/2;
		
		if (media >=7)
			System.out.println("Aprovado!!");
		else
			System.out.println("Reprovado!");
		
		
	}

}
