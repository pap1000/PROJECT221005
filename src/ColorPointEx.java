class Point1 {
    private int x, y;

    public void set(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void showPoint(){
        System.out.println("(" + x + "," + y + ")");
    }
}

//class Point를 상속받은 ColorPoint
class ColorPoint1 extends Point1 {
    private String color;

    public void setColor(String color){
        this.color = color;
    }

    public void showColorPoint(){
        System.out.print(color);
        showPoint();
    }
}

public class ColorPointEx {
    public static void main(String[] args){
        Point1 dot = new Point1();    //Point 'dot'을 생성 후 출력
        dot.set(1,2);
        dot.showPoint();

        //ColorPoint "Color" 생성 후 좌표와 색 입력 후 출력
        ColorPoint1 Color = new ColorPoint1();
        Color.set(3,4);
        Color.setColor("red");
        Color.showColorPoint();
    }
}
