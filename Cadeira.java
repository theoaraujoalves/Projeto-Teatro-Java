package br.unipe.cc.teatro.modelo;

public class Cadeira {
	
	private int posicao;
	private Usuario usuario;
	
	
	public Cadeira(int posicao, Usuario usuario) {
		super();
		this.posicao = posicao;
		this.usuario = usuario;
	}
	
	public int getPosicao() {
		return posicao;
	}
	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cadeira [posicao=" + posicao + ", usuario=" + usuario + "]";
	}


	
}
