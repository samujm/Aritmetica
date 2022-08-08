package operaciones;

public class Aritmetica {

    //Atributos de la clase
    int a; //Como es un tipo primitivo por default su valor es 0
    int b;

    //Metodo (inicia con minuscula y despues mayuscula)
    public void sumar() { //Void para indicar que no regresa ninguna información
        int resultado = a + b;
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
