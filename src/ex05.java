class Point {
    private int x, y;
    public Point(int x, int y) { this.x = x; this.y = y; }
    public int getX() { return x; }
    public int getY() { return y; }
    protected void move(int x, int y) { this.x =x; this.y = y; }
}

//Point를 상속받은 ColorPoint
class ColorPoint extends Point {
    private String color;   //private 멤버 color
    public ColorPoint(int x, int y, String color) { //좌표와 색으로 ColorPoint 생성
        super(x, y);
        this.color = color;
    }
    public void setXY(int x, int y){    //좌표를 지정
        move(x, y);
    }
    public void setColor(String color){ //색을 지정
        this.color = color;
    }
    public String toString() {  //색과 좌표를 문장으로 출력함
        String str = color+"색의 " + "(" + getX() + "," + getY() + ")의 점";
        return str;
    }
}

class Point3D extends Point{
    private int z;

    public Point3D(int x, int y, int z){
        super(x,y);
        this.z = z;
    }
    //z축으로 1 상승
    public void moveUp(){
        z++;
    }
    //z축으로 1 감소
    public void moveDown(){
        z--;
    }
    //이동할 좌표값을 입력하면 해당 좌표로 이동
    public void move(int x, int y, int z){
        move(x,y);
        this.z = z;
    }
    //점의 좌표를 출력
    public String toString(){
        String str = "(" + getX() + "," + getY() + "," + z + ")의 점";
        return str;
    }
}

public class ex05 {
    public static void main(String[] args) {
        Point3D p = new Point3D(1,2,3); // 1,2,3은 각각 x, y, z축의 값
        System.out.println(p.toString() + "입니다.");

        p.moveUp(); // z 축으로 위쪽 이동
        System.out.println(p.toString() + "입니다.");

        p.moveDown(); // z 축으로 아래쪽 이동
        p.move(10, 10); // x, y 축으로 이동
        System.out.println(p.toString() + "입니다.");

        p.move(100,  200, 300); // x, y, z축으로 이동
        System.out.println(p.toString() + "입니다.");
    }
}