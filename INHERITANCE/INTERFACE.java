class student{
    int roll;

    void getdata(int n){
        roll=n;
    }
    void putdata(){
        System.out.println("ROLL_NO :"+roll);
    }
}

class test extends student{
    int marks1,marks2;

     void getmarks(int m1,int m2){
        marks1=m1;
        marks2=m2;
    }
    void putmarks(){
        System.out.println("MARKS1 : "+marks1+ " | MARKS2 :" + marks2);
    }

}
interface sport{
    static final int sportmark=45;

    public void putsport();
}

class result extends test implements sport{
    float total;
// declare abstract method in class which implement
    public void putsport(){
        System.out.println("SPORTS MARKS :"+sportmark);
    }
    void display(){

        total=marks1+marks2+sportmark;
        putdata();
        putmarks();
        putsport();
        System.out.println("TOTAL MARKS :"+total);

    } 
}

class INTERFACE{
    public static void main(String args []){
        result aa = new result();
        aa.getdata(5);
        aa.getmarks(50,60);
        aa.display();
    }
}