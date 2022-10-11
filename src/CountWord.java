import java.util.Scanner;
import java.util.StringTokenizer;

public class CountWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print(">>");
            String str = scanner.nextLine();    //enter 이전까지 입력받음

            if(str.equals("그만")) {
                System.out.println("종료합니다...");
                break;
            }

            StringTokenizer st = new StringTokenizer(str, " "); //공백으로 구분하는 stringtokenizer를 생성
            System.out.println("어절 개수는 " + st.countTokens());   //토큰의 개수를 출력
        }

        scanner.close();
    }
}
