/**
 * Created by Isaac Donkoh-Halm on 11/1/2016.
 */
public class CyclingResult implements IEvent {
    double time;
    int position;

    public CyclingResult(double time, int position) {
        this.time = time;
        this.position = position;
    }

    public double pointsEarned() {
        if (this.position == 1) {
            return (this.time - 10);
        } else if (this.position == 2) {
            return (this.time - 7);
        } else if (this.position == 3) {
            return (this.time - 3);
        } else {
            return this.time;
        }
    }
}