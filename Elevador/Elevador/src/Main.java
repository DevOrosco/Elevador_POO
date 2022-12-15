import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Selecione o elevador que deseja usar: \n 1). Entrada \n 2). Átrio \n 3). Biblioteca");
        int elevadorSelecionado = scan.nextInt();

        switch(elevadorSelecionado){
            case 1:
                Elevador entrada = new Elevador();

                entrada.cor = "Preto";
                entrada.qtdMaxDePessoas = 25;
                entrada.qtdAtualDePessoas = 5;
                entrada.andarAtual = 0;
                entrada.funcionalidades();
                break;

            case 2:
                Elevador atrio = new Elevador();

                atrio.cor = "Preto";
                atrio.qtdMaxDePessoas = 25;
                atrio.qtdAtualDePessoas = 0;
                atrio.andarAtual = 0;
                atrio.funcionalidades();
                break;
            case 3:
                Elevador biblioteca = new Elevador();

                biblioteca.cor = "Preto";
                biblioteca.qtdMaxDePessoas = 25;
                biblioteca.qtdAtualDePessoas = 10;
                biblioteca.andarAtual = 0;
                biblioteca.funcionalidades();
                break;
            default:

                System.out.println("Selecione um elevador válido de 1 a 3");
        }
    }
}