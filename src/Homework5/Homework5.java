package Homework5;

public class Homework5 {
    public static void main (String[] args) {
    Employee person1 = new Employee ("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", 892312312, 30000, 30);
    Employee person2 = new Employee ("Petrov Petr", "Driver", "driver@mailbox.com", 835145478, 15000, 45);
    Employee person3 = new Employee ("Ivanova Anna", "Cook", "cook@mailbox.com", 835177478, 17000, 25);
    Employee person4 = new Employee ("Petrova Inna", "Accountant", "acc@mailbox.com", 899145478, 25000, 50);
    Employee person5 = new Employee ("Egorov Egor", "Lawyer", "lawyer@mailbox.com", 878145478, 28000, 40);

        person1.printInfo();

        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", 892312312, 30000, 30);
        empArray[1] = new Employee ("Petrov Petr", "Driver", "driver@mailbox.com", 835145478, 15000, 45);
        empArray[2] = new Employee ("Ivanova Anna", "Cook", "cook@mailbox.com", 835177478, 17000, 25);
        empArray[3] = new Employee ("Petrova Inna", "Accountant", "acc@mailbox.com", 899145478, 25000, 50);
        empArray[4] = new Employee ("Egorov Egor", "Lawyer", "lawyer@mailbox.com", 878145478, 28000, 40);

        for (;;) {
            if (Employee.getAge() > 40) Employee.printInfo(); //
        }
    }




}

