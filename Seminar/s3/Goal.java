package Exception.Seminar.s3;

public class Goal {
    int i;
    int j;

    public Goal(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public String toString() {
        return String.format("[i = %s, j = %s]", i, j);
    }
}
