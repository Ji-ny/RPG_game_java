package game.thread;

import game.Character;
//

public class Slime_Attack extends Thread {

    int level;
    Character wizard;
    Character slime_1;
    Character slime_2;
    Character slime_3;
    Character slime_ice;
    Character slime_fire;
    Character slime_legend;

    //������
    Slime_Attack(int level, // ����
                  Character wizard, //���ΰ�, ������
                  Character slime_1, //������1
                  Character slime_2, // ������2
                  Character slime_3, // ������3
                  Character slime_fire, // �ҽ�����
                  Character slime_ice, // ����������
                  Character slime_legend){ // ŷ��¯������

        this.level = level; //����
        this.wizard = wizard; // ���ΰ�, ������ �ʱ�ȭ
        this.slime_1 = slime_1; // ������1
        this.slime_2 = slime_2; // ������2
        this.slime_3 = slime_3; // ������3
        this.slime_fire = slime_fire; //����������
        this.slime_ice = slime_ice; //�ҽ�����
        this.slime_legend = slime_legend; // ������ ŷ��¯������
    }

    @Override
    public void run() {
        while(true) { // ���� �ݺ�.
            if (level == 1) { // ������ 1�̸�
                // ������1, ������2, ������3�� ����.
            } else if (level == 2) { // ������ 2�̸�
                // �ҽ�����, ���������� ����
            } else if (level == 3) { // ������ 3�̸�
                // ������ ŷ��¯ �������� ����
            }
            try { // �����ϰ� 1�� ��ٸ���, ��ٸ��� �ڵ����� �������� ������ ��
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
