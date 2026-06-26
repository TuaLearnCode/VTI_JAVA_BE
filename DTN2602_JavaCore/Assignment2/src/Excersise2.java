import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Excersise2 {

    public void question1(){
        System.out.println("Excersise 2 - Question 1:");
        int a = 5;
        System.out.println(a);
        System.out.println("================================");
    }

    public void question2(){
        /* Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in
        ra số nguyên đó thành định dạng như sau: 100,000,000
        */
        System.out.println("Excersise 2 - Question 2:");
        int a = 100000000;
       // Locale localeVN = Locale.of("vi", "VN");
       //Locale.US : dùng dấu , -  localeVN, Local.ITALY dùng dấu .
        System.out.printf(Locale.US,"%,d %n", a);
        System.out.println("=========================");
    }

    public void question3(){
        /*Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf để in ra số
        thực đó chỉ bao gồm 4 số đằng sau
        */
        System.out.println("Excersise 2 - Question 3:");
        float a = (float) 5.567098; 
        // vì java mặc định là double, java không tự động ép kiểu từ double -> float
        System.out.printf("%.4f %n", a);
        // .4f: lấy 4 chữ cái cuối cùng, %n để xuống dòng
        System.out.println("=========================");
    }

    public void question4(){
        System.out.println("Excersise 2 - Question 4:");
        String hoVaTen = "Huynh Thao Duyen";
        System.out.println("Ten toi la \"" + hoVaTen + "\" và toi dang doc than");
        /* " bắt đầu chuỗi, "kết thúc chuỗi
        \" : có nghĩa là 1 ký tự phía sau \ không phải ký tự đặc biệt, in được
        */
       System.out.println("=========================");
    }

    public void question5(){
        /*Lấy thời gian bây giờ và in ra theo định dạng sau: 24/04/2020 11h:16p:20s */
        System.out.println("Excersise 2 - Question 5:");
        String pattern = "dd-MM-yyyy HH'h':mm'p':ss's'";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date =  simpleDateFormat.format(new Date());
        System.out.println(date);
        System.out.println("================================");
    }

    
    /*Cách in ngày tháng năm 
    + Date(): ngày giờ hiện tại
    + LocalDate(): chỉ ngày
    + LocalTime(): chỉ 
    - Cách 1: Ngày tháng năm theo viẹt nam
    Locale localeVN = new Locale("vi", "VN"); // tạo vùng ngôn ngữ là 
    DateFormat dateFormat = DateFormat.getInstanceDate(DateFormat.DEFAULT, localeVN);
    // tạo bộ định dạng ngày theo kiểu default và dùng vùng localVN đã tạo trước đó
    String date = dateFormat.format(new Date()); // lấy ngày và chuyển thành định dạng như trên
    System.out.println(date);
    --> KQ: 19 thg 6, 2026  
    
    nếu dùng dateForma.FULL -> KQ: Th? Sáu, 19 tháng 6, 2026
    
    - Cách 2: in theo định dạng mong muốn
    String pattern = "dd-MM-yyyy";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    String date =  simpleDateFormat.format(new Date());
    System.out.println(date);
    --> KQ: 19-06-2026
    */
   
   
   /* Cách căn lề in ra dưới dạng bảng:
   + printf("%s%n", biến): in chuỗi thường
   + printf("%s%n", biến): in chuỗi hoa
   + printf("%5s%n", x): căn phải: _ _ _ _ x
   + printf("%-5s%n", biến): cắn trái: x _ _ _ _
   */
    public void question6 (Account [] accounts){
        System.out.println("Excersise 2 - Question 6:");
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("%-10s|%-20s|%-20s|%-20s%n", "AccountID", "Email", "Fullname", "Phong ban");
        System.out.println("----------------------------------------------------------------------");
        for (Account account : accounts){
            System.out.printf("%-10s|%-20s|%-20s|%-20s%n",account.accountID, account.email,account.fullName,(account.department != null ? account.department.departmentName : "Chua co phong ban"));
        System.out.println("----------------------------------------------------------------------");
        } 
        
    }
}
