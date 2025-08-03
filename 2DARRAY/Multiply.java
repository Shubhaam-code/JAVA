import java.util.Scanner;

class TwoDarray{

    int a[][]=new int[3][3];
    int b[][]=new int[3][3];
    int c[][]=new int[3][3];

 // input
    void getdata(){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("ENTER THE ELEMENT IN MATRIX :");
                a[i][j]=sc.nextInt();
            }
            
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("ENTER THE ELEMENT IN MATRIX :");
                b[i][j]=sc.nextInt();
            }
            
        }
       
    }

    void putdata(){
        System.out.println("FIRST MATRIX:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+ " ");
                }
            System.out.println();
        }
        

        System.out.println("SECOND MATRIX:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(b[i][j] +" ");
                }
            System.out.println();
        }

    }

    
    void multiply(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=0;
                for(int k=0;k<3;k++){
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
                }
            }
        }
    }

    

    void display(){
        System.out.println("MULTIPLY MATRIX :");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){

                System.out.print(c[i][j] + " ");    
            }
            System.out.println();
            }
    }
}

class Multiply{
    public static void main(String arg []){
        TwoDarray aa = new TwoDarray();
        aa.getdata();
        aa.multiply();
        aa.putdata();
        aa.display();
    }
}