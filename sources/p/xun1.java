package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xun1 {
    public static final xun1 c;
    public static final xun1 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (nvn1.f) {
            d = null;
            c = null;
        } else {
            d = new xun1(null, false);
            c = new xun1(null, true);
        }
    }

    public xun1(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
