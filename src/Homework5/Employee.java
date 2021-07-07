package Homework5;

public class Employee {
    private String name;
    private String job;
    private String email;
    private int phoneNumber;
    private int salary;
    private int age;

    public Employee (String name, String job, String email, int phoneNumber, int salary, int age) {
        this.name = name;
        this.job = job;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo () {
        System.out.printf("Employee: name: %s, job: %s, email: %s, phoneNumber: %d, salary: %d, age: %d", this.getName(),
                this.getJob(), this.getEmail(), this.getPhoneNumber(), this.getSalary(), this.getAge());
    }

    public String getName() {
        return this.name;
    }
    public String getJob() {
        return this.job;
    }
    public String getEmail() {
        return this.email;
    }
    public int getPhoneNumber() {
        return this.phoneNumber;
    }
    public int getSalary() {
        return this.salary;
    }
    public int getAge() {
        return this.age;
    }
}

