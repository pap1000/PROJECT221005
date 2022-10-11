class Weapon{
    //1의 살상력을 가짐
    protected int fire(){
        return 1;
    }
}

//Weapon을 상속받은 Cannon
class Cannon extends Weapon{
    //10의 살상력을 가짐
    protected int fire(){
        return 10;
    }
}

public class Overriding {
    public static void main(String[] args){
        Weapon weapon = new Weapon();
        System.out.println("기본 무기의 살상 능력은 " + weapon.fire());
        weapon = new Cannon();
        System.out.println("대포의 살상 능력은 " + weapon.fire());
    }
}
