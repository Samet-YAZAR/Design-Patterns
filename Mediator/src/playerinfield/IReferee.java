package playerinfield;

import playerinfield.Goalkeeper;

public interface IReferee {
     void registerGoalkeeper(Goalkeeper goalkeeper);
     void registerStriker(Striker striker);
     void setReadyStatus(boolean status);
     Boolean isReady();

}
