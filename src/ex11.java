import java.util.Scanner;

abstract class Calc {
    protected int a, b;
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    abstract int calculate();
}

//Add, Sub, Mul, Div 클래스를 각가에 맞게 calculate를 작성
class Add extends Calc{
    public int calculate() {
        return a+b;
    }
}
class Sub extends Calc{
    public int calculate() {
        return a-b;
    }
}
class Mul extends Calc {
    public int calculate() {
        return a*b;
    }
}
class Div extends Calc{
    public int calculate() {
        if(b == 0)
            return -1;
        return a/b;
    }
}

public class ex11 {
    public static void main(String[] args){
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("두 정수와 연산자를 입력하시오 >>");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        char op = scanner.next().charAt(0);

        switch (op){
            case '+':
                Add add = new Add();
                add.setValue(a,b);
                result = add.calculate();

                break;
            case '-':
                Sub sub = new Sub();
                sub.setValue(a,b);
                result = sub.calculate();
                break;
            case '*':
                Mul mul = new Mul();
                mul.setValue(a,b);
                result = mul.calculate();
                break;
            case '/':
                Div div = new Div();
                div.setValue(a,b);
                result = div.calculate();
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }
        System.out.println(result);

        scanner.close();
    }
}
