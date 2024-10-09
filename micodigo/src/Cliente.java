public class Cliente {
    String rut;
    String nombre;
    int edad;


    public Cliente(){
    }

    public Cliente(String rut,String nombre,int edad){
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;

    }


    @Override
    public String toString(){
        return "Cliente: "+nombre+" Rut:"+rut+" Edad:"+edad;
    }
}

//El constructor se llama siempre igual que la clase
//Un Constructor puede o no ser parametrizado
//ToString muestra la clase y la posicion de memoria donde se encuentra ese objeto
//El espacio entre dos llaves se llama ambito.
//Colision de nombres es cuando 2 variables que son diferentes tienen el mismo nombre
//This se refiere a mi atributo