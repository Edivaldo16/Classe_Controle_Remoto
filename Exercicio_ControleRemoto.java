package GuanabaraPOOControleRemoto;

public class Exercicio_ControleRemoto {

	public static void main(String[] args) {
		ControleRemoto a = new ControleRemoto();
		a.ligar();
		a.abrirMenu();

		for (int i = 0; i < 200; i++) {
			a.maisVolume();
		}
		a.abrirMenu();
		for(int i = 0; i < 200; i++) {
			a.menosVolume();
		}
		a.abrirMenu();
		a.fecharMenu();

	}

}
