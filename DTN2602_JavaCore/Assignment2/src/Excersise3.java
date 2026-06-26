import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Excersise3 {
    // public static void main(String[] args) {
    //     Locale locale = new Locale("vi", "VN");
    //     DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
    //     String date = dateFormat.format(new Date());
    //     System.out.println(date);

    //     String pattern = "dd-MM-yyyy";
    //     SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    //     String date = SimpleDateFormat.format(new Date());
    //     System.out.println(date);
    // }
    /**
     * @param exam
     */
    public void question1(Exam exam){
        System.out.println("Excersise 3 - Question 1:");
        Locale localeVN = new Locale("vi", "VN");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, localeVN);
        String date = dateFormat.format(exam.createDate);
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-10s|%-10s|%-10s|%-15s|%-15s|%-15s|%-20s%n",
        "ExamID",
        "Code",
        "Title",
        "Category",
        "Duration",
        "Creator",
        "CreateDate"
    );
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-10s|%-10s|%-10s|%-15s|%-15s|%-15s|%-20s%n",
        exam.examID,
        exam.code,
        exam.title,
        exam.category.categoryName,
        exam.duration,
        exam.creator.fullName,
        date
    ); 
        System.out.println("===========================================");
    }

    public void question2(Exam exam){
        System.out.println("Excersise 3 - Question 2:");
        String pattern = "yyyy-MM-dd-HH-mm-ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        System.out.println("Create Date of exam: " + date);
        System.out.println("===========================================");
    }

    public void question3(Exam exam){
        System.out.println("Excersise 3 - Question 3:");
        String pattern = "yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        System.out.println("Nam tao exam: " + date);
        System.out.println("===========================================");
    }

    public void question4(Exam exam){
        System.out.println("Excersise 3 - Question 4:");
        String pattern = "MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        System.out.println("Thang nam tao exam: " + date);
        System.out.println("===========================================");
    }

    public void question5(Exam exam){
        System.out.println("Excersise 3 - Question 5:");
        String pattern = "MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        System.out.println("Ngay thang tao exam: " + date);
        System.out.println("===========================================");
    }
}
