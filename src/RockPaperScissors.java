import java.util.Scanner;

class Player{
    private String name;
    private Scanner scanner = new Scanner(System.in);

    public Player(String name){ //name으로 객체 생성
        this.name=name;
    }
    public String getName(){
        return name;
    }
    //player의 메뉴 선택
    public int menu(){
        System.out.println(name + "[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
        return scanner.nextInt();
    }
    public int computer(){
        return (int)(Math.random()*3+1);
    }
}

public class RockPaperScissors {
    public static void main(String[] args){
        int p1_choice, p2_choice;
        String s[] = {"가위", "바위", "보"};
        Player p1 = new Player("철수");
        Player p2 = new Player("Computer");

        while(true){
            p1_choice = p1.menu();
            if(p1_choice==4)
                break;
            if(p1_choice < 1 || p1_choice > 4) {
                System.out.println("잘못된 입력입니다.");
                continue;
            }
            p2_choice = p2.computer();
            System.out.println(p1.getName() + "(" + s[p1_choice-1] + ") : " + p2.getName() + "(" + s[p2_choice-1] + ")");
            int a = p1_choice - p2_choice;
            if(a==0)
                System.out.println("비겼습니다.");
            else if(a==-1 || a==2)
                System.out.println(p1.getName() + "가 이겼습니다.");
            else
                System.out.println(p2.getName() + "가 이겼습니다.");
        }
    }
}
