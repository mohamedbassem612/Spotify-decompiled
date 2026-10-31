package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jfp1 {
    public static final jfp1 c;
    public static final jfp1 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (tfp1.f) {
            d = null;
            c = null;
        } else {
            d = new jfp1(null, false);
            c = new jfp1(null, true);
        }
    }

    public jfp1(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
