abstract class Calculator{
    public abstract int add(int a, int b);
    public abstract int subtract(int a, int b);
    public abstract double average(int[] a);
}

public class GoodCalc extends Calculator {
    //추상 메소드 add, subtract, average를 구현
    public int add(int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public double average(int[] a) {
        double sum = 0;
        for(int i=0; i<a.length; i++)
            sum+=a[i];
        return sum/a.length;
    }

    public static void main(String[] args){
        GoodCalc cal = new GoodCalc();
        //구현된 추상 메소드를 호출하여 출력
        System.out.println(cal.add(2,3));
        System.out.println(cal.subtract(2,3));
        System.out.println(cal.average(new int[]{2,3,4}));
    }
}
