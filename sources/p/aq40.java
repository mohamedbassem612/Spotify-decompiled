package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum aq40 implements v190 {
    STATUS_UNKNOWN(0),
    STATUS_OPEN(1),
    STATUS_LOCKED(2),
    STATUS_EXPIRED(3),
    STATUS_COMPLETED(4),
    UNRECOGNIZED(-1);

    public final int a;

    aq40(int i) {
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
