//entidad Cuenta:

class Cuenta{

    private double saldo;
    int agencia;
    int numero;
    Cliente titular = new Cliente();

//void no retorna valor
    public void depositar(double valor) {
        saldo += valor;
    }
//boolean retorno valor, por eso marca el error
    public boolean retirar (double valor){
        if (saldo >= valor){
            saldo -= valor;
            return true;
        }
        return false;
        }
    
    public boolean transferir (double valor, Cuenta cuenta){
        if(saldo >= valor){
            saldo -= valor;
            cuenta.depositar(valor);
            return true;
        }
        return false;
    }
}

