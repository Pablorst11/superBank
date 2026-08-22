
public class Poupanca extends Conta implements IContas, ICliente  {


    public double saldo() {

        return this.getSaldo();             //pegando do abstract

    }

    public double depositar(double valor) {
        return valor;
    }

    public double sacar(double valor) {
        return valor;
    }

    public void abrirConta() {


        Corrente corr = new Corrente();

        corr.setNumbank(001);
        corr.setNumero(1234566);
        corr.setSaldo();                //pegou da classe corrente

        //Dados Cliente
        System.out.println("Seu banco é: " + corr.getNumbank() + "\n Sua conta Poupança é: " + corr.getNumero() + "\n Nome do cliente: " + corr.getNomecli() + "\n CPF do cliente: " + corr.getCpfcli());



    }-



}