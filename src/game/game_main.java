package game;
import game.thread.Script; // 스크립트 스레드 import

import java.util.Scanner;
import java.util.Random;//랜덤 사용


public class game_main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 스캐너 객체
        Random random = new Random(); // 랜덤 객체
        //random.nextInt(max + min) + min; // 1부터 10까지 생성 min : 1, max : 10

        //public Wizard(String character_name, int hp, int mp, int attack_power, int defense_power, int max_hp, int max_mp, int max_defense_power, int max_attack_power)
        //------------------------캐릭터 객체 생성 ------------------------//
        // 주인공//
        Wizard wizard = new Wizard(       // 마법사 객체 생성
                "마법사",                  //주인공 이름  (character_name)
                100,                      // hp
                100,                      // mp
                10,                      //공격력 (attack_power)
                10,                      //방어력 (defense_power)
                100,                      // 최대 hp (max_hp)
                100,                      // 최대 mp(max_mp)
                10,                      // 최대 방어력 (max_defense_power)
                10);                     // 최대 공격력 (max_attack_power),

        //------------------------몬스터 객체 생성---------------------------//
        //public Slime(String character_name, int hp, int mp, int attack_power, int defense_power, int max_hp, int max_mp, int max_defense_power, int max_attack_power)
        //----------------1단계---------------------//
        //슬라임1//
        Slime slime_1 = new Slime(       // 마법사 객체 생성
                "슬라임_1",                  //주인공 이름  (character_name)
                10,                      // hp
                0,                        // mp
                10,                      //공격력 (attack_power)
                10,                      //방어력 (defense_power)
                10,                      // 최대 hp (max_hp)
                0,                      // 최대 mp(max_mp)
                10,                      // 최대 방어력 (max_defense_power)
                10                       // 최대 공격력 (max_attack_power),
        );
        ///////////////////////////////////////////////////////////////////////////////////////////
        //슬라임2//
        Slime slime_2 = new Slime(       // 마법사 객체 생성
                "슬라임_2",                  //주인공 이름  (character_name)
                10,                      // hp
                0,                        // mp
                10,                      //공격력 (attack_power)
                10,                      //방어력 (defense_power)
                10,                      // 최대 hp (max_hp)
                0,                      // 최대 mp(max_mp)
                10,                      // 최대 방어력 (max_defense_power)
                10                       // 최대 공격력 (max_attack_power),
        );
        ///////////////////////////////////////////////////////////////////////////////////////////
        //슬라임3//
        Slime slime_3 = new Slime(       // 마법사 객체 생성
                "슬라임_3",                  //주인공 이름  (character_name)
                10,                      // hp
                0,                        // mp
                10,                      //공격력 (attack_power)
                10,                      //방어력 (defense_power)
                10,                      // 최대 hp (max_hp)
                0,                      // 최대 mp(max_mp)
                10,                      // 최대 방어력 (max_defense_power)
                10                       // 최대 공격력 (max_attack_power),
        );
        /////////////////////////////////////////////////////////////////////////////////////////////

        //-----------------------------------2단계------------------------------------------------//
        //얼음 슬라임//

        Slime_Ice slime_ice = new Slime_Ice(       // 마법사 객체 생성
                "얼음슬라임",                  //주인공 이름  (character_name)
                20,                      // hp
                0,                        // mp
                20,                      //공격력 (attack_power)
                20,                      //방어력 (defense_power)
                20,                      // 최대 hp (max_hp)
                0,                      // 최대 mp(max_mp)
                20,                      // 최대 방어력 (max_defense_power)
                20                       // 최대 공격력 (max_attack_power),
        );
        slime_ice.ice_stick(); // 얼음 슬라임 공격력 증가
        ///////////////////////////////////////////////////////////////////////////////////////////
        //불슬라임//
        Slime_Fire slime_fire = new Slime_Fire(       // 마법사 객체 생성
                "불슬라임",                  //주인공 이름  (character_name)
                20,                      // hp
                0,                        // mp
                20,                      //공격력 (attack_power)
                20,                      //방어력 (defense_power)
                20,                      // 최대 hp (max_hp)
                0,                      // 최대 mp(max_mp)
                20,                      // 최대 방어력 (max_defense_power)
                20                       // 최대 공격력 (max_attack_power),
        );
        //System.out.println("-- 불 슬라임은 불 지팡이를 착용했다! 불슬라임의 공격력 증가!");
        slime_fire.fire_stick(); // 불슬라임의 공격력 증가

        ///////////////////////////////////////////////////////////////////////////////////////////
        //----------------------------------3단계-------------------------------------------------//
        //전설의 킹왕짱 슬라임//
        Slime_Legend slime_legend = new Slime_Legend(       // 마법사 객체 생성
                "(보스)전설의킹왕짱슬라임",                  //주인공 이름  (character_name)
                30,                      // hp
                0,                        // mp
                50,                      //공격력 (attack_power)
                50,                      //방어력 (defense_power)
                30,                      // 최대 hp (max_hp)
                0,                      // 최대 mp(max_mp)
                50,                      // 최대 방어력 (max_defense_power)
                50                       // 최대 공격력 (max_attack_power),
        );
        slime_legend.Armor(); // 슬라임의 튼튼한 갑옷 착용!
        ///////////////////////////////////////////////////////////////////////////////////////////

        ///////////////////////////////////////////////////////////////////////////////////////////
        //----------------------------------오프닝--------------------------------------------------//
        // --------- 스레드 객체 생성  -------------------------------------------//
        Thread script_0 = new Script(0); // 1초 대기 스레드 객체
        Thread script_1 = new Script(1); // 스토리 스레드 객체
        Thread script_2 = new Script(2); // 게임방법 스레드 객체
        Thread script_3 = new Script(3); // 게임제목 스레드 객체
        Thread script_4 = new Script(4); // 게임엔딩 스레드 객체
        // -----------변수 생성 ----------------------------//
        int i; // 선택지
        int i_target;//공격 대상


        //---------------------------------게임 제목 -----------------------------------------------//
        script_3.start(); // 제목 스레드 출력
        try{
            script_3.join(); // 제목스레드가 끝날때까지 기다려
        }catch (Exception e){
            e.printStackTrace();
        }
        //----------------------------------스토리--------------------------------------------------//

