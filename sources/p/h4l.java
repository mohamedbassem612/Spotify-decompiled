package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum h4l implements v190 {
    UNKNOWN_GROUPING_STATUS(0),
    GROUPED(1),
    GROUPABLE(2),
    GROUPING(3),
    UNRECOGNIZED(-1);

    public final int a;

    h4l(int i) {
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
