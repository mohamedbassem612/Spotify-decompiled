package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum trh implements v190 {
    NO_QUOTA_DATA(0),
    HAS_REMAINING_QUOTA(1),
    QUOTA_FULLY_CONSUMED(2),
    UNRECOGNIZED(-1);

    public final int a;

    trh(int i) {
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
