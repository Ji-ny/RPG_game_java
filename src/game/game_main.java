package game;
import game.thread.Script; // ��ũ��Ʈ ������ import

import java.util.Scanner;
import java.util.Random;//���� ���


public class game_main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // ��ĳ�� ��ü
        Random random = new Random(); // ���� ��ü
        //random.nextInt(max + min) + min; // 1���� 10���� ���� min : 1, max : 10

        //public Wizard(String character_name, int hp, int mp, int attack_power, int defense_power, int max_hp, int max_mp, int max_defense_power, int max_attack_power)
        //------------------------ĳ���� ��ü ���� ------------------------//
        // ���ΰ�//
        Wizard wizard = new Wizard(       // ������ ��ü ����
                "������",                  //���ΰ� �̸�  (character_name)
                100,                      // hp
                100,                      // mp
                10,                      //���ݷ� (attack_power)
                10,                      //���� (defense_power)
                100,                      // �ִ� hp (max_hp)
                100,                      // �ִ� mp(max_mp)
                10,                      // �ִ� ���� (max_defense_power)
                10);                     // �ִ� ���ݷ� (max_attack_power),

        //------------------------���� ��ü ����---------------------------//
        //public Slime(String character_name, int hp, int mp, int attack_power, int defense_power, int max_hp, int max_mp, int max_defense_power, int max_attack_power)
        //----------------1�ܰ�---------------------//
        //������1//
        Slime slime_1 = new Slime(       // ������ ��ü ����
                "������_1",                  //���ΰ� �̸�  (character_name)
                10,                      // hp
                0,                        // mp
                10,                      //���ݷ� (attack_power)
                10,                      //���� (defense_power)
                10,                      // �ִ� hp (max_hp)
                0,                      // �ִ� mp(max_mp)
                10,                      // �ִ� ���� (max_defense_power)
                10                       // �ִ� ���ݷ� (max_attack_power),
        );
        ///////////////////////////////////////////////////////////////////////////////////////////
        //������2//
        Slime slime_2 = new Slime(       // ������ ��ü ����
                "������_2",                  //���ΰ� �̸�  (character_name)
                10,                      // hp
                0,                        // mp
                10,                      //���ݷ� (attack_power)
                10,                      //���� (defense_power)
                10,                      // �ִ� hp (max_hp)
                0,                      // �ִ� mp(max_mp)
                10,                      // �ִ� ���� (max_defense_power)
                10                       // �ִ� ���ݷ� (max_attack_power),
        );
        ///////////////////////////////////////////////////////////////////////////////////////////
        //������3//
        Slime slime_3 = new Slime(       // ������ ��ü ����
                "������_3",                  //���ΰ� �̸�  (character_name)
                10,                      // hp
                0,                        // mp
                10,                      //���ݷ� (attack_power)
                10,                      //���� (defense_power)
                10,                      // �ִ� hp (max_hp)
                0,                      // �ִ� mp(max_mp)
                10,                      // �ִ� ���� (max_defense_power)
                10                       // �ִ� ���ݷ� (max_attack_power),
        );
        /////////////////////////////////////////////////////////////////////////////////////////////

        //-----------------------------------2�ܰ�------------------------------------------------//
        //���� ������//

        Slime_Ice slime_ice = new Slime_Ice(       // ������ ��ü ����
                "����������",                  //���ΰ� �̸�  (character_name)
                20,                      // hp
                0,                        // mp
                20,                      //���ݷ� (attack_power)
                20,                      //���� (defense_power)
                20,                      // �ִ� hp (max_hp)
                0,                      // �ִ� mp(max_mp)
                20,                      // �ִ� ���� (max_defense_power)
                20                       // �ִ� ���ݷ� (max_attack_power),
        );
        slime_ice.ice_stick(); // ���� ������ ���ݷ� ����
        ///////////////////////////////////////////////////////////////////////////////////////////
        //�ҽ�����//
        Slime_Fire slime_fire = new Slime_Fire(       // ������ ��ü ����
                "�ҽ�����",                  //���ΰ� �̸�  (character_name)
                20,                      // hp
                0,                        // mp
                20,                      //���ݷ� (attack_power)
                20,                      //���� (defense_power)
                20,                      // �ִ� hp (max_hp)
                0,                      // �ִ� mp(max_mp)
                20,                      // �ִ� ���� (max_defense_power)
                20                       // �ִ� ���ݷ� (max_attack_power),
        );
        //System.out.println("-- �� �������� �� �����̸� �����ߴ�! �ҽ������� ���ݷ� ����!");
        slime_fire.fire_stick(); // �ҽ������� ���ݷ� ����

        ///////////////////////////////////////////////////////////////////////////////////////////
        //----------------------------------3�ܰ�-------------------------------------------------//
        //������ ŷ��¯ ������//
        Slime_Legend slime_legend = new Slime_Legend(       // ������ ��ü ����
                "(����)������ŷ��¯������",                  //���ΰ� �̸�  (character_name)
                30,                      // hp
                0,                        // mp
                50,                      //���ݷ� (attack_power)
                50,                      //���� (defense_power)
                30,                      // �ִ� hp (max_hp)
                0,                      // �ִ� mp(max_mp)
                50,                      // �ִ� ���� (max_defense_power)
                50                       // �ִ� ���ݷ� (max_attack_power),
        );
        slime_legend.Armor(); // �������� ưư�� ���� ����!
        ///////////////////////////////////////////////////////////////////////////////////////////

        ///////////////////////////////////////////////////////////////////////////////////////////
        //----------------------------------������--------------------------------------------------//
        // --------- ������ ��ü ����  -------------------------------------------//
        Thread script_0 = new Script(0); // 1�� ��� ������ ��ü
        Thread script_1 = new Script(1); // ���丮 ������ ��ü
        Thread script_2 = new Script(2); // ���ӹ�� ������ ��ü
        Thread script_3 = new Script(3); // �������� ������ ��ü
        Thread script_4 = new Script(4); // ���ӿ��� ������ ��ü
        // -----------���� ���� ----------------------------//
        int i; // ������
        int i_target;//���� ���


        //---------------------------------���� ���� -----------------------------------------------//
        script_3.start(); // ���� ������ ���
        try{
            script_3.join(); // ���񽺷��尡 ���������� ��ٷ�
        }catch (Exception e){
            e.printStackTrace();
        }
        //----------------------------------���丮--------------------------------------------------//

