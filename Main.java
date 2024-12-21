import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args) {
        Person firstPerson = new Person("Natalia", "Test");
        Employee firstEmployee = new Employee(firstPerson, Departament.SALES);

        Person secondPerson = new Person("Julia", "Przykladowa");
        Employee secondEmployee = new Employee(secondPerson, Departament.SALES);

        Person thirdPerson = new Person("Urszula", "Demo");
        Employee thirdEmployee = new Employee(thirdPerson, Departament.ADMINISTRATION);

        List<Employee> employees = new ArrayList<>();

        employees.add(firstEmployee);
        employees.add(secondEmployee);
        employees.add(thirdEmployee);

        System.out.println(employees);
   }
}

