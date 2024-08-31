import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int vitorias;
        int derrotas;

        System.out.println("Informe o numero de vitorias;");
        vitorias = leitor.nextInt();
        System.out.println("Informe o numero de derrotas");
        derrotas = leitor.nextInt();

        calcularRanking(vitorias, derrotas);

    }
    public static void calcularRanking(int vitorias, int derrotas){
        int saldo = vitorias - derrotas;
        String nivel = "-";

        if(saldo < 10){
             nivel = "Ferro";
        }
        else if (saldo > 10 && saldo <= 20 ){
            nivel = "Bronze";
        }
        else if (saldo > 20 && saldo <= 50) {
            nivel = "Prata";
        }
        else if(saldo > 50 && saldo <= 80){
            nivel = "Ouro";
        }
        else if (saldo > 80 && saldo <= 90 ) {
            nivel = "Diamante";
        }
        else if (saldo > 90 && saldo <= 100 ) {
            nivel = "Lendário";
        }
        else if (saldo >= 101) {
            nivel = "Imortal";
        }

        System.out.println("O Herói tem de saldo de " + saldo + " vitorias, e está no nível: " + nivel);

    }
}

