//macolin miguel fabre melo 253
import javax.swing.JOptionPane;
//importa a biblioteca
public class MatrizPupUp {

    public static void main(String[] args) {
        //indica o numero de linhas que a matriz terá
        String inputLinhas = JOptionPane.showInputDialog("insira o número de lihnas da matriz:");
        //passa os valores para inteiro
        int linhas = Integer.parseInt(inputLinhas);
        //indica quantas colunas a matriz terá
        String inputColunas = JOptionPane.showInputDialog("insira o número de colunas de matriz ");
        //passa o valor para inteiro
        int colunas =  Integer.parseInt(inputColunas);
        //cria a matriz
        int [][] matriz = new int [linhas][colunas ];
        //cria o laço de repetição
        for (int i =0; i < linhas ; i++) {
            for  (int j = 0 ; j<colunas; j++ ){
                //insere os dados na matriz
        String inputValor = JOptionPane.showInputDialog("insira o valor para a posição ["+i+"]["+j+"]:") ;
        matriz [i][j] = Integer.parseInt(inputValor);

            }

        }
        //monta a matriz 
        StringBuilder matrizStr = new StringBuilder("Matriz preenchida:\n");
        for(int i = 0; i<linhas ;i++ ){

            for(int j = 0 ; j<colunas;j++){
                matrizStr.append(matriz[i][j]).append(" ");
            

            }
            //quebra a linha 
       matrizStr.append("\n");
        }
        //exibe a matriz 
        JOptionPane.showMessageDialog(null,matrizStr.toString());
    }
    
}
