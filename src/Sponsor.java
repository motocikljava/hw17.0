import java.util.Random;

public class Sponsor <S extends transport>{
    protected String sponsorName;
    protected int cash;

    public Sponsor(String sponsorName, int cash) {
        this.sponsorName = sponsorName;
        this.cash = cash;
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public int getCash() {
        return cash;
    }



    @Override
    public String toString() {
        return "Sponsor{" +
                "sponsorName='" + sponsorName + '\'' +
                ", cash=" + cash +
                '}';
    }
}
