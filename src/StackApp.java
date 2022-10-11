import java.util.Scanner;

interface Stack{
    int length();   //현재 스택에 저장된 개수 리턴
    int capacity(); //스택의 전체 저장 가능한 개수 리턴
    String pop();   //스택의 톱(top)에 실수 저장
    boolean push(String val);   //스택의 톱(top)에 저장된 실수 리턴
}

class StringStack implements Stack {
    private int n; //stack의 크기
    private int set; //stack pointer
    private String[] s;
    public StringStack(int n) {
        this.n = n;
        this.set = 0;
        s = new String[n];
    }
    public int length() {
        return set;
    }
    public int capacity() {
        return s.length;
    }
    public String pop() {
        if(set-1 < 0)  // stack에 아무것도 넣지 않았을 떄
            return null;
        set--; //stack pointer 1 감소
        String str = s[set]; //top의 값
        return str;
    }
    public boolean push(String str) {
        if(set < n) {
            s[set] = str; //top에
            set++; //stack pointer를 1 증가
            return true;
        }
        else
            return false;
    }
}

public class StackApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("총 스택 저장 공간의 크기 입력 >> ");
        int n = scanner.nextInt();  //스택의 크기
        StringStack stack = new StringStack(n); //StringStack 'stack'을 생성

        while(true) {
            System.out.print("문자열 입력 >> ");
            String str = scanner.next();    //스캐너에서 문자열을 받아옴
            if(str.equals("그만"))
                break;
            if(!stack.push(str)) //stack.push값이 false이면 푸시불가
                System.out.println("스택이 꽉 차서 푸시 불가!");
        }

        System.out.print("스택에 저장된 모든 문자열 팝 : ");

        for(int i=0; i<n; i++)
            System.out.print(stack.pop() + " ");

        scanner.close();
    }

}