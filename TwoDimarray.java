import java.util.Scanner;

class TwoDarray{

    int a[][]=new int[3][3];

    void getdata(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("ENTER THE NUMBER :");
                Scanner sc = new Scanner(System.in);
                a[i][j]=sc.nextInt();
            }
        }
    }
    void display(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j] + " ");    
            }
            System.out.println();
            }
    }

}

class TwoDimarray{
    public static void main(String arg []){
    TwoDarray a= new TwoDarray();
    a.getdata();
    a.display();

    }
    
}
