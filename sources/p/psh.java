package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum psh implements v190 {
    OK(0),
    NOT_FOUND(1),
    INVALID_ARGUMENTS(2),
    BACKEND_FAILURE(3),
    UNIMPLEMENTED(4),
    UNRECOGNIZED(-1);

    public final int a;

    psh(int i) {
        this.a = i;
    }

    public static psh a(int i) {
        if (i == 0) {
            return OK;
        }
        if (i == 1) {
            return NOT_FOUND;
        }
        if (i == 2) {
            return INVALID_ARGUMENTS;
        }
        if (i == 3) {
            return BACKEND_FAILURE;
        }
        if (i != 4) {
            return null;
        }
        return UNIMPLEMENTED;
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
