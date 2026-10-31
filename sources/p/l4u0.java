package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum l4u0 implements v190 {
    OK(0),
    NOT_FOUND(1),
    INVALID_ARGUMENTS(2),
    BACKEND_FAILURE(3),
    UNRECOGNIZED(-1);

    public final int a;

    l4u0(int i) {
        this.a = i;
    }

    public static l4u0 a(int i) {
        if (i == 0) {
            return OK;
        }
        if (i == 1) {
            return NOT_FOUND;
        }
        if (i == 2) {
            return INVALID_ARGUMENTS;
        }
        if (i != 3) {
            return null;
        }
        return BACKEND_FAILURE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
