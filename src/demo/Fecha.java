package demo;

import java.time.LocalDate;

public class Fecha
{
    private int dia;
    private int mes;
    private int anio;

    public int getAnio() {
        return anio;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Fecha() {}

    public Fecha (int dia, int mes, int anio)
    {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    @Override
    public String toString() { return dia +"/"+ mes +"/"+ anio; }

    public static boolean correcta(Fecha fecha)
    {
        boolean resp;

        try
        {
            LocalDate fec = LocalDate.of(fecha.getAnio(),
                                         fecha.getMes(),
                                         fecha.getDia());
            resp = true;
        }
        catch (Exception e)
        {
            resp = false;
        }

        return resp;
    }

    public void sumaDias(int dias)
    {
        LocalDate fec = LocalDate.of(this.getAnio(),
                                     this.getMes(),
                                     this.getDia());

        LocalDate aux = fec.plusDays(dias);

        this.dia = aux.getDayOfMonth();
        this.mes = aux.getMonthValue();
        this.anio = aux.getYear();
    }
}
