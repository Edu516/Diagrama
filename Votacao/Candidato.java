package Votacao;

public class Candidato {
	protected Usuario user;
	
	public Candidato() {
		user = new Usuario();
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Candidato [user=");
		builder.append(user);
		builder.append("]");
		return builder.toString();
	}
	
	
}
