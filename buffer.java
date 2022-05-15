import java.io.*;
import java.lang.*;
public class buffer {
    public static void main(String[] args) throws IOException, NumberFormatException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter name:");
        String name=br.readLine();
        System.out.println("enter phone number:");
        int phone=Integer.parseInt(br.readLine());
        System.out.println("enter marks:");
        float marks=Float.parseFloat(br.readLine());
        System.out.println("Your name is "+name);
        System.out.println("phone is "+phone);
        System.out.println("marks are "+marks);

    }
}
