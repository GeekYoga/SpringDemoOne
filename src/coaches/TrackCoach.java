package coaches;

import fortuneServices.FortuneService;

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

    // add an init method, custom code, that will be executed when bean will be inited
    public void doMyStartupStuff() {
        System.out.println("TrackCoach: inside method doMystartupStuff");
    }

    // add an destroy method, custom code, that will be executed when bean will be destroy
    public void doMyCleanupStuff() {
        System.out.println("TrackCoach: inside method doMyCleanupStuff");
    }
}
