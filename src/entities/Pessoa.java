package entities;

import java.time.LocalDateTime;
import java.util.Objects;

public class Pessoa {

    private String name;
    private String age;
    private String cpf;

    //Não pode ser alterado, por isso não tem setter
    private final LocalDateTime createdAt = LocalDateTime.now();

    public Pessoa() {
    }

    public Pessoa(String name, String age, String cpf) {
        this.name = name;
        this.age = age;
        this.cpf = cpf;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAge() { return age; }
    public void setAge(String age) { this.age = age; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public LocalDateTime getCreatedAt() { return createdAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(name, pessoa.name);
    }

    @Override
    public int hashCode() { return Objects.hash(name); }

    @Override
    public String toString() {
        return "Pessoa { " +
                "name= " + name +
                ", age= " + age +
                ", cpf= " + cpf +
                " }";
    }
}
