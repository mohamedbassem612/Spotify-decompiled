package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public enum ch40 implements v190 {
    GENERATION_STATUS_UNSPECIFIED(0),
    GENERATION_STATUS_IN_PROGRESS(1),
    GENERATION_STATUS_COMPLETE(2),
    GENERATION_STATUS_ERROR(3),
    UNRECOGNIZED(-1);

    public final int a;

    ch40(int i) {
        this.a = i;
    }

    public static ch40 a(int i) {
        if (i == 0) {
            return GENERATION_STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return GENERATION_STATUS_IN_PROGRESS;
        }
        if (i == 2) {
            return GENERATION_STATUS_COMPLETE;
        }
        if (i != 3) {
            return null;
        }
        return GENERATION_STATUS_ERROR;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
