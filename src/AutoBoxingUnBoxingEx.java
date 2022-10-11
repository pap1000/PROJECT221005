public class AutoBoxingUnBoxingEx {
    public static void main(String[] args) {
        int n = 10;

        Integer intObject = n; //자동 박싱(int형 n을 Integer 객체로)
        System.out.println("intObject = " + intObject);

        int m = intObject + 10; //자동 언박싱(Integer 객체를 int형 n으로)
        System.out.println("m = " + m);
    }
}
