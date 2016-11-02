/**
 * Created by Isaac Donkoh-Halm on 11/1/2016.
 */
public class BiathlonResult implements IEvent {
    BiathlonRound round1;
    BiathlonRound round2;
    BiathlonRound round3;

    public BiathlonResult(BiathlonRound round1, BiathlonRound round2, BiathlonRound round3) {
        this.round1 = round1;
        this.round2 = round2;
        this.round3 = round3;
    }

    public double pointsEarned() {
        return (round1.runTime + (5 - round1.hitTargets)) +
                (round2.runTime + (5 - round2.hitTargets)) +
                (round3.runTime + (5 - round3.hitTargets));
    }

    public BiathlonRound bestRound() {
        if ((round1.runTime + (5 - round1.hitTargets)) < (round2.runTime + (5 - round2.hitTargets))) {
            if ((round1.runTime + (5 - round1.hitTargets)) < (round3.runTime + (5 - round3.hitTargets))) {
                return (this.round1);
            } else if ((round1.runTime + (5 - round1.hitTargets)) == (round2.runTime + (5 - round2.hitTargets))) {
                return (this.round1);
            }
        }
        if ((round2.runTime + (5 - round2.hitTargets)) < (round1.runTime + (5 - round1.hitTargets))) {
            if ((round2.runTime + (5 - round2.hitTargets)) < (round3.runTime + (5 - round3.hitTargets))) {
                return (this.round2);
            } else if ((round2.runTime + (5 - round2.hitTargets)) == (round3.runTime + (5 - round3.hitTargets))) {
                return (this.round2);
            }
        }
        if ((round3.runTime + (5 - round3.hitTargets)) < (round1.runTime + (5 - round1.hitTargets))) {
            if ((round3.runTime + (5 - round3.hitTargets)) < (round2.runTime + (5 - round2.hitTargets))) {
                return (this.round3);
            } else if ((round3.runTime + (5 - round3.hitTargets)) == (round1.runTime + (5 - round1.hitTargets))) {
                return (this.round1);
            }
        }
    }
}
