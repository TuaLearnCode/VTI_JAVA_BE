public class Student {
    int id;
    String name;
    int soTay;
    int soChan;

    public Student(){

    }
    
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(int id, String name, int soTay, int soChan){
        this.id = id;
        this.name = name;
        this.soChan = soChan;
        this.soTay = soTay;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", soTay=").append(soTay);
        sb.append(", soChan=").append(soChan);
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSoTay(){
        return soTay;
    }
    public void setSoTay(int soTay){
        this.soTay = soTay;
    }


}
