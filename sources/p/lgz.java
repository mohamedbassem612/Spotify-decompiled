package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum lgz implements v190 {
    ERROR_CODE_UNSPECIFIED(0),
    INVALID_REQUEST(1),
    NOTE_NOT_FOUND(2),
    POLICY_VIOLATION(3),
    UNAUTHORIZED(4),
    CONTENT_TOO_LONG(5),
    MAX_NOTES_REACHED(6),
    UNRECOGNIZED(-1);

    public final int a;

    lgz(int i) {
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
