package Employees;

import java.util.*;

public class Manager extends Specialist {
    public List<Specialist> collegues = new LinkedList<>();

    public Manager() {
        this("Managerov Employees.Manager -");
    }

    public Manager(String fio) {
        super(fio);
    }

    public void add(Specialist specialist) {
        collegues.add(specialist);
        System.out.println(specialist + " was added successfully");
    }

    public void delete(Specialist specialist) {
        if (collegues.contains(specialist)) {
            collegues.remove(specialist);
        } else {
            System.out.println("No such specialist");
        }
    }

}
