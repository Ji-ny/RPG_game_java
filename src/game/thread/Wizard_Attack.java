package game.thread;

import game.Character;
import game.Wizard;
import game.game_main;
import game.Slime;
import game.Slime_Fire;
import game.Slime_Ice;
import game.Slime_Legend;

import game.*;

//random.nextInt(3) + 1; // __랜덤__ 선택지 3개중에
import java.util.Random;

public class Wizard_Attack extends Thread {
    Random random = new Random(); // 랜덤 객체 선언
    int level;
    Wizard wizard;
    Slime slime_1;
    Slime slime_2;
    Slime slime_3;
    Slime_Ice slime_ice;
    Slime_Fire slime_fire;
    Slime_Legend slime_legend;

    //생성자
    Wizard_Attack(int level, // 레벨
                  Wizard wizard, //주인공, 마법사
                  Slime slime_1, //슬라임1
                  Slime slime_2, // 슬라임2
                  Slime slime_3, // 슬라임3
                  Slime_Fire slime_fire, // 불슬라임
                  Slime_Ice slime_ice, // 얼음슬라임
                  Slime_Legend slime_legend){ // 킹왕짱슬라임

        this.level = level; //레벨
        this.wizard = wizard; // 주인공, 마법사 초기화
        this.slime_1 = slime_1; // 슬라임1
        this.slime_2 = slime_2; // 슬라임2
        this.slime_3 = slime_3; // 슬라임3
        this.slime_fire = slime_fire; //얼음슬라임
        this.slime_ice = slime_ice; //불슬라임
        this.slime_legend = slime_legend; // 전설의 킹왕짱슬라임
    }

    int choice = 0;

    @Override
    public void run() {
        while(true) { // 무한 반복.
            if (level == 1) { // 레벨이 1이면
                // 스킬 선택 : 3.일반공격, 4.마법화살
                int i = random.nextInt(2) + 3; // __랜덤__ 3이나 4 중에 선택 _
                if (wizard.mp < 10 && i == 4) { // 마나 부족시 스킬 못쓰게 하기
                    System.out.println("마나(mp)가 부족합니다. 일반공격만 가능합니다.");
                    System.out.println("현재 마나:" + wizard.mp);
                }
                else if (i == 3) { // 일반 공격 //
                    System.out.println("<공격대상>");
                    System.out.println("1.슬라임1, 2.슬라임2, 3.슬라임3");
                    System.out.printf("-- 공격대상 번호 입력 -> ");

                    int i_target = random.nextInt(3) + 1; // 랜덤 타겟 1~3

                    if (i_target == 1) {// 슬라임1 일반공격
                        wizard.attack(slime_1); // 주인공이 슬라임1 일반공격
                        slime_1.attacked(); // 공격 받음, 죽거나 hp보여주거나
                    } else if (i_target == 2) {
                        wizard.attack(slime_2); //주인공이 슬라임2 일반공격
                        slime_2.attacked(); // 공격 받음, 죽거나 hp보여주거나
                    } else if (i_target == 3) {
                        wizard.attack(slime_3); // 주인공이 슬라임3 일반공격
                        slime_3.attacked(); // 공격 받음, 죽거나 hp보여주거나
                    }

                } else if (i == 4) { // 3.마법화살 공격 //
                    System.out.println("<공격대상>");
                    System.out.println("1.슬라임1, 2.슬라임2, 3.슬라임3");
                    System.out.printf("-- 공격대상 번호 입력 -> ");

                    int i_target = random.nextInt(3) + 1; // 랜덤 타겟 1~3

                    if (i_target == 1) {// 타겟: 슬라임1
                        wizard.magic_arraw(slime_1); // 주인공이 슬라임1 마법화살 공격
                        slime_1.attacked(); // 슬라임1 attacked()
                    } else if (i_target == 2) { //타겟:슬라임2
                        wizard.magic_arraw(slime_2); // 주인공이 슬라임2 마법화살 공격
                        slime_2.attacked(); // 슬라임2 attacked()
                    } else if (i_target == 3) { //타겟:슬라임3
                        wizard.magic_arraw(slime_3); // 주인공이 슬라임3 마법화살 공격
                        slime_3.attacked(); // 슬라임3 attacked()
                    }
                }

            } else if (level == 2) { // 레벨이 2이면
                // 불슬라임, 물슬라임 랜덤 공격
            } else if (level == 3) { // 레벨이 3이면
                // 전설의 킹왕짱 슬라임 공격
            }
        }

    }
}
