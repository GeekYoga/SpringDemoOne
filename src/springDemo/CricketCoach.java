package springDemo;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public CricketCoach(){
        System.out.println("Cricketcoach: no arg constructor");
    }

    // Create setter method for dependency injection
    public void setFortuneService(FortuneService theFortuneService) {
        System.out.println("Cricketcoach: inside  setter method setFortune");
        this.fortuneService = theFortuneService;
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String theEmailAddress) {
        System.out.println("Cricketcoach: inside  setter method setEmail");
        this.emailAddress = theEmailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String theTeam) {
        System.out.println("Cricketcoach: inside  setter method setTeam");
        this.team = theTeam;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
