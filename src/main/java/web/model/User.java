package web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String lastName;

    private String email;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User(long id, String name, String lastName, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + name + '\'' +
                ", LastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User() {
    }

    public User(String firstName, String lastName, String email) {
        this.name = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}
