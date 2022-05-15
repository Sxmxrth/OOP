public class Main {
    public static void main(String[] args) {
        Student[] students=new Student[5];
//        System.out.println(Arrays.toString(students));

        Student sam = new Student();
        System.out.println(sam.rollNo);
        System.out.println(sam.name);
        System.out.println(sam.marks);
        sam.rollNo=23;
        sam.marks=95;
        sam.name="Samarth";
//        System.out.println(sam.rollNo);
//        System.out.println(sam.name);
//        System.out.println(sam.marks);

        Student gar = new Student("Gargi");
        System.out.println(gar.name);
        System.out.println(gar.rollNo);
        System.out.println(gar.marks);
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

    Student(){
        this.rollNo=25;
        this.name="Samarth";
        this.marks=96.5f;

    }
    Student(String name){
        this.name=name;
        this.rollNo=28;
        this.marks=95.5f;

    }
}