//        System.out.println("<<스토리>>");
//        System.out.println("슬라임 던전이 있다.");
//        System.out.println("이 던전의 가장 깊숙한 곳에는 보물상자가 있다고 한다.");
//        System.out.println("그 보물상자를 열면, '완전 킹왕짱 세지는 포션'을 얻을 수 있다.");
//        System.out.println("마법사인 당신은 이 포션을 얻기 위해 던전을 탐험하기로 했다!");
//        System.out.println("----------------------------------------------------------------------");
//        System.out.println("");
        script_1.start(); // 스토리 진행
        try{
            script_1.join();
        }catch (Exception e){
            e.printStackTrace();
        }

        //-----------------------------------------------------------------------------------------//
        //-----------1초 로딩 -------------------//
        script_0.start();
        try{
            script_0.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        //----------------------------------게임 방법------------------------------------------------//

//        System.out.println("<<게임 방법>>");
//        System.out.println("총 3단계로 이루어져 있다.");
//        System.out.println("각 단계마다 나오는 몬스터를 모두 무찌르면, 보상을 획득한다.");
//        System.out.println("단계가 진행될수록 당신은 여러가지 마법을 사용할 수 있다.");
//        System.out.println("매번 단계 시작 전, 로비의 상점에서 코인으로 아이템을 구매할 수 있다.");
//        System.out.println("----------------------------------------------------------------------");
//        System.out.println("");
//        System.out.printf("-- 게임을 시작하려면 아무 번호나 누르고, 엔터하세요. -> ");

        script_2.start();
        try{
            script_2.join();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.printf("-- 게임을 시작하려면 아무 번호나 누르고, 엔터하세요. -> ");
        i = scanner.nextInt();
        System.out.printf("=============================  게임 시작!  =============================");

        try{ // 1초 대기
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }

        //--------------게임 시작-----------------------------------------------------------------------//
        //--------------로비,상점-------------------  //
        loop:
        while (true) {
            int turn = 1; //턴 1로 초기화

            loop1:
            // 로비창: loop~ loop1
            while (true) {
                System.out.println("");
                System.out.println("----------------------------------------------------------------------");
                System.out.println("    <<로비>>");
                System.out.println("    1.[상점]아이템 구매하기");
                System.out.println("    2.아이템 창,아이템 사용하기");
                System.out.println("    3.내 정보 보기");
                System.out.println("    4." + wizard.level + "단계로 가기");
                System.out.println("----------------------------------------------------------------------");


                System.out.printf("-- 번호 입력 ->");
                i = scanner.nextInt();
                if (i == 4) {
                    break; // 다음 단계로 가자~ 반복 탈출
                } else if (i == 1) {
                    wizard.item_shop(); // 1. [상점]아이템 구매하기
                } else if (i == 2) {
                    wizard.item_show(); // 2. 아이템 창, 아이템 사용하기
                } else if (i == 3) {
                    wizard.my_stat(); // 3. 내 정보 보기
                } else {
                    System.out.println("1부터 4까지 입력해 주세요.");
                }
            }

            //------------------------------다음 단계-------------------------------------//
            //-----------------------//---------1단계---------------//-----------------------//
            if (wizard.level == 1) {
                //스탯 리셋 //
                wizard.reset_stat(); // 주인공 스탯 리셋
                slime_1.reset_stat(); // 슬라임 스탯 리셋
                slime_2.reset_stat(); // 슬라임2 스탯 리셋
                slime_3.reset_stat(); // 슬라임3 스탯 리셋
                System.out.println("----------------------------------------------------------------------");
                System.out.println("<<1단계>>");
                System.out.println("마법사 vs 슬라임 3마리");
                System.out.println("----------------------------------------------------------------------");
                System.out.printf("-- 게임을 시작하려면 아무 번호나 누르고, 엔터하세요. -> ");
                i = scanner.nextInt();

                loop2:
                while (true) {//몬스터 피가 다 까지지 않았으면,
                    /////1단계 패배 /////////////
                    if (wizard.hp <= 0) { // 주인공 hp가 0이면, 죽으면
                        System.out.println("----------------------------------------------------------------------");
                        System.out.println("<<1단계 패배...>>");
                        System.out.println("-- 당신은 죽었습니다...");
                        wizard.level = 1;
                        System.out.println("----------------------------------------------------------------------");
                        System.out.printf("-- 로비로 돌아가려면 아무 번호나 누르고 엔터하세요. -> ");
                        i = scanner.nextInt();
                        continue loop;
                    }
                    //////1단계 승리 ///////////
                    if (slime_1.hp <= 0 && slime_2.hp <= 0 && slime_3.hp <= 0) { // 몬스터 피가 0이면
                        System.out.println("----------------------------------------------------------------------");
                        System.out.println("<<1단계 승리!!>>");
                        wizard.level = 2; //레벨 2로 상승
                        wizard.coin += 5; //코인 5개 획득
                        System.out.println("-- 레벨 업!! 현재 레벨: " + wizard.level);
                        System.out.println("-- 코인 5개 획득!! 현재 보유 코인 : " + wizard.coin);
                        System.out.println("-- 스킬 획득!");
                        System.out.println("---- (2) 디버브");
                        System.out.println("----------------------------------------------------------------------");
                        System.out.printf("-- 로비로 돌아가려면 아무 번호나 누르고 엔터하세요. -> ");
                        i = scanner.nextInt();
                        continue loop;
                    }
                    //////////////////////////주인공 공격/////////////////////////////////////////////////////
                    try{
                        Thread.sleep(500);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
                    System.out.println("[마법사] hp: "+wizard.hp+" |  mp: "+wizard.mp);
                    System.out.println("[슬라임1] hp: "+slime_1.hp+" | [슬라임2] hp: "+slime_2.hp+" | [슬라임3] hp: "+slime_3.hp);
                    System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
                    System.out.println(" ");
                    try{
                        Thread.sleep(500);
                    }catch (Exception e){
                        e.printStackTrace();
                    }


                    System.out.println("--<<" + turn + "턴: 내 차례>>");
                    System.out.println("1.내 정보 보기");
                    System.out.println("2.아이템 창, 아이템 사용하기");
                    System.out.println("3.일반공격");
                    System.out.println("4.마법화살");
                    System.out.printf("-- 번호 입력 -> ");
                    i = scanner.nextInt(); /// 행동 번호 입력받기
                    System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- --");
                    System.out.println("");
                    if(wizard.mp < 10 && i==4 ){ // 마나 부족시 스킬 못쓰게 하기
                        System.out.println("마나(mp)가 부족합니다. 일반공격만 가능합니다.");
                        System.out.println("현재 마나:"+wizard.mp);
                        continue loop2;
                    }
                    if (i == 1) { // 내 정보 보기
                        wizard.my_stat();
                        continue loop2;
                    }
                    else if (i == 2) {
                        wizard.item_show();//아이템창, 아이템 사용
                        continue loop2;
                    } else if (i == 3) { // 일반 공격 //
                        System.out.println("<공격대상>");
                        System.out.println("1.슬라임1, 2.슬라임2, 3.슬라임3");
                        System.out.printf("-- 공격대상 번호 입력 -> ");
                        i_target = scanner.nextInt();
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
                        i_target = scanner.nextInt();
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
                    } else {
                        System.out.println("1부터 4까지 입력해 주세요.");
                        continue loop2;
                    }
                    //----주인공 공격 끝 -----//
                    //---슬라임 1 공격 ------//
                    if (slime_1.hp > 0) { // 슬라임1의 hp가 0 이상이라면, 살아있다면
                        System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- --");
                        System.out.println("--<<" + turn + "턴: [슬라임1] 차례>>");
                        int i_slime1 = 0; // 슬라임1 선택지
                        i_slime1 = random.nextInt(3) + 1; // __랜덤__ 선택지 3개중에

                        if (i_slime1 == 1) { // 일반 공격
                            slime_1.attack(wizard); // 주인공에게 일반공격
                            wizard.attacked(); // 주인공 attacked()
                        } else if (i_slime1 == 2) {// 점프 공격
                            slime_1.jump(wizard); // 슬라임1이 주인공에게 점프공격
                            wizard.attacked(); // 주인공 attacked()
                        } else if (i_slime1 == 3) { // 슬로우 공격
                            slime_1.slow(wizard); // 슬라임1이 주인공에게 슬로우 공격 - 방어력 감소
                        }
                    }
                    //-------슬라임2 공격--------//
                    if (slime_2.hp > 0) { // 슬라임2의 hp가 0 이상이라면, 살아있다면
                        System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- --");
                        System.out.println("--<<" + turn + "턴: [슬라임2] 차례>>");
                        int i_slime2 = 0; // 슬라임2 선택지
                        i_slime2 = random.nextInt(3) + 1; // __랜덤__ 선택지 3개중에

                        if (i_slime2 == 1) { // 일반 공격
                            slime_2.attack(wizard); // 슬라임2가 주인공에게 일반공격
                            wizard.attacked(); // 주인공 attacked()
                        } else if (i_slime2 == 2) {// 점프 공격
                            slime_2.jump(wizard); // 슬라임2이 주인공에게 점프공격
                            wizard.attacked(); // 주인공 attacked()
                        } else if (i_slime2 == 3) { // 슬로우 공격
                            slime_2.slow(wizard); // 슬라임2가 주인공에게 슬로우 공격 - 방어력 감소
                        }
                    }

                    //-------슬라임3 공격--------//
                    if (slime_3.hp > 0) { // 슬라임3의 hp가 0 이상이라면, 살아있다면
                        System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- --");
                        System.out.println("--<<" + turn + "턴: [슬라임3] 차례>>");
                        int i_slime3 = 0; // 슬라임2 선택지
                        i_slime3 = random.nextInt(3) + 1; // __랜덤__ 선택지 3개중에

                        if (i_slime3 == 1) { // 일반 공격
                            slime_3.attack(wizard); // 슬라임3가 주인공에게 일반공격
                            wizard.attacked(); // 주인공 attacked()
                        } else if (i_slime3 == 2) {// 점프 공격
                            slime_3.jump(wizard); // 슬라임3이 주인공에게 점프공격
                            wizard.attacked(); // 주인공 attacked()
                        } else if (i_slime3 == 3) { // 슬로우 공격
                            slime_3.slow(wizard); // 슬라임3가 주인공에게 슬로우 공격 - 방어력 감소
                        }
                    }

                    turn++;// 턴 증가
                }
                ////////////////////////////-----------1단계 종료----------//////////////////////////////


            }
            /////////////////////////////////////////////////////////////////////////////////////////
            /////-----------------------------2단계--------------------------------------------/////////
            else if (wizard.level == 2) { // 주인공 레벨이 2이면
                //스탯 리셋 //
                wizard.reset_stat(); // 주인공 스탯 리셋
                slime_fire.reset_stat(); // 불 슬라임 스탯 리셋
                slime_ice.reset_stat(); // 얼음 슬라임 스탯 리셋
                System.out.println("----------------------------------------------------------------------");
                System.out.println("<<2단계>>");
                System.out.println("마법사 vs 불 슬라임 & 얼음 슬라임");
                System.out.println("----------------------------------------------------------------------");
                System.out.printf("-- 게임을 시작하려면 아무 번호나 누르고, 엔터하세요. -> ");
                i = scanner.nextInt();

                loop3:
                while (true) {//몬스터 피가 다 까지지 않았으면,
                    /////2단계 패배 /////////////
                    if (wizard.hp <= 0) { // 주인공 hp가 0이면, 죽으면
                        System.out.println("----------------------------------------------------------------------");
                        System.out.println("<<2단계 패배...>>");
                        System.out.println("-- 당신은 죽었습니다...");
                        wizard.level = 2;
                        System.out.println("----------------------------------------------------------------------");
                        System.out.printf("-- 로비로 돌아가려면 아무 번호나 누르고 엔터하세요. -> ");
                        i = scanner.nextInt();
                        continue loop;
                    }
                    //////2단계 승리 ///////////
                    if (slime_fire.hp <= 0 && slime_ice.hp <= 0) { // 불슬라임,얼음슬라임 피가 0이면
                        System.out.println("----------------------------------------------------------------------");
                        System.out.println("<<2단계 승리!!>>");
                        wizard.level = 3; //레벨 3로 상승
                        wizard.coin += 5; //코인 5개 획득
                        System.out.println("-- 레벨 업!! 현재 레벨: " + wizard.level);
                        System.out.println("-- 코인 5개 획득!! 현재 보유 코인 : " + wizard.coin);
                        System.out.println("-- 스킬 획득!");
                        System.out.println("---- (3) 마법빔");
                        System.out.println("---- (4) 메테오");
                        System.out.println("----------------------------------------------------------------------");
                        System.out.printf("-- 로비로 돌아가려면 아무 번호나 누르고 엔터하세요. -> ");
                        i = scanner.nextInt();
                        continue loop;
                    }
                    ////------------게임시작----------------------------------------------------------------------//
                    //////////////////////////주인공 공격/////////////////////////////////////////////////////
                    try{ // 1초 대기
                        Thread.sleep(500);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
                    System.out.println("내 hp: "+wizard.hp+" | 내 mp: "+wizard.mp);
                    System.out.println(slime_fire.character_name+" hp: "+slime_fire.hp+" | "+slime_ice.character_name+ " hp : "+slime_ice.hp);
                    System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
                    try{ //1초 대기
                        Thread.sleep(500);
                    }catch (Exception e){
                        e.printStackTrace();
                    }

                    System.out.println("--<<" + turn + "턴: 내 차례>>");
                    System.out.println("1.내 정보 보기");
                    System.out.println("2.아이템 창, 아이템 사용하기");
                    System.out.println("3.일반공격");
                    System.out.println("4.마법화살");
                    System.out.println("5.디버프");
                    System.out.printf("-- 번호 입력 -> ");
                    i = scanner.nextInt(); /// 행동 번호 입력받기
                    System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- --");
                    System.out.println("");
                    if(wizard.mp < 10 && (i==4 || i==5)){ // 마나 부족시 스킬 못쓰게 하기
                        System.out.println("마나(mp)가 부족합니다. 일반공격만 가능합니다.");
                        continue loop3;
                    }
                    if (i == 1) { // 내 정보 보기
                        wizard.my_stat();
                        continue loop3;
                    }
                    if (i == 2) {
                        wizard.item_show();//아이템창, 아이템 사용
                        continue loop3;
                    } else if (i == 3) { // 일반 공격 //
                        System.out.println("<공격대상>");
                        System.out.println("1.불 슬라임, 2.얼음 슬라임");
                        System.out.printf("-- 공격대상 번호 입력 -> ");
                        i_target = scanner.nextInt();
                        if (i_target == 1) {// 불 슬라임 일반공격
                            wizard.attack(slime_fire); // 주인공이 불슬라임 일반공격
                            slime_fire.attacked(); // 공격 받음, 죽거나 hp보여주거나
                        } else if (i_target == 2) { // 얼음 슬라임 일반공격
                            wizard.attack(slime_ice); //주인공이 얼음슬라임 일반공격
                            slime_ice.attacked(); // 공격 받음, 죽거나 hp보여주거나
                        }
                    } else if (i == 4) { // 마법 화살 //
                        System.out.println("<공격대상>");
                        System.out.println("1.불 슬라임, 2.얼음 슬라임");
                        System.out.printf("-- 공격대상 번호 입력 -> ");
                        i_target = scanner.nextInt();
                        if (i_target == 1) {// 불 슬라임 마법화살 공격
                            wizard.magic_arraw(slime_fire); // 주인공이 불슬라임 마법화살
                            slime_fire.attacked(); // 공격 받음, 죽거나 hp보여주거나
                        } else if (i_target == 2) { // 얼음 슬라임 마법화살
                            wizard.magic_arraw(slime_ice); //주인공이 얼음슬라임 마법화살
                            slime_ice.attacked(); // 공격 받음, 죽거나 hp보여주거나
                        }
                    } else if (i == 5) { // 디버프 //
                        System.out.println("<공격대상>");
                        System.out.println("1.불 슬라임, 2.얼음 슬라임");
                        System.out.printf("-- 공격대상 번호 입력 -> ");
                        i_target = scanner.nextInt();
                        if (i_target == 1) {// 불 슬라임 디버프 공격
                            wizard.magic_debuff(slime_fire); // 주인공이 불슬라임 디버프 . attacked() 없음
                        } else if (i_target == 2) { // 얼음 슬라임 디버프
                            wizard.magic_debuff(slime_ice); //주인공이 얼음슬라임 디버프 , attacked() 없음
                        }
                    } else {
                        System.out.println("1부터 5까지 입력해 주세요.");
                        continue loop3;
                    }
                    ///불슬라임 공격////
                    if (slime_fire.hp > 0) { // 불슬라임의 hp가 0 이상이라면, 살아있다면
                        System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- --");
                        System.out.println("--<<" + turn + "턴: [불 슬라임] 차례>>");

                        int i_slime_fire = 0; // 불슬라임 선택지
                        i_slime_fire = random.nextInt(5) + 1; // __랜덤__ 선택지 1~5중에

                        if (i_slime_fire == 1) { // 일반 공격
                            slime_fire.attack(wizard); // 주인공에게 일반공격
                            wizard.attacked(); // 주인공 attacked()
                        } else if (i_slime_fire == 2) {// 점프 공격
                            slime_fire.jump(wizard); // 슬라임이 주인공에게 점프공격
                            wizard.attacked(); // 주인공 attacked()
                        } else if (i_slime_fire == 3) { // 슬로우 공격
                            slime_fire.slow(wizard); // 슬라임이 주인공에게 슬로우 공격 - 방어력 감소
                        } else if (i_slime_fire == 4) { // 파이어볼 공격
                            slime_fire.fire_ball(wizard); // 슬라임이 주인공에게 파이어볼 공격
                            wizard.attacked();
                        } else if (i_slime_fire == 5) { // 불화살 공격
                            slime_fire.fire_arrow(wizard); // 슬라임이 주인공에게 불화살 공격
                            wizard.attacked();
                        }
                    }

                    ///얼음슬라임 공격////
                    if (slime_ice.hp > 0) { // 얼음슬라임의 hp가 0 이상이라면, 살아있다면
                        System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- --");
                        System.out.println("--<<" + turn + "턴: [얼음 슬라임] 차례>>");

                        int i_slime_ice = 0; // 얼음슬라임 선택지
                        i_slime_ice = random.nextInt(5) + 1; // __랜덤__ 선택지 1~5중에

                        if (i_slime_ice == 1) { // 일반 공격
                            slime_ice.attack(wizard); // 주인공에게 일반공격
                            wizard.attacked(); // 주인공 attacked()
                        } else if (i_slime_ice == 2) {// 점프 공격
                            slime_ice.jump(wizard); // 슬라임이 주인공에게 점프공격
                            wizard.attacked(); // 주인공 attacked()
                        } else if (i_slime_ice == 3) { // 슬로우 공격
                            slime_ice.slow(wizard); // 슬라임이 주인공에게 슬로우 공격 - 방어력 감소
                        } else if (i_slime_ice == 4) { // 파이어볼 공격
                            slime_ice.ice_freeze(wizard); // 슬라임이 주인공에게 얼리기 공격
                        } else if (i_slime_ice == 5) { // 얼음별 공격
                            slime_ice.ice_meteor(wizard); // 슬라임이 주인공에게 얼음별 공격
                            wizard.attacked();
                        }
                    }
                    turn++; // 턴 증가
                }
            }
            //----------------------2단계 종료----------------------------------------------------------//
            ////////////////////////////////////////////////////////////////////////////////////////////

            //---------------------------------(보스)3단계 시작-----------------------------------------------//
            else if (wizard.level == 3) {
                //스탯 리셋 //
                wizard.reset_stat(); // 주인공 스탯 리셋
                slime_legend.reset_stat(); // 전설의 킹왕짱 슬라임 슬라임 스탯 리셋
                System.out.println("----------------------------------------------------------------------");
                System.out.println("<<3단계>>");
                System.out.println("마법사 vs [보스]전설의 킹왕짱 슬라임");
                System.out.println("----------------------------------------------------------------------");
                System.out.printf("-- 게임을 시작하려면 아무 번호나 누르고, 엔터하세요. -> ");
                i = scanner.nextInt();
                ///////////////////
                /////////3단계 시작//////////////////
                loop4:
                while (true) {
                    /////3단계 패배 /////////////
                    if (wizard.hp <= 0) { // 주인공 hp가 0이면, 죽으면
                        System.out.println("----------------------------------------------------------------------");
                        System.out.println("<<3단계 패배...>>");
                        System.out.println("-- 당신은 죽었습니다...");
                        wizard.level = 3;
                        System.out.println("----------------------------------------------------------------------");
                        System.out.printf("-- 로비로 돌아가려면 아무 번호나 누르고 엔터하세요. -> ");
                        i = scanner.nextInt();
                        continue loop;
                    }
                    //////3단계 승리 ///////////
                    if (slime_legend.hp <= 0) { // 전설의킹왕짱슬라임이 0이면,
                        System.out.println("----------------------------------------------------------------------");
                        System.out.println("<<3단계 승리!!>>");
                        wizard.level = 4; //레벨 3로 상승
                        wizard.coin += 10000; //코인 10000개 획득
                        System.out.println("-- 레벨 업!! 현재 레벨: " + wizard.level);
                        System.out.println("-- 코인 10000개 획득!! 현재 보유 코인 : " + wizard.coin);
                        System.out.println("-- [[전설의 킹왕짱 포션]] 획득!!!!");
                        System.out.println("----------------------------------------------------------------------");
                        System.out.printf("-- 결말을 보려면, 아무 번호나 누르고 엔터하세요. -> ");
                        i = scanner.nextInt();
                        break loop; // 루프를 완전 종료한다.
                    }


                    ////------------3단계 게임시작----------------------------------------------------------------------//
                    //////////////////////////주인공 공격/////////////////////////////////////////////////////
                    try{ //1초 대기
                        Thread.sleep(500);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
                    System.out.println("내 hp: "+wizard.hp+" | 내 mp: "+wizard.mp);
                    System.out.println(slime_legend.character_name+" hp: "+slime_legend.hp);
                    System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
                    System.out.println(" ");
                    try{ //1초 대기
                        Thread.sleep(500);
                    }catch (Exception e){
                        e.printStackTrace();
                    }

                    System.out.println("--<<" + turn + "턴: 내 차례>>");
                    System.out.println("1.내 정보 보기");
                    System.out.println("2.아이템 창, 아이템 사용하기");
                    System.out.println("3.일반공격");
                    System.out.println("4.마법화살");
                    System.out.println("5.디버프");
                    System.out.println("6.마법빔");
                    System.out.println("7.메테오");
                    System.out.printf("-- 번호 입력 -> ");
                    i = scanner.nextInt(); /// 행동 번호 입력받기
                    System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- --");
                    System.out.println("");
                    if(wizard.mp < 10 && (i<=4 && i>=7)){ // 마나 부족시 스킬 못쓰게 하기
                        System.out.println("마나(mp)가 부족합니다. 일반공격만 가능합니다.");
                        continue loop4;
                    }
                    if (i == 1) { // 내 정보 보기
                        wizard.my_stat();
                        continue loop4;
                    }
                    if (i == 2) {
                        wizard.item_show();//아이템창, 아이템 사용
                        continue loop4;
                    } else if (i == 3) { // 일반 공격 //
                        wizard.attack(slime_legend);
                        slime_legend.attacked();
                    } else if (i == 4) { // 마법 화살 //
                        wizard.magic_arraw(slime_legend);
                        slime_legend.attacked();
                    } else if (i == 5) { // 디버프 //
                        wizard.magic_debuff(slime_legend);
                    } else if (i == 6) { // 마법빔 //
                        wizard.magic_beam(slime_legend);
                        slime_legend.attacked();
                    } else if (i == 7) { // 메테오 //
                        wizard.magic_meteo(slime_legend);
                        slime_legend.attacked();
                    } else {
                        System.out.println("1부터 7까지 입력해 주세요.");
                        continue loop4;
                    }

                    /////////주인공 공격 끝 ////////////
                    ////////----전설의 킹왕짱 슬라임 공격---------/////////
                    if (slime_legend.hp > 0) { // 전설의 킹왕짱 슬라임의 hp가 0 이상이라면, 살아있다면
                        System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- --");
                        System.out.println("--<<" + turn + "턴: [전설의 킹왕짱 슬라임] 차례>>");

                        int i_slime_legend = 0; // 얼음슬라임 선택지
                        i_slime_legend = random.nextInt(7) + 1; // __랜덤__ 선택지 1~7중에

                        if (i_slime_legend == 1) { // 일반 공격
                            slime_legend.attack(wizard); // 주인공에게 일반공격
                            wizard.attacked(); // 주인공 attacked()
                        } else if (i_slime_legend == 2) {// 점프 공격
                            slime_legend.jump(wizard); // 슬라임이 주인공에게 점프공격
                            wizard.attacked(); // 주인공 attacked()
                        } else if (i_slime_legend == 3) { // 슬로우 공격
                            slime_legend.slow(wizard); // 슬라임이 주인공에게 슬로우 공격 - 방어력 감소
                        } else if(i_slime_legend == 4){ // 기생충 공격
                            slime_legend.legend_parasite(wizard);
                            wizard.attacked();
                        } else if(i_slime_legend == 5 ){ // 녹이기 공격격
                            slime_legend.legend_melt(wizard);
                            wizard.attacked();
                        } else if(i_slime_legend == 6){ // 독 공격 // attaked 필요 x
                            slime_legend.legend_poison(wizard);
                        } else if(i_slime_legend == 7){ // 슬라임 버프 // 자가버프
                            slime_legend.legend_slime_buff();
                        }
                    }
                    turn++;
                }
            }
        }
///////---------------------------------------엔딩---------------------------------------------------//
        script_4.start();
        try{
            script_4.join(); // 엔딩스레드가 끝날때까지 기다려
        }catch (Exception e){
            e.printStackTrace();
        }
//        System.out.println("----------------------------------------------------------------------");
//        System.out.println("-- 당신은 [[완전 킹왕짱 세지는 포션]]을 마시고,");
//        System.out.println("----[[전설의 킹왕짱 센 마법사]]가 되었습니다.");
//        System.out.println("------축하합니다! ");
//        System.out.println("--------게임 끝!!");
//        System.out.println("----------------------------------------------------------------------");
    }
}
