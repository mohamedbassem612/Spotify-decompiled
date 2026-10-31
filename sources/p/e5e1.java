package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class e5e1 {
    public static final String a = nhc1.V(10, "H");

    public static long a(lee1 lee1Var, wat watVar, f930 f930Var) {
        nw4 nw4VarB = b(lee1Var, watVar, f930Var, 1, false);
        return (((long) r2p1.h(nw4VarB.a.e())) << 32) | (((long) r2p1.h(nw4VarB.f)) & 4294967295L);
    }

    public static final nw4 b(lee1 lee1Var, wat watVar, f930 f930Var, int i, boolean z) {
        String strY0 = o7h.y0(yoi1.Q(0, i), "\n", (String) null, (String) null, new cix0((byte) 29), 30);
        z6x z6xVar = z6x.a;
        return vgo1.j(new rw4(strY0, lee1Var, z6xVar, z6xVar, f930Var, watVar, z), jjl.b(0, 0, 0, 0, 15), i, 1);
    }
}
