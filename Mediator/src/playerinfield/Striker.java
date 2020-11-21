package playerinfield;

import playerinfield.IReferee;

public class Striker implements Whistle {
    private IReferee refereeMediator;

    public Striker(IReferee refereeMediator){
        this.refereeMediator=refereeMediator;
    }

    @Override
    public void shootPenalty() {
        if(refereeMediator.isReady()){
            System.out.println("Successfully the penalty kick taken");
            refereeMediator.setReadyStatus(false);//goalkeeper is occupied
        }else {
            System.out.println("waiting for the goalkeeper");
        }
    }

    public void readyToShoot(){
        System.out.println("Taking the penalty kick initiated");

    }
    public void compleatedProcess(){
        System.out.println("penalty kicking process completed. ");
        refereeMediator.setReadyStatus(true);
    }
}
