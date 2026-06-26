import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        Department department1 = new Department();
        Department department2 = new Department();
        Department department3 = new Department();

        //thêm dũ liệu cho department1
        department1.departmentID = 1;
        department1.departmentName = "IT_Nihonggo";

        Position position1 = new Position();
        Position position2 = new Position();
        Position position3 = new Position();

        //thêm dũ liệu cho position1
        position1.positionID = 1;
        position1.positionName = EPosition.DEV.getDisplayName();

        Account acount1 = new Account();
        Account acount2 = new Account();
        Account acount3 = new Account();

        //thêm dũ liệu cho account1
        acount1.accountID = 1;
        acount1.email = "duyen@gmail.com";
        acount1.username = "Tua";
        acount1.fullName = "Thao Duyen";
        acount1.department = department1;
        acount1.position = position1;
        acount1.position.positionName = position1.positionName;

         //thêm dũ liệu cho account2 
        acount2.accountID = 2;
        acount2.email = "minh@gmail.com";
        acount2.username = "Minh";
        acount2.fullName = "Nguyen Minh";
        acount2.department = department1;
        acount2.position = position1;
        acount2.position.positionName = position1.positionName;

        Group group1 = new Group();
        Group group2 = new Group();
        Group group3 = new Group();

        //thêm dữ liệu cho group1
        group1.groupName = "Du an nghin ty do";
        group1.groupId = 1;
        group1.createDate = LocalDate.now();
        group1.creator = acount1;
        Account [] accounts = {acount1, acount2, acount3};
        group1.accounts = accounts; // danh sách thành viên

        TypeQuestion typeQuestion1 = new TypeQuestion();
        TypeQuestion typeQuestion2 = new TypeQuestion();
        TypeQuestion typeQuestion3 = new TypeQuestion();

        typeQuestion1.typeID = 1;
        typeQuestion1.typeName = ETypeQuestion.MULTIPLE_CHOICE.getDisplayName();


        CategoryQuestion categoryQuestion1 = new CategoryQuestion();
        CategoryQuestion categoryQuestion2 = new CategoryQuestion();
        CategoryQuestion categoryQuestion3 = new CategoryQuestion();
        categoryQuestion1.categoryName = "JavaBE";

        Question question1 = new Question();
        Question question2 = new Question();
        Question question3 = new Question();
        question1.questionID = 1;
        question1.content = "a = 1; b = 2; a + b = ?";
        question1.category = categoryQuestion1;
        question1.type = typeQuestion1;
        question1.creator = acount2;


        Answer answer1 = new Answer();
        Answer answer2 = new Answer();
        Answer answer3 = new Answer();

        answer1.answerID = 1;
        answer1.content = "3";
        answer1.question = question1;
        answer1.isCorrect = false;

        Exam exam1 = new Exam();
        Exam exam2 = new Exam();
        Exam exam3 = new Exam();

        exam1.title = "Thi Java";
        exam1.examID = 1;
        exam1.code = "JC01";
        exam1.category = categoryQuestion1;
        exam1.duration = 60;
        exam1.creator = acount2;
        exam1.createDate = LocalDate.now();

        System.out.println("Department 1: ID = " + department1.departmentID + ", Name = " + department1.departmentName);
        System.out.println("================================");
        System.out.println("Position 1: ID = " + position1.positionID + ", Name = " + position1.positionName);

        System.out.println("================================");
        System.out.println("Account 1: ID = " + acount1.accountID
            + ", Email = " + acount1.email
            + ", Username = " + acount1.username
            + ", Full name = " + acount1.fullName
            + ", Department = " + acount1.department.departmentName
            + ", Position = " + acount1.position.positionName);

        System.out.println("================================");
        System.out.println("Account 2: ID = " + acount2.accountID
            + ", Email = " + acount2.email
            + ", Username = " + acount2.username
            + ", Full name = " + acount2.fullName
            + ", Department = " + acount2.department.departmentName
            + ", Position = " + acount2.position.positionName);

        System.out.println("================================");         
        System.out.println("Group 1: ID = " + group1.groupId
            + ", Name = " + group1.groupName
            + ", Creator = " + group1.creator.fullName
            + ", Create date = " + group1.createDate);
        System.out.println("Group 1 members:");
        for (Account account : group1.accounts) {
            if (account != null) {
            System.out.println("- " + account.accountID + " | " + account.fullName + " | " + account.username);
            }
        }
        System.out.println("================================");
        System.out.println("Type question 1: ID = " + typeQuestion1.typeID + ", Name = " + typeQuestion1.typeName);
        System.out.println("================================");
        System.out.println("Category question 1: ID = " + categoryQuestion1.categoryID + ", Name = " + categoryQuestion1.categoryName);

        System.out.println("================================");
        System.out.println("Question 1: ID = " + question1.questionID
            + ", Content = " + question1.content
            + ", Category = " + question1.category.categoryName
            + ", Type = " + question1.type.typeName
            + ", Creator = " + question1.creator.fullName);

        System.out.println("================================");
        System.out.println("Answer 1: ID = " + answer1.answerID
            + ", Content = " + answer1.content
            + ", Question = " + answer1.question.content
            + ", Is correct = " + answer1.isCorrect);

        System.out.println("================================");
        System.out.println("Exam 1: ID = " + exam1.examID
            + ", Code = " + exam1.code
            + ", Title = " + exam1.title
            + ", Category = " + exam1.category.categoryName
            + ", Duration = " + exam1.duration
            + ", Creator = " + exam1.creator.fullName
            + ", Create date = " + exam1.createDate);
    }


}