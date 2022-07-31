package game;

public class Slime_Ice extends Slime {
    //������//
    public Slime_Ice(String character_name, int hp, int mp, int attack_power, int defense_power, int max_hp, int max_mp, int max_defense_power, int max_attack_power){
        super(character_name, hp, mp, attack_power,defense_power,max_hp, max_mp,max_defense_power, max_attack_power);
    }
    //����//
    public void ice_stick(){ // ���� ������ ����
        attack_power +=10; // ���ݷ� 10��ŭ ���
    }

    //��ų//
    public void ice_freeze(Character target){ // �󸮱� //
        System.out.println(target.character_name+"�� " + character_name+ "���� �󸮱�(freeze) ������ �޾Ҵ�!");
        System.out.println("��,,,�߿�! "+ target.character_name+"�� ���ݷ��� �����ߴ�!");
        target.attack_power -= 10; // Ÿ���� ���ݷ� ����
        if(target.attack_power <= 0){ // Ÿ���� ���ݷ��� 0���� �۰ų� ���ٸ�,
            target.attack_power = 0; // Ÿ���� ���ݷ��� 0���� ������ش�.
        }
        System.out.println(target.character_name +"�� ���� ���ݷ�: "+target.attack_power);
        System.out.println("\n");
        // atacked�� ������� �ʾƵ� ��.

    }

    public void ice_meteor(Character target){ //������
        System.out.println(target.character_name+"�� " + character_name+ "���� ������(ice_meteor)������ �޾Ҵ�!");
        target.hp = target.hp - 10; // Ÿ���� ü�� ����



    }

}
