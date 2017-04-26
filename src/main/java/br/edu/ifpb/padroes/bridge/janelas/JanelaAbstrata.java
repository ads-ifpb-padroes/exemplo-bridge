package br.edu.ifpb.padroes.bridge.janelas;

import br.edu.ifpb.padroes.bridge.plataformas.JanelaImpl;

public abstract class JanelaAbstrata {
	
	protected JanelaImpl janela;
	
	public JanelaAbstrata(JanelaImpl janela) {
		this.janela = janela;
	}
	
	public void desenharJanela(String titulo) {
		janela.desenharJanela(titulo);
	}
	
	public void desenharBotao(String titulo) {
		janela.desenharBotao(titulo);
	}
	
	public abstract void desenhar();

}
