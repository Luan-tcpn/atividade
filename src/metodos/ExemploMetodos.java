package metodos;

public class ExemploMetodos {

	public static void main(String[] args) {

		int resultado = somar(1, 2);

		falar("AAAAAAAAAAAAAAAA");
		ExemploMetodoExterno.mensagem();

	}

	public static int somar(int x, int y) {
		return x + y;
	}

	public static void falar(String mensagem) {
		System.out.println(mensagem);

	}

}
