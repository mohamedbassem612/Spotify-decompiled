package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum lqz0 implements v190 {
    UNSPECIFIED(0),
    DAY(1),
    WEEK(2),
    MONTH(3),
    YEAR(4),
    UNRECOGNIZED(-1);

    public final int a;

    lqz0(int i) {
        this.a = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
