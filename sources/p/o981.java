package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum o981 implements v190 {
    UNKNOWN(0),
    TRAILER(1),
    CONTINUE_LISTENING(2),
    LATEST_PUBLISHED(3),
    UP_NEXT(4),
    FIRST_PUBLISHED(5);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    o981(int i) {
        this.a = i;
    }

    public static o981 a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return TRAILER;
        }
        if (i == 2) {
            return CONTINUE_LISTENING;
        }
        if (i == 3) {
            return LATEST_PUBLISHED;
        }
        if (i == 4) {
            return UP_NEXT;
        }
        if (i != 5) {
            return null;
        }
        return FIRST_PUBLISHED;
    }

    public final int getNumber() {
        return this.a;
    }
}
