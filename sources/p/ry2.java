package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum ry2 implements v190 {
    AGGREGATION_WINDOW_UNSPECIFIED(0),
    AGGREGATION_WINDOW_SEVEN_DAYS(1),
    AGGREGATION_WINDOW_THIRTY_DAYS(2),
    AGGREGATION_WINDOW_ALL_TIME(3),
    UNRECOGNIZED(-1);

    public final int a;

    ry2(int i) {
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
