import java.util.Scanner;

class TwoDarray{

    int a[][]=new int[3][3];
    int b[][]=new int[3][3];
    int c[][]=new int[3][3];

    void getdata(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("ENTER THE NUMBER :");
                Scanner sc = new Scanner(System.in);
                a[i][j]=sc.nextInt();
                b[i][j]=sc.nextInt();
            }
        }
    }
    void add(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){

                System.out.print(c[i][j]=a[i][j]+b[i][j] + "  ");    
            }
            System.out.println();
            }

    }

    void display(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){

                System.out.print(c[i][j] + " ");    
            }
            System.out.println();
            }
    }

}

class TwoDimarrayAddition{
    public static void main(String arg []){
    TwoDarray aa= new TwoDarray();
    aa.getdata(); 
    aa.add();   
    aa.display();

    }
    
}
