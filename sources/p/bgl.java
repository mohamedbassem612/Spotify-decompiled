package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum bgl implements v190 {
    CONSENT_STATE_UNSPECIFIED(0),
    ELIGIBLE_NOT_GRANTED(1),
    INELIGIBLE(2),
    GRANTED(3),
    UNRECOGNIZED(-1);

    public final int a;

    bgl(int i) {
        this.a = i;
    }

    public static bgl a(int i) {
        if (i == 0) {
            return CONSENT_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return ELIGIBLE_NOT_GRANTED;
        }
        if (i == 2) {
            return INELIGIBLE;
        }
        if (i != 3) {
            return null;
        }
        return GRANTED;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
