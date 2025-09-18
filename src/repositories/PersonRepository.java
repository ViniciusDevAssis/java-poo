package repositories;

import entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonRepository {

    private final List<Person> database = new ArrayList<>();

    public void save(Person person) {
        database.add(person);
    }

    public List<Person> findAll() {
        return database;
    }

    public Optional<Person> findById(Long id) {
        return database.stream()
                .filter(person -> person.getId().equals(id))
                .findFirst();
    }

    public void delete(Person person) {
        database.remove(person);
    }
}
