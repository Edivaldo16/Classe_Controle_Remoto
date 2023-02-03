package GuanabaraPOOControleRemoto;

public class ControleRemoto implements Controlador {
	private int volume;
	private boolean ligado;
	private boolean tocando;
	private String marca;

	// Métodos Especiais:
	// Constructor
	public ControleRemoto() {
		// volume = 15;
		this.setVolume(15);
		// ligado = false;
		this.setLigado(false);
		// tocando = false;
		this.setTocando(false);
		this.setMarca("Panasonic");
	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	private String getMarca() {
		return marca;
	}

	private void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public void ligar() {
		this.setLigado(true);

	}

	@Override
	public void desligar() {
		this.setLigado(false);

	}

	@Override
	public void abrirMenu() {
		if (this.getLigado()) {
			System.out.println(this.getMarca());
			System.out.print("Volume: " + this.getVolume());
			System.out.println();
			for (int i = 0; i < this.getVolume(); i++) {
				System.out.print("|");
				//System.out.println();
			}
			System.out.println();
		}

	}

	@Override
	public void fecharMenu() {
		if (this.getLigado()) {
			System.out.println(); // Limpa Texto Menu
		}

	}

	@Override
	public void maisVolume() {
		if (this.getLigado()) {
			if (this.getVolume() >= 0 && this.getVolume() < 100) {
				this.setVolume(this.getVolume() + 1);
			} else {
				this.setVolume(100);
			}
		}

	}

	@Override
	public void menosVolume() {
		if (this.getLigado()) {
			if (this.getVolume() > 0 && this.getVolume() <= 100) {
				this.setVolume(this.getVolume() - 1);
			} else {
				this.setVolume(0);
			}
		}

	}

	@Override
	public void ligarMudo() {
		if (this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
			System.out.println("Mudo!");
		}

	}

	@Override
	public void desligarMudo() {
		if (this.getLigado() && this.getVolume() == 0) {
			this.setVolume(15);
			System.out.println("Volume: " + this.getVolume());
		}

	}

	@Override
	public void play() {
		if (this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
			System.out.println("Play!");
		}

	}

	@Override
	public void pause() {
		if (this.getLigado() && this.getTocando()) {
			this.setTocando(true);
			System.out.println("Play!");
		}

	}

}
