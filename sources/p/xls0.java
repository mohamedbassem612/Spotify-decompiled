package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum xls0 implements v190 {
    UNKNOWN(0),
    BLOCKED(1),
    VIEWER(2),
    CONTRIBUTOR(3),
    MADE_FOR(4),
    ADMIN(5),
    UNRECOGNIZED(-1);

    public final int a;

    xls0(int i2) {
        this.a = i2;
    }

    public static xls0 a(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 == 1) {
            return BLOCKED;
        }
        if (i2 == 2) {
            return VIEWER;
        }
        if (i2 == 3) {
            return CONTRIBUTOR;
        }
        if (i2 == 4) {
            return MADE_FOR;
        }
        if (i2 != 5) {
            return null;
        }
        return ADMIN;
    }

    @Override // p.v190
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
