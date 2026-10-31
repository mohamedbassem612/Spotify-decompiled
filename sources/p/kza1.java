package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kza1 implements yw0 {
    public final fza1 a;
    public final qq0 b;
    public final Flowable c;
    public final xn0 d;
    public final llm e;

    public kza1(fza1 fza1Var, qq0 qq0Var, Flowable flowable, xn0 xn0Var, q8n q8nVar) {
        this.a = fza1Var;
        this.b = qq0Var;
        this.c = flowable;
        this.d = xn0Var;
        this.e = smo1.e(q8nVar);
    }

    @Override // p.yw0
    public final void start() {
        dt71 dt71Var = this.b.d;
        vbm[] vbmVarArr = q601.a;
        l4p1.u(this.e, f5p1.q(new zo51(h5p1.t(dt71Var, rqt0.v(new h801(new kge(this.c), (byte) 14), dw81.i), jza1.h), this, (byte) 28), new wp41(this, (lnm) null, (byte) 25)));
    }

    @Override // p.yw0
    public final void stop() {
        smo1.q(this.e);
    }
}
