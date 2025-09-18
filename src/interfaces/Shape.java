package interfaces;


//Interfaces são usadas para definir um contrato
//ou seja, uma classe que implementa uma interface
//tem que implementar todos os métodos da interface
public interface Shape {


    //Interfaces não podem ter implementação

    //As classes que implementam uma interface devem implementar todos os métodos da interface
    //Eles devem ter a mesma assinatura, mas podem ter implementação diferente
    public double area();
    public double perimeter();

    default void printArea() {
        System.out.println("Area: " + area());
    }
}
