package game.thread;

public class Script extends Thread{
    int number;
    public Script(int number){
        this.number = number;
    }
    // ���丮 ��� �Լ� //
    public void script_story(){
        String[] script_story = {"<<���丮>>",
                "   ������ ������ �ִ�.",
                "   �� ������ ���� ����� ������ �������ڰ� �ִٰ� �Ѵ�.",
                "   �� �������ڸ� ����, '���� ŷ��¯ ������ ����'�� ���� �� �ִ�.",
                "   �������� ����� �� ������ ��� ���� ������ Ž���ϱ�� �ߴ�!",
                "----------------------------------------------------------------------",
                ""
        };

        for(int i = 0; i<script_story.length ; i++){ // ���丮 0.3�� �ð��� �ΰ� �迭 ���, �迭 ������ ���
            System.out.println(script_story[i]); // �迭 �ε����� �� ���
            try{
                Thread.sleep(300); // 0.3��
            }catch (Exception e){ // ����
                e.printStackTrace();
            }
        }

    }

    // 1�� ��� //
    public void loading(){ // 1�� ����ϴ� �Լ�
        try{
            Thread.sleep(1000); // 1��
        }catch (Exception e){ // ����
            e.printStackTrace();
        }
    }

    public void  script_gamerule(){
        String[] script_gamerule = {
                "<<���� ���>>",
                "   �� 3�ܰ�� �̷���� �ִ�.",
                "   �� �ܰ踶�� ������ ���͸� ��� �����, ������ ȹ���Ѵ�.",
                "   �ܰ谡 ����ɼ��� ����� �������� ������ ����� �� �ִ�.",
                "   �Ź� �ܰ� ���� ��, �κ��� �������� �������� �������� ������ �� �ִ�.",
                "----------------------------------------------------------------------",
                ""
        };

        for(int i = 0; i<script_gamerule.length ; i++){ // ���� ��� 0.3�� �� �ΰ� ���.
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
                "  ��","�� ", "ŷ","��","¯ ","��","��","�� ", "��","��","�� ","��","��","!  ",
                "====================\n\n",
                ""
        };

        for(int i = 0; i<script_title.length ; i++){ // ���� ��� 0.15�� �� �ΰ� ���.
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
                "   ����� [[���� ŷ��¯ ������ ����]]�� ���ð�",
                "   [[������ ŷ��¯ �� ������]]�� �Ǿ����ϴ�.",
                "   �����մϴ�!",
                "   ���� ��!!",
                "======================================================================"
        };

        for(int i = 0; i<script_ending.length ; i++){ // ���� ��� 0.15�� �� �ΰ� ���.
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
            case 0: // ���
                loading(); // 1�� �ε�
                break;
            case 1: // ���丮
                script_story();
                break;
            case 2: // ���ӹ��
                script_gamerule();
                break;
            case 3: // ���� ����
                script_title();
                break;
            case 4: // ���� ����
                script_ending();
                break;
            default:
                break;
        }

    }

//    public static void main(String[] args){
//        Thread jian = new Script(1); // ���������� ����
//        //Thread jian_thread = new Thread(jian); // ������ ��ü ����
//        jian.start(); // ������ ����
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
