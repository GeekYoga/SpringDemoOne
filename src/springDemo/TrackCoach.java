package springDemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    // No argument constructor
    public TrackCoach() {}

    public TrackCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
