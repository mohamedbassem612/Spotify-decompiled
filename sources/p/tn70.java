package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum tn70 implements v190 {
    UNSPECIFIED(0),
    INVALID_FORMAT(1),
    ALREADY_TAKEN(2),
    UPDATE_LIMITED(3),
    CONTAINS_BLOCKED_WORD(4),
    INVALID_LENGTH(5),
    INVALID_BOUNDARY_CHARACTER(6),
    UNRECOGNIZED(-1);

    public final int a;

    tn70(int i) {
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
