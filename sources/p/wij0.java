package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum wij0 implements v190 {
    AD(0),
    SUBSCRIPTION(1),
    CATALOGUE_ALL(2),
    SHUFFLE(3),
    COMMERCIAL(4);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    wij0(int i) {
        this.a = i;
    }

    public static wij0 a(int i) {
        if (i == 0) {
            return AD;
        }
        if (i == 1) {
            return SUBSCRIPTION;
        }
        if (i == 2) {
            return CATALOGUE_ALL;
        }
        if (i == 3) {
            return SHUFFLE;
        }
        if (i != 4) {
            return null;
        }
        return COMMERCIAL;
    }

    public final int getNumber() {
        return this.a;
    }
}
