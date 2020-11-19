public class Referee implements IReferee{
    private Goalkeeper goalkeeper;
    private Striker striker;
    private Boolean ready;

    @Override
    public void registerGoalkeeper(Goalkeeper goalkeeper) {
            this.goalkeeper=goalkeeper;
    }

    @Override
    public void registerStriker(Striker striker) {
            this.striker=striker;
    }

    @Override
    public void setReadyStatus(boolean status) {
            this.ready= status;
    }

    @Override
    public Boolean isReady() {
        return ready;
    }
}
