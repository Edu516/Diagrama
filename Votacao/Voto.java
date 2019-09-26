package Votacao;

public class Voto {
	protected Votacao vot;
	
	public Voto() {
		vot = new Votacao();
	}

	public Votacao getVot() {
		return vot;
	}

	public void setVot(Votacao vot) {
		this.vot = vot;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Voto [vot=");
		builder.append(vot);
		builder.append("]");
		return builder.toString();
	}
	
	
}
