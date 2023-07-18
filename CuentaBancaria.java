public class CuentaBancaria {
    private int numeroCuenta;
    private int Saldo;

    public CuentaBancaria(int nc, int sal )
    {
        numeroCuenta = nc;
        Saldo = sal;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        numeroCuenta = numeroCuenta;
    }

    public int getSaldo() {
        return Saldo;
    }

    public void setSaldo(int saldo) {
        Saldo = saldo;
    }


}

