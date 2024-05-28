package aula2705;
import java.util.ArrayList;

public class Tratamento {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		try {
//			int[] meusNumeros = {11,422,33,654,35};
//			System.out.println(meusNumeros[5]);
//		}
//		catch(Exception e) {
//			System.out.println("Tem algo errado!");
//		}
//		finally {
//			System.out.println("O 'try catch' foi finalizado!");
//		}
//	}
//		static void verificaIdade(int idade) {
//			if (idade < 18) {
//				throw new ArithmeticException("Acesso negado - Você é menor de idade - tem menos de 18 anos!");
//			}
//			else {
//				System.out.println("Acesso garantido - Você é maior de idade!");
//			}
//		}
//		public static void main(String[] args) {
//			verificaIdade(17);
//		}
	
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Fiat");
		cars.add("Fusca");
		cars.add("Corsa");
		cars.add("Spin");
//		System.out.println(cars);
		
//		System.out.println(cars.get(3));
		
		cars.set(1, "Toro");
		cars.set(0, "Ferrari");
		cars.add("Kombi");
		cars.add("Hyllux");
//		cars.set(5, "Corsa"); --O sistema não aceita o SET se a posição não existir no array

//		System.out.println(cars);
		
//		for(int i = 0; i < cars.size(); i ++) {
//			System.out.println(cars.get(i));
//		}
		for(String i : cars) {
			System.out.println(i);
		}
		
		int i = 0;
		while(true) {
			i++;
			System.out.println(i);
			if(i == 100000) {
				break;
			}
		}
	}
		
}

