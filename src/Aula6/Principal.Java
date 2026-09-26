import java.util.Scanner;

public class Principal{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Calculos ca = new Calculos();

        System.out.println("Escolha a opção entre 1-4");
        int escolha = scanner.nextInt();


        System.out.println("Digite o primeiro número");
        int n1 = scanner.nextInt();
        ca.setNum1(n1);

        System.out.println("Digite o segundo número");
        int n2 = scanner.nextInt();
        ca.setNum2(n2);

        //Laço case - escolha então
        switch (escolha) {

            case 1:
                System.out.println("Você escolheu soma:" + ca.soma(ca.getNum1(0), ca.getNum2(0)));
                break;


            case 2:
                System.out.println("Você escolheu subtração:" + ca.subtração(ca.getNum1(0), ca.getNum2(0)));
                break;


            case 3:
                System.out.println("Você escolheu multiplicação:" + ca.multiplicação(ca.getNum1(0), ca.getNum2(0)));
                break;


            case 4:
                System.out.println("Você escolheu divisão:" + ca.divisão(ca.getNum1(0), ca.getNum2(0)));
                break;


            default: System.out.println("Nenhuma das opções!");
                break;


        }








    }







}