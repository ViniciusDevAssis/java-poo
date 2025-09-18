package services;

import entities.Person;
import repositories.PersonRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class PersonService {

    private final PersonRepository repository = new PersonRepository();

    public void createPerson(String name, Integer age, String cpf) {
        Person person = new Person(name, age, cpf, null);
        repository.save(person);
        System.out.print("Pessoa cadastrada com sucesso!");
    }

    public List<Person> findAll() {
        return repository.findAll();
    }

    public void updatePerson(Long id, String name, Integer age, String cpf) {
        Optional<Person> optional = repository.findById(id);
        if (optional.isPresent()) {
            Person person = optional.get();
            person.setName(name);
            person.setAge(age);
            person.setCpf(cpf);
            person.setUpdatedAt(LocalDate.now());
            System.out.println("Pessoa atualizada com sucesso!");
        } else {
            System.out.println("Pessoa nao encontrada!");
        }
    }

    public void deletePerson(Long id) {
        Optional<Person> optional = repository.findById(id);
        if (optional.isPresent()) {
            repository.delete(optional.get());
            System.out.println("Pessoa deletada com sucesso!");
        } else {
            System.out.println("Pessoa nao encontrada!");
        }
    }
}
