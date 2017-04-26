package br.edu.ifpb.padroes.bridge.janelas;

import br.edu.ifpb.padroes.bridge.plataformas.JanelaImpl;

public class JanelaDialogo extends JanelaAbstrata {

	public JanelaDialogo(JanelaImpl janela) {
		super(janela);
	}

	@Override
	public void desenhar() {
		desenharJanela("JanelaImpl de Diálogo");
        desenharBotao("Botão Sim");
        desenharBotao("Botão Não");
        desenharBotao("Botão Cancelar");
	}

}
