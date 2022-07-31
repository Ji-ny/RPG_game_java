package game;

public class Slime_Legend extends Slime{
    //생성자//
    public Slime_Legend(String character_name, int hp, int mp, int attack_power, int defense_power, int max_hp, int max_mp, int max_defense_power, int max_attack_power){
        super(character_name, hp, mp, attack_power,defense_power,max_hp, max_mp,max_defense_power, max_attack_power);
    }

    //무기//
    public void Armor(){ // 갑옷 착용
        defense_power += 10; // 방어력 10만큼 상승
    }

    //스킬
    public void legend_parasite(Character target){ //기생충
        target.hp -= 10; // 공격받았을 때, hp 깎임
        System.out.println(target.character_name+"은 " + character_name+ "에게 기생충(legend_parasite) 공격을 받았다!");
    }

    public void legend_melt(Character target){ // 녹이기
        target.hp -= 10; // 공격받았을 때, hp 깎임
        System.out.println(target.character_name+"은 " + character_name+ "에게 녹이기(legend_melt) 공격을 받았다!");
    }

    public void legend_poison(Character target){ //독 공격

        target.attack_power -= 10; // 타겟 공격력 감소
        target.defense_power -= 10; // 타겟 방어력 감소

        if(target.attack_power <= 0){ // 타겟 공격력이 0보다 작다면,
            target.attack_power = 0; // 공격력 0으로 초기화
        }

        if(target.defense_power <= 0){ // 타겟 방어력이 0보다 작다면,
            target.defense_power = 0; // 방어력 0으로 초기화
        }

        System.out.println(target.character_name+"은 " + character_name+ "에게 독(legend_poison) 공격을 받았다!");
        System.out.println(target.character_name+"의 공격력과 방어력이 감소했다!");
        System.out.println(target.character_name+"의 공격력: "+ target.attack_power);
        System.out.println(target.character_name+"의 방어력: "+ target.defense_power);
        System.out.println("\n"); // attaked 필요 없음
    }

    public void legend_slime_buff(){ // 슬라임버프, 방어력 증가
        System.out.println(character_name+"은 슬라임버프(legend_slime_buff) 스킬을 사용했다!");
        System.out.println(character_name+"의 방어력이 증가했다!");
        System.out.println(character_name+"의 방어력 : "+defense_power);
        System.out.println("\n");
        defense_power += 10; // 자신의 방어력 증가.

    }

}
