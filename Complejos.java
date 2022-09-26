/**
 * Complejo
 * Construir una clase Complejo con dos atributos:
dPReal: parte real de tipo double
dPImag: parte imaginaria también de tipo double 

y los constructores necesarios y tres métodos:
 public void asignar(double x, double y)
 public Complejo sumar(Complejo c1, Complejo c2)
 public void imprimir
Construir una clase ComplejoTest que contenga un método principal que
trabaje con instancias de la clase Complejo y realice la prueba de los distintos
métodos.
Incluye una imagen llamada ComplejoTestPrueba.jpg que sea un pantallazo de
la ejecución.
Será necesario entregar el enlace a github 

 */
public class Complejo {
     /*Autor: Andrés Felipe Guzmán Ramírez */
     /* Atributos */

     /**
     *Un número complejo, es una entidad matemática que viene dada por un par de números reales, 
        el primero a se denomina la parte real y al segundo b la parte imaginaria.
     */
    protected double dPReal;
    protected double dPImag;
    

      /* Constructores */

    public Complejo(double x, double y) {
        this.dPReal = x;
        this.dPImag = y;
    }

    public Complejo(){

        
    }
 
       /* Métodos */
    
    /**
     * @param x da valor a la parte real
     * @param y da valor a la parte imaginaria
     */
    public void asignar(double x, double y){
        dPReal=x;
        dPImag=y;
    }
    /**
     * 
     */
    public void imprimir() {
        
        System.out.println(dPReal + "," + dPImag); 
    }

    public double getdPReal() {
        return dPReal;
    }

    public double getdPImag() {
        return dPImag;
    }

    public void setdPReal(double dPReal) {
        this.dPReal = dPReal;
    }

    public void setdPImag(double dPImag) {
        this.dPImag = dPImag;
    }

    public String toString() {
        return dPImag + "," + dPReal ;
    }

    public Complejo sumar(Complejo c1 , Complejo c2){
        /* (a, b) + (c, d) = (a + c, b + d) */

            Complejo resultado = new Complejo();
            resultado.dPReal = c2.dPReal + c1.dPReal;
            resultado.dPImag = c2.dPImag + c1.dPImag;
            
            return resultado;
    }

       
    
}
