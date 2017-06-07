import java.util.Scanner;

public class Program {
    static Scanner scanner = new Scanner(System.in);
    static AgendaSemanal agenda;

    public static void main(String[] args){
        System.out.println("Bem-vindo à agenda");

        int opcao = mostrarMenPrincipal();
        MesSemana ma = pedirMesSemana();

        switch(opcao){
            case 1: 
                agenda = new AgendaSemanal(ma.mes, ma.semana);
                break;
            case 2:
                // Carregar a agenda
                break;
        }

        System.out.println("Agenda carregada com sucesso!");

        int op = exibirSegundoMenu();
    }

    public static int exibirSegundoMenu() {
        int opcao = 0;

        while(opcao < 1 || opcao > 2) {
            System.out.println("Escolha uma das opções\n");

            System.out.println("1 - Exibir toda a agenda");
            System.out.println("2 - Marcar consulta");

            String input = scanner.next();
            if(IntegerExtension.isSafeToParse(input)){
                opcao = Integer.parseInt(input);
            }
        }

        return opcao;
    }

    public static MesSemana pedirMesSemana() {
        int mes = 0;
        while(mes < 1 || mes > 12) {
            System.out.println("Escolha o mês:");

            String input = scanner.next();
            if(IntegerExtension.isSafeToParse(input)){
                mes = Integer.parseInt(input);
            }
        }

        int semana = 0;
        while(semana < 1 || semana > 52) {
            System.out.println("Escolha a semana:");

            String input = scanner.next();
            if(IntegerExtension.isSafeToParse(input)){
                semana = Integer.parseInt(input);
            }
        }

        return new MesSemana(mes, semana);
    }

    public static int mostrarMenPrincipal(){
        int opcao = 0;

        while(opcao < 1 || opcao > 2) {
            System.out.println("Escolha uma das opções\n");

            System.out.println("1 - Criar agenda");
            System.out.println("2 - Exibir agenda");

            String input = scanner.next();
            if(IntegerExtension.isSafeToParse(input)){
                opcao = Integer.parseInt(input);
            }
        }

        return opcao;
    }
}

class MesSemana {
    public int mes;
    public int semana;

    public MesSemana(int mes, int semana){
        this.mes = mes;
        this.semana = semana;
    }
}