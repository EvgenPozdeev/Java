public class Employee {
    private int id;
    private static int nextId = -1;
    private String name;
    private String surname;
    private double salary;

    public  Employee(){}

    public Employee(String name, String surname, double salary) throws FieldLengthLimitException, IncorrectSalaryException {
        this.id = ++nextId;

        if (name.length() > 25) {
            throw new FieldLengthLimitException(
                    
            );
        }

        this.name = name;

        if (surname.length() > 25) {
            throw new FieldLengthLimitException(
                    
            );
        }

        this.surname = surname;

        if (salary < 0) {
            throw new IncorrectSalaryException(
                    
            );
        }

        this.salary = salary;
    }

    @Override
    public String toString() {
        return getClass().getName() + " Id: " + this.id + "; FullName: " + this.name + " " + this.surname + "; Salary: " + this.salary + ";";
    }


    public int getId() {
        return id;
    }

    public int getNextId() {
        return nextId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNextId(int nextId) {
        this.nextId = nextId;
    }

    public void setName(String name) throws FieldLengthLimitException {
        if (name.length() > 25) {
            throw new FieldLengthLimitException(
                    
            );
        }

        this.name = name;
    }

    public void setSurname(String surname) throws FieldLengthLimitException {
        if (surname.length() > 25) {
            throw new FieldLengthLimitException(
                    
            );
        }

        this.surname = surname;
    }

    public void setSalary(double salary) throws IncorrectSalaryException {
        if (salary < 0) {
            throw new IncorrectSalaryException(
                    
            );
        }

        this.salary = salary;
    }
}
