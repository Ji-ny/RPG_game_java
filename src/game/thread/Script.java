package game.thread;

public class Script extends Thread{
    int number;
    public Script(int number){
        this.number = number;
    }
    // 스토리 출력 함수 //
    public void script_story(){
        String[] script_story = {"<<스토리>>",
                "   슬라임 던전이 있다.",
                "   이 던전의 가장 깊숙한 곳에는 보물상자가 있다고 한다.",
                "   그 보물상자를 열면, '완전 킹왕짱 세지는 포션'을 얻을 수 있다.",
                "   마법사인 당신은 이 포션을 얻기 위해 던전을 탐험하기로 했다!",
                "----------------------------------------------------------------------",
                ""
        };

        for(int i = 0; i<script_story.length ; i++){ // 스토리 0.3초 시간차 두고 배열 출력, 배열 끝까지 출력
            System.out.println(script_story[i]); // 배열 인덱스의 값 출력
            try{
                Thread.sleep(300); // 0.3초
            }catch (Exception e){ // 예외
                e.printStackTrace();
            }
        }

    }

    // 1초 대기 //
    public void loading(){ // 1초 대기하는 함수
        try{
            Thread.sleep(1000); // 1초
        }catch (Exception e){ // 예외
            e.printStackTrace();
        }
    }

    public void  script_gamerule(){
        String[] script_gamerule = {
                "<<게임 방법>>",
                "   총 3단계로 이루어져 있다.",
                "   각 단계마다 나오는 몬스터를 모두 무찌르면, 보상을 획득한다.",
                "   단계가 진행될수록 당신은 여러가지 마법을 사용할 수 있다.",
                "   매번 단계 시작 전, 로비의 상점에서 코인으로 아이템을 구매할 수 있다.",
                "----------------------------------------------------------------------",
                ""
        };

        for(int i = 0; i<script_gamerule.length ; i++){ // 게임 방법 0.3초 차 두고 출력.
            System.out.println(script_gamerule[i]);
            try{
                Thread.sleep(300);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public void  script_title(){
        String[] script_title = {
                "====================",
                "  완","전 ", "킹","왕","짱 ","세","지","는 ", "포","션","을 ","얻","자","!  ",
                "====================\n\n",
                ""
        };

        for(int i = 0; i<script_title.length ; i++){ // 게임 방법 0.15초 차 두고 출력.
            System.out.printf(script_title[i]);
            try{
                Thread.sleep(150);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public void  script_ending(){
        String[] script_ending = {
                "======================================================================",
                "   당신은 [[완전 킹왕짱 세지는 포션]]을 마시고",
                "   [[전설의 킹왕짱 센 마법사]]가 되었습니다.",
                "   축하합니다!",
                "   게임 끝!!",
                "======================================================================"
        };

        for(int i = 0; i<script_ending.length ; i++){ // 게임 방법 0.15초 차 두고 출력.
            System.out.println(script_ending[i]);
            try{
                Thread.sleep(300);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run(){
        switch(number){
            case 0: // 대기
                loading(); // 1초 로딩
                break;
            case 1: // 스토리
                script_story();
                break;
            case 2: // 게임방법
                script_gamerule();
                break;
            case 3: // 게임 제목
                script_title();
                break;
            case 4: // 게임 엔딩
                script_ending();
                break;
            default:
                break;
        }

    }

//    public static void main(String[] args){
//        Thread jian = new Script(1); // 런어블생성자 생성
//        //Thread jian_thread = new Thread(jian); // 스레드 객체 생성
//        jian.start(); // 스레드 실행
//        try{
//            jian.join();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        Thread jian1 = new Script(2);
//        jian1.start();
//        try{
//            jian1.join();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//        System.out.println("finish");
//    }
}
