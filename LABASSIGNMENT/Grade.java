import java.util.Scanner;

class Student{
    int marks;
    Scanner sc = new Scanner(System.in);
    
    // INPUT
    void input(){
        System.out.print("ENTER THE NO :");
        marks=sc.nextInt();
        if(marks<0 || marks>100){
            System.out.println("INVAILD MARKS ");
        }
        else{
            output();
        }
    
        
    }
    // THIS FUNCTION DETERMINE GRADE
    void output(){
        if(marks>=90){
            System.out.print("GRADE : A");
           
            }
        else if (marks>=80 ){
            System.out.print("GRADE : B");
            
            }
        else if(marks>=70 ){
            System.out.print("GRADE : C");
            
            }
        else if(marks>60 ){
            System.out.print("GRADE : D");
            
            }
        else{
                System.out.print("GRADE : F");

            }
        }
    }
    




class Grade{
    public static void main(String arg []){
        Student aa= new Student();
        aa.input();
        
    }
}