package employees;

public class Worker {

public class Worker extends Employee {
    public Worker(String fullName, double salary) {
        super(fullName, salary);
    }

 public String position;

 public Worker(String fullName, double salary, String position) {
     super(fullName, salary);
     this.position = position;
 }

 // pobieranie pozycji
 public String getPosition() {
     return position;
 }

 // ustawianie pozycji
 public void setPosition(String position) {
     this.position = position;
 }

 // Metoda toString
 public String toString() {
     return "Worker: {fullName='" + getFullName() + "', Salary: " + getSalary() + ", Position: " + position + "}";
 }
}
}
