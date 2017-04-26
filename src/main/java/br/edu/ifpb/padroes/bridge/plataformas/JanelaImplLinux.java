package br.edu.ifpb.padroes.bridge.plataformas;

public class JanelaImplLinux implements JanelaImpl {

	public void desenharJanela(String titulo) {
		System.out.println(titulo + " » JanelaImpl Linux");
	}

	public void desenharBotao(String titulo) {
		System.out.println(titulo + " » Botão Linux");
	}

}
