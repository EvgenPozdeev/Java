public class Main {
    public static void main(String[] args) {


        try {
            Manager manager = new Manager("Evgen", "Pozdeev", 500, 1000);
            Employee employee = new Employee("Misha", "Kazanov", 0);


            Registry registry = Registry.getRegistry();
            registry.addWorker(manager);
            registry.addWorker(employee);
            registry.printList();
            registry.addWorker(employee); 

        } catch (FieldLengthLimitException | IncorrectSalaryException | EmployeeInRegistryException e) {
            e.printStackTrace();
        }
    }
}