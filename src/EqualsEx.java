class Point5 {
    int x, y;
    public Point5(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public boolean equals(Object obj) {
        Point5 p = (Point5)obj;
        if(x == p.x && y == p.y)
            return true;
        else
            return false;
    }
}

class Rect2 {
    int width, height;
    public Rect2(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public boolean equals(Object obj) {
        Rect2 p = (Rect2)obj;
        if (width*height == p.width*p.height)   //면적이 같다면 참
            return true;
        else
            return false;
    }
}

public class EqualsEx {
    public static void main(String[] args) {
/*        Point5 a = new Point5(2,3);
        Point5 b = new Point5(2,3);
        Point5 c = new Point5(3,4);

        if(a == b) //래퍼런스를 비교하기 때문에 거짓
            System.out.println("a==b");
        if(a.equals(b)) //객체 내용을 비교하기 때문에 참
            System.out.println("a is equal to b");
        if(a.equals(c)) //거짓
            System.out.println("a is equal to c");*/
        Rect2 a = new Rect2(2,3);
        Rect2 b = new Rect2(3,2);
        Rect2 c = new Rect2(3,4);

        //면적이 같아야 참
        if(a.equals(b))
            System.out.println("a is equal to b");
        if(a.equals(c))
            System.out.println("a is equal to c");
        if(b.equals(c))
            System.out.println("b is equal to c");
    }
}
