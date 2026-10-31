package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum vls0 implements v190 {
    UNKNOWN(0),
    BLOCKED(1),
    VIEWER(2),
    CONTRIBUTOR(3),
    MADE_FOR(4),
    ADMIN(5);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    vls0(int i) {
        this.a = i;
    }

    public static vls0 a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return BLOCKED;
        }
        if (i == 2) {
            return VIEWER;
        }
        if (i == 3) {
            return CONTRIBUTOR;
        }
        if (i == 4) {
            return MADE_FOR;
        }
        if (i != 5) {
            return null;
        }
        return ADMIN;
    }

    public final int getNumber() {
        return this.a;
    }
}
