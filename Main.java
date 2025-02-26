
import java.util.Scanner;
public class  Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Utils utils = new Utils();
        System.out.println("Selecione uma das opcoes abaixo:");
        System.out.println("1. Multiplicação de dois números naturais");
        System.out.println("2. Soma de dois números naturais");
        System.out.println("3. Cálculo de 1 + 1/2 + 1/3 + 1/4 + ... + 1/N");
        System.out.println("4. Inversão de uma string");
        System.out.println("5. Gerador da sequência");
        System.out.println("6. Gerador de Sequência de Ackerman");
        System.out.println("7. Soma e o produto dos elementos do vetor");
        System.out.println("8. Palíndromo");
        System.out.println("9. Combinações com as n primeiras letras do alfabeto");
        System.out.println("0. Sequência de Fibonacci generalizad");

        int opcao = utils.escolha(sc, 7);

        utils.limpaConsole();

        switch (opcao) {
            case 1:
                multiplica();
                break;
            case 2:
                soma();
                break;
            case 3:
                divide();
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 0:
                break;
            default:
                System.out.println("Opcão inválida");
        }
        sc.close();
    }

    private static void multiplica(){
        
        Recursao _recursao = new Recursao();
        Scanner sc = new Scanner(System.in);
            System.out.println("Informe o primeiro numero : ");
            int n1 = sc.nextInt();

            System.out.println("Informe o segundo numero: ");
            int n2 = sc.nextInt();
        System.out.println(_recursao.multiplica(n1,n2,n1));
        sc.close();
    }

    private static void soma(){
        
        Recursao _recursao = new Recursao();
        Scanner sc = new Scanner(System.in);
            System.out.println("Informe o primeiro numero : ");
            int n1 = sc.nextInt();

            System.out.println("Informe o segundo numero: ");
            int n2 = sc.nextInt();
        System.out.println(_recursao.soma(n1,n2));
        sc.close();
    }
    private static void divide(){
        
        Recursao _recursao = new Recursao();
        Scanner sc = new Scanner(System.in);
            System.out.println("Informe o  numero : ");
            double n1 = sc.nextInt();
        System.out.println(_recursao.divide(n1,0, n1 - 1));
        sc.close();
    }
}