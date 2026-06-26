import java.text.ParseException;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
            Department department1 = new Department();
            Department department2 = new Department();
            Department department3 = new Department();
    
            //thêm dũ liệu cho department1 và department2
            department1.departmentID = 1;
            department1.departmentName = "IT_Nihonggo";
            department2.departmentID = 2;
            department2.departmentName = "IT_Java";
            department3.departmentID = 3;
            department3.departmentName = "IT_Python";
    
            Position position1 = new Position();
            Position position2 = new Position();
            Position position3 = new Position();
            Position position4 = new Position();
    
            //thêm dũ liệu cho position
            position1.positionID = 1;
            position1.positionName = EPosition.DEV.getDisplayName();
            position2.positionID = 2;
            position2.positionName = EPosition.TEST.getDisplayName();
            position3.positionID = 3;
            position3.positionName = EPosition.SCRUM_MASTER.getDisplayName();
            position4.positionID = 4;
            position4.positionName = EPosition.PM.getDisplayName();
    
            Account account1 = new Account();
            Account account2 = new Account();
            Account account3 = new Account();
    
            //thêm dũ liệu cho account1
            account1.accountID = 1;
            account1.email = "duyen@gmail.com";
            account1.username = "Tua";
            account1.fullName = "Thao Duyen";
            account1.department = department1;
            account1.position = position1;
            account1.position.positionName = position1.positionName;

             //thêm dũ liệu cho account2 
            account2.accountID = 2;
            account2.email = "minh@gmail.com";
            account2.username = "Minh";
            account2.fullName = "Nguyen Minh";
            account2.department = null;
            account2.position = position1;
            account2.position.positionName = position1.positionName;
    
            //thêm dũ liệu cho account3
            account3.accountID = 3;
            account3.email = "duc@gmail.com";
            account3.username = "Duc";
            account3.fullName = "Tran Duc";
            account3.department = department3;
            account3.position = position1;
            account3.position.positionName = position1.positionName;

            Group group1 = new Group();
            Group group2 = new Group();
    
            //thêm dữ liệu cho group1
            group1.groupName = "Du an nghin ty do";
            group1.groupId = 1;
            group1.createDate = LocalDate.now();
            group1.creator = account1;
           
         

            //thêm dữ liệu cho group2
            group2.groupName = "Du an khong dong";
            group2.groupId = 2;
            group2.createDate = LocalDate.now();
            group2.creator = account2;
           
            //thêm danh sách group mà account tham gia
            account1.groups = new Group[]{group1, group2};
            account2.groups = new Group[]{group1, group2};
            //thêm danh sách thành viên cho group1 và group2
            group1.accounts = new Account[]{account1, account2};
            group2.accounts = new Account[]{account1, account2};
           
            TypeQuestion typeQuestion1 = new TypeQuestion();
            TypeQuestion typeQuestion2 = new TypeQuestion();
            TypeQuestion typeQuestion3 = new TypeQuestion();
    
            typeQuestion1.typeID = 1;
            typeQuestion1.typeName = ETypeQuestion.MULTIPLE_CHOICE.getDisplayName();
            typeQuestion2.typeID = 2;
            typeQuestion2.typeName = ETypeQuestion.ESSAY.getDisplayName();
    
    
            CategoryQuestion categoryQuestion1 = new CategoryQuestion();
            CategoryQuestion categoryQuestion2 = new CategoryQuestion();
            CategoryQuestion categoryQuestion3 = new CategoryQuestion();
            categoryQuestion1.categoryID = 1;
            categoryQuestion1.categoryName = "JavaBE";
    
            Question question1 = new Question();
            Question question2 = new Question();
            Question question3 = new Question();
            question1.questionID = 1;
            question1.content = "Dap an cua cau hoi sau la bao nhieu: a = 1; b = 2; a + b = ?";
            question1.category = categoryQuestion1;
            question1.type = typeQuestion1;
            question1.creator = account2;

            question2.questionID = 2;
            question2.content = "Tra loi cau hoi tu luan sau: Ban la sinh vien nam may?";
            question2.category =  categoryQuestion1;
            question2.type =  typeQuestion2;
            question2.creator = account2;
    
            Answer answer1 = new Answer();
            Answer answer2 = new Answer();
            Answer answer3 = new Answer();
    
            answer1.answerID = 1;
            answer1.content = "4";
            answer1.question = question1;
            answer1.isCorrect = false;

            answer2.answerID = 2;
            answer1.content = "3";
            answer1.question = question1;
            answer1.isCorrect = true;

            Exam exam1 = new Exam();
            Exam exam2 = new Exam();
            Exam exam3 = new Exam();
    
            exam1.examID = 1;
            exam1.code = "JC01";
            exam1.title = "Thi Java";
            exam1.category = categoryQuestion1;
            exam1.duration = 60;
            exam1.creator = account2;
            exam1.createDate = new Date();

            Excersise1 excersise1 = new Excersise1();
            excersise1.question1(account2);
            excersise1.question2(account2);
            excersise1.question3(account2);
            excersise1.question4(account1);
            excersise1.question5(group1);
            excersise1.question6(account2);
            excersise1.question7(account1);
            
            Account [] accounts = new Account[]{account1, account2, account3};
            excersise1.question8(accounts);
            
            Department [] departments = new Department []{department1, department2};
            excersise1.question9(departments);

            excersise1.question10(accounts);
            excersise1.question11(departments);
            excersise1.question12(departments);
            excersise1.question13(accounts);
            excersise1.question14(accounts);
            excersise1.question15();
            
            excersise1.question16_10(accounts);
            excersise1.question16_11(departments);
            excersise1.question16_12(departments);
            excersise1.question16_13(accounts);
            excersise1.question16_14(accounts);
            excersise1.question16_15();

            excersise1.question17_10(accounts);
            excersise1.question17_11(departments);
            excersise1.question17_12(departments);
            excersise1.question17_13(accounts);
            excersise1.question17_14(accounts);
            excersise1.question17_15();
            
            
            Excersise2 excersise2 = new Excersise2();
            excersise2.question1();
            excersise2.question2();
            excersise2.question3();
            excersise2.question4();
            excersise2.question5();
            excersise2.question6(accounts);
            
            Excersise3 excersise3 = new Excersise3();
            excersise3.question1(exam1);
            excersise3.question2(exam1);
            excersise3.question3(exam1);
            excersise3.question4(exam1);
            excersise3.question5(exam1);

            Excersise4 excersise4 = new Excersise4();
            excersise4.question1();
            excersise4.question2();
            excersise4.question3();
            excersise4.question4();
            excersise4.question5();
            excersise4.question6();
            excersise4.question7();

            Excersise5 excersise5 = new Excersise5();
            Scanner scanner = new Scanner (System.in);
            //excersise5.question1(scanner);
            // excersise5.question2(scanner);
            // excersise5.question3(scanner);
            //excersise5.question4(scanner);

            Position [] positions = {position1, position2, position3, position4};
            // excersise5.question5(scanner, departments, positions);
            //excersise5.question6(scanner, departments);
            excersise5.question7(scanner);

    }
}