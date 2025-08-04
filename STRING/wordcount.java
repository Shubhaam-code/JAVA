import java.util.Scanner;

class word{
    

    Scanner sc =new Scanner(System.in);
    String name;
    //input
    void getdata()
    {
        System.out.print("ENTER THE NAME :");
        name=sc.nextLine();
    }
    
    
    void work(){
        int word=1;
        
        for(int i=0;i<name.length()-1;i++){
            int j=i+1;
            if(name.charAt(i)==' ' && name.charAt(j)!=' '){
                word+=1;
                
            }

        }
        System.out.println("WORDS :"+word);
        
    }
    void display(){
        System.out.println("NAME :"+name);
        

    }
}

public class wordcount{
    public static void main(String args []){
        word aa =new word ();
        aa.getdata();
        aa.display();
        aa.work();
    }
}