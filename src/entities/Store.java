package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Store {

    private String name;
    private String email;

    //Exemplo de composição
    private List<Product> products = new ArrayList<>();


    //Composição é quando uma classe possui outra classe como atributo.
    //Pode ser (has-a: tem-um) ou (has-many: tem vários).
    //Usado quando uma classe possui outra classe como parte de seu conjuto.


    public Store() {
    }

    public Store(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Store store = (Store) o;
        return Objects.equals(name, store.name);
    }

    @Override
    public int hashCode() { return Objects.hash(name); }
}
