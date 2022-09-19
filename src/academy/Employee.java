package academy;

import java.util.Scanner;

public class Employee implements IEmployee{
    private String empId;
    private String empName;
    private float rate;
    private float salary;
    private String address;
    private boolean sex;

    public Employee() {
    }

    public Employee(String empId, String empName, float rate, float salary, String address, boolean sex) {
        this.empId = empId;
        this.empName = empName;
        this.rate = rate;
        this.salary = salary;
        this.address = address;
        this.sex = sex;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ma nv: ");
        this.empId = scanner.nextLine();
        System.out.println("nhap ten nv: ");
        this.empName = scanner.nextLine();
        System.out.println("nhap he so luong: ");
        this.rate = Float.parseFloat(scanner.nextLine());
        System.out.println("nhap dia chi nv: ");
        this.address = scanner.nextLine();
        System.out.println("nhap gioi tinh nv: ");
        this.sex = Boolean.parseBoolean(scanner.nextLine());

    }

    @Override
    public void displayData() {
        System.out.printf("ma nhan vien: %s - ten nhan vien: %s - he so luong: %.2f\n", empId,empName,rate);
        System.out.printf("luong nhan vien: %.2f - dia chi: %s - gioi tinh: %b\n",salary, address,sex);

    }
    public void employeeSalary(){
        this.salary = this.rate * BASIC_SALARY;
    }
}
