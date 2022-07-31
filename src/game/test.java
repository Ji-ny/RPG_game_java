package game;
import java.util.Random;

public class test {
//·£´ý »ç¿ë
    public static void main(String[] args){
        int i;
        Random random = new Random();
        for(int j = 1; j < 10 ; j++){
            i = random.nextInt(10)+1;
            System.out.println(i);
        }

    }
}
