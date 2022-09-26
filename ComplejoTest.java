public class ComplejoTest {
    public static void main(String[] args) throws Exception {

        Complejo num1 = new Complejo(1.0,1.0);
        Complejo num2 = new Complejo(2.0,2.0);
        
        num2.asignar(3.5, 2.7);

        num1.imprimir();
        System.out.println("numero complejo 1: "+ num1);
        System.out.println("numero complejo 2: "+ num2);
        System.out.println("El resultado de su suma es: ");
        System.out.println(num2.sumar(num1, num2));
    }
}
