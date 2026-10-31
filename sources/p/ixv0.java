package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum ixv0 implements v190 {
    DAY(0),
    WEEK(1),
    MONTH(2),
    YEAR(3),
    UNRECOGNIZED(-1);

    public final int a;

    ixv0(int i) {
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
