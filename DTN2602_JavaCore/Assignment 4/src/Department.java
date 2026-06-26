public class Department {
    int departmentID;
    String departmentName;

    public Department(){

    }

    public Department(String departmentName){
        this.departmentID =  0;
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Department{");
        sb.append("departmentID=").append(departmentID);
        sb.append(", departmentName=").append(departmentName);
        sb.append('}');
        return sb.toString();
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    
}
