import java.util.Scanner;

class palidrone1{

    Scanner sc = new Scanner(System.in);
    String name;
    void input(){
        System.out.print("ENTER THE NAME :");
        name=sc.next();
    }
    void method(){
        int i=0;
        int j=name.length()-1;
        int flag=0;
        while(i<j && flag==0){
            if(name.charAt(i)!=name.charAt(j)){
                flag=1;  
                System.out.println("NOT A PALIDRONE :"); 
            }
            i++;
            j--;
        }
        if(flag==0){
            System.out.println("PALIDRONE ");

        }
    }
}
public class palidrome{
    public static void main(String arg []){
        palidrone1 aa= new palidrone1();
        aa.input();
        aa.method();
    }
}