package exercicio1;

public class Conta {
    //atributos ou propriedades ou variaveis de instancia
    String correntista;
    int numero;
    double saldo;

    //metodo para depositar um valor na conta
    public void depositar(double valor){
        saldo += valor;
    }

    //metodo para sacar um valor da conta
    public void sacar(double valor){
        saldo -= valor;
    }
}



