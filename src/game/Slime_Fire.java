package game;
import java.util.Random; // 랜덤클래스

public class Slime_Fire extends Slime{


    public Slime_Fire(String character_name, int hp, int mp, int attack_power, int defense_power, int max_hp, int max_mp, int max_defense_power, int max_attack_power){
        super(character_name, hp, mp, attack_power,defense_power,max_hp, max_mp,max_defense_power, max_attack_power);
    }

    //무기//
    public void fire_stick(){ // 불 지팡이 착용
        attack_power +=10; // 공격력 10만큼 상승
    }

    //패시브//
    public void fire_damage(Character target){ // 불 추가 데미지
        int temp_random = 0; // 랜덤 int 값
        Random random = new Random(); //랜덤 객체생성
        random.setSeed(System.currentTimeMillis()); //시드값 현재시간 설정
        temp_random = random.nextInt(10); // 0~10까지 랜덤한 숫자 리턴
        System.out.println(target.character_name+"에게 랜덤으로 "+ temp_random + "의 추가 데미지가 들어갑니다.");
        target.hp = target.hp - temp_random;
    }

    //스킬//
    public void fire_ball(Character target){ //파이어볼
        target.hp = target.hp - 10; // 타겟의 hp 깎기
        System.out.println(target.character_name+"은 " + character_name+ "에게 파이어볼(fireball) 공격을 받았다!");
        System.out.println(target.character_name+"은 뜨거워한다! 아뜨거.");
        fire_damage(target); // 추가 공격
    }

    public void fire_arrow(Character target){ // 불 화살 데미지가 약한 대신, 추가공격 두번 들어감
        target.hp = target.hp - 5; // 타겟의 hp 깎기
        System.out.println(target.character_name+"은 " + character_name+ "에게 불 화살(fire_arrow) 공격을 받았다!");
        System.out.println(target.character_name+"은 아주 뜨거워한다! 아뜨거.");
        fire_damage(target); // 추가 데미지
        fire_damage(target); // 추가 데미지
    }

}
