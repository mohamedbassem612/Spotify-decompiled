package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class ai31 {
    public static final kiv a = mod.h(new n4k((byte) 21));
    public static final ci31 b;
    public static final ci31 c;

    static {
        int i = u7h.l;
        b = new ci31(true, Float.NaN, nfb.p());
        c = new ci31(false, Float.NaN, nfb.p());
    }

    public static ci31 a(float f, int i, boolean z) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        int i2 = u7h.l;
        long jP = nfb.p();
        if (p3v.c(f, Float.NaN) && z4h1.b(jP, nfb.p())) {
            return z ? b : c;
        }
        return new ci31(z, f, jP);
    }
}
