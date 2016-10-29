package shiyao.com.vocabularyscorer;

/**
 * Created by liushiyao on 10/29/16.
 */
public class Status {
    private int correctNbr;

    private int wrongNbr;

    private int total;

    private int count;

    private double rate;

    public Status(int total) {
        this.total = total;
        this.correctNbr = 0;
        this.wrongNbr = 0;
        this.rate = 0d;
    }

    public double getProgress() {
        return this.total == 0 ?  0d : (double) this.count / this.total;
    }

    public int getWrongNbr() {
        return wrongNbr;
    }

    public void setWrongNbr(int wrongNbr) {
        this.wrongNbr = wrongNbr;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getCorrectNbr() {

        return correctNbr;
    }

    public void setCorrectNbr(int correctNbr) {
        this.correctNbr = correctNbr;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
