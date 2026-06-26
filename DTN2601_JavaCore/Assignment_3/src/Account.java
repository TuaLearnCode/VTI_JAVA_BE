import java.time.LocalDate;

public class Account {
    int accountID;
    String email;
    String username;
    String firstName;
    String lastName;
    String fullName;
    Department department;
    Position position;
    LocalDate createDate;
    Float salary;

    // a) No parameters
    public Account() {
    }

    // b) id, email, username, firstName, lastName
    public Account(int accountID, String email, String username, String firstName, String lastName) {
        this.accountID = accountID;
        this.email = email;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
    }

    // c) id, email, username, firstName, lastName, position — createDate = now
    public Account(int accountID, String email, String username, String firstName, String lastName, Position position) {
        this(accountID, email, username, firstName, lastName);
        this.position = position;
        this.createDate = LocalDate.now();
    }

    // d) id, email, username, firstName, lastName, position, createDate
    public Account(int accountID, String email, String username, String firstName, String lastName, Position position, LocalDate createDate) {
        this(accountID, email, username, firstName, lastName);
        this.position = position;
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Account{id=" + accountID + ", username='" + username + "', fullName='" + fullName + "', createDate=" + createDate + "}";
    }
}
