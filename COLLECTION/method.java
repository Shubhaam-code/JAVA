import java.util.*;

public class method
{
    public static void main(String []args)
    {
        ArrayList a1=new ArrayList();
        a1.add(100);
        a1.add("RAHUL");
        a1.add(300);
        System.out.println(a1);

        System.out.println(a1.contains(500));
        System.out.println(a1.isEmpty());
        System.out.println("SIZE :"+ a1.size());
        a1.remove(0); 
        System.out.println(a1);

        ArrayList a2=new ArrayList();
        a2.add("AMRIT");
        a2.add("SHUBHAM");
        a2.add("ALOK");
        System.out.println(a2);

        a1.addAll(a2);
        
        System.out.println(a1);

        a1.removeAll(a2);
        System.out.println(a1);
        a1.clear();
        System.out.println(a1);
    }
}