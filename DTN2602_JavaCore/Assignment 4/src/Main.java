import java.util.ArrayList;

public class Main{
    public static void main (String [] args){
        Department d1 = new Department();
        System.out.println(d1); //Department{departmentID=0, departmentName=null}
        
        Department d2 = new Department("IT Nihongo");
        System.out.println(d2);

        // Các cách khởi tạo và gán giá trị cho đối tượng
    
        // cách 1
        Student s1 = new Student();
        s1.id = 100;
        s1.name = "Duyen";
        s1.soChan = 2;
        s1.soTay = 2;
        System.out.println(s1);

        //cách 2: contructor 2 biến
        Student s2 = new Student(2, "Chanyeol");
        System.out.println(s2);

        //cách 3: contructor 4 biến
        Student s3 = new Student(3, "D.O", 2,2);
        System.out.println(s3);
        
        //cách 4 : tạo qua set
        Student s4 = new Student();
        s4.setId(4);
        s4.setName("Beakhyun");
        System.out.println(s4);

        //arrayList
        ArrayList<Integer> pointArr = new ArrayList<Integer>();
        pointArr.add(10);
        pointArr.add(20);
        pointArr.add(30);
        for (Integer item : pointArr){
            System.out.println(item);
        }

        pointArr.remove(2);
        
        ArrayList <String> nameList = new ArrayList<String>();
        nameList.add("Chanyeol");
        nameList.add("Beakhyun");
        nameList.add("D.O");
        for (String name : nameList){
            System.out.println(name);
        }

        ArrayList <Student> studentList = new ArrayList<Student>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        // for (Student stu : studentList){
        //     System.out.println(stu);
        // }
        System.out.println(studentList);

        int searchId = 100;
        boolean found = false;
        for (Student stu : studentList){
            if (stu.getId() == searchId){
                found = true;
                System.out.println("Ten cua sinh vien la: " + stu.getName());
                break;
            }
        }
        if (!found){
            System.out.println("Khong co sinh vien voi id " + searchId);
        }
        

    }
}