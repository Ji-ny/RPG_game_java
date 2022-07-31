package game;

import java.util.Random;
import game.*;

public class Wizard extends Character{

    public Wizard(String character_name, int hp, int mp, int attack_power, int defense_power, int max_hp, int max_mp, int max_defense_power, int max_attack_power){
        super(character_name, hp, mp, attack_power,defense_power,max_hp, max_mp,max_defense_power, max_attack_power);
    }
    int level = 1; //레벨
    int coin = 5; // 보유 코인

        ///포션 개수//
    int potion_hp = 0 ; // hp 회복 포션
    int potion_mp = 0 ; // mp 회복 포션
    int potion_max_hp = 0; // 최대 hp 증가 포션
    int potion_max_mp= 0 ; // 최대 mp 증가 포션
    int potion_max_attack_power = 0; // 최대 공격력 증가 포션
    int potion_max_defense_power = 0; // 최대 방어력 증가 포션

///////////////////////////////////////////////////////////////////////////////////
    // 스킬패시브 //

    public void plus_damage(Character target){ // 추가 데미지
        int temp_random = 0; // 랜덤 int 값
        Random random = new Random(); //랜덤 객체생성
        random.setSeed(System.currentTimeMillis()); //시드값 현재시간 설정
        temp_random = random.nextInt(10); // 0~10까지 랜덤한 숫자 리턴 <-- 수정해야 한다.
        System.out.println(target.character_name+"에게 랜덤으로 "+ temp_random + "의 추가 데미지가 들어갑니다.");
        target.hp = target.hp - temp_random;
    }
    //스킬//
    public void magic_arraw(Character target){ // 마법화살
        mp -= 10; // mp 감소
        target.hp = target.hp - 100; // 공격당한 캐릭터 hp : 공격력만큼 공격당하게 하기.
        System.out.println(target.character_name+"은 "+ character_name+ "에게 마법화살(magic_arraw) 공격을 받았다!");
    }

    public void magic_debuff(Character target){// 디버프 : 공격력, 방어력 감소
        mp -= 10; // mp 감소
        target.attack_power -= 10; // 타겟 공격력 감소
        target.defense_power -= 10; // 타겟 방어력 감소

        if(target.attack_power <= 0){ // 타겟 공격력이 0보다 작다면,
            target.attack_power = 0; // 공격력 0으로 초기화
        }

        if(target.defense_power <= 0){ // 타겟 방어력이 0보다 작다면,
            target.defense_power = 0; // 방어력 0으로 초기화
        }

        System.out.println(target.character_name+"은 " + character_name+ "에게 디버프(magic_debuff) 공격을 받았다!");
        System.out.println(target.character_name+"의 공격력과 방어력이 감소했다!");
        System.out.println(target.character_name+"의 공격력: "+ target.attack_power);
        System.out.println(target.character_name+"의 방어력: "+ target.defense_power);
        System.out.println("\n");
        // attacked 필요없음
    }

    public void magic_beam(Character target){ // 마법빔
        mp -= 10; // mp 감소
        target.hp = target.hp - 10; // 공격당한 캐릭터 hp : 공격력만큼 공격당하게 하기.
        System.out.println(target.character_name+"은 "+ character_name+ "에게 마법빔(magic_beam) 공격을 받았다!");
    }

    public void magic_meteo(Character target){ // 메테오, 추가공격격
        mp -= 10; // mp 감소
        target.hp = target.hp - 10; // 공격당한 캐릭터 hp : 공격력만큼 공격당하게 하기.
        System.out.println(target.character_name+"은 "+ character_name+ "에게 메테오(magic_meteo) 공격을 받았다!");
        plus_damage(target);
    }

    //-------------------------------------------------------------------------------------------------------------//

