package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yl1 {
    public final Flowable a;
    public final fl3 b;
    public final lik1 c;

    public yl1(Flowable flowable, fl3 fl3Var, lik1 lik1Var) {
        this.a = flowable;
        this.b = fl3Var;
        this.c = lik1Var;
    }

    public final rt01 a(qzh qzhVar) {
        return new rt01(this.b.a(this.c.a, this.a), qzhVar);
    }
}
