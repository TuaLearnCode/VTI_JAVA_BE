import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* Nhập từ bàn phím:
+ next(): Nhập 1 chuỗi không cách + xuống dòng
+ nextLine(): nhập 1 chuỗi có dấu cách + xuống dòng
+ nextInt(): nhập 1 số nguyên + xuống dòng
+ nextDouble(): nhập vào số thực + xuống dòng
+ hasNextInt():  trả về true nếu giá trị nhập vào là 1 số
--> dùng trong if để kiểm tra nhập đúng định dạng số nguyên không?
*/
public class Excersise5 {
    
    public void question1(Scanner scan){
        //Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình.
        System.out.println("Excersise 5 - Question 1");
        System.out.print("Nhap vao 3 so nguyen: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println (a + " " + b + " " + c);
        System.out.println("=========================");
    }

    public void question2(Scanner scan){
       //Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình.
        System.out.println("Excersise 5 - Question 2");
        System.out.print("Nhap vao 2 so thuc: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        System.out.println (a + " " + b + " ");
        System.out.println("=========================");
    }
    
    public void question3(Scanner scan){
      //Viết lệnh cho phép người dùng nhập họ và tên.
        System.out.println("Excersise 5 - Question 3");
        System.out.print("Hãy nhập vào họ và tên của bạn: ");
        String hoVaTen = scan.nextLine();   
        System.out.println ("Họ và tên của bạn là: " + hoVaTen);
        System.out.println("=========================");
    }

    public void question4(Scanner scan) throws ParseException{
        //Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ.
        System.out.println("Excersise 5 - Question 4");
        System.out.print("Hãy nhập vào ngày sinh của bạn (dd-MM-yyyy): ");
        String dayInput = scan.next();
        
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date = simpleDateFormat.parse(dayInput);
        // lúc này date = Sun Dec 23 00:00:00 ICT 1888
        String birthday = simpleDateFormat.format(date);
        // chuyển date -> string với định dạng pattern mong muốn
        //parse dùng để chuyển đổi (convert)
        // một chuỗi String thành đối tượng Date
        System.out.println ("Ngay sinh cua ban la: " + birthday);
        System.out.println("=========================");
    }

    public void question5(Scanner scan, Department[] deparments, Position[] positions){
        //người dùng tạo tài khoản
        Account Acc = new Account();
        System.out.println("Excersise 5 - Question 5");
        System.out.println("Hay nhap thong tin account: ");

        System.out.print("Account ID: ");
        Acc.accountID  = scan.nextInt();

        System.out.print("Email: ");
        Acc.email = scan.next(); 

        System.out.print("Username: ");
        Acc.username = scan.next();

        System.out.print("Fullname: ");
        scan.nextLine();// để ăn "Enter" của scan.next hoặc scan.nextInt phía trên
        Acc.fullName = scan.nextLine();

        System.out.print("Deparment ID: ");
        int deparmentID = scan.nextInt();
        boolean foundD = false;
        for (Department department : deparments){
            if (deparmentID == department.departmentID){
                Acc.department = department;
                foundD = true;
                break;
            }
        }
        if (!foundD){
                System.out.print("Khong tim thay phong ban voi ID tren");
        }

        System.out.print("Position (1,2,3,4): ");
        if (scan.hasNextInt()){
            int positionID = scan.nextInt();
            boolean foundP = false;
            for (Position position : positions){
                if (positionID == position.positionID){
                    Acc.position = position;
                    foundP = true;
                    break;
                }
            }
            if (!foundP){
                 System.out.print("Khong tim thay position voi ID ten!");
            }
        }
        else {
            System.out.println("Nhap loi!");
        }
        
        System.out.println("-----------------------------------------------------");
        System.out.printf("%-10s|%-15s|%-15s|%-15s|%-10s%n", "AccountID", "Email", "Fullname", "Department", "Position");
        System.out.println("-----------------------------------------------------");
        System.out.printf("%-10s|%-15s|%-15s|%-15s|%-10s%n",Acc.accountID, Acc.email,Acc.fullName,(Acc.department != null ? Acc.department.departmentName : "Chua co phong ban"), (Acc.position != null ? Acc.position.positionName : "Khong tim thay vi tri"));
        System.out.println("-------------------------------------------------------------");
        } 
    
    public void question6(Scanner scan, Department [] departments){
        //Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ.
        System.out.println("Excersise 5 - Question 6");
        System.out.println("Hay nhap thong tin phong ban moi: ");
        System.out.print("Nhap DeparmentID: ");
        if (scan.hasNextInt()){
            int departmentID = scan.nextInt();
            boolean found = false;
            for (Department department : departments){
                if (departmentID == department.departmentID){
                    found = true;
                    break;
                }
            }
            if (found){
                System.out.println("Loi tao moi! Trung ID!");
                System.out.print("Cac ID phong ban hien tai nhu sau: ");
                for (Department department : departments){
                System.out.print(department.departmentID + " ");
                }
                return;
            }
            else {
                Department department = new Department();
                department.departmentID = departmentID;
                scan.nextLine();
                System.out.print("Nhap Department Name: ");
                department.departmentName = scan.nextLine();
                System.out.println ("Thong tin phong ban moi: ");
                System.out.println ("DepartmentID: " + department.departmentID );
                System.out.println ("DepartmentName: " + department.departmentName );
                
            }
        }
        else {
                System.out.println("Loi nhap!");
        }
        System.out.println("=========================================");
    }
    
    /*Logic chua xử lý tốt ở chỗ: nếu nhập sai -> lỗi nhập -> break; 
        public void question7(Scanner scan) {
            //Nhập vào số chẵn
            System.out.println("Excersise 5 - Question 7");
            System.out.print("Nhap so chan di em: ");
            if(scan.hasNextInt()){
                int soChan = scan.nextInt();
                while (soChan % 2 != 0){
                    System.out.print("So ban nhap khong phai so chan! Nhap lai: ");
                    if(scan.hasNextInt()){
                    soChan = scan.nextInt();
                    }
                    else {
                        System.out.println("Loi nhap!");
                        break;
                    }
                }
                System.out.println("Ban da nhap so: " + soChan);
            }
            else {
                System.out.println("Loi nhap!");
            }

            System.out.println("========================================");
        }
    */
    
    public void question7(Scanner scan) {
    System.out.println("Exercise 5 - Question 7");

    while (true) {
        System.out.print("Nhap so chan di em: ");
        if (!scan.hasNextInt()) {
            System.out.println("Loi nhap!");
            scan.next(); // bỏ dữ liệu sai
            continue;
        }
        int soChan = scan.nextInt();
        if (soChan % 2 == 0) {
            System.out.println("Ban da nhap so: " + soChan);
            break;
        }
        System.out.println("So ban nhap khong phai so chan!");
    }
    System.out.println("========================================");
}
   }
