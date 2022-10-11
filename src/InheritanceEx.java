class Person{
    private int weight;
    int age;
    protected int height;
    public String name;

    public void setWeight(int weight){
        this.weight = weight;
    }

    public int getWeight(){
        return weight;
    }
}

//Person을 상속받은 Student
class Student extends Person{
    public void set(){
        age = 25;
        name = "LeeBumSeok";
        height = 175;
        //private 멤버인 weight에 간접적으로 접근
        setWeight(90);
    }

    public void showStudent(){
        System.out.println("나이: " + age);
        System.out.println("이름: " + name);
        System.out.println("몸무게: " + getWeight());
    }
}

public class InheritanceEx {
    public static void main(String[] args){
        Student a = new Student();  //Student 'a'를 생성
        a.set();
        a.showStudent();
    }
}
