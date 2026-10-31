package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public enum kn0 implements v190 {
    PRECISION_UNKNOWN(0),
    PRECISION_LOW(1),
    PRECISION_HIGH(2),
    UNRECOGNIZED(-1);

    public final int a;

    kn0(int i) {
        this.a = i;
    }

    public static kn0 a(int i) {
        if (i == 0) {
            return PRECISION_UNKNOWN;
        }
        if (i == 1) {
            return PRECISION_LOW;
        }
        if (i != 2) {
            return null;
        }
        return PRECISION_HIGH;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
