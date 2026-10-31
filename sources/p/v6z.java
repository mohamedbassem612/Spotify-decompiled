package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum v6z implements v190 {
    UNKNOWN(0),
    FULL(1),
    TRAILER(2),
    BONUS(3);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    v6z(int i) {
        this.a = i;
    }

    public static v6z a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return FULL;
        }
        if (i == 2) {
            return TRAILER;
        }
        if (i != 3) {
            return null;
        }
        return BONUS;
    }

    public final int getNumber() {
        return this.a;
    }
}
