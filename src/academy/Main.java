package academy;

import java.util.Scanner;

public class Main {
   static Scanner scanner = new Scanner(System.in);
    static int index = -1;
    static Employee[] arrEmployee = new Employee[1000];
    public static void main(String[] args) {

        do {
            System.out.println("-----MENU-----");
            System.out.println("1. nhap thong tin nhan vien");
            System.out.println("2. tinh luong nhan vien");
            System.out.println("3. hien thi thong tin nhan vien");
            System.out.println("4. Hien thi cac nhan vien theo gioi tinh");
            System.out.println("5. hien thi cac nhan vien theo khoang luong a--->>b");
            System.out.println("6. sap xep bang luong giam dan");
            System.out.println("7. Thoat");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    Main.inputDataEmployee(scanner);
                    break;
                case 2:
                    Main.employeeSalary();
                    break;
                case 3:
                    Main.displayEmployee();
                    break;
                case 4:
                    Main.displayEmployeeBySex();
                    break;
                case 5:
                    Main.salaryRange();
                    break;
                case 6:
                    Main.sortByEmployeeSalaryASCE();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! ");
            }
        }while (true);
    }
    public static void inputDataEmployee(Scanner scanner){
        System.out.println("nhap so luong nhan vien: ");
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            Employee employee = new Employee();
            employee.inputData();
            index++;
            arrEmployee[index] = employee;
        }
    }
    public static void employeeSalary(){
        for (int i = 0; i <= index ; i++) {
            arrEmployee[i].employeeSalary();
        }
    }
    public static void displayEmployee(){
        for (int i = 0; i <= index ; i++) {
            arrEmployee[i].displayData();
        }
    }
    public static void sortByEmployeeSalaryASCE(){
        for (int i = 0; i < index; i++) {
            for (int j = i+1; j <= index ; j++) {
                if (arrEmployee[i].getSalary() < arrEmployee[j].getSalary()){
                    Employee temp = arrEmployee[i];
                    arrEmployee[i] = arrEmployee[j];
                    arrEmployee[j] = temp;
                }

            }
        }
        System.out.println("-----sap xep luong gian dan-----");
        displayEmployee();

    }
    public static void salaryRange(){
        float a;
        System.out.println("nhap a:  ");
        a = Float.parseFloat(scanner.nextLine());
        System.out.println("nhap b: ");
        float b = Float.parseFloat(scanner.nextLine());
        for (int i = 0; i < index; i++) {
            if (a <= arrEmployee[i].getSalary() && arrEmployee[i].getSalary() <= b){
                System.out.println("------khoang luong phu hop-------");
                arrEmployee[i].displayData();
            }
        }
    }
    public static void displayEmployeeBySex(){
        System.out.println("nhap gioi tinh can tim: ");
        boolean sex = Boolean.parseBoolean(scanner.nextLine());
        for (int i = 0; i <= index; i++) {
            if (sex == arrEmployee[i].isSex()){
                arrEmployee[i].displayData();
            }
        }
    }

}
