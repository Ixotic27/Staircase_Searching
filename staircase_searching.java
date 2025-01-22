import java.util.*;
public class staircase_searching {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n,m;
            System.out.println("Enter the number of rows and columns of the matrix: ");
            n = sc.nextInt();
            m = sc.nextInt();
            int ar[][]=new int[n][m];
            System.out.println("Enter the elements of the matrix: ");
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    ar[i][j]=sc.nextInt();
                }
            }
            int key;
            System.out.println("Enter the element to be searched: ");
            key = sc.nextInt();
            sort(ar,key);
        }
    }
    public static boolean sort(int ar[][], int key){
        int row=0,col=ar[0].length-1;
        while(row<ar.length && col>=0){
            if(ar[row][col]==key){
                System.out.println("Element found at: "+row+" "+col);
                return true;
            }
            else if(ar[row][col]>key){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Element not found");
        return false;
    }
}
