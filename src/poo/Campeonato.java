package poo;
import javax.swing.JOptionPane;

public class Campeonato {
	public void classificacao() {

		 String nome = JOptionPane.showInputDialog("Digite o Nome do Campeonato");
		 String regiao = JOptionPane.showInputDialog("Digite a Regi�o do Campeonato");
		 String quadrilha1 = JOptionPane.showInputDialog("Digite a Quadrilha vencedora!");
		 String quadrilha2 = JOptionPane.showInputDialog("Digite o Segundo Lugar!");
		 String quadrilha3 = JOptionPane.showInputDialog("Digite a Terceiro Lugar !");
		 String quadrilha4 = JOptionPane.showInputDialog("Digite a Quarto Lugar!");
		 String quadrilha5 = JOptionPane.showInputDialog("Digite a Quinto Lugar!");
		 
		 
		 String tudo = "NOME DO CAMPEONATO: "+ nome + "\n\nA REGI�O DO CAMPEONATO �: "+ regiao + 
				"\n\nPRIMEIRA POSI��O: "+ quadrilha1+
				"\n\nSEGUNDA POSI��O: "+ quadrilha2+ 
				"\n\nTERCEIRA POSI��O: "+ quadrilha3+ 
				"\n\nQUARTA POSI��O: "+ quadrilha4+ 
				"\n\nQUINTA POSI��O: "+ quadrilha5;
		
		JOptionPane.showMessageDialog(null, tudo);
		System.exit(0);
		
	}
}