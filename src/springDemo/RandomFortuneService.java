package springDemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService{

    private String[] fortunes = new String[] {"Fortune 1!", "Fortune 2!", "Fortune 3!"};

    @Override
    public String getFortune() {
        Random random = new Random();
        int index = random.nextInt(fortunes.length);
        return fortunes[index];
    }
}
