//crate a class 
class Student{
    //class var
    String name;
    int id;
    Student(String name, int id){
        this.name=name;
        this.id=id;
    }
    //method-display the details 
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Id:"+id);
    }
}
//child class
class Collegesudent extends Student{
    String Course;
    //constructor
    Collegesudent(String name, int id, String Course){
        super(name, id);
        this.Course=Course;
    }
    //overide the parent 
    @Override 
    void display(){
        System.out.println("Student name:"+name);
        System.out.println("Student Id:"+id);
        System.out.println("Student course:"+Course);
    }
}
//main class
public class Main {
    //main method 
    public static void main(String[] args) {
        //object-used to run class method
        Student s1=new Student("Ameera", 04);
        Collegesudent s2=new Collegesudent("alex",05,"bio");
        //excute
        s2.display();//child class method
    }
}