package game;
import java.util.Scanner;

public class Character {
    //스캐너 사용//
    Scanner scanner = new Scanner(System.in);
    //속성//
    String character_name; // 캐릭터 이름
    public int hp; // 체럭
    public int mp; // 마나
    public int attack_power; // 공격력
    public int defense_power; // 방어력
    public int max_hp; //최대체력
    public int max_mp; //최대마나
    public int max_defense_power; // 최대 방어력
    public int max_attack_power; //최대 공격력

    public Character(){}// 기본 생성자

    public Character(String character_name, int hp,int mp, int attack_power, int defense_power, int max_hp, int max_mp, int max_defense_power, int max_attack_power){ //char 캐릭터이름, hp 생성자
        this.character_name = character_name; //캐릭터 이름
        this.hp = hp; // 체력
        this.mp = mp;
        this.attack_power = attack_power; // 공격력
        this.defense_power = defense_power; // 방어력
        this.max_hp = max_hp; // 최대 체력
        this.max_mp = max_mp; // 최대 mp
        this.max_defense_power = max_defense_power; // 최대 공격력
        this.max_attack_power = max_attack_power; // 최대 방어력
    }

    public void attack(Character target){ // 공격하다, 클래스 캐릭터 이름 넣음

        target.hp = target.hp - 10; // 공격당한 캐릭터 hp : 공격력만큼 공격당하게 하기.
        System.out.println(target.character_name+"은 " + character_name+ "에게 일반공격(attack)을 받았다!");
    }


    public void attacked(){ // 공격 받았을 경우, 죽는다, 캐릭터 이름\
        if(hp <= 0){
            hp = 0; //hp를 0으로 만들어줌
            System.out.println(character_name + "의 남은 hp: "+ hp); // 남은 hp: 0이 되도록 해야할 것
            System.out.println( "-->>>>>>"+character_name + "는(은) 쓰러졌다!<<<<<<---");
            System.out.println("");
        }
        else{
            System.out.println(character_name + "의 남은 hp: "+hp);
            System.out.println("");
        }
    }

    public void reset_stat(){ // 능력치 리셋 , 게임다시시작할때
        hp = max_hp; // hp 리셋
        mp = max_mp; // mp 리셋
        attack_power = max_attack_power; //공격력 리셋
        defense_power = max_defense_power; // 방어력 리셋

    }



}
