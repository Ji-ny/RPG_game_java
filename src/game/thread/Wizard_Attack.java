package game.thread;

import game.Character;
import game.Wizard;
import game.game_main;
import game.Slime;
import game.Slime_Fire;
import game.Slime_Ice;
import game.Slime_Legend;

import game.*;

//random.nextInt(3) + 1; // __����__ ������ 3���߿�
import java.util.Random;

public class Wizard_Attack extends Thread {
    Random random = new Random(); // ���� ��ü ����
    int level;
    Wizard wizard;
    Slime slime_1;
    Slime slime_2;
    Slime slime_3;
    Slime_Ice slime_ice;
    Slime_Fire slime_fire;
    Slime_Legend slime_legend;

    //������
    Wizard_Attack(int level, // ����
                  Wizard wizard, //���ΰ�, ������
                  Slime slime_1, //������1
                  Slime slime_2, // ������2
                  Slime slime_3, // ������3
                  Slime_Fire slime_fire, // �ҽ�����
                  Slime_Ice slime_ice, // ����������
                  Slime_Legend slime_legend){ // ŷ��¯������

        this.level = level; //����
        this.wizard = wizard; // ���ΰ�, ������ �ʱ�ȭ
        this.slime_1 = slime_1; // ������1
        this.slime_2 = slime_2; // ������2
        this.slime_3 = slime_3; // ������3
        this.slime_fire = slime_fire; //����������
        this.slime_ice = slime_ice; //�ҽ�����
        this.slime_legend = slime_legend; // ������ ŷ��¯������
    }

    int choice = 0;

    @Override
    public void run() {
        while(true) { // ���� �ݺ�.
            if (level == 1) { // ������ 1�̸�
                // ��ų ���� : 3.�Ϲݰ���, 4.����ȭ��
                int i = random.nextInt(2) + 3; // __����__ 3�̳� 4 �߿� ���� _
                if (wizard.mp < 10 && i == 4) { // ���� ������ ��ų ������ �ϱ�
                    System.out.println("����(mp)�� �����մϴ�. �Ϲݰ��ݸ� �����մϴ�.");
                    System.out.println("���� ����:" + wizard.mp);
                }
                else if (i == 3) { // �Ϲ� ���� //
                    System.out.println("<���ݴ��>");
                    System.out.println("1.������1, 2.������2, 3.������3");
                    System.out.printf("-- ���ݴ�� ��ȣ �Է� -> ");

                    int i_target = random.nextInt(3) + 1; // ���� Ÿ�� 1~3

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

                    int i_target = random.nextInt(3) + 1; // ���� Ÿ�� 1~3

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
                }

            } else if (level == 2) { // ������ 2�̸�
                // �ҽ�����, �������� ���� ����
            } else if (level == 3) { // ������ 3�̸�
                // ������ ŷ��¯ ������ ����
            }
        }

    }
}
