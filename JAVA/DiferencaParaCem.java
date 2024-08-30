//macolin miguel fabre melo 253
import javax.swing.JOptionPane;
//importa a biblioteca^^
public class DiferencaParaCem{

public static void main(String[] args) {
    
    int continuar = JOptionPane.YES_OPTION;
    //declarada para fazer o laço de repetição assim podendo parar o laço ^^

      while (continuar == JOptionPane.YES_OPTION){
//criação do laço de repetição ^^
        String input 
= JOptionPane.showInputDialog("Digite um número");
//aqui faz uma pergunta para inserir um numero em String^^
int numero = Integer.parseInt(input);
//aqui ele pega o valor em String e passa para inteiro^^
int diferenca = 100 - numero;
//faz o calculo para se obter a diferença^^
String menssagem = " falta " + diferenca+ " para chegar a 100.";
//parte que vai juntar as informações para demonstrar ao usuari posteriormente 
JOptionPane.showMessageDialog(null,  menssagem);
//parte que demonstra ao usuario quanto falta ^^
continuar = JOptionPane.showConfirmDialog(  null, "Deseja continuar?","continuar",JOptionPane.YES_NO_OPTION);
//aqui pergunta se o usuario quer continuar ou parar

      }  



}

}