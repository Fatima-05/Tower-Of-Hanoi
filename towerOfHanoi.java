import java.util.*;
public class towerOfHanoi{
    public static void hanoiTower(int n, String source, String helper, String destination){
        if(n==1){
            System.out.println("Move disk 1 from "+source+" to "+destination);
            return;
        }
        hanoiTower(n-1, source, destination, helper);
        System.out.println("Move disk "+n+" from "+source+" to "+destination);
        hanoiTower(n-1, helper, source, destination);
    }
    public static void main(String args[]){
        Scanner sc=null;
        try(Scanner scDisk=new Scanner(System.in);){
            System.out.print("Enter number of disk(s): ");
            int n=scDisk.nextInt();
            if(n<=0){
                System.out.println("Invalid number of disks!");
                return;
            }
            hanoiTower(n,"S","H","D");
        }
        finally{
            if(sc!=null){
                sc.close();
            }
        }
    }
}