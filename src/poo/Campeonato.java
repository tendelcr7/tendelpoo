package poo;
import javax.swing.JOptionPane;

public class Campeonato {
	public void classificacao() {

		 String nome = JOptionPane.showInputDialog("Digite o Nome do Campeonato");
		 String regiao = JOptionPane.showInputDialog("Digite a Região do Campeonato");
		 String quadrilha1 = JOptionPane.showInputDialog("Digite a Quadrilha vencedora!");
		 String quadrilha2 = JOptionPane.showInputDialog("Digite o Segundo Lugar!");
		 String quadrilha3 = JOptionPane.showInputDialog("Digite a Terceiro Lugar !");
		 String quadrilha4 = JOptionPane.showInputDialog("Digite a Quarto Lugar!");
		 String quadrilha5 = JOptionPane.showInputDialog("Digite a Quinto Lugar!");
		 
		 
		 String tudo = "NOME DO CAMPEONATO: "+ nome + "\n\nA REGIÃO DO CAMPEONATO É: "+ regiao + 
				"\n\nPRIMEIRA POSIÇÃO: "+ quadrilha1+
				"\n\nSEGUNDA POSIÇÃO: "+ quadrilha2+ 
				"\n\nTERCEIRA POSIÇÃO: "+ quadrilha3+ 
				"\n\nQUARTA POSIÇÃO: "+ quadrilha4+ 
				"\n\nQUINTA POSIÇÃO: "+ quadrilha5;
		
		JOptionPane.showMessageDialog(null, tudo);
		System.exit(0);
		
	}
}