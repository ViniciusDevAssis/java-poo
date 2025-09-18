package application;

import entities.Animal;
import entities.Cat;
import entities.Dog;

public class AnimalTest {
    public static void main(String[] args) {
        Animal rex = new Dog();
        Animal kitty = new Cat();


        //O makeNoise() é polimórfico
        //Ele pode assumir diferentes comportamentos dependendo do objeto que o invoca
        rex.makeNoise();
        kitty.makeNoise();

    }
}
