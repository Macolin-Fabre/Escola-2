import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException; 
import javax.swing.*;
import java.util.Scanner;


public class cadastro_popup {
    
private static final String FILE_PATH = "cadastros.txt";
    public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);
//
        while (true) {

            //mostra um popup e coleta um dado
            String nome = JOptionPane.showInputDialog(null, "Digite seu nome ", 
            "cadstro de usuário", JOptionPane.PLAIN_MESSAGE); 
            if (nome == null || nome.trim().isEmpty() ) {


                //demonstra um erro

                JOptionPane.showMessageDialog(null , "nome não pode ser vazio!","erro",JOptionPane.ERROR_MESSAGE);
                continue;
                
            }
            String sobrenome = JOptionPane.showInputDialog(null, "Digite seu sobrenome ", "cadastro de usuário", 
            JOptionPane.PLAIN_MESSAGE);
            if (sobrenome == null || nome.trim().isEmpty() ) {



                JOptionPane.showMessageDialog(null , "sobrenome não pode ser vazio!","erro",JOptionPane.ERROR_MESSAGE);
                continue;
            
        }
        String[] opcoeSexo = {"Masculino", "Feminino","outro"};
        String sexo = (String) JOptionPane.showInputDialog(null, "Digite seu sexo ", "cadastro de usuário",
         JOptionPane.PLAIN_MESSAGE,null , opcoeSexo, opcoeSexo[0]);
        if (sexo == null  ) {

            JOptionPane.showMessageDialog(null , "sexo deve ser selecionado","erro",JOptionPane.ERROR_MESSAGE);
            continue;

        }
        

        String cpf = JOptionPane.showInputDialog(null,"Digite seu cpf" , "Cadatro de usuário",
        JOptionPane.PLAIN_MESSAGE);
        
        if (cpf == null) {

            JOptionPane.showInternalMessageDialog(null , "cpf não pode estar vazio", "erro", JOptionPane.ERROR_MESSAGE);
            
        }
         

        String endereco = JOptionPane.showInputDialog(null ,
         "Informe seu endereço",
         "Cadastro usuário",JOptionPane.PLAIN_MESSAGE);

         if (endereco == null) {


        JOptionPane.showInputDialog(null, "endereço não pode estar vazio",
         "Erro", JOptionPane.ERROR_MESSAGE);

            
         }
         String rg = JOptionPane.showInputDialog(null,
          "Informe seu RG",
          "cadastro usuário " ,JOptionPane.PLAIN_MESSAGE);
          
          if (rg == null) {

            JOptionPane.showInputDialog(null ,"RG não pode estar vazio ",
            "Erro" , JOptionPane.ERROR_MESSAGE);
            
          }
          String idade = JOptionPane.showInputDialog(null,
          "Informe sua idade: ",
          "cadastro usuário " ,JOptionPane.PLAIN_MESSAGE);
          
          if (idade == null) {

            JOptionPane.showInputDialog(null ,"a idade não pode estar vazia ",
            "Erro" , JOptionPane.ERROR_MESSAGE);

          }



            salvarCadastro (nome,sobrenome,sexo,cpf,idade,rg,endereco);

            int resposta = JOptionPane.showConfirmDialog(null, "Deseja cadstrar outra pessoa?", "continuar", 
            JOptionPane.YES_NO_OPTION);
            
            if (resposta  == JOptionPane.NO_OPTION ) {

                break;
        

    }

}}

    public static String getFilePath() {
        return FILE_PATH;
    }

    //abaixo envia os dados coletados para um arquivo do tipo txt
    //lembrar de colocar todos os nomes certos

private static void salvarCadastro (String nome, String sobrenome , String sexo ,String cpf, String idade , String rg , String  endereco ){

    try (BufferedWriter writer = new BufferedWriter(new FileWriter (FILE_PATH,true))){


writer.write(nome + "," + sobrenome + "," +sexo + "," + cpf + "," + idade + "," + rg+ "," +endereco);
writer.newLine();
JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!" , "Sucesso!" , JOptionPane.INFORMATION_MESSAGE );

    }
catch (IOException e) {

JOptionPane.showMessageDialog(null, "Erro ao salvar dados!" , "Erro" , JOptionPane.ERROR_MESSAGE);

}

}
}