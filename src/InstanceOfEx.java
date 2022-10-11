class Researcher extends Person{}
class Professor extends Researcher{}

public class InstanceOfEx {
    static void print(Person a){
        if(a instanceof Person)
            System.out.print("Person ");
        if(a instanceof Student)
            System.out.print("Student ");
        if(a instanceof Researcher)
            System.out.print("Researcher ");
        if(a instanceof  Professor)
            System.out.print("Professor ");
        System.out.println();
    }

    public static void main(String[] args){
        System.out.print("new Student() -> ");
        print(new Student());
        System.out.print("new Researcher() -> ");
        print(new Researcher());
        System.out.print("new Professor() -> ");
        print(new Professor());
    }
}
