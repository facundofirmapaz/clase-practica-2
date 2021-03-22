package demo;

public class Main {

    public static void main(String[] args)
    {
        Fecha fecha = new Fecha(31,3,2021);

        System.out.println(Fecha.correcta(fecha));

        fecha.sumaDias(5);

        System.out.println(fecha.toString());

    }
}
