import java.util.Scanner;

abstract class GameObject { //추상 클래스
    protected int distance; //한 번 이동 거리
    protected int x, y; //현재 위치(화면 맵 상의 위치)
    public GameObject(int startX, int startY, int distance) { //초기 위치와 이동 거리 설정
        this.x = startX;
        this.y = startY;
        this.distance = distance;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public boolean collide(GameObject p) { //이 객체가 객체 p와 충돌했으면 true 리턴
        if(this.x == p.getX() && this.y == p.getY())
            return true;
        else
            return false;
    }
    protected abstract void move(); //이동한 후의 새로운 위치로 x, y 변경
    protected abstract char getShape(); //객체의 모양을 나타내는 문자 리턴
}

class Bear extends GameObject{
    Scanner scanner = new Scanner(System.in);

    public Bear(int x, int y, int d){
        super(x, y, d);
    }

    protected void move(){
        System.out.print("왼쪽(a), 위(w), 아래(s), 오른쪽(d) >> ");
        String input = scanner.next();  //bear의 방향을 지정할 입력값을 저장

        switch (input){ //입력된 값에 따라 bear가 다른 방향으로 움직임
            case "a":
                if(super.y > 0)
                    super.y -= super.distance;
                break;
            case "w":
                if(super.x > 0)
                    super.x -= super.distance;
                break;
            case "s":
                if(super.x < 9)
                    super.x += super.distance;
                break;
            case "d":
                if(super.y < 19)
                    super.y += super.distance;
                break;
        }
    }

    protected char getShape(){
        return 'B';
    }
}

//GameObject를 상속받은 Fish
class Fish extends GameObject{
    public Fish(int x, int y, int d){
        super(x, y, d);
    }

    protected void move(){
        int move = (int)(Math.random()*4);  //fish가 랜덤한 방향으로 움직이게 할 변수

        switch(move){   //랜덤으로 정해진 변수에 따라 fish가 다른 방향으로 움직임
            case 0:
                if(super.x > 0)
                    super.x -= super.distance;
            case 1:
                if(super.y > 0)
                    super.y -= super.distance;
                break;
            case 2:
                if(super.x < 9)
                    super.x += super.distance;
                break;
            case 3:
                if(super.y < 19)
                    super.y += super.distance;
                break;
        }
    }

    public char getShape(){
        return '@';
    }
}

public class Game {
    char[][] Map = new char[10][20];    //지도로 사용할 배열
    Bear bear;  //Object bear와 fish
    Fish fish;

    public static void main(String[] args){
        Game game = new Game();
        game.start();
    }

    //게임 시작 method
    public void start(){
        System.out.println("** Bear의 Fish 먹기 게임을 시작합니다 **");
        bear = new Bear(0,0,1); //bear의 초기값
        fish = new Fish((int)(Math.random()*10), (int)(Math.random()*20), 1); //fish의 초기값

        PrintMap(); //지도 출력
        int index = 0;  //5번마다 랜덤으로 움직일 fish를 위한 index
        int move[] = fishmove();    //fish의 움직임을 저장한 랜덤배열
        while(true){
            bear.move();    //bear가 움직이고
            if(move[index]==1)  //랜덤배열의 값이 1이면 fish도 움직임
                fish.move();
            index++;    //5번이라는 분기를 체크하기 위해 index 증가
            if(index==5){   //한 분기를 마쳤을 경우 초기화
                move = fishmove();
                index = 0;
            }
            PrintMap(); //변경된 지도를 출력
            if(bear.collide(fish)){ //bear와 fish가 충돌했을 경우 bear의 승리
                System.out.println("Bear wins!!");
                break;
            }
        }
    }

    //지도로 사용할 배열에 bear와 fish의 위치를 입력 후 출력하는 method
    public void PrintMap(){
        for(int i=0; i<10; i++)
            for(int j=0; j<20; j++)
                Map[i][j] = '-';

        //baer와 fish의 현재 위치를 입력
        Map[bear.getX()][bear.getY()] = bear.getShape();
        Map[fish.getX()][fish.getY()] = fish.getShape();

        //전체 지도를 출력
        for(int i=0; i<10; i++) {
            for (int j = 0; j < 20; j++)
                System.out.print(Map[i][j]);
            System.out.println();
        }
    }

    //fish가 랜덤하게 움직이도록 하는 초기값
    public int[] fishmove(){
        int arr[] = {0, 0, 0, 0, 0};
        int first = (int)(Math.random()*5);
        int second;

        while(true){    //first와 second가 다른 값을 가질 때까지
            second = (int)(Math.random()*5);
            if(first!=second)
                break;
        }
        arr[first] = 1;
        arr[second] = 1;

        return arr;
    }
}
