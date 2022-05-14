package Employees;

import comparators.DateComparator;
import comparators.FioComparator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public abstract class Specialist {
    public String fio;
    public LocalDate date;
    public LocalDate jobStart;
    public DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");

    public Specialist(String fio, String strDate, String strJobStart) {
        this.fio = fio;
        date = LocalDate.parse(strDate, formatter);
        jobStart = LocalDate.parse(strJobStart, formatter);
    }
    Specialist (String fio) {
        this(fio, "12 10 2022", "23 10 1997");
    }

    public Specialist() {
        this("Test Test Test", "15 2 2010", "23 10 1997");
    }

    public String getFio() {
        return fio;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalDate getJobStart() {
        return jobStart;
    }

    public void sortedFio(Manager man) {
        man.collegues.stream()
                .sorted((x, y) -> new FioComparator().compare(x, y))
                .forEach(System.out::println);
    }

    public void sortedDate(Manager man) {
        man.collegues.stream()
                .sorted((x, y) -> new DateComparator().compare(x, y))
                .forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Specialist{" +
                "fio='" + fio + '\'' +
                '}';
    }
}
