package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum az91 implements v190 {
    SOCIAL_DATA_TYPE_UNSPECIFIED(0),
    SOCIAL_DATA_TYPE_REAL(1),
    SOCIAL_DATA_TYPE_PLACEHOLDER(2),
    UNRECOGNIZED(-1);

    public final int a;

    az91(int i) {
        this.a = i;
    }

    public static az91 a(int i) {
        if (i == 0) {
            return SOCIAL_DATA_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return SOCIAL_DATA_TYPE_REAL;
        }
        if (i != 2) {
            return null;
        }
        return SOCIAL_DATA_TYPE_PLACEHOLDER;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
