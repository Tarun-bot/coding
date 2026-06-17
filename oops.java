public class oops {
    int a;
    oops(int b){
        a=b;
    }
    void display(){
        System.out.println("the value of a is: "+a);
    }
    public static void main(String[] args) {
        oops obj=new oops(2);

        obj.display();
    }
    
}
