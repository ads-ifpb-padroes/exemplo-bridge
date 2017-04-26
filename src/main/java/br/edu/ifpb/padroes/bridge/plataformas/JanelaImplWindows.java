package br.edu.ifpb.padroes.bridge.plataformas;

public class JanelaImplWindows implements JanelaImpl {

	public void desenharJanela(String titulo) {
		System.out.println(titulo + " » JanelaImpl Windows");
	}

	public void desenharBotao(String titulo) {
		System.out.println(titulo + " » Botão Windows");
	}

}
