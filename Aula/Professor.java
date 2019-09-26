package Aula;

public class Professor extends Pessoa{

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Professor [getNome()=");
		builder.append(getNome());
		builder.append(", getCpf()=");
		builder.append(getCpf());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append("]");
		return builder.toString();
	}
	
}
