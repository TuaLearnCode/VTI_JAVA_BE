import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // ===== Exercise 1 - Constructor =====

        // Question 1: Department constructors
        Department dep1 = new Department();                      // a) no params
        Department dep2 = new Department("Engineering");         // b) nameDepartment, id=0
        System.out.println("dep1: id=" + dep1.departmentID + ", name=" + dep1.departmentName);
        System.out.println("dep2: " + dep2);

        // Question 2: Account constructors
        Account acc1 = new Account();                            // a) no params
        Account acc2 = new Account(2, "bob@mail.com", "bob", "Bob", "Smith");  // b)
        Position pos = new Position();
        Account acc3 = new Account(3, "carol@mail.com", "carol", "Carol", "White", pos); // c) createDate=now
        Account acc4 = new Account(4, "dave@mail.com", "dave", "Dave", "Brown", pos, LocalDate.of(2024, 1, 15)); // d)
        System.out.println("acc1: " + acc1);
        System.out.println("acc2: " + acc2);
        System.out.println("acc3: " + acc3);
        System.out.println("acc4: " + acc4);

        // Question 3: Group constructors
        Group g1 = new Group();                                  // a) no params
        Account[] members = { acc2, acc3 };
        Group g2 = new Group("Java Team", acc2, members, LocalDate.now()); // b) Account[]
        String[] usernames = { "alice", "eve", "mallory" };
        Group g3 = new Group("Security Team", acc4, usernames, LocalDate.now()); // c) String[]
        System.out.println("g1: " + g1);
        System.out.println("g2: " + g2);
        System.out.println("g3: " + g3);

    //     Scanner scanner = new Scanner(System.in);
    //     Account acc1 = new Account();
    //     Account acc2 = new Account();
    //     acc1.salary = 5240.5f;
    //     acc2.salary = 10970.055f;

    //     Exercise1.question1(acc1);
    //     Exercise1.question1(acc2);

    //     int randomNumber = Exercise1.question2();
    //     Exercise1.question3(randomNumber);

    //     Exercise1.question4(7, 0);
    //     Exercise1.question4(9, 3);

    //     Exercise2.question1();

    //     Exercise3.question1();
    //     Exercise3.question2();
    //     Exercise3.question3();

    //     Exercise4.question1(scanner);
    //     Exercise4.question2(scanner);
    //     Exercise4.question3(scanner);
    //     Exercise4.question4(scanner);
    //     Exercise4.question5(scanner);
    //     Exercise4.question6(scanner);
    //     Exercise4.question7(scanner);

    //     Group g1 = new Group(); g1.groupName = "Java Basic";
    //     Group g2 = new Group(); g2.groupName = "Python Advanced";
    //     Group g3 = new Group(); g3.groupName = "Java Spring";
    //     Group g4 = new Group(); g4.groupName = "C++ Beginner";
    //     Group g5 = new Group(); g5.groupName = "Java Web";
    //     Exercise4.question8(List.of(g1, g2, g3, g4, g5));
     
    //     Exercise4.question9(List.of(g1, g2, g3, g4, g5));
    //     Exercise4.question10(scanner);
    //     Exercise4.question11(scanner);
    //     Exercise4.question12(scanner);
    //     Exercise4.question13(scanner);
    //     Exercise4.question14(scanner);
    //     Exercise4.question15(scanner);
    //     Exercise4.question16(scanner);

    //     scanner.close();

    //     Department[] departments = {
    //         new Department(1, "Phong A"),
    //         new Department(2, "Phong B"),
    //         new Department(3, "Phong C"),
    //         new Department(4, "Phong D"),
    //         new Department(5, "Phong E")
    //     };

    //     Exercise5.question1(departments);
    //     Exercise5.question2(departments);
    //     Exercise5.question3(departments);
    //     Exercise5.question4(departments);
    //     Exercise5.question5(departments);
    //     Exercise5.question6();
    //     Exercise5.question7();
    }
}
