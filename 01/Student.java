public class Student{
    String name;
    int age;
    double gpa;

    Student(String name,int age,double gpa){
        this.name=name;
        this.age=age;
        this.gpa=gpa;
    }

    public static void main(String[] args){
        Student obj=new Student("thanu",23,3.8);
        System.out.println("my name is " + obj.name);
        System.out.println("i am " + obj.age + "years old");
        System.out.println("i got a " + obj.gpa + "gpa value" );

    }
}