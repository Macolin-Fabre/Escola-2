// Macolin Miguel Fabre Melo 2-53

import javax.swing.JOptionPane;
//importar as bibliotecas 
public class ConcatenacaoDeValores {
    
public static void main(String[] args) {
    
//se obtem um valor em string ou seja um caractere
String primeiroValor = JOptionPane.showInputDialog("Digite o primeiro valor ");

String segundoValor = JOptionPane.showInputDialog("Digite o segundo valor ");

String resulatdo = primeiroValor + segundoValor ; 
//mostra em um pop up o resultado
JOptionPane.showMessageDialog(null,"resultado da concatenação  " + resulatdo, "resultado",JOptionPane.INFORMATION_MESSAGE);
}

}
