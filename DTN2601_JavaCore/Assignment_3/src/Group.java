import java.time.LocalDate;

public class Group {
    int groupId;
    String groupName;
    Account creator;
    Account[] accounts;
    LocalDate createDate;

    // a) No parameters
    public Group() {
    }

    // b) groupName, creator, Account[] accounts, createDate
    public Group(String groupName, Account creator, Account[] accounts, LocalDate createDate) {
        this.groupName = groupName;
        this.creator = creator;
        this.accounts = accounts;
        this.createDate = createDate;
    }

    // c) groupName, creator, String[] usernames, createDate
    public Group(String groupName, Account creator, String[] usernames, LocalDate createDate) {
        this.groupName = groupName;
        this.creator = creator;
        this.createDate = createDate;
        this.accounts = new Account[usernames.length];
        for (int i = 0; i < usernames.length; i++) {
            Account acc = new Account();
            acc.username = usernames[i];
            this.accounts[i] = acc;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Group{name='").append(groupName).append("', members=[");
        if (accounts != null) {
            for (int i = 0; i < accounts.length; i++) {
                sb.append(accounts[i].username);
                if (i < accounts.length - 1) sb.append(", ");
            }
        }
        sb.append("]}");
        return sb.toString();
    }
}
