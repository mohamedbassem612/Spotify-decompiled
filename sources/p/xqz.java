package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum xqz implements v190 {
    OK(0),
    FORBIDDEN(1),
    NOT_FOUND(2),
    CONFLICT(3),
    UNRECOGNIZED(-1);

    public final int a;

    xqz(int i) {
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
