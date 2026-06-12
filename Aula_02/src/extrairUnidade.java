
public class extrairUnidade {

	public static void main(String[] args) {
		int numero = 07;
        double a = 10.5;
        int dezena = numero / 10;  // 47 / 10 = 4
        int unidade = numero % 10; // 47 % 10 = 7
        
        System.out.println("Dezena: " + dezena);
        System.out.println("Unidade: " + unidade);

	}
}