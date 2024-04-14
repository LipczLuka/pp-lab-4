import employees.Manager;
import employees.Worker.Worker;

public class Company {
public static void main(String[] args) {
    // Tablica pracowników

    Employee[] employees = new Employee[5];

    // Dodaj pięciu pracowników do tablicy
    employees[0] = new Manager("Monika Osiak", 19500);
    employees[1] = new Employee("Anna Pawlak", 19000);
    employees[2] = new Worker("Grażyna Gruszka", 11200);
    employees[3] = new Employee("Maja Sobiepan", 13800);
    employees[4] = new Employee("Ola Kowalczyk", 13800);

    // Wyświetl dane dla pracownika o indeksie równym 3
    System.out.println("Dane pracownika o indeksie 3:");
    System.out.println(employees[3].toString());

    // Zmodyfikuj salary dla pracownika o indeksie równym 3
    employees[3].setSalary(16000);

   // Wyświetl dane dla wszystkich pracowników
        System.out.println("Dane dla wszystkich pracowników:");
        for (Employee employee : employees) (Manager manager : employees) (Worker worker : employees)
        {
            System.out.println(employee.toString());
    }

}
}

