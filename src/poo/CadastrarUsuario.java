package poo;
import javax.swing.JOptionPane;

public class CadastrarUsuario extends Usuario {
	String Uadmin;
	String Udefault;
	
	public void cadastrando() {
		
		Usuario u1 = new Usuario();
		
		u1.nome = JOptionPane.showInputDialog("Digite seu Nome");
		u1.quadrilha = JOptionPane.showInputDialog("Digite sua Quadrilha");
		u1.regiao = JOptionPane.showInputDialog("Digite sua Regi�o");
		
		String tudo = "Seu Nome �: "+ u1.nome + "\nSua Quadrilha �: "+ u1.quadrilha+ 
				"\nSua Regi�o �: "+ u1.regiao + "\n\n Aperte Ok para abrir o Cadastro de Campeonatos!";
		
		JOptionPane.showMessageDialog(null, tudo);
		
		
		Campeonato c2 = new Campeonato();
		c2.classificacao();
	}
}