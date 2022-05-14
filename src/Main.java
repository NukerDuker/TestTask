import Employees.*;
import comparators.DateComparator;
import comparators.FioComparator;

import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Manager man = new Manager();
        man.add(new Worker());
        man.add(new Other());
        man.sortedDate(man);

    }
}
