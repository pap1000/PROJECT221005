import java.util.Calendar;

public class GoodMorning {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance(); //Calendar 'now'를 생성, 현재 날짜와 시간 저장

        int hour = now.get(Calendar.HOUR_OF_DAY);   //24시를 기준으로한 시
        int minute = now.get(Calendar.MINUTE);      //분
        System.out.println("현재 시간은 " + hour + "시 " + minute + "분입니다.");

        if(hour > 4 && hour < 12)               //오전 4시부터 12시이전
            System.out.println("Good Morning");
        else if(hour >= 12 && hour < 18)        //오전 12시부터 오후 18시이전
            System.out.println("Good Afternoon");
        else if(hour >= 18 && hour < 22)        //오후 18시~오후 22시
            System.out.println("Good Evening");
        else                                    //오후 22시에서 오전 4시까지
            System.out.println("Good Night");
    }
}