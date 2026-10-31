package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sng extends x7e0 {
    public static final o3r i;
    public final dng d;
    public final d0r e;
    public final llm f;
    public final bpb1 g = gio1.b(new jmg("", (String) null, "", false));
    public xab1 h;

    static {
        jd11 jd11Var = rc11.a;
        i = w3p1.n(new l4r(new wlu(jd11Var.b(jo70.class)), 1, tzf.a1, new j4r(tzf.W0), tzf.b1), new l4r(new wlu(jd11Var.b(xkk1.class)), 2, tzf.Y0, new j4r(tzf.X0), tzf.Z0), rng.b);
    }

    public sng(dng dngVar, d0r d0rVar, q8n q8nVar) {
        this.d = dngVar;
        this.e = d0rVar;
        this.f = smo1.e(flo1.l(op71.f(), q8nVar));
    }

    public final void e() {
        lnm lnmVar = null;
        this.h = fn31.T(this.f, (o8n) null, 0, new bag(d3p1.F(this.e, i, this.d.a), this, lnmVar, (byte) 4), 3);
    }

    public final void f() {
        xab1 xab1Var = this.h;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.h = null;
    }
}
