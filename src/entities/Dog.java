package entities;

public class Dog extends Animal{

    //Mais um exemplo de polimorfismo, nesse caso sobreposição
    @Override
    public void makeNoise() {
        System.out.println("Au au");
    }
}
