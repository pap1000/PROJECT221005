interface PhoneInterface{
    final int TIMEOUT = 10000;
    void sendCall();
    void receiveCall();
    default void printLogo() {
        System.out.println("** Phone **");
    }
}

interface MobilePhoneInterface extends PhoneInterface{
    void sendSMS();
    void receiveSMS();
}

interface MP3Interface{
    public void play();
    public void stop();
}

class PDA{
    public int calculate(int x, int y){
        return x+y;
    }
}

//두 개의 인터페이스를 구현하고 PDA를 상속받은 class 'SamsungPhone'
class SamsungPhone extends PDA implements MobilePhoneInterface, MP3Interface{
    public void sendCall(){
        System.out.println("따르릉따르릉~~");
    }
    public void receiveCall(){
        System.out.println("전화가 왔습니다.");
    }
    public void sendSMS(){
        System.out.println("문자갑니다.");
    }
    public void receiveSMS(){
        System.out.println("문자왔어요.");
    }
    public void play(){
        System.out.println("음악 연주합니다.");
    }
    public void stop(){
        System.out.println("음악 중단합니다.");
    }
    public void schedule(){
        System.out.println("일정 관리합니다.");
    }
}

public class InterfaceEx {
    public static void main(String[] args){
        SamsungPhone galaxy = new SamsungPhone();   //SamsunPhone 'galaxy' 생성
        //구현된 추상 메소드를 호출
        galaxy.printLogo();
        galaxy.sendCall();
        galaxy.play();
        System.out.println("3과 5를 더하면 " + galaxy.calculate(3,5));
        galaxy.schedule();
    }
}
