
import java.util.Scanner;

public class arra {
    public static void main(String[] args) {
        Scanner me = new Scanner(System.in);
        char arr[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','/','.'};
        int n=me.nextInt();
        int idx=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[idx++]+" ");
            }
            System.out.println();
        }
    }
}