//        System.out.println("<<���丮>>");
//        System.out.println("������ ������ �ִ�.");
//        System.out.println("�� ������ ���� ����� ������ �������ڰ� �ִٰ� �Ѵ�.");
//        System.out.println("�� �������ڸ� ����, '���� ŷ��¯ ������ ����'�� ���� �� �ִ�.");
//        System.out.println("�������� ����� �� ������ ��� ���� ������ Ž���ϱ�� �ߴ�!");
//        System.out.println("----------------------------------------------------------------------");
//        System.out.println("");
        script_1.start(); // ���丮 ����
        try{
            script_1.join();
        }catch (Exception e){
            e.printStackTrace();
        }

        //-----------------------------------------------------------------------------------------//
        //-----------1�� �ε� -------------------//
        script_0.start();
        try{
            script_0.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        //----------------------------------���� ���------------------------------------------------//

//        System.out.println("<<���� ���>>");
//        System.out.println("�� 3�ܰ�� �̷���� �ִ�.");
//        System.out.println("�� �ܰ踶�� ������ ���͸� ��� �����, ������ ȹ���Ѵ�.");
//        System.out.println("�ܰ谡 ����ɼ��� ����� �������� ������ ����� �� �ִ�.");
//        System.out.println("�Ź� �ܰ� ���� ��, �κ��� �������� �������� �������� ������ �� �ִ�.");
//        System.out.println("----------------------------------------------------------------------");
//        System.out.println("");
//        System.out.printf("-- ������ �����Ϸ��� �ƹ� ��ȣ�� ������, �����ϼ���. -> ");

        script_2.start();
        try{
            script_2.join();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.printf("-- ������ �����Ϸ��� �ƹ� ��ȣ�� ������, �����ϼ���. -> ");
        i = scanner.nextInt();
        System.out.printf("=============================  ���� ����!  =============================");

        try{ // 1�� ���
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }

        //--------------���� ����-----------------------------------------------------------------------//
        //--------------�κ�,����-------------------  //
        loop:
        while (true) {
            int turn = 1; //�� 1�� �ʱ�ȭ

            loop1:
            // �κ�â: loop~ loop1
            while (true) {
                System.out.println("");
                System.out.println("----------------------------------------------------------------------");
                System.out.println("    <<�κ�>>");
                System.out.println("    1.[����]������ �����ϱ�");
                System.out.println("    2.������ â,������ ����ϱ�");
                System.out.println("    3.�� ���� ����");
                System.out.println("    4." + wizard.level + "�ܰ�� ����");
                System.out.println("----------------------------------------------------------------------");


                System.out.printf("-- ��ȣ �Է� ->");
                i = scanner.nextInt();
                if (i == 4) {
                    break; // ���� �ܰ�� ����~ �ݺ� Ż��
                } else if (i == 1) {
                    wizard.item_shop(); // 1. [����]������ �����ϱ�
                } else if (i == 2) {
                    wizard.item_show(); // 2. ������ â, ������ ����ϱ�
                } else if (i == 3) {
                    wizard.my_stat(); // 3. �� ���� ����
                } else {
                    System.out.println("1���� 4���� �Է��� �ּ���.");
                }
            }

            //------------------------------���� �ܰ�-------------------------------------//
            //-----------------------//---------1�ܰ�---------------//-----------------------//
            if (wizard.level == 1) {
                //���� ���� //
                wizard.reset_stat(); // ���ΰ� ���� ����
                slime_1.reset_stat(); // ������ ���� ����
                slime_2.reset_stat(); // ������2 ���� ����
                slime_3.reset_stat(); // ������3 ���� ����
                System.out.println("----------------------------------------------------------------------");
                System.out.println("<<1�ܰ�>>");
                System.out.println("������ vs ������ 3����");
                System.out.println("----------------------------------------------------------------------");
                System.out.printf("-- ������ �����Ϸ��� �ƹ� ��ȣ�� ������, �����ϼ���. -> ");
                i = scanner.nextInt();

                loop2:
                while (true) {//���� �ǰ� �� ������ �ʾ�����,
                    /////1�ܰ� �й� /////////////
                    if (wizard.hp <= 0) { // ���ΰ� hp�� 0�̸�, ������
                        System.out.println("----------------------------------------------------------------------");
                        System.out.println("<<1�ܰ� �й�...>>");
                        System.out.println("-- ����� �׾����ϴ�...");
                        wizard.level = 1;
                        System.out.println("----------------------------------------------------------------------");
                        System.out.printf("-- �κ�� ���ư����� �ƹ� ��ȣ�� ������ �����ϼ���. -> ");
                        i = scanner.nextInt();
                        continue loop;
                    }
                    //////1�ܰ� �¸� ///////////
                    if (slime_1.hp <= 0 && slime_2.hp <= 0 && slime_3.hp <= 0) { // ���� �ǰ� 0�̸�
                        System.out.println("----------------------------------------------------------------------");
                        System.out.println("<<1�ܰ� �¸�!!>>");
                        wizard.level = 2; //���� 2�� ���
                        wizard.coin += 5; //���� 5�� ȹ��
                        System.out.println("-- ���� ��!! ���� ����: " + wizard.level);
                        System.out.println("-- ���� 5�� ȹ��!! ���� ���� ���� : " + wizard.coin);
                        System.out.println("-- ��ų ȹ��!");
                        System.out.println("---- (2) �����");
                        System.out.println("----------------------------------------------------------------------");
                        System.out.printf("-- �κ�� ���ư����� �ƹ� ��ȣ�� ������ �����ϼ���. -> ");
                        i = scanner.nextInt();
                        continue loop;
                    }
                    //////////////////////////���ΰ� ����/////////////////////////////////////////////////////
                    try{
                        Thread.sleep(500);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
                    System.out.println("[������] hp: "+wizard.hp+" |  mp: "+wizard.mp);
                    System.out.println("[������1] hp: "+slime_1.hp+" | [������2] hp: "+slime_2.hp+" | [������3] hp: "+slime_3.hp);
                    System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
                    System.out.println(" ");
                    try{
                        Thread.sleep(500);
                    }catch (Exception e){
                        e.printStackTrace();
                    }


                    System.out.println("--<<" + turn + "��: �� ����>>");
                    System.out.println("1.�� ���� ����");
                    System.out.println("2.������ â, ������ ����ϱ�");
                    System.out.println("3.�Ϲݰ���");
                    System.out.println("4.����ȭ��");
                    System.out.printf("-- ��ȣ �Է� -> ");
                    i = scanner.nextInt(); /// �ൿ ��ȣ �Է¹ޱ�
                    System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- --");
                    System.out.println("");
                    if(wizard.mp < 10 && i==4 ){ // ���� ������ ��ų ������ �ϱ�
                        System.out.println("����(mp)�� �����մϴ�. �Ϲݰ��ݸ� �����մϴ�.");
                        System.out.println("���� ����:"+wizard.mp);
                        continue loop2;
                    }
                    if (i == 1) { // �� ���� ����
                        wizard.my_stat();
                        continue loop2;
                    }
                    else if (i == 2) {
                        wizard.item_show();//������â, ������ ���
                        continue loop2;
                    } else if (i == 3) { // �Ϲ� ���� //
                        System.out.println("<���ݴ��>");
                        System.out.println("1.������1, 2.������2, 3.������3");
                        System.out.printf("-- ���ݴ�� ��ȣ �Է� -> ");
                        i_target = scanner.nextInt();
                        if (i_target == 1) {// ������1 �Ϲݰ���
                            wizard.attack(slime_1); // ���ΰ��� ������1 �Ϲݰ���
                            slime_1.attacked(); // ���� ����, �װų� hp�����ְų�
                        } else if (i_target == 2) {
                            wizard.attack(slime_2); //���ΰ��� ������2 �Ϲݰ���
                            slime_2.attacked(); // ���� ����, �װų� hp�����ְų�
                        } else if (i_target == 3) {
                            wizard.attack(slime_3); // ���ΰ��� ������3 �Ϲݰ���
                            slime_3.attacked(); // ���� ����, �װų� hp�����ְų�
                        }

                    } else if (i == 4) { // 3.����ȭ�� ���� //
                        System.out.println("<���ݴ��>");
                        System.out.println("1.������1, 2.������2, 3.������3");
                        System.out.printf("-- ���ݴ�� ��ȣ �Է� -> ");
                        i_target = scanner.nextInt();
                        if (i_target == 1) {// Ÿ��: ������1
                            wizard.magic_arraw(slime_1); // ���ΰ��� ������1 ����ȭ�� ����
                            slime_1.attacked(); // ������1 attacked()
                        } else if (i_target == 2) { //Ÿ��:������2
                            wizard.magic_arraw(slime_2); // ���ΰ��� ������2 ����ȭ�� ����
                            slime_2.attacked(); // ������2 attacked()
                        } else if (i_target == 3) { //Ÿ��:������3
                            wizard.magic_arraw(slime_3); // ���ΰ��� ������3 ����ȭ�� ����
                            slime_3.attacked(); // ������3 attacked()
                        }
                    } else {
                        System.out.println("1���� 4���� �Է��� �ּ���.");
                        continue loop2;
                    }
                    //----���ΰ� ���� �� -----//
                    //---������ 1 ���� ------//
                    if (slime_1.hp > 0) { // ������1�� hp�� 0 �̻��̶��, ����ִٸ�
                        System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- --");
                        System.out.println("--<<" + turn + "��: [������1] ����>>");
                        int i_slime1 = 0; // ������1 ������
                        i_slime1 = random.nextInt(3) + 1; // __����__ ������ 3���߿�

                        if (i_slime1 == 1) { // �Ϲ� ����
                            slime_1.attack(wizard); // ���ΰ����� �Ϲݰ���
                            wizard.attacked(); // ���ΰ� attacked()
                        } else if (i_slime1 == 2) {// ���� ����
                            slime_1.jump(wizard); // ������1�� ���ΰ����� ��������
                            wizard.attacked(); // ���ΰ� attacked()
                        } else if (i_slime1 == 3) { // ���ο� ����
                            slime_1.slow(wizard); // ������1�� ���ΰ����� ���ο� ���� - ���� ����
                        }
                    }
                    //-------������2 ����--------//
                    if (slime_2.hp > 0) { // ������2�� hp�� 0 �̻��̶��, ����ִٸ�
                        System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- --");
                        System.out.println("--<<" + turn + "��: [������2] ����>>");
                        int i_slime2 = 0; // ������2 ������
                        i_slime2 = random.nextInt(3) + 1; // __����__ ������ 3���߿�

                        if (i_slime2 == 1) { // �Ϲ� ����
                            slime_2.attack(wizard); // ������2�� ���ΰ����� �Ϲݰ���
                            wizard.attacked(); // ���ΰ� attacked()
                        } else if (i_slime2 == 2) {// ���� ����
                            slime_2.jump(wizard); // ������2�� ���ΰ����� ��������
                            wizard.attacked(); // ���ΰ� attacked()
                        } else if (i_slime2 == 3) { // ���ο� ����
                            slime_2.slow(wizard); // ������2�� ���ΰ����� ���ο� ���� - ���� ����
                        }
                    }

                    //-------������3 ����--------//
                    if (slime_3.hp > 0) { // ������3�� hp�� 0 �̻��̶��, ����ִٸ�
                        System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- --");
                        System.out.println("--<<" + turn + "��: [������3] ����>>");
                        int i_slime3 = 0; // ������2 ������
                        i_slime3 = random.nextInt(3) + 1; // __����__ ������ 3���߿�

                        if (i_slime3 == 1) { // �Ϲ� ����
                            slime_3.attack(wizard); // ������3�� ���ΰ����� �Ϲݰ���
                            wizard.attacked(); // ���ΰ� attacked()
                        } else if (i_slime3 == 2) {// ���� ����
                            slime_3.jump(wizard); // ������3�� ���ΰ����� ��������
                            wizard.attacked(); // ���ΰ� attacked()
                        } else if (i_slime3 == 3) { // ���ο� ����
                            slime_3.slow(wizard); // ������3�� ���ΰ����� ���ο� ���� - ���� ����
                        }
                    }

                    turn++;// �� ����
                }
                ////////////////////////////-----------1�ܰ� ����----------//////////////////////////////


            }
            /////////////////////////////////////////////////////////////////////////////////////////
            /////-----------------------------2�ܰ�--------------------------------------------/////////
            else if (wizard.level == 2) { // ���ΰ� ������ 2�̸�
                //���� ���� //
                wizard.reset_stat(); // ���ΰ� ���� ����
                slime_fire.reset_stat(); // �� ������ ���� ����
                slime_ice.reset_stat(); // ���� ������ ���� ����
                System.out.println("----------------------------------------------------------------------");
                System.out.println("<<2�ܰ�>>");
                System.out.println("������ vs �� ������ & ���� ������");
                System.out.println("----------------------------------------------------------------------");
                System.out.printf("-- ������ �����Ϸ��� �ƹ� ��ȣ�� ������, �����ϼ���. -> ");
                i = scanner.nextInt();

                loop3:
                while (true) {//���� �ǰ� �� ������ �ʾ�����,
                    /////2�ܰ� �й� /////////////
                    if (wizard.hp <= 0) { // ���ΰ� hp�� 0�̸�, ������
                        System.out.println("----------------------------------------------------------------------");
                        System.out.println("<<2�ܰ� �й�...>>");
                        System.out.println("-- ����� �׾����ϴ�...");
                        wizard.level = 2;
                        System.out.println("----------------------------------------------------------------------");
                        System.out.printf("-- �κ�� ���ư����� �ƹ� ��ȣ�� ������ �����ϼ���. -> ");
                        i = scanner.nextInt();
                        continue loop;
                    }
                    //////2�ܰ� �¸� ///////////
                    if (slime_fire.hp <= 0 && slime_ice.hp <= 0) { // �ҽ�����,���������� �ǰ� 0�̸�
                        System.out.println("----------------------------------------------------------------------");
                        System.out.println("<<2�ܰ� �¸�!!>>");
                        wizard.level = 3; //���� 3�� ���
                        wizard.coin += 5; //���� 5�� ȹ��
                        System.out.println("-- ���� ��!! ���� ����: " + wizard.level);
                        System.out.println("-- ���� 5�� ȹ��!! ���� ���� ���� : " + wizard.coin);
                        System.out.println("-- ��ų ȹ��!");
                        System.out.println("---- (3) ������");
                        System.out.println("---- (4) ���׿�");
                        System.out.println("----------------------------------------------------------------------");
                        System.out.printf("-- �κ�� ���ư����� �ƹ� ��ȣ�� ������ �����ϼ���. -> ");
                        i = scanner.nextInt();
                        continue loop;
                    }
                    ////------------���ӽ���----------------------------------------------------------------------//
                    //////////////////////////���ΰ� ����/////////////////////////////////////////////////////
                    try{ // 1�� ���
                        Thread.sleep(500);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
                    System.out.println("�� hp: "+wizard.hp+" | �� mp: "+wizard.mp);
                    System.out.println(slime_fire.character_name+" hp: "+slime_fire.hp+" | "+slime_ice.character_name+ " hp : "+slime_ice.hp);
                    System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
                    try{ //1�� ���
                        Thread.sleep(500);
                    }catch (Exception e){
                        e.printStackTrace();
                    }

                    System.out.println("--<<" + turn + "��: �� ����>>");
                    System.out.println("1.�� ���� ����");
                    System.out.println("2.������ â, ������ ����ϱ�");
                    System.out.println("3.�Ϲݰ���");
                    System.out.println("4.����ȭ��");
                    System.out.println("5.�����");
                    System.out.printf("-- ��ȣ �Է� -> ");
                    i = scanner.nextInt(); /// �ൿ ��ȣ �Է¹ޱ�
                    System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- --");
                    System.out.println("");
                    if(wizard.mp < 10 && (i==4 || i==5)){ // ���� ������ ��ų ������ �ϱ�
                        System.out.println("����(mp)�� �����մϴ�. �Ϲݰ��ݸ� �����մϴ�.");
                        continue loop3;
                    }
                    if (i == 1) { // �� ���� ����
                        wizard.my_stat();
                        continue loop3;
                    }
                    if (i == 2) {
                        wizard.item_show();//������â, ������ ���
                        continue loop3;
                    } else if (i == 3) { // �Ϲ� ���� //
                        System.out.println("<���ݴ��>");
                        System.out.println("1.�� ������, 2.���� ������");
                        System.out.printf("-- ���ݴ�� ��ȣ �Է� -> ");
                        i_target = scanner.nextInt();
                        if (i_target == 1) {// �� ������ �Ϲݰ���
                            wizard.attack(slime_fire); // ���ΰ��� �ҽ����� �Ϲݰ���
                            slime_fire.attacked(); // ���� ����, �װų� hp�����ְų�
                        } else if (i_target == 2) { // ���� ������ �Ϲݰ���
                            wizard.attack(slime_ice); //���ΰ��� ���������� �Ϲݰ���
                            slime_ice.attacked(); // ���� ����, �װų� hp�����ְų�
                        }
                    } else if (i == 4) { // ���� ȭ�� //
                        System.out.println("<���ݴ��>");
                        System.out.println("1.�� ������, 2.���� ������");
                        System.out.printf("-- ���ݴ�� ��ȣ �Է� -> ");
                        i_target = scanner.nextInt();
                        if (i_target == 1) {// �� ������ ����ȭ�� ����
                            wizard.magic_arraw(slime_fire); // ���ΰ��� �ҽ����� ����ȭ��
                            slime_fire.attacked(); // ���� ����, �װų� hp�����ְų�
                        } else if (i_target == 2) { // ���� ������ ����ȭ��
                            wizard.magic_arraw(slime_ice); //���ΰ��� ���������� ����ȭ��
                            slime_ice.attacked(); // ���� ����, �װų� hp�����ְų�
                        }
                    } else if (i == 5) { // ����� //
                        System.out.println("<���ݴ��>");
                        System.out.println("1.�� ������, 2.���� ������");
                        System.out.printf("-- ���ݴ�� ��ȣ �Է� -> ");
                        i_target = scanner.nextInt();
                        if (i_target == 1) {// �� ������ ����� ����
                            wizard.magic_debuff(slime_fire); // ���ΰ��� �ҽ����� ����� . attacked() ����
                        } else if (i_target == 2) { // ���� ������ �����
                            wizard.magic_debuff(slime_ice); //���ΰ��� ���������� ����� , attacked() ����
                        }
                    } else {
                        System.out.println("1���� 5���� �Է��� �ּ���.");
                        continue loop3;
                    }
                    ///�ҽ����� ����////
                    if (slime_fire.hp > 0) { // �ҽ������� hp�� 0 �̻��̶��, ����ִٸ�
                        System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- --");
                        System.out.println("--<<" + turn + "��: [�� ������] ����>>");

                        int i_slime_fire = 0; // �ҽ����� ������
                        i_slime_fire = random.nextInt(5) + 1; // __����__ ������ 1~5�߿�

                        if (i_slime_fire == 1) { // �Ϲ� ����
                            slime_fire.attack(wizard); // ���ΰ����� �Ϲݰ���
                            wizard.attacked(); // ���ΰ� attacked()
                        } else if (i_slime_fire == 2) {// ���� ����
                            slime_fire.jump(wizard); // �������� ���ΰ����� ��������
                            wizard.attacked(); // ���ΰ� attacked()
                        } else if (i_slime_fire == 3) { // ���ο� ����
                            slime_fire.slow(wizard); // �������� ���ΰ����� ���ο� ���� - ���� ����
                        } else if (i_slime_fire == 4) { // ���̾ ����
                            slime_fire.fire_ball(wizard); // �������� ���ΰ����� ���̾ ����
                            wizard.attacked();
                        } else if (i_slime_fire == 5) { // ��ȭ�� ����
                            slime_fire.fire_arrow(wizard); // �������� ���ΰ����� ��ȭ�� ����
                            wizard.attacked();
                        }
                    }

                    ///���������� ����////
                    if (slime_ice.hp > 0) { // ������������ hp�� 0 �̻��̶��, ����ִٸ�
                        System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- --");
                        System.out.println("--<<" + turn + "��: [���� ������] ����>>");

                        int i_slime_ice = 0; // ���������� ������
                        i_slime_ice = random.nextInt(5) + 1; // __����__ ������ 1~5�߿�

                        if (i_slime_ice == 1) { // �Ϲ� ����
                            slime_ice.attack(wizard); // ���ΰ����� �Ϲݰ���
                            wizard.attacked(); // ���ΰ� attacked()
                        } else if (i_slime_ice == 2) {// ���� ����
                            slime_ice.jump(wizard); // �������� ���ΰ����� ��������
                            wizard.attacked(); // ���ΰ� attacked()
                        } else if (i_slime_ice == 3) { // ���ο� ����
                            slime_ice.slow(wizard); // �������� ���ΰ����� ���ο� ���� - ���� ����
                        } else if (i_slime_ice == 4) { // ���̾ ����
                            slime_ice.ice_freeze(wizard); // �������� ���ΰ����� �󸮱� ����
                        } else if (i_slime_ice == 5) { // ������ ����
                            slime_ice.ice_meteor(wizard); // �������� ���ΰ����� ������ ����
                            wizard.attacked();
                        }
                    }
                    turn++; // �� ����
                }
            }
            //----------------------2�ܰ� ����----------------------------------------------------------//
            ////////////////////////////////////////////////////////////////////////////////////////////

            //---------------------------------(����)3�ܰ� ����-----------------------------------------------//
            else if (wizard.level == 3) {
                //���� ���� //
                wizard.reset_stat(); // ���ΰ� ���� ����
                slime_legend.reset_stat(); // ������ ŷ��¯ ������ ������ ���� ����
                System.out.println("----------------------------------------------------------------------");
                System.out.println("<<3�ܰ�>>");
                System.out.println("������ vs [����]������ ŷ��¯ ������");
                System.out.println("----------------------------------------------------------------------");
                System.out.printf("-- ������ �����Ϸ��� �ƹ� ��ȣ�� ������, �����ϼ���. -> ");
                i = scanner.nextInt();
                ///////////////////
                /////////3�ܰ� ����//////////////////
                loop4:
                while (true) {
                    /////3�ܰ� �й� /////////////
                    if (wizard.hp <= 0) { // ���ΰ� hp�� 0�̸�, ������
                        System.out.println("----------------------------------------------------------------------");
                        System.out.println("<<3�ܰ� �й�...>>");
                        System.out.println("-- ����� �׾����ϴ�...");
                        wizard.level = 3;
                        System.out.println("----------------------------------------------------------------------");
                        System.out.printf("-- �κ�� ���ư����� �ƹ� ��ȣ�� ������ �����ϼ���. -> ");
                        i = scanner.nextInt();
                        continue loop;
                    }
                    //////3�ܰ� �¸� ///////////
                    if (slime_legend.hp <= 0) { // ������ŷ��¯�������� 0�̸�,
                        System.out.println("----------------------------------------------------------------------");
                        System.out.println("<<3�ܰ� �¸�!!>>");
                        wizard.level = 4; //���� 3�� ���
                        wizard.coin += 10000; //���� 10000�� ȹ��
                        System.out.println("-- ���� ��!! ���� ����: " + wizard.level);
                        System.out.println("-- ���� 10000�� ȹ��!! ���� ���� ���� : " + wizard.coin);
                        System.out.println("-- [[������ ŷ��¯ ����]] ȹ��!!!!");
                        System.out.println("----------------------------------------------------------------------");
                        System.out.printf("-- �ḻ�� ������, �ƹ� ��ȣ�� ������ �����ϼ���. -> ");
                        i = scanner.nextInt();
                        break loop; // ������ ���� �����Ѵ�.
                    }


                    ////------------3�ܰ� ���ӽ���----------------------------------------------------------------------//
                    //////////////////////////���ΰ� ����/////////////////////////////////////////////////////
                    try{ //1�� ���
                        Thread.sleep(500);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
                    System.out.println("�� hp: "+wizard.hp+" | �� mp: "+wizard.mp);
                    System.out.println(slime_legend.character_name+" hp: "+slime_legend.hp);
                    System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
                    System.out.println(" ");
                    try{ //1�� ���
                        Thread.sleep(500);
                    }catch (Exception e){
                        e.printStackTrace();
                    }

                    System.out.println("--<<" + turn + "��: �� ����>>");
                    System.out.println("1.�� ���� ����");
                    System.out.println("2.������ â, ������ ����ϱ�");
                    System.out.println("3.�Ϲݰ���");
                    System.out.println("4.����ȭ��");
                    System.out.println("5.�����");
                    System.out.println("6.������");
                    System.out.println("7.���׿�");
                    System.out.printf("-- ��ȣ �Է� -> ");
                    i = scanner.nextInt(); /// �ൿ ��ȣ �Է¹ޱ�
                    System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- --");
                    System.out.println("");
                    if(wizard.mp < 10 && (i<=4 && i>=7)){ // ���� ������ ��ų ������ �ϱ�
                        System.out.println("����(mp)�� �����մϴ�. �Ϲݰ��ݸ� �����մϴ�.");
                        continue loop4;
                    }
                    if (i == 1) { // �� ���� ����
                        wizard.my_stat();
                        continue loop4;
                    }
                    if (i == 2) {
                        wizard.item_show();//������â, ������ ���
                        continue loop4;
                    } else if (i == 3) { // �Ϲ� ���� //
                        wizard.attack(slime_legend);
                        slime_legend.attacked();
                    } else if (i == 4) { // ���� ȭ�� //
                        wizard.magic_arraw(slime_legend);
                        slime_legend.attacked();
                    } else if (i == 5) { // ����� //
                        wizard.magic_debuff(slime_legend);
                    } else if (i == 6) { // ������ //
                        wizard.magic_beam(slime_legend);
                        slime_legend.attacked();
                    } else if (i == 7) { // ���׿� //
                        wizard.magic_meteo(slime_legend);
                        slime_legend.attacked();
                    } else {
                        System.out.println("1���� 7���� �Է��� �ּ���.");
                        continue loop4;
                    }

                    /////////���ΰ� ���� �� ////////////
                    ////////----������ ŷ��¯ ������ ����---------/////////
                    if (slime_legend.hp > 0) { // ������ ŷ��¯ �������� hp�� 0 �̻��̶��, ����ִٸ�
                        System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- --");
                        System.out.println("--<<" + turn + "��: [������ ŷ��¯ ������] ����>>");

                        int i_slime_legend = 0; // ���������� ������
                        i_slime_legend = random.nextInt(7) + 1; // __����__ ������ 1~7�߿�

                        if (i_slime_legend == 1) { // �Ϲ� ����
                            slime_legend.attack(wizard); // ���ΰ����� �Ϲݰ���
                            wizard.attacked(); // ���ΰ� attacked()
                        } else if (i_slime_legend == 2) {// ���� ����
                            slime_legend.jump(wizard); // �������� ���ΰ����� ��������
                            wizard.attacked(); // ���ΰ� attacked()
                        } else if (i_slime_legend == 3) { // ���ο� ����
                            slime_legend.slow(wizard); // �������� ���ΰ����� ���ο� ���� - ���� ����
                        } else if(i_slime_legend == 4){ // ����� ����
                            slime_legend.legend_parasite(wizard);
                            wizard.attacked();
                        } else if(i_slime_legend == 5 ){ // ���̱� ���ݰ�
                            slime_legend.legend_melt(wizard);
                            wizard.attacked();
                        } else if(i_slime_legend == 6){ // �� ���� // attaked �ʿ� x
                            slime_legend.legend_poison(wizard);
                        } else if(i_slime_legend == 7){ // ������ ���� // �ڰ�����
                            slime_legend.legend_slime_buff();
                        }
                    }
                    turn++;
                }
            }
        }
///////---------------------------------------����---------------------------------------------------//
        script_4.start();
        try{
            script_4.join(); // ���������尡 ���������� ��ٷ�
        }catch (Exception e){
            e.printStackTrace();
        }
//        System.out.println("----------------------------------------------------------------------");
//        System.out.println("-- ����� [[���� ŷ��¯ ������ ����]]�� ���ð�,");
//        System.out.println("----[[������ ŷ��¯ �� ������]]�� �Ǿ����ϴ�.");
//        System.out.println("------�����մϴ�! ");
//        System.out.println("--------���� ��!!");
//        System.out.println("----------------------------------------------------------------------");
    }
}
