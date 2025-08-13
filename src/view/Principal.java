package view;

import javax.swing.JOptionPane;
import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		OperacoesController c = new OperacoesController();
		
		String frase = JOptionPane.showInputDialog("Digite o texto separado por ponto e vírgula:");
		c.contaPalavras(frase);
	}

}
