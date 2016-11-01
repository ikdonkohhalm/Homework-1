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

public class CyclingResult implements IEvent {
    double time;
    int position;
    public CyclingResult (double time, int position) {
        this.time=time;
        this.position=position;
    }
    public double pointsEarned () {
        return this.time;
        /*
        Note: come back with if statements for the top 3 placed atheletes.
                1st Place: 10 Points off
                2nd Place: 7 points off
                3rd Place: 3 points off
        */
    }
}


public class BiathlonResult implements IEvent {
    BiathlonRound round1;
    BiathlonRound round2;
    BiathlonRound round3;
    public BiathlonResult (BiathlonRound round1, BiathlonRound round2, BiathlonRound round3) {
        this.round1=round1;
        this.round2=round2;
        this.round3=round3;
    }
    public double pointsEarned() {
        return (round1.runTime + (5-round1.hitTargets))+
                (round2.runTime + (5-round2.hitTargets))+
                (round3.runTime + (5-round3.hitTargets));
    }
    public BiathlonRound bestRound() {
        /* I F  S T A T E M E N T S
           F

           S
           T
           A
           T
           E
           M
           E
           N
           T
           S

          */
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

interface IEvent {
    public double pointsEarned();