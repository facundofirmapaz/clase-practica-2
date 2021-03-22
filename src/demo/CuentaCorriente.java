package demo;

import java.util.spi.CurrencyNameProvider;

public class CuentaCorriente
{
    private double saldo;

    public CuentaCorriente() { saldo = 0; }

    public CuentaCorriente(double s) { saldo = s;}

    public CuentaCorriente(CuentaCorriente c)
    {
        saldo = c.getSaldo();
    }

    public double getSaldo() { return saldo; }

    public void setSaldo(double saldo) { this.saldo = saldo; }

    public void ingreso(double i) { saldo += i; }

    public boolean egreso(double e)
    {
        boolean resp = false;
        if (saldo >= e)
        {
            saldo -= e;
            resp = true;
        }
        return resp;
    }

    public void reintegro(double r) { this.ingreso(r); }

    public static boolean transferencia(CuentaCorriente origen, CuentaCorriente destino, double monto)
    {
        boolean resp =  false;
        if (origen.egreso(monto))
        {
            destino.ingreso(monto);
            resp = true;
        }
        return resp;
    }
}
