import java.util.Scanner;

class cal{

    int x;
    int y;
    int no;
    Scanner sc = new Scanner(System.in);
    void input(){
        System.out.print("ENTER THE 1ST NO :");
        x=sc.nextInt();
        System.out.print("ENTER THE 2ST NO :");
        y=sc.nextInt();


    }
    void operation(){
        System.out.println("ENTER THE 1 FOR + :");
        System.out.println("ENTER THE 2 FOR - :");
        System.out.println("ENTER THE 3 FOR * :");
        System.out.println("ENTER THE 4 FOR / :");
        no=sc.nextInt();

    }
    void method(){
        if(no==4 && y==0){
            System.out.println("INVAILD");
            return;
        }
        switch(no){
            case 1:
                System.out.println("ADDITION OF TWO NO :"+(x+y));
                break;
            case 2:
                System.out.println("SUBTRACTION OF TWO NO :"+(x-y));
                break;
            case 3:
                System.out.println("MULTIPLICATION OF TWO NO :"+(x*y));
                break;
            case 4:
                System.out.println("DIVISION OF TWO NO :"+(x/y));
                break;
            default:
                System.out.println("INVAILD");


        }
    }


}
class Calculator{
    public static void main(String arg []){
        cal aa= new cal();
        aa.input();
        aa.operation();
        aa.method();
        
    }
}