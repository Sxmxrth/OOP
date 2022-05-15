public class overloading {
    public static void main(String[] args) {
        Students samarth=new Students(23,"Samarth",95.6f);
        Students gargi= new Students(28,"Gargi",96.0f);
        Students navneet= new Students(50,"Navneet",94.0f);

        System.out.println(samarth.name);
        System.out.println(gargi.name);
        System.out.println(navneet.name);

        System.out.println(samarth.rollNo);
        System.out.println(gargi.rollNo);
        System.out.println(navneet.rollNo);

        System.out.println(samarth.marks);
        System.out.println(gargi.marks);
        System.out.println(navneet.marks);
    }
}

class Students{
    int rollNo;
    String name;
    float marks;

    Students(int r,String n,float m){
        this.rollNo=r;
        this.name=n;
        this.marks=m;
    }
}
