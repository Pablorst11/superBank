public abstract class Conta {

    private double numero;
    private int numbank;
    private double saldo;


    //Get pega o valor número da conta e Set define o valor do número da conta
    public double getNumero() {
        return numero;
    }
    
    public void setNumero(double numero) {
        this.numero = numero;
    }

    //Get pega o valor numbank da conta e Set define o valor do numbank da conta
    public int getNumbank() {
        return numbank;
    }

    public void setNumbank(int numbank) {
        this.numbank = numbank;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
}