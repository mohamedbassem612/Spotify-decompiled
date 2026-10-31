package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum uql implements v190 {
    CONTENT_ALIGNMENT_UNKNOWN(0),
    CONTENT_ALIGNMENT_CENTER(1),
    CONTENT_ALIGNMENT_BOTTOM(2),
    UNRECOGNIZED(-1);

    public final int a;

    uql(int i) {
        this.a = i;
    }

    public static uql a(int i) {
        if (i == 0) {
            return CONTENT_ALIGNMENT_UNKNOWN;
        }
        if (i == 1) {
            return CONTENT_ALIGNMENT_CENTER;
        }
        if (i != 2) {
            return null;
        }
        return CONTENT_ALIGNMENT_BOTTOM;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
