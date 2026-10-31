package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum jji1 implements v190 {
    USER_VERIFICATION_UNSPECIFIED(0),
    USER_VERIFICATION_REQUIRED(1),
    USER_VERIFICATION_PREFERRED(2),
    USER_VERIFICATION_DISCOURAGED(3),
    UNRECOGNIZED(-1);

    public final int a;

    jji1(int i) {
        this.a = i;
    }

    public static jji1 a(int i) {
        if (i == 0) {
            return USER_VERIFICATION_UNSPECIFIED;
        }
        if (i == 1) {
            return USER_VERIFICATION_REQUIRED;
        }
        if (i == 2) {
            return USER_VERIFICATION_PREFERRED;
        }
        if (i != 3) {
            return null;
        }
        return USER_VERIFICATION_DISCOURAGED;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
