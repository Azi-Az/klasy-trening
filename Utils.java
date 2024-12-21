import java.util.List;

public class Utils {
    static Company initdata() {

        Person firstPerson = new Person("Natalia", "Test");
        Person secondPerson = new Person("Julia", "Przykladowa");
        Person thirdPerson = new Person("Urszula", "Demo");

        Employee firstEmployee = new Employee(firstPerson, Departament.SALES);
        Employee secondEmployee = new Employee(secondPerson, Departament.SALES);
        Employee thirdEmployee = new Employee(thirdPerson, Departament.ADMINISTRATION);

        Company company = new Company("Firma");
        List<Employee> employees = company.getEmployees();
        employees.add(firstEmployee);
        employees.add(secondEmployee);
        employees.add(thirdEmployee);

        return company;
    }
}
