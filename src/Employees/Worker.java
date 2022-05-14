package Employees;

import java.util.Comparator;

public class Worker extends Specialist implements Comparator<Specialist> {
    private String fio;

    public Worker() {
        this("Worker Cool Guy", "03 08 2020", "03 08 2021");
    }

    public Worker(String fio, String date, String jobStart) {
        super(fio, date, jobStart);
    }

    @Override
    public int compare(Specialist o1, Specialist o2) {
        return 0;
    }
}
