//Macolin Miguel Fabre Melo 253
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;




public class unificador {

    public static void main(String[] args) {

        // criação do frame principal
        JFrame frame = new JFrame ("menu principal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(470, 370);
        frame.setLayout(new BorderLayout());

        //criação da barra e menu
        JMenuBar menubar = new JMenuBar ();

        //criação do menu
        JMenu menu = new JMenu ("opções");
        menubar.add(menu);

        //criação dos itens do menu

        JMenuItem ColetaDeDadosItem = new JMenuItem("Coleta de dados");
        JMenuItem ConcatenacaoDeValoresItem = new JMenuItem("Concatenação de valores");
        JMenuItem FolhaDePagamentoItem = new JMenuItem("Folha de pagamento");
        JMenuItem mainItem = new JMenuItem("Main");
        JMenuItem MatrizPupUpItem = new JMenuItem("Matriz Pop-up");
        JMenuItem vetorValoresItem = new JMenuItem("Vetor Valores");
        JMenuItem OperacoesMatematicasItem = new JMenuItem("Operações matemáticas");
        JMenuItem DiferencaParaCemItem = new JMenuItem("Diferença pra cem");

        //adicionandoitens ao menu 
        menu.add (ColetaDeDadosItem);
        menu.add(ConcatenacaoDeValoresItem);
        menu.add(FolhaDePagamentoItem);
        menu.add(mainItem);
        menu.add(MatrizPupUpItem);
        menu.add(vetorValoresItem);
        menu.add(OperacoesMatematicasItem);
        menu.add(DiferencaParaCemItem);
        //adicionando actionListener para cada item de menu 

       ColetaDeDadosItem.addActionListener(new ActionListener(){

            @Override 
            public void actionPerformed (ActionEvent e) {
                ColetaDeDados.main(null); //chama o arquivo perguntas_em_popup.java

        }
        
    });

    ConcatenacaoDeValoresItem.addActionListener(new ActionListener() {
        
        @Override
        public void actionPerformed (ActionEvent e ){
            ConcatenacaoDeValores.main(null);
        }
    });

    DiferencaParaCemItem.addActionListener(new ActionListener() {
        
        @Override
        public void actionPerformed (ActionEvent e ){
        DiferencaParaCem.main(null);
        }
    });

        FolhaDePagamentoItem.addActionListener(new ActionListener() {
        
        @Override
        public void actionPerformed (ActionEvent e ){
           FolhaDePagamento.main(null);
        }
    });

    mainItem.addActionListener(new ActionListener() {
        
        @Override
        public void actionPerformed (ActionEvent e ){
           main.main(null);
        }
    });
    MatrizPupUpItem.addActionListener(new ActionListener() {
        
        @Override
        public void actionPerformed (ActionEvent e ){
           MatrizPupUp.main(null);
        }
    });
    OperacoesMatematicasItem.addActionListener(new ActionListener() {
        
        @Override
        public void actionPerformed (ActionEvent e ){
           OperacoesMatematicas.main(null);
        }
    });

   vetorValoresItem.addActionListener(new ActionListener() {
        
        @Override
        public void actionPerformed (ActionEvent e ){
            vetorValores.main(null);
        }
    });



    //adicionando a barra de menu ao frame 

    frame.setJMenuBar(menubar);

    //criação do pianel para o botão de sair 

    JPanel panel = new JPanel();
    JButton sairButton = new JButton("sair"); 

    //adicionando actionListener para o botão de sair 
    sairButton.addActionListener( new ActionListener(){

        @Override
        public void actionPerformed (ActionEvent e){

            System.exit(0); //sai do programa 

            
        }
    });

//adicionando o botão ao painel  

panel.add(sairButton);

// adicionando o painel ao frame 
frame.add(panel, BorderLayout.SOUTH);

//Configurando o franme para se visível 
frame.setVisible(true);
}}