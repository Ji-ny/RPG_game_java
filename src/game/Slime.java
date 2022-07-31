package game;

public class Slime extends Character{ // 캐릭터

    public Slime(String character_name, int hp, int mp, int attack_power, int defense_power, int max_hp, int max_mp, int max_defense_power, int max_attack_power){
        super(character_name, hp, mp, attack_power,defense_power,max_hp, max_mp,max_defense_power, max_attack_power);
    }


    public void jump(Character target){ // 점프 공격
        target.hp = target.hp - 10; // 공격당한 캐릭터 hp : 공격력만큼 공격당하게 하기.
        System.out.println(target.character_name+"은 "+ character_name+ "에게 점프(jump) 공격을 받았다!");
    }

    public void slow(Character target){ // 둔화
        target.defense_power = target.defense_power - 10; // 공격당한 캐릭터 hp : 공격력만큼 공격당하게 하기.
        if (target.defense_power <=0 ){ // 0보다 낮다면, 0으로  초기화
            target.defense_power = 0;
        }
        System.out.println(target.character_name+"은 " + character_name+ "에게 둔화(slow) 공격을 받았다!");
        System.out.println(target.character_name+"의 현재 방어력이 10만큼 감소했다!");
        System.out.println(target.character_name+"의 방어력: "+ target.defense_power); // attacked 불필요
    }


}
