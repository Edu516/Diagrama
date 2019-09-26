package Votacao;

public class Validacao {
	private String hash;
	private boolean ativo;
	protected Usuario user;
	protected Votacao votacao;
	
	public Validacao() {
		user = new Usuario();
		votacao = new Votacao();
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

	public Votacao getVotacao() {
		return votacao;
	}

	public void setVotacao(Votacao votacao) {
		this.votacao = votacao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Validacao [hash=");
		builder.append(hash);
		builder.append(", ativo=");
		builder.append(ativo);
		builder.append(", user=");
		builder.append(user);
		builder.append(", votacao=");
		builder.append(votacao);
		builder.append("]");
		return builder.toString();
	}
	
	
}
