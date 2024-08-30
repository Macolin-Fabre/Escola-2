//Macolin Miguel Fabre Melo 253 
import javax.swing.JOptionPane;
//importA  as bibliotecas 
public class OperacoesMatematicas {

    public static void main(String[] args) {
        try{ 
//try tenta fazer 
                String primeiroNumeroString = JOptionPane.showInputDialog("Digite o primeiro número ingteiro ou flutuante ");
                double primeiroNumero = Double.parseDouble(primeiroNumeroString);
// pega um numero em string e converte ele para double ou seja numero com virgula
                
                String segundoNumeroString = JOptionPane.showInputDialog("Digite o segundo numero inteito ou flutuate");
                Double segundoNumero = Double.parseDouble(segundoNumeroString);
// pega um numero em string e converte ele para double ou seja numero com virgula
                Double soma = primeiroNumero + segundoNumero ;
                Double subtracao = primeiroNumero - segundoNumero;
                Double multiplicacao = primeiroNumero * segundoNumero;
                Double divisao = (segundoNumero != 0)
                ? primeiroNumero / segundoNumero : Double.NaN ;// evita divisão por zero 

                //faz as operaçoes 

                String menssagem = String.format ("resultado das operações entre %.2f e %.2f: \n",primeiroNumero,segundoNumero);
                menssagem += String.format("soma: %.2f\n", soma );
                menssagem += String.format("subtração %.2f\n", subtracao );
                menssagem += String.format ("multiplicação %.2f\n" , multiplicacao);
                menssagem += String.format("Divisão %s\n", (segundoNumero != 0 ) ? String.format("%.2f", divisao):"indefinida (divisão por zero)");
                
                //saida das informaçoes demonstrada por um pop-up
                JOptionPane.showConfirmDialog(null, menssagem, "Resultado das operações", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e ){

            JOptionPane.showMessageDialog(null, "Por favor , insira um número válido ", "Erro de entrada ", JOptionPane.ERROR_MESSAGE);

        }


        }

    }
    


