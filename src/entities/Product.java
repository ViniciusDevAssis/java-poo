package entities;

import java.util.Objects;

//Classe é a representação de um objeto no mundo real.
//Todas as classes do Java herdam da classe Object.
public class Product {

    //Atributos são as características de um objeto.
    //Um objeto não deve ter atributos públicos.
    private String name;
    private Double price;
    private Integer quantity;

    //Produto é uma classe que representa um produto com nome, preço e quantidade.
    //O Objeto Produto pode ser usado em um sistema de gerenciamento de estoque ou vendas etc.

    //Encapsulamento
    /*Palavras como private, public, protected são modificadores de acesso, usadas
    para definir o nível de acesso dos atributos e métodos de uma classe.*/

    //private: acessível apenas dentro da própria classe ou de uma instanciação.
    //public: acessível de qualquer lugar.
    //protected: acessível dentro da classe e subclasses.
    //default: acessível dentro do pacote.


    public Product() {
    /*É uma convenção em Java criar um construtor padrão (sem parâmetros)
    para permitir a criação de objetos sem inicializar os atributos imediatamente.*/
    }


    //O Construtor com parâmetros permite inicializar os atributos do objeto no momento da criação.
    public Product(String name, Double price, Integer quantity) {
        //A palavra-chave "this" é usada para diferenciar os atributos da classe dos parâmetros do construtor.
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


    //Ao escrever dois construtores diferentes, temos um exemplo de sobrecarga de construtores.
    //Sobrecarga basicamente é ter mais de um comportamento para um método ou construtor.

    //Getters e Setters
    //São métodos que permitem acessar e modificar os atributos privados de uma classe.
    //Isso é um exemplo de encapsulamento, para garantir a integridade dos dados.

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Double getPrice() { return price; }

    public void setPrice(Double price) { this.price = price; }

    public Integer getQuantity() { return quantity; }

    public void setQuantity(Integer quantity) { this.quantity = quantity; }

    //Equals é usado para comparar dois objetos.
    //Se os objetos forem iguais, retorna true, caso contrário, retorna false.
    //A comparação é feita com base nos atributos do objeto.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    //HashCode é usado para obter um código hash de um objeto.
    //Código hash é um valor numérico que representa um objeto.
    @Override
    public int hashCode() { return Objects.hash(name); }

    //toString é usado para obter uma representação em string de um objeto.
    //Isso é útil para depuração e exibição de objetos.
    @Override
    public String toString() {
        return "Produto { " +
                "name= " + name +
                ", price= " + price +
                ", quantity= " + quantity +
                " }";
    }
}
