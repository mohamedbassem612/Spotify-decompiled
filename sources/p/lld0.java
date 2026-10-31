package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum lld0 implements v190 {
    UNKNOWN_LISTENING_PARTY_RESTRICTION(0),
    NO_RESTRICTION(1),
    NON_PREMIUM(2),
    GEO_BLOCKED(3),
    AGE_GATED(4),
    NOT_REGISTERED(5),
    UNRECOGNIZED(-1);

    public final int a;

    lld0(int i2) {
        this.a = i2;
    }

    public static lld0 a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_LISTENING_PARTY_RESTRICTION;
        }
        if (i2 == 1) {
            return NO_RESTRICTION;
        }
        if (i2 == 2) {
            return NON_PREMIUM;
        }
        if (i2 == 3) {
            return GEO_BLOCKED;
        }
        if (i2 == 4) {
            return AGE_GATED;
        }
        if (i2 != 5) {
            return null;
        }
        return NOT_REGISTERED;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
