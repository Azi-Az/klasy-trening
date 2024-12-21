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

        Company company = new Company("Firma");
        List<Employee> employees = company.getEmployees();
        employees.add(firstEmployee);
        employees.add(secondEmployee);
        employees.add(thirdEmployee);

        for (int i = 0; i < company.getEmployees().size(); i++){
            System.out.println(employees.get(i).toString());
        }






//        List<Employee> employees = new ArrayList<>();
//
//        employees.add(firstEmployee);
//        employees.add(secondEmployee);
//        employees.add(thirdEmployee);
//
//        for (int i = 0; i < employees.size(); i++) {
//            System.out.println(employees.get(i).toString());
//        }


   }
}

