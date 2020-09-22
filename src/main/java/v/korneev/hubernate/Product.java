package v.korneev.hubernate;


import javax.persistence.*;

@Entity
@Table
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private Long id;

    @Column
    private String nameProduct;

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void NameProduct(){

    }

    public void print(){
        System.out.println("Product ID = " + id + " ; name product = " + nameProduct);
    }
}
