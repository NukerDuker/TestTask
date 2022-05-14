package comparators;

import Employees.Specialist;

import java.util.Comparator;

public class DateComparator implements Comparator<Specialist> {

    @Override
    public int compare(Specialist o1, Specialist o2) {
        return o1.getDate().compareTo(o2.getDate());
    }
}
