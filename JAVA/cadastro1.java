
//Macolin
//Turma:253

import java.util.Scanner;

// isoo para o scanner funcionar

public class cadastro1 {
public static void main(String[] args) {

    //esses são sintaxes para rodar o codigo

        Scanner leia = new Scanner (System.in);

        String nome,sobrenome,rg,genero = "",endereco,cpf;
        char sexo;
        float salario;
    
        // aqui são declaradas as variaveis

            System.out.println("Digite seu nome ");
            nome = leia.nextLine();

            System.out.println("Digite seu sobrenome ");
            sobrenome = leia.nextLine();

            System.out.println("Digite seu cpf: ");
            cpf = leia.nextLine();

            System.out.println("Digite seu endeço: ");
            endereco = leia.nextLine();


            System.out.println("Digite seu salario: ");
            salario = leia.nextFloat();

            System.out.println("Digite seu rg: ");
            rg = leia.nextLine();

            System.out.println("Digite seu sexo [M] ou [F]");
            sexo = leia.nextLine().charAt(0);

            // essas são as sintaxes para fazer que apareça algo para o usuario que ira rodar o codigo

                if (sexo == 'M' || sexo == 'm') {

                    genero = "Masculino";
                    
                }

                else if (sexo == 'F'  || sexo == 'f') {

                    genero = "Feminino";

                }

                else {
                    genero = "indefinido";

                }

                // essas são as sintaxes para definir qual genero usuario ira escolher 
    
                        System.out.println("nome: "+nome);
                        System.out.println("sobrenome: "+sobrenome);
                        System.out.println("sexo:  "+genero);
                        System.out.println("cpf: "+cpf);
                        System.out.println("endereço: "+endereco);
                        System.out.println("salario: "+salario);
                        System.out.println("rg: "+rg);

                        // essas sintaxes são para dar o resultado para o usuario

    }
}


