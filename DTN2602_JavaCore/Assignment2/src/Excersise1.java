public class Excersise1 {
    
    public void question1 (Account account){
        System.out.println("Question 1: ");
        if (account.department == null){
            System.out.println("Nhan vien nay chua co phong ban");
        } else {
            System.out.println("Phong ban cua nhan vien nay la: " + account.department.departmentName);
        }

        System.out.println("================================");
    }

    public void question2 (Account account){
        System.out.println("Question 2: ");
        int groupCount = account.groups != null ? account.groups.length : 0;
        if (groupCount == 0){
            System.out.println("Nhan vien nay chua tham gia group nao");
        } else if (groupCount == 1 || groupCount == 2){
            System.out.println("Group cua nhan vien nay la Java Fresher, C# Fresher");
        } else if (groupCount == 3){
            System.out.println("Nhan vien nay la nguoi quan trong, tham gia nhieu group");
        } else {
            System.out.println("Nhan vien nay la nguoi hong chuyen, tham gia tat ca cac group");
        }
        System.out.println("================================");
    }

    public void question3 (Account account){
        System.out.println("Question 3: ");
        String message = account.department == null ? "Nhan vien nay chua co phong ban" : "Phong ban cua nhan vien nay la: " + account.department.departmentName;
        System.out.println(message);
        
        // Cách 2:
        //System.out.println(
        //     account.department == null ? "Nhan vien nay chua co phong ban" : "Phong ban cua nhan vien nay la: " + account.department.departmentName
        // );
        System.out.println("================================");
    }

    public void question4 (Account account){
        System.out.println("Question 4: ");
        String message = account.position.positionName == EPosition.DEV.getDisplayName() ? "Day la Developer" : "Nguoi nay khong phai la Developer";
        System.out.println(message);
        System.out.println("================================");
    }

    public void question5 (Group group){
        System.out.println("Question 5: ");
        int groupCount = group.accounts != null ? group.accounts.length : 0;
        switch(groupCount){
            case 1: 
                System.out.println("Nhom co mot thanh vien");
                break;
            case 2:
                System.out.println("Nhom co hai thanh vien");       
                break;
            case 3: 
                System.out.println("Nhom co ba thanh vien");
                break;
            default:
                System.out.println("Nhom co nhieu thanh vien");
        }
        System.out.println("================================");
    }

    public void question6 (Account account){
        System.out.println("Question 6: ");
        int groupCount = account.groups != null ? account.groups.length : 0;
        switch (groupCount){
            case 0:
                System.out.println("Nhan vien nay chua tham gia group nao");
                break;
            // có thể hiểu là groupCount = 1 | 2
            case 1:
            case 2:
                System.out.println("Group cua nhan vien nay la Java Fresher, C# Fresher");
                break;
            case 3:
                System.out.println("Nhan vien nay la nguoi quan trong, tham gia nhieu group");
                break;
            default:
                System.out.println("Nhan vien nay la nguoi hong chuyen, tham gia tat ca cac group");
        }
        System.out.println("================================");
    }

    public void question7 (Account account){
        System.out.println("Question 7: ");
        String position = account.position.positionName;
        switch (position){
            case "Dev":
                System.out.println("Day la Developer");
                break;  
            default:
                System.out.println("Nguoi nay khong phai la Developer");    
        }
        System.out.println("================================");
       
    }

    public void question8 (Account [] accounts){
        System.out.println("Question 8: ");
        for (Account account : accounts){
            System.out.println("Thong tin account: " + account.accountID);
            System.out.println("Email: " + account.email);
            System.out.println("Full name: " + account.fullName);
            System.out.println ("Phong ban: " + (account.department != null ? account.department.departmentName : "Chua co phong ban"));
            System.out.println("\n");
        }
        System.out.println("================================");
    }

    public void question9 (Department [] departments){
        System.out.println("Question 9: ");
        for (Department department : departments){
            System.out.println("Thong tin phong ban: " + department.departmentID);
            System.out.println("Ten phong ban: " + department.departmentName);
            System.out.println("\n");
        }
        System.out.println("================================");
    }

    public void question10 (Account [] accounts){
        System.out.println("Question 10: ");
        for (int i = 0; i < accounts.length; i++){
            System.out.println("Thong tin account thu " + (i+1) + ": ");
            System.out.println("AccountID: " + accounts[i].accountID);
            System.out.println("Email: " + accounts[i].email);
            System.out.println("Full name: " + accounts[i].fullName);
            System.out.println("Phong ban: " + (accounts[i].department != null ? accounts[i].department.departmentName : "Chua co phong ban"));
            System.out.println("\n");   
        }
        System.out.println("================================");
    }

    public void question11 (Department [] departments){
        System.out.println("Question 11: ");
        for (int i = 0; i < departments.length; i++){
            System.out.println("Thong tin phong ban thứ " + (i+1) + ": ");
            System.out.println("DepartmentID: " + departments[i].departmentID);
            System.out.println("Ten phong ban: " + departments[i].departmentName);
            System.out.println("\n");
        }
        System.out.println("================================");
    }

    public void question12 (Department [] departments){
        System.out.println("Question 12: ");
        for (int i = 0; i < departments.length; i++){
            if ( i == 2){
                break;
            }
            System.out.println("Thong tin phong ban thứ " + (i+1) + ": ");
            System.out.println("DepartmentID: " + departments[i].departmentID);
            System.out.println("Ten phong ban: " + departments[i].departmentName);
            System.out.println("\n");
        }
        System.out.println("================================");
    }

    public void question13 (Account [] accounts){
        System.out.println("Question 13: ");
        for (int i = 0; i < accounts.length; i++){
            if (i==1){
                continue;
            }
            System.out.println("Thong tin account thứ " + (i+1) + ": ");
            System.out.println("AccountID: " + accounts[i].accountID);
            System.out.println("Email: " + accounts[i].email);
            System.out.println("Full name: " + accounts[i].fullName);
            System.out.println("Phong ban: " + (accounts[i].department != null ? accounts[i].department.departmentName : "Chua co phong ban"));
            System.out.println("\n");   
        }
        System.out.println("================================");
    }

    public void question14 (Account [] accounts){
        System.out.println("Question 14: ");
        for (int i = 0; i < accounts.length; i++){
            if (accounts[i].accountID == 4){
               break;
            }
            System.out.println("Thong tin account thứ " + (i+1) + ": ");
            System.out.println("AccountID: " + accounts[i].accountID);
            System.out.println("Email: " + accounts[i].email);
            System.out.println("Full name: " + accounts[i].fullName);
            System.out.println("Phong ban: " + (accounts[i].department != null ? accounts[i].department.departmentName : "Chua co phong ban"));
            System.out.println("\n");   
        }
        System.out.println("================================");
    }

    public void question15(){
        System.out.println("Question 15: ");
        for (int i = 0; i <= 20; i++){
           if (i % 2 == 0){
                System.out.print(i + " ");
           }
        }
        System.out.println();
        System.out.println("================================");
    }

    public void question16_10(Account [] accounts){
        System.out.println("Question 16_10: ");
        int i = 0;
        while (i < accounts.length){
            System.out.println("Thong tin account thứ " + (i+1) + ": ");
            System.out.println("AccountID: " + accounts[i].accountID);
            System.out.println("Email: " + accounts[i].email);
            System.out.println("Full name: " + accounts[i].fullName);
            System.out.println("Phong ban: " + (accounts[i].department != null ? accounts[i].department.departmentName : "Chua co phong ban"));
            System.out.println("\n");   
            i++;
        }
        System.out.println("================================");
    }

    public void question16_11(Department [] departments){
        System.out.println("Question 16_11: ");
        int i = 0;
        while (i < departments.length){
            System.out.println("Thong tin phong ban thứ " + (i+1) + ": ");
            System.out.println("DepartmentID: " + departments[i].departmentID);
            System.out.println("Ten phong ban: " + departments[i].departmentName);
            System.out.println("\n");
            i++;
        }
        System.out.println("================================");
    }

    public void question16_12 (Department [] departments){
        System.out.println("Question 16_12: ");
        int i = 0;
        while (i < 2 ){
            System.out.println("Thong tin phong ban thứ " + (i+1) + ": ");
            System.out.println("DepartmentID: " + departments[i].departmentID);
            System.out.println("Ten phong ban: " + departments[i].departmentName);
            System.out.println("\n");
            i++;
        }
        System.out.println("================================");
    }

     public void question16_13 (Account [] accounts){
        System.out.println("Question 16_13: ");
        int i = 0;
        while (i < accounts.length){
            if (i == 1){
                i++;
                continue;
            }
            System.out.println("Thong tin account thứ " + (i+1) + ": ");
            System.out.println("AccountID: " + accounts[i].accountID);
            System.out.println("Email: " + accounts[i].email);
            System.out.println("Full name: " + accounts[i].fullName);
            System.out.println("Phong ban: " + (accounts[i].department != null ? accounts[i].department.departmentName : "Chua co phong ban"));
            System.out.println("\n"); 
            i++;
        }
        System.out.println("================================");
    }

    public void question16_14 (Account [] accounts){
        System.out.println("Question 16_14: ");
        int i = 0;
        while (i < accounts.length && accounts[i].accountID < 4 ){ //phải có điều kiện i < accounts.length để tránh lỗi ArrayIndexOutOfBoundsException là lỗi khi truy cập vào một chỉ số mảng không tồn tại
            System.out.println("Thong tin account thứ " + (i+1) + ": ");
            System.out.println("AccountID: " + accounts[i].accountID);
            System.out.println("Email: " + accounts[i].email);
            System.out.println("Full name: " + accounts[i].fullName);
            System.out.println("Phong ban: " + (accounts[i].department != null ? accounts[i].department.departmentName : "Chua co phong ban"));
            System.out.println("\n");   
            i++;
        }
        System.out.println("================================");
    }

    public void question16_15(){
        System.out.println("Question 16_15: ");
        int i = 0;  
        while (i <= 20){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
        System.out.println("================================");
    }

    public void question17_10(Account [] accounts){
        System.out.println("Question 17_10: ");

        if (accounts.length == 0) {
            System.out.println("Khong co account nao");
            System.out.println("================================");
            return;
        }
        int i = 0;

        do {
            System.out.println("Thong tin account thứ " + (i+1) + ": ");
            System.out.println("AccountID: " + accounts[i].accountID);
            System.out.println("Email: " + accounts[i].email);
            System.out.println("Full name: " + accounts[i].fullName);
            System.out.println("Phong ban: " + (accounts[i].department != null ? accounts[i].department.departmentName : "Chua co phong ban"));
            System.out.println("\n");   
            
            i++;
        } while (i < accounts.length);
        System.out.println("================================");
    }

    public void question17_11 (Department [] departments){
        System.out.println("Question 17_11: ");
        if (departments.length ==0){
            System.out.println("Khong co phong ban nao");
            System.out.println("================================");
            return;
        }
        int i = 0;
        do {
            System.out.println("Thong tin phong ban thứ " + (i+1) + ": ");
            System.out.println("DepartmentID: " + departments[i].departmentID);
            System.out.println("Ten phong ban: " + departments[i].departmentName);
            System.out.println("\n");
            i++;
        } while (i < departments.length);
        System.out.println("================================");
    }

    public void question17_12 (Department [] departments){
        System.out.println("Question 17_12: ");
        if (departments.length == 0){
            System.out.println ("Khong co phong ban nao!");
            System.out.println ("============================");
            return;
        }
        int i = 0;
        do {
            System.out.println("Thong tin phong ban thứ " + (i+1) + ": ");
            System.out.println("DepartmentID: " + departments[i].departmentID);
            System.out.println("Ten phong ban: " + departments[i].departmentName);
            System.out.println("\n");
            i++;
        } while ( i < departments.length && i != 2);
        System.out.println("================================");
    }

    public void question17_13 (Account [] accounts){
        System.out.println("Question 17_13: ");
        if (accounts.length == 0){
            System.out.println("Khong co account nao");
            System.out.println("================================");
            return;
        }
        int i = 0;
        do {
            if (i==1){
                i++;
                continue;
            }
            System.out.println("Thong tin account thứ " + (i+1) + ": ");
            System.out.println("AccountID: " + accounts[i].accountID);
            System.out.println("Email: " + accounts[i].email);
            System.out.println("Full name: " + accounts[i].fullName);
            System.out.println("Phong ban: " + (accounts[i].department != null ? accounts[i].department.departmentName : "Chua co phong ban"));
            System.out.println("\n");  
            i++; 
        } while ( i < accounts.length);
        System.out.println("================================");
    }

    public void question17_14 (Account [] accounts){
        System.out.println("Question 17_14: ");
        if (accounts.length == 0){
            System.out.println("Khong co account nao");
            System.out.println("================================");
            return;
        }
        int i = 0;
        do {
            System.out.println("Thong tin account thứ " + (i+1) + ": ");
            System.out.println("AccountID: " + accounts[i].accountID);
            System.out.println("Email: " + accounts[i].email);
            System.out.println("Full name: " + accounts[i].fullName);
            System.out.println("Phong ban: " + (accounts[i].department != null ? accounts[i].department.departmentName : "Chua co phong ban"));
            System.out.println("\n");  
            i++; 
        } while ( i < accounts.length && accounts[i].accountID < 4);
        System.out.println("================================");
    }

    public void question17_15(){
        System.out.println("Question 17_15: ");
        int i = 0;  
        do {
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
            i++;
        } while ( i <= 20);
        System.out.println();
        System.out.println("================================");
    }

}
