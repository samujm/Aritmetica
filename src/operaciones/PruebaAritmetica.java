package operaciones;

public class PruebaAritmetica {

    public static void main(String[] args) {
        
        //VARIABLES LOCALES
        //Var solo puede utilizarse cuando trabajamos con variables locales, no en atributos
        var a = 10;
        var b = 2;
        
        miMetodo();
        
        //Constructor vacio
        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("aritmetica1 a: " + aritmetica1.a);
        System.out.println("aritmetica1 b: " + aritmetica1.b);

        //Constructor con argumentos
        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2 a: " + aritmetica2.a);
        System.out.println("aritmetica2 b: " + aritmetica2.b);

        /* aritmetica1.a = 3;
        aritmetica1.b = 2;
        aritmetica1.sumar();
        
        //Se necesita almacenar el valor retornado, por eso se crea la variable resultado
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("Resultado desde la prueba = " + resultado);
        
        resultado = aritmetica1.sumarConArgumentos(5, 8); //Pasando los parametros al metodo
        System.out.println("Resultado usando argumentos = " + resultado);*/
    }
    
    public static void miMetodo(){ //Agregamos static por que el metodo main solo puede llamar metodos staticos
        System.out.println("Otro metodo");
        //a = 10; //La variable se destruye en el otro metodo, no está al alcance de donde fue definida
    }
    
}
