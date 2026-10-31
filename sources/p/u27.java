package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u27 {
    public final d0r a;
    public final gw70 b;
    public final bn4 c;

    public u27(d0r d0rVar, gw70 gw70Var, bn4 bn4Var) {
        this.a = d0rVar;
        this.b = gw70Var;
        this.c = bn4Var;
    }

    public final f37 a(Flowable flowable) {
        return new f37(flowable, this.a, this.b, this.c.a());
    }
}
