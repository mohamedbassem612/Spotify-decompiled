package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum pmz implements v190 {
    UNKNOWN_STRATEGY(0),
    BEST_MATCHING(1),
    BACKEND_ADVISED(2),
    OFFLINED_FILE(3),
    CACHED_FILE(4),
    LOCAL_FILE(5),
    UNRECOGNIZED(-1);

    public final int a;

    pmz(int i2) {
        this.a = i2;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
