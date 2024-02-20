import package1.Moveable;
import package1.RunableI;

import java.util.*;

public class Student extends Person implements RunableI, Cloneable {
    private int id;
    private String name;
    private String surname;
    private int grade;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Student() {
        super.setTest(5);
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
    public void add() {
        System.out.println("add method");
    }
    public List<Student>  getStudents() {
        return new ArrayList<>();
    }

    @Override
    public void getResponsibility(Person person) {
        System.out.println("Student");
    }

    @Override
    public void run() {

    }
}
