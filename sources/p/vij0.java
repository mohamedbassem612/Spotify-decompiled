package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum vij0 implements v190 {
    DEFAULT(0),
    SMALL(1),
    LARGE(2),
    XLARGE(3);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    vij0(int i) {
        this.a = i;
    }

    public static vij0 a(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 1) {
            return SMALL;
        }
        if (i == 2) {
            return LARGE;
        }
        if (i != 3) {
            return null;
        }
        return XLARGE;
    }

    public final int getNumber() {
        return this.a;
    }
}
