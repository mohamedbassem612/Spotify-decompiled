package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum h5t implements v190 {
    REASON_UNSPECIFIED(0),
    CAPPED(1),
    ENTITLEMENT_MISSING(2),
    UNRECOGNIZED(-1);

    public final int a;

    h5t(int i) {
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
