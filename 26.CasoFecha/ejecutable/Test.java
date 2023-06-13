package ejecutable;
import modelo.Fecha;
import modelo.FechaDetallada;
import modelo.MuestraConjunto;

public class Test
{
    public static void main(String[] args)
    {
        Object[] arr = {new Fecha(2,10,1970), new FechaDetallada(23,12,1948), new String("Esto es una cadena"), new Integer(34)};

        // Como el método es estático lo invocamos a través de la clase
        MuestraConjunto.mostrar(arr);
    }
}