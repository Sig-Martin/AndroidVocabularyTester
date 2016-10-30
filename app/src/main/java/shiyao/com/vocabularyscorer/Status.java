package shiyao.com.vocabularyscorer;

/**
 * Created by liushiyao on 10/29/16.
 */
public class Status {
    private int correctNbr;

    private int wrongNbr;

    private final int total;

    private int count;

    public void correct() {
        this.correctNbr += 1;
        this.count += 1;
    }

    public void wrong() {
        this.wrongNbr += 1;
        this.count += 1;
    }

    public Status(int total) {
        this.total = total;
        this.correctNbr = 0;
        this.wrongNbr = 0;
    }

    public String getProgressStr() {
        return  Math.round(this.getProgress() * 1000) / 100 + "%";
    }

    private double getProgress() {
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

    private double getRate() {
        return (double) this.correctNbr / (double) this.total;
    }

    public String getRateStr() {
        return  Math.round(this.getRate() * 1000) / 100 + "%";
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
