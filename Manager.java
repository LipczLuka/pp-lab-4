package employees;

public class Manager extends Employee {
   
    public Manager(String fullName, double salary) {
        super(fullName, salary);
    }

     public int numberOfSubordinates;

     public Manager(String fullName, double salary, int numberOfSubordinates) {
         super(fullName, salary);
         this.numberOfSubordinates = numberOfSubordinates;
     }
 
     //  pobieranie liczby podwładnych
     public int getNumberOfSubordinates() {
         return numberOfSubordinates;
     }
 
     // ustawianie liczby podwładnych
     public void setNumberOfSubordinates(int numberOfSubordinates) {
         this.numberOfSubordinates = numberOfSubordinates;
     }
 
     // Metoda toString
     public String toString() {
         return "Manager: {fullName='" + getFullName() + "', Salary: " + getSalary() + ", Subordinates: " + numberOfSubordinates + "}";
     }
 }
