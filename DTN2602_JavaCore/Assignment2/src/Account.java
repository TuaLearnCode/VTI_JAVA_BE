import java.time.LocalDate;

public class Account {
      int accountID;
      String email;
      String username;
      String fullName;
      Department department; // FK -> Object
      Position position;
      Group[] groups; //danh sách group mà account tham gia
      LocalDate createDate;
}

