import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] students=new Student[5];
//        System.out.println(Arrays.toString(students));

        Student sam = new Student(23,"Samarth",95);
//        System.out.println(sam.rollNo);
//        sam.rollNo=23;
//        sam.marks=95;
//        sam.name="Samarth";

        Student gar = new Student();
        gar.name="Gargi";
        gar.marks=93;
        gar.rollNo=28;

        Student nav = new Student();
        nav.name="Navneet";
        nav.marks=94;
        nav.rollNo=36;

//        System.out.println(nav.name);

    }
}

class Student{
    int rollNo;
    String name;
    float marks;
}
