package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum zlz implements v190 {
    UNKNOWN(0),
    GOOD(1),
    POOR(3),
    ABSENT(4),
    UNRECOGNIZED(-1);

    public final int a;

    zlz(int i) {
        this.a = i;
    }

    public static zlz a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return GOOD;
        }
        if (i == 3) {
            return POOR;
        }
        if (i != 4) {
            return null;
        }
        return ABSENT;
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
