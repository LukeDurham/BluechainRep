package node.blockchain.prescription;

import java.io.Serializable;

public abstract class Event implements Serializable{

    public enum Action {
        Prescription,
        FillScript,
        Algorithm
    }

    private String patientUID;
    private Action action;

    public String getPatientUID() {
        return patientUID;
    }

    public Action getAction() {
        return action;
    }

    public Event(Action action){
        this.action = action;
    }

    public Event(String patientUID, Action action){
        this.patientUID = patientUID;
        this.action = action;
    }


}

