package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w7m1 implements hsw {
    public final String a;
    public final kly0 b;
    public final nfa0 c;
    public final o7m1 d;
    public final mr20 e;
    public final o3r f = w3p1.n(new l4r(pwc0.b, 1, m5m1.W0, new j4r(new u7m1(this, (byte) 0)), m5m1.X0), new l4r(hvm.c, 1, m5m1.Y0, new j4r(new u7m1(this, (byte) 1)), m5m1.Z0), new fak1(this, (byte) 19));
    public final aa3 g = new aa3(this);
    public final yd91 h = new yd91(3, new bkk1(this, 24));

    public w7m1(String str, koc0 koc0Var, ttq ttqVar, nfa0 nfa0Var, q8n q8nVar, o7m1 o7m1Var) {
        this.a = str;
        this.b = ttqVar;
        this.c = nfa0Var;
        this.d = o7m1Var;
        this.e = rqt0.u(new uji1(kln1.C(koc0Var, nfa0Var, q8nVar), (byte) 10));
    }

    @Override // p.anc0
    public final void a() {
        o7m1 o7m1Var = this.d;
        llm llmVar = o7m1Var.j;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
        o7m1Var.j = null;
    }

    @Override // p.anc0
    public final void b() {
        o7m1 o7m1Var = this.d;
        if (o7m1Var.j == null) {
            o7m1Var.j = i3a.k(o7m1Var.e);
        }
    }

    @Override // p.hsw, p.xe91
    public final l381 c() {
        return this.g;
    }

    @Override // p.xe91
    public final yd91 d() {
        return this.h;
    }

    @Override // p.hsw, p.xe91
    public final mr20 getShow() {
        return this.e;
    }
}
