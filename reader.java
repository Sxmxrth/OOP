import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class reader {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter name");
        String name=br.readLine();

    }
}
