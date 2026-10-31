package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b7p0 implements pzf0 {
    public final dg30 a;
    public final o241 b;
    public final Flowable c;
    public final kly0 d;
    public final kly0 e;
    public final lnn0 f;
    public final idd1 g = new idd1(new ivn0(this, (byte) 23));

    public b7p0(dg30 dg30Var, o241 o241Var, Flowable flowable, thq thqVar, thq thqVar2, lnn0 lnn0Var) {
        this.a = dg30Var;
        this.b = o241Var;
        this.c = flowable;
        this.d = thqVar;
        this.e = thqVar2;
        this.f = lnn0Var;
    }

    @Override // p.pzf0
    public final zob1 a(Object obj) {
        return d5p1.t(new qsc0(yoi1.g(this.b.a.map(f331.Y0).distinctUntilChanged()), this, (w6p0) obj, (byte) 16), cto1.q(this.a), new alb1(0L, Long.MAX_VALUE), (Object) null);
    }
}
