package v.korneev.hubernate;

import javax.persistence.*;

@Entity
    @Table(name = "user")

    public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column
    private Long id;

        @Column
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public User() {
    }

    public void print(){
        System.out.println(" User id = " + id + " ;name = " + name);
    }

}
