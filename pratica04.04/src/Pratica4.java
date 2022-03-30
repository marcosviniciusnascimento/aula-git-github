import java.util.Scanner;

public class Pratica4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double peso, altura, imc;
		Scanner input = new Scanner(System.in);
		System.out.println("Qual o peso? ");
		peso = input.nextDouble();
		System.out.println("Qual a altura? ");
		altura = input.nextDouble();
		imc = peso/(altura*2);
		
		if (imc<20)
			System.out.println("Abaixo do Peso");
		else if (imc>=20 && imc<=25)
			System.out.println("Normal");
		else if (imc>=25 && imc<=30)
			System.out.println("Sobrepeso");
		else if (imc>=30 && imc<=40)
			System.out.println("Obesidade");
		else if (imc>40)
			System.out.println("Obesidade Morbida");
	}

}
