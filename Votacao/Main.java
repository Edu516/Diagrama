package Votacao;

public class Main {

	public static void main(String[] args) {
		Usuario us = new Usuario();
		Candidato us2 = new Candidato();
		
		us.setEmail("23@h.com");
		us2.setUser(us);
		
		Votacao vot = new Votacao();
		
		vot.setCand(us2);
		vot.setUser(us);
		
		System.out.println(vot);
	}

}
