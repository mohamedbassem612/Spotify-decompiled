package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum tuw implements v190 {
    ELIGIBILITY_STATUS_UNSPECIFIED(0),
    ELIGIBILITY_STATUS_UNRESTRICTED(1),
    ELIGIBILITY_STATUS_HIDDEN(2),
    ELIGIBILITY_STATUS_DISABLED(3),
    ELIGIBILITY_STATUS_NEW_USER_ACCOUNT(4),
    ELIGIBILITY_STATUS_ALREADY_COMMENTED(5),
    UNRECOGNIZED(-1);

    public final int a;

    tuw(int i2) {
        this.a = i2;
    }

    public static tuw a(int i2) {
        if (i2 == 0) {
            return ELIGIBILITY_STATUS_UNSPECIFIED;
        }
        if (i2 == 1) {
            return ELIGIBILITY_STATUS_UNRESTRICTED;
        }
        if (i2 == 2) {
            return ELIGIBILITY_STATUS_HIDDEN;
        }
        if (i2 == 3) {
            return ELIGIBILITY_STATUS_DISABLED;
        }
        if (i2 == 4) {
            return ELIGIBILITY_STATUS_NEW_USER_ACCOUNT;
        }
        if (i2 != 5) {
            return null;
        }
        return ELIGIBILITY_STATUS_ALREADY_COMMENTED;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
