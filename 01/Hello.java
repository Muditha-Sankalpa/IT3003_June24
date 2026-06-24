public class Hello{
    String name;
    int age;

    Hello(String name,int age){
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args){
        Hello h= new Hello("thanu",23);
        System.out.println("my name is " + h.name);
        System.out.println("i am " + h.age +"years old");
    }
}