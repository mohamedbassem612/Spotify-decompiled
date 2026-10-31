package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum tij0 implements v190 {
    FULL(0),
    TRAILER(1),
    BONUS(2);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    tij0(int i) {
        this.a = i;
    }

    public static tij0 a(int i) {
        if (i == 0) {
            return FULL;
        }
        if (i == 1) {
            return TRAILER;
        }
        if (i != 2) {
            return null;
        }
        return BONUS;
    }

    public final int getNumber() {
        return this.a;
    }
}
