public class usuario {
    private String nome;
    private int idade;
    private String cpf;
    
    public usuario (String nome, int idade, String cpf) {

        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf ;


    }

    public String getNome(){

            return nome;
    }

    public int getIdade(){
        return idade;

    }

    public String getCpf(){

        return cpf;
    }
}
