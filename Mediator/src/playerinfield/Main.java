package playerinfield;

import playerinfield.Goalkeeper;
import playerinfield.IReferee;

public class Main {
    public static void main(String[] args) {
        IReferee refereeMediator = new Referee();
        Goalkeeper goalkeeper = new Goalkeeper(refereeMediator);

        Striker striker1 = new Striker(refereeMediator);
        Striker striker2 = new Striker(refereeMediator);

        refereeMediator.registerStriker(striker1);
        refereeMediator.registerGoalkeeper(goalkeeper);


        striker1.readyToShoot();
        goalkeeper.shootPenalty();
        striker1.shootPenalty();
        striker1.compleatedProcess();








    }
}
