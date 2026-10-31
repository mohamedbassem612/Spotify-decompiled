package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class l9 {
    public static final l9 c;
    public static final l9 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (t9.d) {
            d = null;
            c = null;
        } else {
            d = new l9(null, false);
            c = new l9(null, true);
        }
    }

    public l9(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
