import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException; 
import javax.swing.*;


public class perguntas_em_popup{

    private static final String FILE_PATH = "cadastros2.txt";
public static void main(String[] args) {

//mostra um popup
JOptionPane.showMessageDialog(null, "Você sabe somar?");

int escolha2 =  JOptionPane.showConfirmDialog(null, "vamos ver",

 "confirmação ",JOptionPane.YES_NO_OPTION);//mostra o tipo de seleção ou o tipo do popup
 if (escolha2 == JOptionPane.YES_OPTION) {

    JOptionPane.showMessageDialog(null, "Ótimo");
    
 }

else {

JOptionPane.showMessageDialog(null, "vai ver sim");

}

JOptionPane.showMessageDialog(null, "1+1 quanto é?",
 "menssagem",
JOptionPane.INFORMATION_MESSAGE);

int escolha3 =  JOptionPane.showConfirmDialog(null, "você disse 10",
 "confirmação ",JOptionPane.YES_NO_OPTION);
 if (escolha3 == JOptionPane.YES_OPTION) {

    JOptionPane.showMessageDialog(null, "Ótimo");
    
 }

else {

JOptionPane.showMessageDialog(null, "inimigo do conhecimento");

}

int escolha =  JOptionPane.showConfirmDialog(null, "certeza do resultado",
 "confirmação ",JOptionPane.YES_NO_OPTION);
 if (escolha == JOptionPane.YES_OPTION) {

    JOptionPane.showMessageDialog(null, "Ótimo");
    
 }

else {

JOptionPane.showMessageDialog(null, "tente de novo");

}



int escolha4 =  JOptionPane.showConfirmDialog(null, "1+1 é 10",
 "confirmação ",JOptionPane.YES_NO_OPTION);
 if (escolha4 == JOptionPane.YES_OPTION) {

    JOptionPane.showMessageDialog(null, "você é qualificado");
    
 }

else {

JOptionPane.showMessageDialog(null, "você não é qualificado");

}

JOptionPane.showMessageDialog(null, "São números bínarios");

}



}
