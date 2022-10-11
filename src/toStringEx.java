class Point4{
    int x, y;

    public Point4(int x, int y) {
        this.x=x;
        this.y=y;
    }

    public String toString(){
        return "Point(" + x + "," + y + ")";
    }
}

public class toStringEx {
    public static void main(String[] args){
        Point4 p = new Point4(2,3);

        System.out.println(p.toString());   //Point4 'p'를 문자열로 리턴받아 출력
        System.out.println(p);              //p를 자동으로 변환하여 출력
        System.out.println(p + "입니다.");
    }
}
