package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum x831 implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    RESUME_POINT_VIEW_UNSPECIFIED(0),
    RESUME_POINT_VIEW_BASIC(1),
    /* JADX INFO: Fake field, exist only in values array */
    RESUME_POINT_VIEW_FULL(2),
    UNRECOGNIZED(-1);

    public final int a;

    x831(int i) {
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
