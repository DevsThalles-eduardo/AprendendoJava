package ContaBancaria;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public void setTitular(String titular){
        this.titular = titular;
    }
    public String getTitular() {
        return titular;
    }

    public double setSaldo(double saldo) {
      return this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public double depositar(double valor){

       double saldoAtual = getSaldo() + valor;
        return setSaldo(saldoAtual);
    }
    public double sacar(double valor){

        double saldoAtual = getSaldo() - valor;
       return setSaldo(saldoAtual);
    }

    public void apresentar(){
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: "+ getSaldo() + "R$");

    }


}
