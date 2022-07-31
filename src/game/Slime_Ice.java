package game;

public class Slime_Ice extends Slime {
    //생성자//
    public Slime_Ice(String character_name, int hp, int mp, int attack_power, int defense_power, int max_hp, int max_mp, int max_defense_power, int max_attack_power){
        super(character_name, hp, mp, attack_power,defense_power,max_hp, max_mp,max_defense_power, max_attack_power);
    }
    //무기//
    public void ice_stick(){ // 얼음 지팡이 착용
        attack_power +=10; // 공격력 10만큼 상승
    }

    //스킬//
    public void ice_freeze(Character target){ // 얼리기 //
        System.out.println(target.character_name+"은 " + character_name+ "에게 얼리기(freeze) 공격을 받았다!");
        System.out.println("으,,,추워! "+ target.character_name+"은 공격력이 감소했다!");
        target.attack_power -= 10; // 타겟의 공격력 감소
        if(target.attack_power <= 0){ // 타겟의 공격력이 0보다 작거나 같다면,
            target.attack_power = 0; // 타겟의 공격력을 0으로 만들어준다.
        }
        System.out.println(target.character_name +"의 현재 공격력: "+target.attack_power);
        System.out.println("\n");
        // atacked를 사용하지 않아도 됨.

    }

    public void ice_meteor(Character target){ //얼음별
        System.out.println(target.character_name+"은 " + character_name+ "에게 얼음별(ice_meteor)공격을 받았다!");
        target.hp = target.hp - 10; // 타겟의 체력 감소



    }

}
