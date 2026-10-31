package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum la81 implements v190 {
    UNKNOWN_LABEL(0),
    NOT_STARTED(1),
    IN_PROGRESS(2),
    COMPLETED(3);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    la81(int i) {
        this.a = i;
    }

    public static la81 a(int i) {
        if (i == 0) {
            return UNKNOWN_LABEL;
        }
        if (i == 1) {
            return NOT_STARTED;
        }
        if (i == 2) {
            return IN_PROGRESS;
        }
        if (i != 3) {
            return null;
        }
        return COMPLETED;
    }

    public final int getNumber() {
        return this.a;
    }
}
