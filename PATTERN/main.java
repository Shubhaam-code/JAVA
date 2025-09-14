class A{
    public void show(){
        System.out.println("HELLO");
    }
}
class B extends A{
    public void show(){
         System.out.println("Hey");
    }
}

class main{
    public static void main(String arg[]){
        B bb = new B();
        bb.show();

    }

}