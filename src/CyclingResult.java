/**
 * Created by Isaac Donkoh-Halm on 11/1/2016.
 */
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
