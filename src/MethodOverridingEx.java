class Shape{
    public Shape next;
    public Shape(){
        next = null;
    }

    public void draw(){
        System.out.println("Shape");
    }
}

class Line extends Shape{
    public void draw(){ //method를 클래스에 맞게 오버라이딩
        System.out.println("Line");
    }
}

class Rect extends Shape{
    public void draw(){ //method를 클래스에 맞게 오버라이딩
        System.out.println("Rect");
    }
}

class Circle extends Shape{
    public void draw(){
        System.out.println("Circle");
    }
}

public class MethodOverridingEx {
    static void paint(Shape shape){
        shape.draw();   //shape에 따라 오버라이딩된 draw를 사용, 동적 바인딩
    }

    public static void main(String[] args){
        Line line = new Line();
        paint(line);
        //새로운 객체들을 생성하여 shape에 따라 오버라이딩된 method를 호출
        paint(new Shape());
        paint(new Line());
        paint(new Rect());
        paint(new Circle());
    }
}
