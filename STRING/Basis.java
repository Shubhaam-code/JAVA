import java.util.Scanner;
class Basis{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        String name= new String();

        System.out.print("ENTER THE NAME BRO :");
        
        name = sc.nextLine();

        System.out.println("MY NAME IS "+ name +".");
    }
}