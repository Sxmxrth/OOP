import java.io.*;
public class searching_buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int[] arr={-1,3,17,69,100,120};
        System.out.println("enter a number to search in this array :");
        int target=Integer.parseInt(br.readLine());
        System.out.println(binary(arr,target));
    }

    public static int binary(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+ (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
