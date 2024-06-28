import java.util.Scanner;

public class NomesRepetidos {

    public static void main(String[] args) {

        //Aula passada foi sobre o uso de funções e laço de repetição While

        Scanner leitor = new Scanner(System.in);
        String nome;
        int quantidadeDeRepeticao;

        System.out.println("Qual o seu nome? ");
        nome = leitor.nextLine();

        System.out.println("Quantas vezes repetir o seu nome? ");
        quantidadeDeRepeticao = leitor.nextInt();

        int x = 0;
        while(x < quantidadeDeRepeticao){
            System.out.println(x + " - " + nome);
            x = x + 1;
        }
        System.out.println("A C A B O U!");
    }

}
