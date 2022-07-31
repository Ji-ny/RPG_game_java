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

    //생성자
    Slime_Attack(int level, // 레벨
                  Character wizard, //주인공, 마법사
                  Character slime_1, //슬라임1
                  Character slime_2, // 슬라임2
                  Character slime_3, // 슬라임3
                  Character slime_fire, // 불슬라임
                  Character slime_ice, // 얼음슬라임
                  Character slime_legend){ // 킹왕짱슬라임

        this.level = level; //레벨
        this.wizard = wizard; // 주인공, 마법사 초기화
        this.slime_1 = slime_1; // 슬라임1
        this.slime_2 = slime_2; // 슬라임2
        this.slime_3 = slime_3; // 슬라임3
        this.slime_fire = slime_fire; //얼음슬라임
        this.slime_ice = slime_ice; //불슬라임
        this.slime_legend = slime_legend; // 전설의 킹왕짱슬라임
    }

    @Override
    public void run() {
        while(true) { // 무한 반복.
            if (level == 1) { // 레벨이 1이면
                // 슬라임1, 슬라임2, 슬라임3이 공격.
            } else if (level == 2) { // 레벨이 2이면
                // 불슬라임, 물슬라임이 공격
            } else if (level == 3) { // 레벨이 3이면
                // 전설의 킹왕짱 슬라임이 공격
            }
            try { // 공격하고 1초 기다리기, 기다리면 자동으로 슬라임이 공격할 것
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
