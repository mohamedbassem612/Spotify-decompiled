package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum vg01 implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_REASON_START(0),
    REASON_START_OPEN(1),
    /* JADX INFO: Fake field, exist only in values array */
    REASON_START_PAGE_TURN(2),
    UNRECOGNIZED(-1);

    public final int a;

    vg01(int i) {
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
