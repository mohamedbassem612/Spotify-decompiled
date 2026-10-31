package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum n3e implements v190 {
    OK(0),
    NOT_FOUND(1),
    FAILED_TO_PARSE_JSON(2),
    INVALID_STATE(3),
    UNRECOGNIZED(-1);

    public final int a;

    n3e(int i) {
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
