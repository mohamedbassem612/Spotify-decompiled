package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rkb0 {
    public static final rkb0 a;

    static {
        rkb0 rkb0Var = new rkb0();
        if (p3v.b(0.0f, 0.0f) < 0 || p3v.b(0.0f, 0.0f) < 0 || p3v.b(0.0f, 0.0f) < 0 || p3v.b(0.0f, 0.0f) < 0) {
            pf80.a("Layer outsets must be non-negative");
        }
        a = rkb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rkb0) && p3v.c(0.0f, 0.0f) && p3v.c(0.0f, 0.0f) && p3v.c(0.0f, 0.0f) && p3v.c(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + x0d.f(x0d.f(Float.hashCode(0.0f) * 31, 31, 0.0f), 31, 0.0f);
    }

    public final String toString() {
        String strD = p3v.d(0.0f);
        String strD2 = p3v.d(0.0f);
        return rjx.o(gvg.n("LayerOutsets(left=", strD, ", top=", strD2, ", right="), p3v.d(0.0f), ", bottom=", p3v.d(0.0f), ")");
    }
}
