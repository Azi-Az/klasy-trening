import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Company company = Utils.initdata();

        String title = "Panel administracyjny firmy" + company.getName();

        System.out.println("-".repeat(title.length()));
        System.out.println(title);
        System.out.println("-".repeat(title.length()));

        int number;


        System.out.println("Wybierz opcje");
        System.out.println("1. Wyswietl liste pracownikow");
        System.out.println("0. Zamknij program");

        boolean done = false;

        while (!done) {

            try {

                Scanner input = new Scanner(System.in);
                System.out.println("Podaj numer opcji");
                number = input.nextInt();

                switch (number) {
                    case 1:
                        for (int i = 0; i < company.getEmployees().size(); i++) {
                            System.out.println(company.getEmployees().get(i).toString());
                        }
                        break;

                    case  0:
                        System.out.println("Program zostaje zamkniety");
                        break;

                    default:
                        System.out.println("Podano zly numer opcji");

                }
                done = true;

            } catch (InputMismatchException e) {
                System.out.println("Podana opcja nie istnieje");
            }
        }

    }
}







//        for (int i = 0; i < company.getEmployees().size(); i++){
//            System.out.println(company.getEmployees().get(i).toString());
//        }

//CRUD - CREATE, READ, UPDATE, DELETE







//        List<Employee> employees = new ArrayList<>();
//
//        employees.add(firstEmployee);
//        employees.add(secondEmployee);
//        employees.add(thirdEmployee);
//
//        for (int i = 0; i < employees.size(); i++) {
//            System.out.println(employees.get(i).toString());
//        }




