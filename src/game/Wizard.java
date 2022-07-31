package game;

import java.util.Random;
import game.*;

public class Wizard extends Character{

    public Wizard(String character_name, int hp, int mp, int attack_power, int defense_power, int max_hp, int max_mp, int max_defense_power, int max_attack_power){
        super(character_name, hp, mp, attack_power,defense_power,max_hp, max_mp,max_defense_power, max_attack_power);
    }
    int level = 1; //����
    int coin = 5; // ���� ����

        ///���� ����//
    int potion_hp = 0 ; // hp ȸ�� ����
    int potion_mp = 0 ; // mp ȸ�� ����
    int potion_max_hp = 0; // �ִ� hp ���� ����
    int potion_max_mp= 0 ; // �ִ� mp ���� ����
    int potion_max_attack_power = 0; // �ִ� ���ݷ� ���� ����
    int potion_max_defense_power = 0; // �ִ� ���� ���� ����

///////////////////////////////////////////////////////////////////////////////////
    // ��ų�нú� //

    public void plus_damage(Character target){ // �߰� ������
        int temp_random = 0; // ���� int ��
        Random random = new Random(); //���� ��ü����
        random.setSeed(System.currentTimeMillis()); //�õ尪 ����ð� ����
        temp_random = random.nextInt(10); // 0~10���� ������ ���� ���� <-- �����ؾ� �Ѵ�.
        System.out.println(target.character_name+"���� �������� "+ temp_random + "�� �߰� �������� ���ϴ�.");
        target.hp = target.hp - temp_random;
    }
    //��ų//
    public void magic_arraw(Character target){ // ����ȭ��
        mp -= 10; // mp ����
        target.hp = target.hp - 100; // ���ݴ��� ĳ���� hp : ���ݷ¸�ŭ ���ݴ��ϰ� �ϱ�.
        System.out.println(target.character_name+"�� "+ character_name+ "���� ����ȭ��(magic_arraw) ������ �޾Ҵ�!");
    }

    public void magic_debuff(Character target){// ����� : ���ݷ�, ���� ����
        mp -= 10; // mp ����
        target.attack_power -= 10; // Ÿ�� ���ݷ� ����
        target.defense_power -= 10; // Ÿ�� ���� ����

        if(target.attack_power <= 0){ // Ÿ�� ���ݷ��� 0���� �۴ٸ�,
            target.attack_power = 0; // ���ݷ� 0���� �ʱ�ȭ
        }

        if(target.defense_power <= 0){ // Ÿ�� ������ 0���� �۴ٸ�,
            target.defense_power = 0; // ���� 0���� �ʱ�ȭ
        }

        System.out.println(target.character_name+"�� " + character_name+ "���� �����(magic_debuff) ������ �޾Ҵ�!");
        System.out.println(target.character_name+"�� ���ݷ°� ������ �����ߴ�!");
        System.out.println(target.character_name+"�� ���ݷ�: "+ target.attack_power);
        System.out.println(target.character_name+"�� ����: "+ target.defense_power);
        System.out.println("\n");
        // attacked �ʿ����
    }

    public void magic_beam(Character target){ // ������
        mp -= 10; // mp ����
        target.hp = target.hp - 10; // ���ݴ��� ĳ���� hp : ���ݷ¸�ŭ ���ݴ��ϰ� �ϱ�.
        System.out.println(target.character_name+"�� "+ character_name+ "���� ������(magic_beam) ������ �޾Ҵ�!");
    }

    public void magic_meteo(Character target){ // ���׿�, �߰����ݰ�
        mp -= 10; // mp ����
        target.hp = target.hp - 10; // ���ݴ��� ĳ���� hp : ���ݷ¸�ŭ ���ݴ��ϰ� �ϱ�.
        System.out.println(target.character_name+"�� "+ character_name+ "���� ���׿�(magic_meteo) ������ �޾Ҵ�!");
        plus_damage(target);
    }

    //-------------------------------------------------------------------------------------------------------------//

