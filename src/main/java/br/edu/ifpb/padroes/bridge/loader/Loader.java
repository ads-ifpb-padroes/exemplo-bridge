package br.edu.ifpb.padroes.bridge.loader;

import br.edu.ifpb.padroes.bridge.janelas.JanelaAbstrata;
import br.edu.ifpb.padroes.bridge.janelas.JanelaAviso;
import br.edu.ifpb.padroes.bridge.janelas.JanelaDialogo;
import br.edu.ifpb.padroes.bridge.plataformas.JanelaImpl;
import br.edu.ifpb.padroes.bridge.plataformas.JanelaImplLinux;
import br.edu.ifpb.padroes.bridge.plataformas.JanelaImplWindows;

public class Loader {
	
	private static JanelaImpl plataforma = new JanelaImplLinux();
	
	public static void main(String[] args) {
		JanelaAbstrata janela = new JanelaDialogo(plataforma);
	    janela.desenhar();
	    janela = new JanelaAviso(plataforma);
	    janela.desenhar();

		if(System.getProperty("os.name").equals("Linux"))
			System.out.println("Opa");

		System.out.println("==================================");
	 
	    janela = new JanelaDialogo(new JanelaImplWindows());
	    janela.desenhar();
	}

}
