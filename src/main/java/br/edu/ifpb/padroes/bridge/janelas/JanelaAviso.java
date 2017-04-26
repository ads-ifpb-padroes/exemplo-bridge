package br.edu.ifpb.padroes.bridge.janelas;

import br.edu.ifpb.padroes.bridge.plataformas.JanelaImpl;

public class JanelaAviso extends JanelaAbstrata {

	public JanelaAviso(JanelaImpl janela) {
		super(janela);
	}

	@Override
	public void desenhar() {
		desenharJanela("JanelaImpl de Aviso");
        desenharBotao("Ok");
	}

}
