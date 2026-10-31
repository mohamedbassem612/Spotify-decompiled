package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dm91 {
    public final hj91 a;
    public final Flowable b;
    public final up41 c;
    public final a78 d;

    public dm91(hj91 hj91Var, Flowable flowable, up41 up41Var, a78 a78Var) {
        this.a = hj91Var;
        this.b = flowable;
        this.c = up41Var;
        this.d = a78Var;
    }

    public final qm91 a(qzh qzhVar, boolean z) {
        return new qm91(z, qzhVar, this.b, this.a, this.c, this.d);
    }
}
