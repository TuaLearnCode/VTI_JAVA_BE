import java.time.LocalDate;

public class Group {
    int groupId;
    String groupName;
    Account creator; // FK -> object
    LocalDate createDate;
    Account [] accounts; //danh sách thành viên
}   