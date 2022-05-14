package comparators;

import Employees.Specialist;

import java.util.Comparator;

public class FioComparator implements Comparator<Specialist> {

    @Override
    public int compare(Specialist o1, Specialist o2) {
        return o1.getFio().compareTo(o2.getFio());
    }
}
