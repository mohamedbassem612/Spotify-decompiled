package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum mfc implements v190 {
    PRIMARY(0),
    SECONDARY(1),
    TERTIARY(2),
    UNRECOGNIZED(-1);

    public final int a;

    mfc(int i) {
        this.a = i;
    }

    public static mfc a(int i) {
        if (i == 0) {
            return PRIMARY;
        }
        if (i == 1) {
            return SECONDARY;
        }
        if (i != 2) {
            return null;
        }
        return TERTIARY;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
