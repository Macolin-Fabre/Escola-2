//macolin miguel fabre melo 253

//importa a biblioteca dos pop-up
import javax.swing.JOptionPane;

public class vetorValores {
    public static void main(String[] args) {
        //declaração do vetor delimitado por 5 casas
        String[] valores = new String[4];
//criação do laço de repetição 
        for (int i = 0; i< valores.length; i++){

valores [i] = JOptionPane.showInputDialog("Digite o valor " + (i+1) + ":");
//ele monta uma fração da saída
        }

        StringBuilder menssagem = new StringBuilder("Valores Digitados:\n");
        //ele monta outra fração da saída
        for(int i = 0; i < valores.length; i++){

        
            //junta tudas as informsções  e forma a saída 
            menssagem.append("Valor ").append(i + 1).append(": ").append(valores[i]).append("\n");
        }

        JOptionPane.showMessageDialog(null, menssagem.toString(),"valores digitados",JOptionPane.INFORMATION_MESSAGE);
        //exibe a saída em pop-up
    }
}
