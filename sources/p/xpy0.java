package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum xpy0 implements v190 {
    UNKNOWN_FAILURE(0),
    GENERAL_ERROR(2),
    INVALID_FILE(3),
    NOT_COMPATIBLE_WITH_RUNTIME(4),
    UNRECOGNIZED(-1);

    public final int a;

    xpy0(int i) {
        this.a = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
