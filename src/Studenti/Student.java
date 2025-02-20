package Studenti;

public class Student implements Comparable<Student>{
    String name;
    int ocjena;

    public Student(String name, int ocjena) {
        this.name = name;
        this.ocjena = ocjena;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(ocjena, o.ocjena);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ocjena=" + ocjena +
                '}';
    }

}
