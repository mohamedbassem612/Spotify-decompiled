package p;

import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s940 implements q940 {
    public final ov20 a;
    public final h2i1 b;
    public final luk c;
    public final krh d;
    public final c9n e;
    public final kly0 f;
    public final t2j0 g;
    public final xj4 h;
    public final Optional i;
    public final ConcurrentHashMap t = new ConcurrentHashMap();

    public s940(ov20 ov20Var, h2i1 h2i1Var, luk lukVar, krh krhVar, c9n c9nVar, kly0 kly0Var, t2j0 t2j0Var, xj4 xj4Var, Optional optional) {
        this.a = ov20Var;
        this.b = h2i1Var;
        this.c = lukVar;
        this.d = krhVar;
        this.e = c9nVar;
        this.f = kly0Var;
        this.g = t2j0Var;
        this.h = xj4Var;
        this.i = optional;
    }

    public final en10 a(jm10 jm10Var) {
        v6a v6aVar = new v6a(1, this, s940.class, "cappingStateFlowFor", "cappingStateFlowFor(Lcom/spotify/gating/api/CappingFeature;)Lkotlinx/coroutines/flow/StateFlow;", 0, (byte) 2);
        xj4 xj4Var = this.h;
        boolean zA = xj4Var.a();
        boolean zB = xj4Var.b();
        pze0.m(this.i.orElse(null));
        return new en10(jm10Var, this.a, this.b, this.c, v6aVar, this.e, this.f, zA, zB, this.g);
    }
}
