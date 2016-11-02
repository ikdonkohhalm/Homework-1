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
    public double totalScore(){
        return cr.pointsEarned()+br.pointsEarned();
    }
    public boolean hasBeaten(Athlete other){
        return (this.totalScore()<other.totalScore());
    }
    public Athlete betterCyclist1(Athlete other) {
        if (this.cr < other.cr) {
            return this;
        } else {
            return other;
        }
    }


}









