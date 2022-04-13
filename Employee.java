/**
 * Java 1. Homework 5
 * 
 * @author Alexey Chulkov
 * @version 11.04.2022
 */
 
public class Employee {
    private String name;
	private String position;
	private String email;
	private String phone;
	private int salary;
	private int age;
	
	public Employee(String name, String position, String email, String phone, int salary, int age){
	    this.name = name;
		this.position = position;
		this.email = email;
		this.phone = phone;
		this.salary = salary;
		this.age = age;
	}
    
    public void printInfo() {
        System.out.println("Name " + name + " | " + "Должность: " + position + " | " + "e-mail: " + email + " | " + 
		       "Телефон: " + phone + " | " + "Зарплата: " + salary + " | " + "Возраст: " + age);
    }
	
    public static void main(String[] args) {
    
    Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivanov@mail.ru", "89105554411", 60000, 35);
        employees[1] = new Employee("Smirnov Oleg", "Developer", "smirn@mail.ru", "89103251144", 100000, 44);
        employees[2] = new Employee("Sidorov Alexander", "Web designer", "Sidor@mail.ru", "89104517712", 90000, 27);
        employees[3] = new Employee("Petrov Vasiliy", "Marketing specialist", "petvas@mail.ru", "89108512456", 85000, 42);
        employees[4] = new Employee("Shubin Alexey", "Analyst", "shub@mail.ru", "89104526611", 95000, 33);
    for (int i = 0; i < employees.length; i++)
        if (employees[i].age > 40) employees[i].printInfo();
    }
}