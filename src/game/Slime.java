package game;

public class Slime extends Character{ // ĳ����

    public Slime(String character_name, int hp, int mp, int attack_power, int defense_power, int max_hp, int max_mp, int max_defense_power, int max_attack_power){
        super(character_name, hp, mp, attack_power,defense_power,max_hp, max_mp,max_defense_power, max_attack_power);
    }


    public void jump(Character target){ // ���� ����
        target.hp = target.hp - 10; // ���ݴ��� ĳ���� hp : ���ݷ¸�ŭ ���ݴ��ϰ� �ϱ�.
        System.out.println(target.character_name+"�� "+ character_name+ "���� ����(jump) ������ �޾Ҵ�!");
    }

    public void slow(Character target){ // ��ȭ
        target.defense_power = target.defense_power - 10; // ���ݴ��� ĳ���� hp : ���ݷ¸�ŭ ���ݴ��ϰ� �ϱ�.
        if (target.defense_power <=0 ){ // 0���� ���ٸ�, 0����  �ʱ�ȭ
            target.defense_power = 0;
        }
        System.out.println(target.character_name+"�� " + character_name+ "���� ��ȭ(slow) ������ �޾Ҵ�!");
        System.out.println(target.character_name+"�� ���� ������ 10��ŭ �����ߴ�!");
        System.out.println(target.character_name+"�� ����: "+ target.defense_power); // attacked ���ʿ�
    }


}
