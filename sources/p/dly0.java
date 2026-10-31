package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dly0 implements anc0 {
    public final d0r a;
    public final String b;
    public final q8n c;
    public final cly0 d;
    public xab1 e;

    public dly0(d0r d0rVar, String str, q8n q8nVar) {
        this.a = d0rVar;
        this.b = str;
        this.c = q8nVar;
        this.d = new cly0(d3p1.F(d0rVar, w3p1.n(new l4r(pwc0.e, 1, ucy0.h, new j4r(ucy0.f), ucy0.i), new l4r(pwc0.b, 1, ucy0.t, new j4r(ucy0.g), ucy0.X), j8y0.O0), str), (byte) 0);
    }

    @Override // p.anc0
    public final void a() {
        xab1 xab1Var = this.e;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
    }

    @Override // p.anc0
    public final void b() {
        xab1 xab1Var = this.e;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.e = fn31.T(smo1.e(this.c), (o8n) null, 0, new c3u0(this, (lnm) null, (byte) 22), 3);
    }
}
