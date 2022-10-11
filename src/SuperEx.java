class Point2{
    private int x, y;

    public Point2(){
        this.x = this.y = 0;
    }
    public Point2(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void showPoint2(){
        System.out.println("(" + x + "," + y + ")");
    }
}

//point2를 상속받은 ColorPoint2, super를 사용하여 슈퍼클래스 Point2 생성자 호출
class ColorPoint2 extends Point2{
    private String color;
    public ColorPoint2(int x, int y, String color){
        super(x, y);
        this.color = color;
    }

    public void showColorPoint(){
        System.out.print(color);
        showPoint2();
    }
}

public class SuperEx{
    public static void main(String[] args){
        ColorPoint2 dot2 = new ColorPoint2(5, 6, "blue");   //ColorPoint2 'dot2'를 생성
        dot2.showColorPoint();
    }
}