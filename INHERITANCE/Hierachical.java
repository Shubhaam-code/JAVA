import java.util.Scanner;


class a{
    Scanner sc = new Scanner(System.in);

    int a;
    int b;
    
    void input(){
        System.out.print("ENTER A :");
        
        a=sc.nextInt();
        System.out.print("ENTER B :");
        b=sc.nextInt();
    }

}
class b extends a{
    
    int sum;
    void display(){
        sum=a+b;
        System.out.println("TOTAL SUM :"+sum);
    }

}
class c extends a{
    
    int diff;
    
    
    void putdata(){
        diff=a-b;
        System.out.println("TOTAL DIF :"+diff);
    }

}

class Hierachical{
    public static void main(String arg[]){
        b aa=new b();
        c bb=new c();

        aa.input();
        aa.display();
        bb.input();
        bb.putdata();
    }
}