    //�ൿ2//
    public void item_shop(){ // ������ �����ϱ�, ���� �̿�
        System.out.println("--------------------------------------------------------");
        System.out.println("���� �ܾ�: "+coin+"��");
        System.out.println("<���� ������ ���>");
        System.out.println("1.hp ȸ�� ����");
        System.out.println("2.mp ȸ�� ����");
        System.out.println("3.�ִ� hp ���� ����");
        System.out.println("4.�ִ� mp ���� ����");
        System.out.println("5.�ִ� ���ݷ� ���� ����");
        System.out.println("6.�ִ� ���� ���� ����");
        System.out.println("7.���� ������");
        System.out.println("--------------------------------------------------------");
        while(true) {
            int choice_shop = 0;
            System.out.printf("������ ��ȣ �Է� -> ");
            choice_shop = scanner.nextInt(); // ��ȣ �Է¹ޱ�
            if(choice_shop == 7) { // 7�̸� ����
                System.out.println("-- �������� �����ϴ�.");
                System.out.println("--------------------------------------------------------");
                break;
            }
            else{
                switch (choice_shop) {
                    case 1:

                        if(coin-1 >= 0) {
                            System.out.println("-- hp ȸ�� ���� ���� �Ϸ�");
                            coin--;
                            potion_hp++;
                        }
                        else
                            System.out.println("-- ���� ����, �ܾ� ����");

                        break;
                    case 2:
                        if(coin-1 >= 0) {
                            System.out.println("-- mp ȸ�� ���� ���� �Ϸ�");
                            coin--;
                            potion_mp++;
                        }
                        else
                            System.out.println("-- ���� ����, �ܾ� ����");
                        break;
                    case 3:
                        if(coin-1 >= 0) {
                            potion_max_hp++;
                            coin--;
                            System.out.println("-- �ִ� hp ���� ���� ���� �Ϸ�");
                        }
                        else
                            System.out.println("-- ���� ����, �ܾ� ����");
                        break;
                    case 4:
                        if(coin-1 >= 0) {
                            potion_max_mp++;
                            coin--;
                            System.out.println("-- �ִ� mp ���� ���� ���� �Ϸ�");
                        }
                        else{
                            System.out.println("-- ���� ����, �ܾ� ����");
                        }
                        break;
                    case 5:
                        if(coin-1 >= 0) {
                            potion_max_attack_power++;
                            coin--;
                            System.out.println("-- �ִ� ���ݷ� ���� ���� ���� �Ϸ�");
                        }
                        else
                            System.out.println("-- ���� ����, �ܾ� ����");
                        break;
                    case 6:
                        if(coin-1 >= 0) {
                            potion_max_defense_power++;
                            coin--;
                            System.out.println("-- �ִ� ���� ���� ���� ���� �Ϸ�");
                        }
                        else
                            System.out.println("-- ���� ����, �ܾ� ����");
                        break;
                    default:
                        System.out.println("-- 1���� 7���� �Է����ּ���");
                }
            }
        }

    }
    public void item_show(){ //������â, ������ ��� , ���� �߿� 1,2���� ��� ����
        System.out.println("--------------------------------------------------------");
        System.out.println("<������ ���>");
        System.out.println("1.hp ȸ�� ����: "+potion_hp+"��");
        System.out.println("2.mp ȸ�� ����: "+potion_mp+"��");
        System.out.println("3.�ִ� hp ���� ����: "+potion_max_hp+"��");
        System.out.println("4.�ִ� mp ���� ����: "+potion_max_mp+"��");
        System.out.println("5.�ִ� ���ݷ� ���� ����: "+potion_max_attack_power+"��");
        System.out.println("6.�ִ� ���� ���� ����: "+potion_max_defense_power+"��");
        System.out.println("7.������â ������");
        System.out.println("--------------------------------------------------------");
        while(true) {
            int choice_show = 0;
            System.out.printf("����� ��ȣ �Է� -> ");
            choice_show = scanner.nextInt(); // ��ȣ �Է¹ޱ�
            if(choice_show == 7) { // 7�̸� ����
                System.out.println("-- ������ â���� �����ϴ�.");
                System.out.println("--------------------------------------------------------");
                break;
            }
            else{
                switch (choice_show) {
                    case 1:

                        if(potion_hp-1 >= 0) {
                            System.out.println("-- hp ȸ�� ���� ��� �Ϸ�");
                            potion_hp--; // hp ȸ�� ���� -1
                            hp += 10; // hp 10 ȸ��
                            if(hp > max_hp){ //�ִ� hp���� hp�� �� Ŀ����
                                hp = max_hp; // hp�� max_hp�� ����
                            }
                            System.out.println("-- ���� hp : "+hp);

                        }
                        else
                            System.out.println("-- ��� ����, ���� ����");

                        break;
                    case 2:
                        if(potion_mp-1 >= 0) {
                            System.out.println("-- mp ȸ�� ���� ��� �Ϸ�");
                            potion_mp--; // mp ȸ�� ���� -1
                            mp += 10; // mp 10 ȸ��
                            if(mp > max_mp){ //�ִ� mp���� mp�� �� Ŀ����
                                mp = max_mp; // hp�� max_hp�� ����
                            }
                            System.out.println("-- ���� mp : "+mp);

                        }
                        else
                            System.out.println("-- ��� ����, ���� ����");
                        break;
                    case 3:
                        if(potion_max_hp-1 >= 0) {
                            System.out.println("-- �ִ� hp ���� ���� ��� �Ϸ�");
                            potion_max_hp--; // �ִ� hp �������� -1
                            max_hp += 10; // �ִ� hp ����
                            System.out.println("-- ���� Max hp : "+max_hp);
                        }
                        else
                            System.out.println("-- ��� ����, ���� ����");
                        break;
                    case 4:
                        if(potion_max_mp-1 >= 0) {
                            System.out.println("-- �ִ� mp ���� ���� ��� �Ϸ�");
                            potion_max_mp--; // �ִ� mp���� ���� -1
                            max_mp += 10; // �ִ� mp ����
                            System.out.println("-- ���� max_mp : "+max_mp);

                        }
                        else{
                            System.out.println("-- ��� ����, ���� ����");
                        }
                        break;
                    case 5:
                        if(potion_max_attack_power-1 >= 0) {
                            System.out.println("-- �ִ� ���ݷ� ���� ���� ��� �Ϸ�");
                            potion_max_attack_power--; // �ִ���ݷ��������� -1
                            max_attack_power += 10; // �ִ� ���ݷ� ����
                            System.out.println("-- ���� �ִ� ���ݷ� : "+max_attack_power);

                        }
                        else
                            System.out.println("-- ��� ����, ���� ����");
                        break;
                    case 6:
                        if(potion_max_defense_power-1 >= 0) {
                            System.out.println("-- �ִ� ���� ���� ���� ��� �Ϸ�");
                            potion_max_defense_power--; // �ִ������������ -1
                            max_defense_power += 10; // �ִ� ���� ����
                            System.out.println("-- ���� �ִ� ���� : "+max_defense_power);

                        }
                        else
                            System.out.println("-- ��� ����, ���� ����");
                        break;
                    default:
                        System.out.println("-- 1���� 7���� �Է����ּ���");
                }
            }
        }

    }

    public void my_stat(){ // �� ����,�� ��������
        System.out.println("--------------------------------------------------------");
        System.out.println("<���� �� ����>");
        System.out.println("1.����:"+level);
        System.out.println("2.hp: "+hp);
        System.out.println("3.mp: "+mp);
        System.out.println("4.���ݷ�: "+attack_power);
        System.out.println("5.����: "+defense_power);
        System.out.println("6.��ų : ����ȭ��(1), �����(2), ������(3),���׿�(3)");
        System.out.println("-           -           -            -");
        System.out.println("1.�ִ� hp: "+max_hp);
        System.out.println("2.�ִ� mp: "+max_mp);
        System.out.println("3.�ִ� ���ݷ�: "+max_attack_power);
        System.out.println("4.�ִ� ����: "+max_defense_power);
        System.out.println("--------------------------------------------------------");
    }


}
