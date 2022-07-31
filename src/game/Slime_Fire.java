package game;
import java.util.Random; // ����Ŭ����

public class Slime_Fire extends Slime{


    public Slime_Fire(String character_name, int hp, int mp, int attack_power, int defense_power, int max_hp, int max_mp, int max_defense_power, int max_attack_power){
        super(character_name, hp, mp, attack_power,defense_power,max_hp, max_mp,max_defense_power, max_attack_power);
    }

    //����//
    public void fire_stick(){ // �� ������ ����
        attack_power +=10; // ���ݷ� 10��ŭ ���
    }

    //�нú�//
    public void fire_damage(Character target){ // �� �߰� ������
        int temp_random = 0; // ���� int ��
        Random random = new Random(); //���� ��ü����
        random.setSeed(System.currentTimeMillis()); //�õ尪 ����ð� ����
        temp_random = random.nextInt(10); // 0~10���� ������ ���� ����
        System.out.println(target.character_name+"���� �������� "+ temp_random + "�� �߰� �������� ���ϴ�.");
        target.hp = target.hp - temp_random;
    }

    //��ų//
    public void fire_ball(Character target){ //���̾
        target.hp = target.hp - 10; // Ÿ���� hp ���
        System.out.println(target.character_name+"�� " + character_name+ "���� ���̾(fireball) ������ �޾Ҵ�!");
        System.out.println(target.character_name+"�� �߰ſ��Ѵ�! �ƶ߰�.");
        fire_damage(target); // �߰� ����
    }

    public void fire_arrow(Character target){ // �� ȭ�� �������� ���� ���, �߰����� �ι� ��
        target.hp = target.hp - 5; // Ÿ���� hp ���
        System.out.println(target.character_name+"�� " + character_name+ "���� �� ȭ��(fire_arrow) ������ �޾Ҵ�!");
        System.out.println(target.character_name+"�� ���� �߰ſ��Ѵ�! �ƶ߰�.");
        fire_damage(target); // �߰� ������
        fire_damage(target); // �߰� ������
    }

}
