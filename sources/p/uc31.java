package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class uc31 {
    public static final uc31 d = new uc31(0, false, false);
    public static final uc31 e = new uc31(500, true, false);
    public static final uc31 f;
    public final short a;
    public final boolean b;
    public final boolean c;

    static {
        new uc31(100L, true, false);
        f = new uc31(0L, false, true);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
    public uc31(long j, boolean z, boolean z2) {
        this.b = z;
        this.a = (int) j;
        if (z2) {
            o0c.k("shouldRetry must be false when completeWithoutFailure is set to true", !z);
        }
        this.c = z2;
    }
}
