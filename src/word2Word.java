import java.util.Scanner;

public class word2Word {
    public static void main(String[] args) {
        System.out.print(">>");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();//한 줄을 읽고 StringBuffer로 변환
        StringBuffer sb = new StringBuffer(text);

        while(true) {
            System.out.print("명령: ");
            String cmd = scanner.nextLine();          //한 줄을 읽고 문자열에 저장
            String[] words = cmd.split("!");   //!을 기준으로 나눔

            if(cmd.equals("그만")) {
                System.out.print("종료합니다");
                break;
            }
            if(words[0].length() == 0 || words[1].length() == 0) {    //양쪽 토큰 중 하나라도 길이가 0이라면
                System.out.println("잘못된 명령입니다!");
                continue;
            }

            int first = sb.indexOf(words[0]);  //첫번째 토큰과 일치하는 stringbuffer의 첫 index값
            if(first == -1) { //일치하는 단어가 없음
                System.out.println("찾을 수 없습니다!");
                continue;
            }
            sb.replace(first, first + words[0].length(), words[1]);
            System.out.println(sb.toString());
        }

        scanner.close();
    }
}