    //행동2//
    public void item_shop(){ // 아이템 구매하기, 상점 이용
        System.out.println("--------------------------------------------------------");
        System.out.println("현재 잔액: "+coin+"개");
        System.out.println("<상점 아이템 목록>");
        System.out.println("1.hp 회복 포션");
        System.out.println("2.mp 회복 포션");
        System.out.println("3.최대 hp 증가 포션");
        System.out.println("4.최대 mp 증가 포션");
        System.out.println("5.최대 공격력 증가 포션");
        System.out.println("6.최대 방어력 증가 포션");
        System.out.println("7.상점 나가기");
        System.out.println("--------------------------------------------------------");
        while(true) {
            int choice_shop = 0;
            System.out.printf("구매할 번호 입력 -> ");
            choice_shop = scanner.nextInt(); // 번호 입력받기
            if(choice_shop == 7) { // 7이면 종료
                System.out.println("-- 상점에서 나갑니다.");
                System.out.println("--------------------------------------------------------");
                break;
            }
            else{
                switch (choice_shop) {
                    case 1:

                        if(coin-1 >= 0) {
                            System.out.println("-- hp 회복 포션 구매 완료");
                            coin--;
                            potion_hp++;
                        }
                        else
                            System.out.println("-- 구매 실패, 잔액 부족");

                        break;
                    case 2:
                        if(coin-1 >= 0) {
                            System.out.println("-- mp 회복 포션 구매 완료");
                            coin--;
                            potion_mp++;
                        }
                        else
                            System.out.println("-- 구매 실패, 잔액 부족");
                        break;
                    case 3:
                        if(coin-1 >= 0) {
                            potion_max_hp++;
                            coin--;
                            System.out.println("-- 최대 hp 증가 포션 구매 완료");
                        }
                        else
                            System.out.println("-- 구매 실패, 잔액 부족");
                        break;
                    case 4:
                        if(coin-1 >= 0) {
                            potion_max_mp++;
                            coin--;
                            System.out.println("-- 최대 mp 증가 포션 구매 완료");
                        }
                        else{
                            System.out.println("-- 구매 실패, 잔액 부족");
                        }
                        break;
                    case 5:
                        if(coin-1 >= 0) {
                            potion_max_attack_power++;
                            coin--;
                            System.out.println("-- 최대 공격력 증가 포션 구매 완료");
                        }
                        else
                            System.out.println("-- 구매 실패, 잔액 부족");
                        break;
                    case 6:
                        if(coin-1 >= 0) {
                            potion_max_defense_power++;
                            coin--;
                            System.out.println("-- 최대 방어력 증가 포션 구매 완료");
                        }
                        else
                            System.out.println("-- 구매 실패, 잔액 부족");
                        break;
                    default:
                        System.out.println("-- 1부터 7까지 입력해주세요");
                }
            }
        }

    }
    public void item_show(){ //아이템창, 아이템 사용 , 게임 중엔 1,2번만 사용 가능
        System.out.println("--------------------------------------------------------");
        System.out.println("<아이템 목록>");
        System.out.println("1.hp 회복 포션: "+potion_hp+"개");
        System.out.println("2.mp 회복 포션: "+potion_mp+"개");
        System.out.println("3.최대 hp 증가 포션: "+potion_max_hp+"개");
        System.out.println("4.최대 mp 증가 포션: "+potion_max_mp+"개");
        System.out.println("5.최대 공격력 증가 포션: "+potion_max_attack_power+"개");
        System.out.println("6.최대 방어력 증가 포션: "+potion_max_defense_power+"개");
        System.out.println("7.아이템창 나가기");
        System.out.println("--------------------------------------------------------");
        while(true) {
            int choice_show = 0;
            System.out.printf("사용할 번호 입력 -> ");
            choice_show = scanner.nextInt(); // 번호 입력받기
            if(choice_show == 7) { // 7이면 종료
                System.out.println("-- 아이템 창에서 나갑니다.");
                System.out.println("--------------------------------------------------------");
                break;
            }
            else{
                switch (choice_show) {
                    case 1:

                        if(potion_hp-1 >= 0) {
                            System.out.println("-- hp 회복 포션 사용 완료");
                            potion_hp--; // hp 회복 포션 -1
                            hp += 10; // hp 10 회복
                            if(hp > max_hp){ //최대 hp보다 hp가 더 커지면
                                hp = max_hp; // hp를 max_hp로 조정
                            }
                            System.out.println("-- 현재 hp : "+hp);

                        }
                        else
                            System.out.println("-- 사용 실패, 개수 부족");

                        break;
                    case 2:
                        if(potion_mp-1 >= 0) {
                            System.out.println("-- mp 회복 포션 사용 완료");
                            potion_mp--; // mp 회복 포션 -1
                            mp += 10; // mp 10 회복
                            if(mp > max_mp){ //최대 mp보다 mp가 더 커지면
                                mp = max_mp; // hp를 max_hp로 조정
                            }
                            System.out.println("-- 현재 mp : "+mp);

                        }
                        else
                            System.out.println("-- 사용 실패, 개수 부족");
                        break;
                    case 3:
                        if(potion_max_hp-1 >= 0) {
                            System.out.println("-- 최대 hp 증가 포션 사용 완료");
                            potion_max_hp--; // 최대 hp 증가포션 -1
                            max_hp += 10; // 최대 hp 증가
                            System.out.println("-- 현재 Max hp : "+max_hp);
                        }
                        else
                            System.out.println("-- 사용 실패, 개수 부족");
                        break;
                    case 4:
                        if(potion_max_mp-1 >= 0) {
                            System.out.println("-- 최대 mp 증가 포션 사용 완료");
                            potion_max_mp--; // 최대 mp증가 포션 -1
                            max_mp += 10; // 최대 mp 증가
                            System.out.println("-- 현재 max_mp : "+max_mp);

                        }
                        else{
                            System.out.println("-- 사용 실패, 개수 부족");
                        }
                        break;
                    case 5:
                        if(potion_max_attack_power-1 >= 0) {
                            System.out.println("-- 최대 공격력 증가 포션 사용 완료");
                            potion_max_attack_power--; // 최대공격력증가포션 -1
                            max_attack_power += 10; // 최대 공격력 증가
                            System.out.println("-- 현재 최대 공격력 : "+max_attack_power);

                        }
                        else
                            System.out.println("-- 사용 실패, 개수 부족");
                        break;
                    case 6:
                        if(potion_max_defense_power-1 >= 0) {
                            System.out.println("-- 최대 방어력 증가 포션 사용 완료");
                            potion_max_defense_power--; // 최대방어력증가포션 -1
                            max_defense_power += 10; // 최대 방어력 증가
                            System.out.println("-- 현재 최대 방어력 : "+max_defense_power);

                        }
                        else
                            System.out.println("-- 사용 실패, 개수 부족");
                        break;
                    default:
                        System.out.println("-- 1부터 7까지 입력해주세요");
                }
            }
        }

    }

    public void my_stat(){ // 내 상태,내 정보보기
        System.out.println("--------------------------------------------------------");
        System.out.println("<현재 내 정보>");
        System.out.println("1.레벨:"+level);
        System.out.println("2.hp: "+hp);
        System.out.println("3.mp: "+mp);
        System.out.println("4.공격력: "+attack_power);
        System.out.println("5.방어력: "+defense_power);
        System.out.println("6.스킬 : 마법화살(1), 디버프(2), 마법빔(3),메테오(3)");
        System.out.println("-           -           -            -");
        System.out.println("1.최대 hp: "+max_hp);
        System.out.println("2.최대 mp: "+max_mp);
        System.out.println("3.최대 공격력: "+max_attack_power);
        System.out.println("4.최대 방어력: "+max_defense_power);
        System.out.println("--------------------------------------------------------");
    }


}
