package controller;

public class OperacoesController {
	
	public OperacoesController() {
		super();
	}
	
	public void contaPalavras(String frase) {
		String[] vetorPalavras = frase.split(";");
		
		System.out.println("Quantidade de partes: " + vetorPalavras.length);
		
		//foreach - tipo (TipoDado var : vetor)
		/*for (String palavra : vetorPalavras) {
			 System.out.println(palavra);
		}*/
	}
}
