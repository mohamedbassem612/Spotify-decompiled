package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum bat implements v190 {
    DENIAL_REASON_UNSPECIFIED(0),
    DENIAL_REASON_MAX_CHILDREN_REACHED(1),
    DENIAL_REASON_PARENTAL_AGE_LOW(2),
    DENIAL_REASON_NOT_ALLOWED(3),
    UNRECOGNIZED(-1);

    public final int a;

    bat(int i) {
        this.a = i;
    }

    public static bat a(int i) {
        if (i == 0) {
            return DENIAL_REASON_UNSPECIFIED;
        }
        if (i == 1) {
            return DENIAL_REASON_MAX_CHILDREN_REACHED;
        }
        if (i == 2) {
            return DENIAL_REASON_PARENTAL_AGE_LOW;
        }
        if (i != 3) {
            return null;
        }
        return DENIAL_REASON_NOT_ALLOWED;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
