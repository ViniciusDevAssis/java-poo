package controllers;

import entities.Person;
import services.PersonService;

import java.util.Scanner;

public class PersonController {
    public static void main(String[] args) {
        final PersonService service = new PersonService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=====Menu=====");
            System.out.println("1- Cadastrar Pessoa");
            System.out.println("2- Listar todos");
            System.out.println("3- Atualizar Pessoa");
            System.out.println("4- Deletar Pessoa");
            System.out.println("0- Sair");
            System.out.print("Digite sua opcao: ");

            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Nome: ");
                    String name = sc.nextLine();
                    System.out.print("Idade: ");
                    Integer age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();
                    service.createPerson(name, age, cpf);
                    break;
                case 2:
                    System.out.println("Pessoas cadastradas:");
                    for (Person person : service.findAll()) {
                        System.out.println(person);
                    }
                    break;
                case 3:
                    System.out.println("Id: ");
                    Long id = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Novo nome: ");
                    String newName = sc.nextLine();
                    System.out.print("Nova idade: ");
                    Integer newAge = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Novo CPF: ");
                    String newCpf = sc.nextLine();
                    service.updatePerson(id, newName, newAge, newCpf);
                    break;
                case 4:
                    System.out.println("Id: ");
                    Long idDelete = sc.nextLong();
                    sc.nextLine();
                    service.deletePerson(idDelete);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opcao invalida!");
            }
        }
    }
}
