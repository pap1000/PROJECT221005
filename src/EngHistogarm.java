import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class EngHistogarm {
    static String read(){
        StringBuffer sb = new StringBuffer();   //string buffer와 scanner 생성
        Scanner scanner = new Scanner(System.in);

        while(true){
            String line = scanner.nextLine();   //enter 전까지를 line에 입력
            if(line.equals(";"))    //세미콜론을 만날 때까지 무한루프
                break;
            sb.append(line);        //string buffer에 line을 추가
        }
        return sb.toString(); //string buffer를 문자열로 반환
    }

    public static void main(String[] args){
        int alphabet_count[]= new int[26];  //알파벳의 개수가 26개이기 때문에 크기가 26인 배열 선언

        System.out.print("영문 텍스트를 입력하고 세미콜론을 입력하세요.\n");
        String str = read().toLowerCase();  //read로 반환되는 문자열을 소문자로 변환

        for(int i=0; i < str.length(); i++){
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')  //알파벳일 때
                alphabet_count[(int)(str.charAt(i) - 'a')]++; //alphabet_count내에서의 해당 알파벳의 인덱스의 값을 증가
        }

        for(int i=0; i < 26; i++){
            System.out.print((char)(i + 'a'));
            for(int j=0; j < alphabet_count[i]; j++)    //카운트된 인덱스의 값만큼 "-"를 출력하여 histogram을 그림
                System.out.print("-");
            System.out.println();
        }

    }
}
