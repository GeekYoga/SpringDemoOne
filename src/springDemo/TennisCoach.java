package springDemo;

public class TennisCoach implements Coach{

    private FortuneService fortuneService;

    public TennisCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Today we train a backhand with a twist.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
