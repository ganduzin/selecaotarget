import java.util.Scanner;

public class PerguntaDois {
    
   public static void main(String[] args){

    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Digite o número a ser pesquisado: ");
        int numeroAPesquisar = Integer.parseInt(scanner.nextLine());

        int primeiroFib = 0;
        int segundoFib = 1;
        while (primeiroFib < numeroAPesquisar) {

            primeiroFib = segundoFib + primeiroFib;
            segundoFib = primeiroFib + segundoFib;

        }

        if (primeiroFib == numeroAPesquisar){
            System.out.println("O número " + numeroAPesquisar + " pertence a sequência de Fibonacci");
        }else{
            System.out.println("O número " + numeroAPesquisar + " NÃO pertence a sequência de Fibonacci");
        }
    } catch (NumberFormatException e) {
        System.out.println("Digite um número válido");
    }

   }
}
