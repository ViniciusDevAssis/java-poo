package entities;

//Herança
//final impede que a classe seja herdada
public final class Seller extends Pessoa {
    //Seller está herdando de Person

    private Double salary;

    public Seller() {
    }

    //Novo construtor que passa os parâmetros para o construtor da classe mãe
    public Seller(String name, String age, String cpf, Double salary) {
        //suepr() chama o construtor da classe mãe
        super(name, age, cpf);
        this.salary = salary;
    }

    public Double getSalary() { return salary; }
    public void setSalary(Double salary) { this.salary = salary; }

    @Override
    public String toString() {
        return "Seller { " +
                super.toString() + //Exemplo de polimorfismo, nesse caso sobreposição, chamando o toString da classe mãe
                ", salary= " + salary +
                " }";
    }
}
