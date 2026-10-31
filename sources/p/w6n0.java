package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class w6n0 {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        ytw0 ytw0Var = jfv.b;
        a = fdg1.k0(200, ngv.d);
    }

    public static final h7n0 a(h7n0 h7n0Var, wkt wktVar) {
        if (h7n0Var instanceof g7n0) {
            return g7n0.j((g7n0) h7n0Var, (ela1) null, (u771) null, 0, wktVar, 7);
        }
        if (h7n0Var instanceof e7n0) {
            return e7n0.j((e7n0) h7n0Var, null, null, 0, wktVar, 55);
        }
        if (h7n0Var instanceof f7n0) {
            return f7n0.j((f7n0) h7n0Var, 0, wktVar, 55);
        }
        eg.o();
        return null;
    }
}
