package Votacao;

public class Usuario {
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("usuario [email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}
	
	
}
