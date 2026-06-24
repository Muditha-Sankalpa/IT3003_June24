public class DataTypes{
    int a;
    double b;
    char c;

    DataTypes(int a, double b, char c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public static void main(String[] args){
        DataTypes obj = new DataTypes(10,5.5,'x');
        System.out.println("int " + obj.a);
        System.out.println("double " + obj.b);
        System.out.println("char " + obj.c);
    }
}
