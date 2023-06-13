public class TestPolimorfismo
{
    public static void main(String[] args)
    {
        Vaca daisy = new Vaca();
        Animal animal = new Vaca();
        Serpiente serpiente = new Serpiente();

        System.out.println("daisy dice: " + daisy.hablar());
        System.out.println("animal dice: " + animal.hablar());
        System.out.println("serpiente dice: " + serpiente.hablar());
    }
}