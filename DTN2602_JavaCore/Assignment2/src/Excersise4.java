import java.time.LocalDate;
import java.util.Random;
/* Muốn random thì:
- Random random = new Random();
+ int a = random.nextInt();
+ int a = random.nextInt(n); random từ 0 -> n-1
+ double a = random.nextDouble()
- Muốn random các thành phần trong Array -> random index -> array(index)
 */
public class Excersise4 {

    public void question1(){
        System.out.println("Excersise 4 - Question 1:");
        Random random = new Random();
        int a = random.nextInt(); //0 --> 9
        System.out.println(a);
        System.out.println("===========================================");
    }

    public void question2(){
        System.out.println("Excersise 4 - Question 2:");
        Random random = new Random();
        double a = random.nextDouble(); //0 --> 9
        System.out.println(a);
        System.out.println("===========================================");
    }

    public void question3(){
        System.out.println("Excersise 4 - Question 3:");
        Random random = new Random();
        String a[] = new String[] {"Chanyeol", "Baekhyun", "D.O", "Kai"};
        // String a[] = {""};
        int index = random.nextInt(a.length); //từ 0 -> a.length - 1
        String name = a[index];
        System.out.println(name);
        System.out.println("===========================================");
    }

    /*
    + date.getYear();      // int
    + date.getMonthValue();// int
    + date.getDayOfMonth();// int
    + date.toEpochDay();   // long 
    + date.ofEpochDay(long a) // ngày tháng
    */

    public void question4(){
        //Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24-07-1995 tới ngày 20-12- 1995
        System.out.println("Excersise 4 - Question 4:");
        Random random = new Random();
        
        int minDay = (int) LocalDate.of(1995, 07, 24).toEpochDay(); //ép kiểu vì toEpochDay() trả về long
        int maxDay = (int) LocalDate.of(1995,12,20).toEpochDay();
        //đổi ngày thành số ngày tính từ mốc 01/01/1970.

        long randomInt = random.nextInt(maxDay - minDay) + minDay;
        // nextInt(20-10+1) -> random(11) -> random từ 0 -> 10; 
        // nếu muốn random từ 10 - 20 -> nextInt(20-10+1) + 10

        LocalDate randomDay = LocalDate.ofEpochDay(randomInt); // đổi từ long -> date
        System.out.println(randomDay); //1995-08-21
        System.out.println("===========================================");
    }

    public void question5(){
        System.out.println("Excersise 4 - Question 5:");
        Random random = new Random();
        int minDay = (int) LocalDate.of(2025, 01, 01).toEpochDay();
        int maxDay = (int) LocalDate.of(2026,01,01).toEpochDay();
        long randomInt = random.nextInt(maxDay - minDay) + minDay;
        LocalDate randomDay = LocalDate.ofEpochDay(randomInt); 
        System.out.println(randomDay); 
        System.out.println("===========================================");
    }  
    
    public void question6(){
        // lấy ngẫu nhiên 1 ngày trong quá khứ
        System.out.println("Excersise 4 - Question 6:");
        Random random = new Random();
        int today = (int) LocalDate.now().toEpochDay();
        long randomInt = random.nextInt(today);
        LocalDate randomDay = LocalDate.ofEpochDay(randomInt); 
        System.out.println(randomDay); 
        System.out.println("===========================================");
    } 

    public void question7(){
        // ramdom số có 3 chữ số
        System.out.println("Excersise 4 - Question 7:");
        Random random = new Random();
        int a = random.nextInt(999 - 100 + 1) + 100; //100 - 
        System.out.println(a);
        System.out.println("===========================================");
    }
    


}
