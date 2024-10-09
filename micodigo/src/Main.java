public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Cliente instanciaCliente = new Cliente( "26456487-k", "Juan Perez", 37); //Esto es una instancia de la clase Cliente
        Cliente instanciaCliente2 = new Cliente(); //Esto es una instancia de la clase Cliente

        Puerto puerto = new Puerto();

        System.out.println("Instancia de Cliente creada "+ instanciaCliente);
        System.out.println("Instancia de Cliente 2 creada "+ instanciaCliente2);

        System.out.println("Instancia de Puerto creada "+ puerto);


    }
}