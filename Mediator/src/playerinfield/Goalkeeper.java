package playerinfield;

public class Goalkeeper  implements Whistle {
    private IReferee refereeMediator;

    public Goalkeeper(IReferee refereeMediator){
        this.refereeMediator=refereeMediator;
    }
    @Override
    public void shootPenalty() {
        System.out.println("GoalKeeper is ready for shooting");
        refereeMediator.setReadyStatus(true);
    }
}
