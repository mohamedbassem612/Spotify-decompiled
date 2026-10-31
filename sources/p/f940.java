package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum f940 implements v190 {
    DENY_REASON_UNSPECIFIED(0),
    DENY_REASON_ENTITLEMENT_MISSING(1),
    UNRECOGNIZED(-1);

    public final int a;

    f940(int i) {
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
