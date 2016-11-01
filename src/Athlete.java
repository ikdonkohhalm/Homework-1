/**
 * Created by Isaac Donkoh-Halm on 10/26/2016.
 */
public class Athlete {
    BiathlonResult br;
    CyclingResult cr;
    public Athlete(BiathlonResult br, CyclingResult cr){
        this.br=br;
        this.cr=cr;
    }

}

public class CyclingResult {
    double time;
    int position;
    public CyclingResult (double time, int position) {
        this.time=time;
        this.position=position
    }
}


public class BiathlonResult {
    BiathlonRound round1;
    BiathlonRound round2;
    BiathlonRound round3;
    public BiathlonResult (BiathlonRound round1, BiathlonRound round2, BiathlonRound round3) {
        this.round1=round1;
        this.round2=round2;
        this.round3=round3;
    }
    
}


public class BiathlonRound {
    int hitTargets;
    double runTime;
    public BiathlonRound (int hitTargets, double runTime){
        this.hitTargets=hitTargets;
        this.runTime=runTime
    }
}
