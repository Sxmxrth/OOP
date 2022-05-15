public class wrapper_classes {
    public static void main(String[] args) {
        //Wrapper class
        Integer x=10;
        Float f=12.5f;
        Character ch='A';
        System.out.println(x);
        System.out.println(f);
        System.out.println(ch);

//        Integer a=20;
//        Integer b=10;
//        swap(a,b);
//        System.out.println(a+" "+b);


        //how to swap two number using a method
        swapNumber s= new swapNumber();
        s.x=10;
        s.y=20;
        swap(s);
        System.out.println(s.x+" "+s.y);
    }

    static void swap(swapNumber a){
        a.x = a.x + a.y;
        a.y = a.x - a.y;
        a.x = a.x - a.y;
    }
}

class swapNumber{
    int x,y;
}
