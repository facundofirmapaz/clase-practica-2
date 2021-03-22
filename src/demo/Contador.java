package demo;

public class Contador
{
    private int valor;

    public Contador() { valor = 0; }

    public Contador(int valor) { this.valor = valor; }

    public Contador(Contador c) { this.valor = c.getValor(); }

    public void setValor(int valor) { this.valor = valor; }

    public int getValor() { return valor; }

    public void decremento(int unidad) { valor -= unidad; }

    public void incremento(int unidad) { valor += unidad; }
}
