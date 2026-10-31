package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum b131 implements v190 {
    NONE(0),
    IS_EXPLICIT(1),
    IS_19_PLUS(2),
    UNRECOGNIZED(-1);

    public final int a;

    b131(int i) {
        this.a = i;
    }

    public static b131 a(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return IS_EXPLICIT;
        }
        if (i != 2) {
            return null;
        }
        return IS_19_PLUS;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
