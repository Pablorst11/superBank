public class Corrente extends Conta {



    private String nomecli;
    private String cpfcli;


    public double saldo() {
        return this.getSaldo();
    }

    public double depositar(double valordep) {
        return valordep;
    }

    public double sacar(double valorsac) {
        return valorsac;
    }

    public void abrirConta() {
        this.setNumbank(001);
        this.setNumero(1234566);

        System.out.println("Sua conta é: " + this.getNumero());
        System.out.println("Sua agência é: " + this.getNumbank());
    }

    
    //Getters e Setters

    public String getNomecli(){
        return nomecli;
    }

    public void setNomecli(String nomecli) {
        this.nomecli = nomecli;
    }

    public String getCpfcli(){
        return cpfcli;
    }

    public void setCpfcli(String cpfcli) {
        this.cpfcli = cpfcli;
    }


}