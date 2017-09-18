package poo;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    JDialog.setDefaultLookAndFeelDecorated(false);
    Object[] selectionValues = { "Cadastrar novo usuario", "Cadastrar Novo Campeonato",};
    String initialSelection = "Cadastrar novo usuario";
    Object selection = JOptionPane.showInputDialog(null, "\tBATALHAS JUNINAS!!!"
    		+ "\n\nESCOLHA UMA OPÇÃO ABAIXO:",
        "By:Tendel Lopes", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
    
    if(selection == "Cadastrar novo usuario"){
    	CadastrarUsuario ca1 = new CadastrarUsuario();
		ca1.cadastrando();
    }
    else if(selection =="Cadastrar Novo Campeonato"){
    	Campeonato cp1 = new Campeonato();
		cp1.classificacao();
    }
  }
}
