import java.util.Scanner;

public class Elevador {

    String cor;


    int qtdMaxDePessoas = 25;


    int andarAtual=0;


    int andares;


    int qtdAtualDePessoas;



    public static void funcionalidades(){
        System.out.println("Selecione a ação desejada: \n 1). Entrar \n  2). Sair  \n  3). Subir \n  4). Descer");

        Scanner scan = new Scanner(System.in);
        int acao = scan.nextInt();


        switch (acao){

            case 1:
                entrar();
                break;

            case 2:
                sair();
                break;


            case 3:
                subir();
                break;

            case 4:
                descer();
                break;
        }
    }
    public static void entrar(){

        System.out.println("Entrando no Elevador... \n Você está dentro do Elevador");

    }

    public static void sair(){

        System.out.println("Saindo do Elevador... \n Você saiu do Elevador ");

    }

    public static void subir(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Selecione o andar desejado: -1,0,1, 2, 3, 4, 5");
        int andarSelecionado = scan.nextInt();

        System.out.println("Subindo para o andar " + andarSelecionado + "... \n Você chegou ao andar " + andarSelecionado);
    }

    public static void descer(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Selecione o andar desejado: -1,0,1, 2, 3, 4, 5");
        int andarSelecionado = scan.nextInt();

        System.out.println("Descendo para o andar " + andarSelecionado + "... \n Você chegou ao andar " + andarSelecionado);
    }
}

