import java.util.Scanner;

class count{
    String name;
    void getdata(){
        Scanner sc= new Scanner(System.in);
       
        System.out.print("ENTER THE NAME :");

        name=sc.nextLine();
        name=name.toUpperCase();
        System.out.println("NAME :"+name);


    }
    

    void display(){
         int vowel=0;
         int cons=0;

        for(int i=0;i<name.length();i++){
             char a =name.charAt(i);
             if(a=='A'|| a=='E'|| a=='I'|| a=='O'|| a=='U' ){
                 vowel+=1;
             }
             else if (Character.isLetter(a)){ // igonre space and no
                 cons+=1;
             }
        }
        System.out.println("VOWEL :"+vowel);
        System.out.println("CONS :"+cons);

    }
    
}

public class vowel{
    public static void main (String args []){
        count aa = new count();
        aa.getdata();
        aa.display();

    }
}