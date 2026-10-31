package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gsf1 implements hsw {
    public final koc0 a;
    public final dtq b;
    public final dt71 c;
    public final bpb1 d;
    public final llm e;
    public xab1 f;
    public final kr41 g;
    public final yd91 h;

    public gsf1(koc0 koc0Var, dtq dtqVar) {
        this.a = koc0Var;
        this.b = dtqVar;
        dt71 dt71VarE = mgo1.e(3, 0, 2, 2);
        this.c = dt71VarE;
        this.d = gio1.b(Boolean.FALSE);
        this.e = smo1.e(guo1.B());
        this.g = new kr41(new any(dt71VarE, (byte) 18), (byte) 13);
        this.h = new yd91(3, new esf1(this, (byte) 1));
    }

    @Override // p.anc0
    public final void a() {
        xab1 xab1Var = this.f;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        smo1.p(this.e, (CancellationException) null);
    }

    @Override // p.anc0
    public final void b() {
        xab1 xab1Var = this.f;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.f = l4p1.u(this.e, new fu20(((roc0) this.a).d(), new pec1(this, (lnm) null, (byte) 22), (byte) 1));
    }

    @Override // p.xe91
    public final yd91 d() {
        return this.h;
    }

    @Override // p.hsw, p.xe91
    public final mr20 getShow() {
        return this.g;
    }
}
