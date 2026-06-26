package com.studentmgmt;
import java.util.ArrayList;
import java.util.Scanner;

import com.entity.Student;

public class StudentManagement {

    private ArrayList<Student> students = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public ArrayList<Student> initData(){
        ArrayList<Student>  students = new ArrayList<>();
        Student s1 = new Student(1, "Chanyeol",35 , "ExoChanyeol@gmail.com");
        Student s2 = new Student(2, "Beakhyun",32 , "ExoChanyeol@gmail.com");
        Student s3 = new Student(3, "D.O",31 , "ExoChanyeol@gmail.com");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        return students;
    }
    
    //displayStudents()  →  Duyệt ArrayList và in thông tin từng SV
    public void displayStudents(){
        System.out.println("-------------------------------------------------------------");
        System.out.printf("| %-2s | %-20s | %-5s | %-20s%n", "ID", "Ho Tên", "Tuoi", "Email");
        System.out.println("-------------------------------------------------------------");
        for (Student student : students) {
            System.out.printf(
                "| %-2d | %-20s | %-5d | %-20s |%n",
                student.getId(),
                student.getName(),
                student.getAge(),
                student.getEmail()
            );
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println("Tong so sinh vien: " + students.size());
    }

    public Student findStudentById(int id){
        for (Student student : students){
            if (student.getId() == id){
                return student; 
            }
        }
        return null;
    }
    
    //addStudent()
    public void addStudent(Scanner scan){
        Student stu = new Student();
        System.out.println("Hay nhap cac thong tin cua hoc sinh moi: ");

        System.out.print("Nhap Student ID: ");
        int id = scan.nextInt();
        scan.nextLine();
        while (isDuplicateId(id)){
            System.out.println("Da ton tai sinh vien voi ID nay!");
            System.out.print("Hay nhap lai Student ID: ");
            id = scan.nextInt();
            scan.nextLine();
        }
        stu.setId(id);

        System.out.print("Nhap ten: ");
        stu.setName(scan.nextLine());

        System.out.print("Nhap tuoi: ");
        stu.setAge(scan.nextInt());
        scan.nextLine();

        System.out.print("Nhap email: ");
        stu.setEmail(scan.nextLine());

        students.add(stu);
        System.out.println("Them sinh vien thanh cong!");
    }

    private boolean isDuplicateId(int id){
        for (Student student : students){
            if (student.getId() == id) return true;
        }
        return false;
    }

    // updateStudent(int id)
    public void updateStudent(int id){
        Student s = findStudentById(id);
        if (s == null){
            System.out.println("Khong tim thay sinh vien voi ID " + id);
            return;
        }

        while (true){
            System.out.println("\n--- Cap nhat sinh vien [ID: " + id + "] ---");
            System.out.println("1. Ten    : " + s.getName());
            System.out.println("2. Tuoi   : " + s.getAge());
            System.out.println("3. Email  : " + s.getEmail());
            System.out.println("0. Luu va thoat");
            System.out.print("Chon truong muon sua: ");

            int field;
            try {
                field = Integer.parseInt(scan.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Lua chon khong hop le.");
                continue;
            }

            switch (field){
                case 1:
                    System.out.print("Ten moi [" + s.getName() + "]: ");
                    String name = scan.nextLine();
                    if (!name.trim().isEmpty()) s.setName(name);
                    break;
                case 2:
                    System.out.print("Tuoi moi [" + s.getAge() + "]: ");
                    try {
                        int age = Integer.parseInt(scan.nextLine().trim());
                        s.setAge(age);
                    } catch (NumberFormatException e) {
                        System.out.println("Tuoi khong hop le, giu nguyen tuoi cu.");
                    }
                    break;
                case 3:
                    System.out.print("Email moi [" + s.getEmail() + "]: ");
                    String email = scan.nextLine();
                    if (!email.trim().isEmpty()) s.setEmail(email);
                    break;
                case 0:
                    System.out.println("Cap nhat sinh vien thanh cong!");
                    return;
                default:
                    System.out.println("Lua chon khong hop le, vui long chon 0-3.");
            }
        }
    }

    public void deleteStudent(int id){
        Student s = findStudentById(id);
        if (s == null){
            System.out.println("Khong tim thay sinh vien voi ID " + id);
            return;
        }

        System.out.println("Ban co chac muon xoa sinh vien [" + s.getName() + "] khong? (yes/no): ");
        String confirm = scan.nextLine().trim().toLowerCase();
        if (confirm.equals("yes")){
            students.remove(s);
            System.out.println("Xoa sinh vien thanh cong!");
        } else {
            System.out.println("Huy xoa sinh vien.");
        }
    }

    public void showMenu(){
        System.out.println("\n=== QUAN LY SINH VIEN ===");
        System.out.println("1. Hien thi danh sach");
        System.out.println("2. Tim theo ID");
        System.out.println("3. Them sinh vien");
        System.out.println("4. Sua sinh vien");
        System.out.println("5. Xoa sinh vien");
        System.out.println("6. Thoat");
        System.out.print("Nhap lua chon: ");
    }

    public void run(){
        students = initData();
        while (true){
            showMenu();
            int choice;
            try {
                choice = Integer.parseInt(scan.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Lua chon khong hop le, vui long nhap so tu 1-6.");
                continue;
            }

            switch (choice){
                case 1:
                    displayStudents();
                    break;
                case 2:
                    System.out.print("Nhap ID can tim: ");
                    int findId;
                    try {
                        findId = Integer.parseInt(scan.nextLine().trim());
                    } catch (NumberFormatException e) {
                        System.out.println("ID khong hop le.");
                        break;
                    }
                    Student student = findStudentById(findId);
                    if (student == null){
                        System.out.println("Khong tim thay sinh vien voi ID " + findId);
                    } else {
                        System.out.println("Thong tin student voi ID " + student.getId() + " la: ");
                        System.out.println("------------------------------------------------------------");
                        System.out.printf("| %-2s | %-20s | %-5s | %-20s%n", "ID", "Ho va Ten", "Tuoi", "Email");
                        System.out.println("------------------------------------------------------------");
                        System.out.printf(
                            "| %-2d | %-20s | %-5d | %-20s |%n",
                            student.getId(),
                            student.getName(),
                            student.getAge(),
                            student.getEmail()
                        );
                        System.out.println("------------------------------------------------------------");
                    }
                    break;
                case 3:
                    addStudent(scan);
                    break;
                case 4:
                    System.out.print("Nhap ID sinh vien can sua: ");
                    int updateId;
                    try {
                        updateId = Integer.parseInt(scan.nextLine().trim());
                    } catch (NumberFormatException e) {
                        System.out.println("ID khong hop le.");
                        break;
                    }
                    updateStudent(updateId);
                    break;
                case 5:
                    System.out.print("Nhap ID sinh vien can xoa: ");
                    int deleteId;
                    try {
                        deleteId = Integer.parseInt(scan.nextLine().trim());
                    } catch (NumberFormatException e) {
                        System.out.println("ID khong hop le.");
                        break;
                    }
                    deleteStudent(deleteId);
                    break;
                case 6:
                    System.out.println("Tam biet!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long nhap so tu 1-6.");
            }
        }
    }
}
