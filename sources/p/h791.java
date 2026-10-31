package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h791 implements wpw {
    public final w9u0 a;
    public final poy0 b;
    public final ia00 c = n3o1.q(this).a(v691.c, v691.d);
    public final nsw d = jch0.j(v691.e);

    public h791(Flowable flowable, Flowable flowable2, w9u0 w9u0Var) {
        this.a = w9u0Var;
        this.b = y3o1.Y(Flowable.h(flowable, flowable2, o9x0.Z), er81.W0, new t491(this, (byte) 1), new d781(this, (byte) 20), 8);
    }

    public final rqw a() {
        return this.c;
    }

    public final rsw c() {
        return this.d;
    }

    public final mqw getBehavior() {
        return this.b;
    }
}
