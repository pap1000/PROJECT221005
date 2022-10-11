class Point3{
    int x, y;
    public Point3(int x, int y){
        this.x=x;
        this.y=y;
    }
}

public class ObjectPropertyEx {
    public static void print(Object obj){
        System.out.println(obj.getClass().getName());   //클래스 이름 출력
        System.out.println(obj.hashCode()); //hash code 값을 출력
        System.out.println(obj.toString()); //object를 문자열로 출력
        System.out.println(obj);    //object 출력
    }
    public static void main(String[] args){
        Point3 p = new Point3(2,3);
        print(p);
    }
}
