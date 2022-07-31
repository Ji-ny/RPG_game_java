package game;

public class Slime_Legend extends Slime{
    //������//
    public Slime_Legend(String character_name, int hp, int mp, int attack_power, int defense_power, int max_hp, int max_mp, int max_defense_power, int max_attack_power){
        super(character_name, hp, mp, attack_power,defense_power,max_hp, max_mp,max_defense_power, max_attack_power);
    }

    //����//
    public void Armor(){ // ���� ����
        defense_power += 10; // ���� 10��ŭ ���
    }

    //��ų
    public void legend_parasite(Character target){ //�����
        target.hp -= 10; // ���ݹ޾��� ��, hp ����
        System.out.println(target.character_name+"�� " + character_name+ "���� �����(legend_parasite) ������ �޾Ҵ�!");
    }

    public void legend_melt(Character target){ // ���̱�
        target.hp -= 10; // ���ݹ޾��� ��, hp ����
        System.out.println(target.character_name+"�� " + character_name+ "���� ���̱�(legend_melt) ������ �޾Ҵ�!");
    }

    public void legend_poison(Character target){ //�� ����

        target.attack_power -= 10; // Ÿ�� ���ݷ� ����
        target.defense_power -= 10; // Ÿ�� ���� ����

        if(target.attack_power <= 0){ // Ÿ�� ���ݷ��� 0���� �۴ٸ�,
            target.attack_power = 0; // ���ݷ� 0���� �ʱ�ȭ
        }

        if(target.defense_power <= 0){ // Ÿ�� ������ 0���� �۴ٸ�,
            target.defense_power = 0; // ���� 0���� �ʱ�ȭ
        }

        System.out.println(target.character_name+"�� " + character_name+ "���� ��(legend_poison) ������ �޾Ҵ�!");
        System.out.println(target.character_name+"�� ���ݷ°� ������ �����ߴ�!");
        System.out.println(target.character_name+"�� ���ݷ�: "+ target.attack_power);
        System.out.println(target.character_name+"�� ����: "+ target.defense_power);
        System.out.println("\n"); // attaked �ʿ� ����
    }

    public void legend_slime_buff(){ // �����ӹ���, ���� ����
        System.out.println(character_name+"�� �����ӹ���(legend_slime_buff) ��ų�� ����ߴ�!");
        System.out.println(character_name+"�� ������ �����ߴ�!");
        System.out.println(character_name+"�� ���� : "+defense_power);
        System.out.println("\n");
        defense_power += 10; // �ڽ��� ���� ����.

    }

}
