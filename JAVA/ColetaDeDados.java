//Macolin Miguel Fabre Melo 253 
import javax.swing.JOptionPane;
//traz uma biblioteca 
public class ColetaDeDados{

public static void main (String[]args){

    String texto = JOptionPane.showInputDialog("Digite um valor para \n uma variável do tipo \n String texto:");

//coleta um valor em caractere 
    int inteiro = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro, numero indivisivel sem virgula"));

//coleta um valor em interiro
    double pontoFlutuante = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero real ou dseja com virgula é divisvel"));

//coleta um valor real ou seja cim virgula
    int respostaBoolean = JOptionPane.showConfirmDialog(null, "\"escolha uma opção para \n uma variavel tipo Boolean \n",
    "escolha", JOptionPane.YES_NO_OPTION);

    // coleta um valor boolean ou seja verdadeiro ou falso
    boolean booleano = (respostaBoolean == JOptionPane.YES_OPTION);

    //mostra os valores adquiridos 
    String menssagem = String.format ("var. String: %s\nvar . inteiro: %d\nvar , Float/real: %.2f\nvar . booleana: %b",
    texto , inteiro, pontoFlutuante, booleano);

    JOptionPane.showMessageDialog(null, menssagem,"Dados inseriodos", JOptionPane.INFORMATION_MESSAGE);



}
}
