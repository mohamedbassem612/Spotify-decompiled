package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k691 {
    public final Flowable a;
    public final Flowable b;
    public final w9u0 c;
    public final mrq0 d;
    public final h691 e;

    public k691(Flowable flowable, Flowable flowable2, w9u0 w9u0Var, mrq0 mrq0Var, h691 h691Var) {
        this.a = flowable;
        this.b = flowable2;
        this.c = w9u0Var;
        this.d = mrq0Var;
        this.e = h691Var;
    }

    public final n691 a(qzh qzhVar) {
        return new n691(this.a, this.b, this.c, this.d, this.e, qzhVar);
    }
}
