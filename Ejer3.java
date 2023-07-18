public class Ejer3 {
    public static void main(String[]args)
    {
        CuentaBancaria[] CB = new CuentaBancaria[3];

        CB[0] = new CuentaBancaria(1234, 70000);
        CB[1] = new CuentaBancaria(4321, 50000);
        CB[2] = new CuentaBancaria(1111, 80000);

        int saldoMax = 0;

        for(CuentaBancaria cb : CB )
        {
            if(cb.getSaldo() > saldoMax )
            {
                saldoMax = cb.getSaldo();

            }
            System.out.println("Saldo Maximao: " + saldoMax);
        }


    }
}

