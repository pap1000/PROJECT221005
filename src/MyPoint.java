public class MyPoint {
    private int x, y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "Point(" + x + "," + y + ")";
    }
    public boolean equals(Object obj) {
        MyPoint dot = (MyPoint)obj;     //비교할 점을 MyPoint로 변환
        if(x == dot.x && y == dot.y)    //해당 점과 비교하는 점이 같은 좌표라면 true
            return true;
        else
            return false;
    }

    public static void main(String [] args) {
        MyPoint p = new MyPoint(3, 50);
        MyPoint q = new MyPoint(4, 50);
        System.out.println(p);
        if(p.equals(q)) System.out.println("같은 점");
        else System.out.println("다른 점");
    }
}