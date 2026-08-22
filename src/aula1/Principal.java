import java.util.Scanner;

public class Principal (

public static void main(String[] args){

    Scanner teclado = new Scanner(System.in);

    //Iniciando o objeto da classe conrrente
    Corrente corrente = new Corrente();

    //Criando o digite seu nome

    System.out.println("Digite seu Nome");

    String nome = teclado.nextline();
    corrente.setNomecli(nome);

    //Criando o digite CPf

    System.out.println("Digite seu CPF");

    String cpf = teclado.nextline();
    corrente.serCpfcli(cpf);

    corrente.abrirConta();
}

)