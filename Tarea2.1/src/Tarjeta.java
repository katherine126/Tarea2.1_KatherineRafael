/*En esta clase Tarjeta implementaremos dos atributos: int NumeroTarjeta y
char NombreCliente, crear los metodos y get set correspondientes a cada
atributo. ¿Que se tendría que hacer para que siempre el nombre Juan
aparezca cuando no se le asigne nombre a un objeto de tipo tarjeta?*/

/* @author Katherine */

public class Tarjeta {
    
/*Para que me aparezca Juan como default en el NombreCliente lo declaro
 en el constructor ya que recordé que su función es crear
 objetos e INICIALIZAR sus atributos a su valor de DEFECTO.
 Tambien hay que recordar que se tiene que hacer antes de declarar los
 atributos.*/
    public Tarjeta(){
        NombreCliente="Juan";
    }
    /*Creamos los atributos correspondientes*/
    private int NumeroTarjeta;
    private String NombreCliente;
    
    /*Creamos los metodos GET y SET correspondientes a cada atributo*/
    
    public int getNumeroDeTarjeta(){
    return NumeroTarjeta;
    }
    
    public void setNumeroDeTarjeta(int NumeroTarjeta){
        this.NumeroTarjeta= NumeroTarjeta;
    }
    
    public String getNombreDeCliente(){
        return NombreCliente;
    }
    
    public void setNombreDeCliente(String NombreCliente){
        this.NombreCliente= NombreCliente;
    }
    
   }
