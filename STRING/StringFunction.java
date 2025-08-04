import java.util.Scanner;

class StringFunction {
    public static void main(String args []){
         Scanner sc= new Scanner(System.in);

         String name;
         System.out.print("ENTER THE NAME :");

         name=sc.nextLine();

         System.out.println("NAME :" +name);
         System.out.println(name.length());
         System.out.println(name.charAt(0));
         
         for(int i=0;i<name.length();i++){
            System.out.print(name.charAt(i)+" ");
         }
    }

}
