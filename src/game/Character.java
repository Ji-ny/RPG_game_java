package game;
import java.util.Scanner;

public class Character {
    //��ĳ�� ���//
    Scanner scanner = new Scanner(System.in);
    //�Ӽ�//
    String character_name; // ĳ���� �̸�
    public int hp; // ü��
    public int mp; // ����
    public int attack_power; // ���ݷ�
    public int defense_power; // ����
    public int max_hp; //�ִ�ü��
    public int max_mp; //�ִ븶��
    public int max_defense_power; // �ִ� ����
    public int max_attack_power; //�ִ� ���ݷ�

    public Character(){}// �⺻ ������

    public Character(String character_name, int hp,int mp, int attack_power, int defense_power, int max_hp, int max_mp, int max_defense_power, int max_attack_power){ //char ĳ�����̸�, hp ������
        this.character_name = character_name; //ĳ���� �̸�
        this.hp = hp; // ü��
        this.mp = mp;
        this.attack_power = attack_power; // ���ݷ�
        this.defense_power = defense_power; // ����
        this.max_hp = max_hp; // �ִ� ü��
        this.max_mp = max_mp; // �ִ� mp
        this.max_defense_power = max_defense_power; // �ִ� ���ݷ�
        this.max_attack_power = max_attack_power; // �ִ� ����
    }

    public void attack(Character target){ // �����ϴ�, Ŭ���� ĳ���� �̸� ����

        target.hp = target.hp - 10; // ���ݴ��� ĳ���� hp : ���ݷ¸�ŭ ���ݴ��ϰ� �ϱ�.
        System.out.println(target.character_name+"�� " + character_name+ "���� �Ϲݰ���(attack)�� �޾Ҵ�!");
    }


    public void attacked(){ // ���� �޾��� ���, �״´�, ĳ���� �̸�\
        if(hp <= 0){
            hp = 0; //hp�� 0���� �������
            System.out.println(character_name + "�� ���� hp: "+ hp); // ���� hp: 0�� �ǵ��� �ؾ��� ��
            System.out.println( "-->>>>>>"+character_name + "��(��) ��������!<<<<<<---");
            System.out.println("");
        }
        else{
            System.out.println(character_name + "�� ���� hp: "+hp);
            System.out.println("");
        }
    }

    public void reset_stat(){ // �ɷ�ġ ���� , ���Ӵٽý����Ҷ�
        hp = max_hp; // hp ����
        mp = max_mp; // mp ����
        attack_power = max_attack_power; //���ݷ� ����
        defense_power = max_defense_power; // ���� ����

    }



}
