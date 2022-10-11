import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐", "/");   //Stringtokenizer 생성
        while (st.hasMoreTokens())  //다음 토근이 있다면 true
            System.out.println(st.nextToken()); //다음 토큰을 출력
    }
}
