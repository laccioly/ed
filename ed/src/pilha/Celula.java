package pilha;


public class Celula {
	
	private Object elemento;
	private Celula proximo;
	
	public Celula(Object elemento ) {
		this.elemento=elemento;
	}

	public Object getElemento() {
		return elemento;
	}

	public Celula getProximo() {
		return proximo;
	}

	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}

}
