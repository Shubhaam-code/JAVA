import java.util.Scanner;


class a{
    Scanner sc = new Scanner(System.in);

    int a;
    int b;
    int sum;
    void input(){
        System.out.print("ENTER A :");
        
        a=sc.nextInt();
        System.out.print("ENTER B :");
        b=sc.nextInt();
    }
    void add(){
        sum=a+b;
        System.out.println("SUM :"+sum);

    }

}
class b extends a{
    
    int c;
    void getdata(){
        System.out.print("ENTER C :");
        
        c=sc.nextInt(); 
    }
    void display(){
        System.out.println("TOTAL SUM :"+(c+sum));
    }

}

class Single{
    public static void main(String arg[]){
        b aa=new b();
        aa.input();
        aa.add();
        aa.getdata();
        aa.display();
    }
}