package Votacao;

public class Votacao {
	protected Usuario user;
	protected Candidato cand;
	public Usuario getUser() {
		return user;
	}
	public void setUser(Usuario user) {
		this.user = user;
	}
	public Candidato getCand() {
		return cand;
	}
	public void setCand(Candidato cand) {
		this.cand = cand;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Votacao [user=");
		builder.append(user);
		builder.append(", cand=");
		builder.append(cand);
		builder.append("]");
		return builder.toString();
	}
	
	
}
