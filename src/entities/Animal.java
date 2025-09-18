package entities;

//Classe abstrata não pode ser instanciada
//As principais vantagens de usar classes abstratas são:
//1. Forçar que as classes filhas implementem certos métodos
//2. Permitir a criação de métodos com implementação padrão
//3. Reaproveitar código
public abstract class Animal {

    //Função abstrata não pode ter implementação
    public abstract void makeNoise();
}
