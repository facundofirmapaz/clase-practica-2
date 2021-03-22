package demo;

public class Fraccion
{
    private int numerador;
    private int denominador;

    public int getDenominador() {
        return denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public Fraccion() {}

    public Fraccion(int numerador, int denominador)
    {
        this.denominador = denominador;
        this.numerador = numerador;
    }

    public Fraccion suma(Fraccion s)
    {
        int numUno, numDos, den;

        den = this.denominador * s.getDenominador();

        numUno = den /this.numerador;
        numDos = den / s.getNumerador();

        return new Fraccion(numUno + numDos, den);
    }

    public Fraccion suma(int s)
    {
        Fraccion sum = new Fraccion(s, 1);

        return this.suma(sum);
    }

    public Fraccion producto(Fraccion p)
    {
        return new Fraccion(this.numerador * p.getNumerador(),
                this.denominador * p.getDenominador());
    }

    public Fraccion producto(int p)
    {
        Fraccion prod = new Fraccion(p, 1);

        return this.producto(prod);
    }

    public Fraccion resta(Fraccion r)
    {
        Fraccion res = r.producto(-1);
        return this.suma(res);

    }

    public Fraccion resta(int r)
    {
        Fraccion aux = new Fraccion(r, 1);
        return this.resta(aux);
    }

    public Fraccion cociente(Fraccion c)
    {
        Fraccion coc = new Fraccion(c.denominador, c.numerador);

        return this.producto(coc);
    }

    public Fraccion cociente(int c)
    {
        return new Fraccion(this.numerador, this.denominador * c);
    }


}
