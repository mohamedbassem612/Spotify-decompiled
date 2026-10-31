package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum moz implements v190 {
    UNMETERED(0),
    CELLULAR(1),
    EXPENSIVE(2),
    CONSTRAINED(3),
    UNRECOGNIZED(-1);

    public final int a;

    moz(int i) {
        this.a = i;
    }

    public static moz a(int i) {
        if (i == 0) {
            return UNMETERED;
        }
        if (i == 1) {
            return CELLULAR;
        }
        if (i == 2) {
            return EXPENSIVE;
        }
        if (i != 3) {
            return null;
        }
        return CONSTRAINED;
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
