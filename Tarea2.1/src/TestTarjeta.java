/* */
/* @author Katherine*/

public class TestTarjeta {
    public static void main(String[] args) {
        
        Tarjeta tarjetita=new Tarjeta();
        
  //*Utilizamos GET porque no haremos ningun cambio.
  //*Es decir, solo queremos el estado del atributo.
        tarjetita.getNombreDeCliente(); 
        System.out.println("Tu nombre es: " + tarjetita.getNombreDeCliente());
        
        tarjetita.setNumeroDeTarjeta(-11369272);
        System.out.println("Tu numero de tarjeta es: " + tarjetita.getNumeroDeTarjeta());
        
       }
}
