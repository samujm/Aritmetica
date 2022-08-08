package operaciones;

public class Aritmetica {

    //Atributos de la clase
    int a; //Como es un tipo primitivo por default su valor es 0
    int b;
    
    //Constructor vacio 
    //Solo se manda llamar cuando creamos nuestro objeto cuando ocupamos la palabra new
    //Solo esta sirviendo para reservar espacio en memoria
    //NOTA: EL CONSTRUCTOR VACIO SOLO LO CREA EL COMPILADOR SI NO SE HA CREADO NINGUN OTRO CONSTRUCTOR, EN TODO CASO NO LO CREA Y CAUSA ERROR, AQUI SE CREO EL SIGUIENTE DE ABAJO
    public Aritmetica(){ //Se llama igual que la clase, no regresa ningun tipo de dato
        System.out.println("Ejecutanto constructor");
    }
    
    //Sobrecarga de constructores
    //tiene que ver con agregar dos o mas constructores a nuestra clase
    public Aritmetica(int a, int b){ //var no se puede utilizar para definir metodos
        this.a = a;
        this.b = b;
    }
    
    
    //Metodo (inicia con minuscula y despues mayuscula)
    public void sumar() { //Void para indicar que no regresa ninguna información
        int resultado = this.a + this.b;
        System.out.println("Resultado = " + resultado);
    }

    
    public int sumarConRetorno() { //Va a regresar un entero
//        int resultado = a + b;
//        return resultado;
        return (this.a + this.b);
    }
    
    
    public int sumarConArgumentos(int a/*arg1*/, int b/*arg2*/){ //Recibiendo Argumentos, información que va a recibir el metodo
        //EL ARGUMENTO A SE ASIGNA AL ATRIBUTO THIS.A
        this.a = a/*arg1*/; //this es opcional, esto hace referencia a un atributo de nuestra clase y no un metodo independiente de nuestra clase
        this.b = b/*arg2*/;
        //return a + b;
        return this.sumarConRetorno();
    }
}
