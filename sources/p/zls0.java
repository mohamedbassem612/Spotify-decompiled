package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum zls0 implements v190 {
    SUCCESS(0),
    UNKNOWN_ERROR(1),
    PADLOCK_ERROR(2),
    USERACCOUNT_ERROR(3),
    NO_USER_ID(4),
    NOT_ELIGIBLE(5),
    UNRECOGNIZED(-1);

    public final int a;

    zls0(int i2) {
        this.a = i2;
    }

    public static zls0 a(int i2) {
        if (i2 == 0) {
            return SUCCESS;
        }
        if (i2 == 1) {
            return UNKNOWN_ERROR;
        }
        if (i2 == 2) {
            return PADLOCK_ERROR;
        }
        if (i2 == 3) {
            return USERACCOUNT_ERROR;
        }
        if (i2 == 4) {
            return NO_USER_ID;
        }
        if (i2 != 5) {
            return null;
        }
        return NOT_ELIGIBLE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
