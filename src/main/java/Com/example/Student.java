package Com.example;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    int id;
    String name;
    String Address;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        Address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Student(){
        super();

    }
}
