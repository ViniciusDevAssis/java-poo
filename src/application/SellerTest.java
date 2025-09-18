package application;

import entities.Pessoa;
import entities.Seller;

public class SellerTest {
    public static void main(String[] args) {

        //Upcasting é quando uma classe filha é convertida para uma classe mãe
        Pessoa p = new Seller();

        //Downcasting é quando uma classe mãe é convertida para uma classe filha
        Seller s = (Seller) p;

        s.setName("John");
        s.setAge("30");
        s.setCpf("123456789");
        s.setSalary(1200.0);

        System.out.println(s);
    }
}
