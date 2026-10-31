package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum ftb1 implements v190 {
    STATS_AVAILABLE(0),
    STATS_EMPTY(1),
    STATS_EMPTY_CURRENT_PERIOD(2),
    STATS_DATA_PROCESSING(3),
    UNRECOGNIZED(-1);

    public final int a;

    ftb1(int i) {
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
