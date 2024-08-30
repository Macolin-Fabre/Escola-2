//macolin miguel fabre melo 253
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
//exportar as variáveis
public class main{

private static final String FILE_PATH ="usuario.txt";
//arquivo txt
public static void main(String[] args) {
    //bloco de seleção para uma opção
    while (true) {
        String[] options = {"Adicionar Usuário","Atualizar Usuário","Listar Usuários","Sair"};
        int escolha = JOptionPane.showOptionDialog(null,"escolha uma opção","menu", 
        JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[0]);


        switch (escolha) {
        case 0:
        adicionarUsuario();
        break;
        case 1:
        AtualizarUsuario();
        break;
        case 2:
        listarUsuarios();
        break;
        case 3:
        System.exit(0);
        break;

        default:
            JOptionPane.showMessageDialog(null,"Opção invalida" );

            }
        }

    }
//configurando a opção adicionar usuario
private static void adicionarUsuario() {
//coleta de dados
    String nome  = JOptionPane.showInputDialog("Nome");
    String idadeStr = JOptionPane.showInputDialog("Idade");
    int idade = Integer.parseInt(idadeStr);
    String cpf = JOptionPane.showInputDialog("CPF");

    Usuario usuario = new Usuario(nome,idade,cpf);     
//manda pro txt
    try (BufferedWriter Writer = new BufferedWriter(new FileWriter(FILE_PATH))){

        Writer.write(usuario.toString());
        Writer.newLine();
        JOptionPane.showMessageDialog(null,"Usuário adicionadocom sucesso!");
    }catch (IOException e){

e.printStackTrace();    
JOptionPane.showMessageDialog(null, "Erro ao adicionar usuário.");

        }

    }
//configurando a opção atualizar usuario
    private static void AtualizarUsuario(){
//ele trocará as informações 
        String  cpf = JOptionPane.showInputDialog("CPF do usuário a ser atualizado:");

        List<Usuario> usuarios = lerUsuarios();
        boolean encontrado = false;

        for(Usuario usuario :usuarios){

            if(usuario.getCpf().equals(cpf)){

                String nome = JOptionPane.showInputDialog("Novo Nome:");
                String IdadeStr = JOptionPane.showInputDialog("Nova Idade");
                int idade = Integer.parseInt(IdadeStr);

                usuarios.remove(usuario);
                usuarios.add(new Usuario(nome,idade,cpf));
                encontrado  = true;
                break;

            }
        }
        //manda pro txt
        if (encontrado) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))){
                for (Usuario usuario:usuarios){

                writer.write(usuario.toString());
                writer.newLine();

                }
                JOptionPane.showMessageDialog(null,"Usuario atualizado com sucesso.");
            }catch (IOException e ){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erros ao atualizar usuário.");
            }
        
        }else{
        JOptionPane.showMessageDialog(null, "Usuário não encontrado");
        }
    }
    //configura a opção listar usuarios
private static void listarUsuarios(){

List <Usuario> usuarios= lerUsuarios();
if(usuarios.isEmpty()){

    JOptionPane.showMessageDialog(null,"Nenhum usuário encontrado.");
    return;
}
StringBuilder sb = new StringBuilder();
for (Usuario usuario : usuarios){
//quais informações aparecerão na lista
    sb.append("Nome").append(usuario.getNome())
    .append(",idade:").append(usuario.getIdade())
    .append(",CPF:").append (usuario.getCpf()).append("\n");
}
JOptionPane.showMessageDialog(null, sb.toString(),"Lista de usuários",
JOptionPane.INFORMATION_MESSAGE);
}
private static List<Usuario> lerUsuarios(){

    List<Usuario> usuarios = new ArrayList<>();
    try(BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))){
        String linha;
        while ((linha = reader.readLine()) != null) {
            usuarios.add(Usuario.fromString(linha));
        }
    }catch (   IOException e){
            e.printStackTrace();
        }
return usuarios;
    }
}
