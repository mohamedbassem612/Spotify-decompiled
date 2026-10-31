package p;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class of30 extends xf30 {
    public final /* synthetic */ hv30 a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ o1p1 c;
    public final /* synthetic */ bh0 d;
    public final /* synthetic */ zf30 e;

    public of30(zf30 zf30Var, hv30 hv30Var, AtomicReference atomicReference, o1p1 o1p1Var, bh0 bh0Var) {
        this.e = zf30Var;
        this.a = hv30Var;
        this.b = atomicReference;
        this.c = o1p1Var;
        this.d = bh0Var;
    }

    @Override // p.xf30
    public final void a() {
        StringBuilder sb = new StringBuilder("fragment_");
        zf30 zf30Var = this.e;
        sb.append(zf30Var.e);
        sb.append("_rq#");
        sb.append(zf30Var.A1.getAndIncrement());
        this.b.set(((sh0) this.a.apply(null)).g(sb.toString(), zf30Var, this.c, this.d));
    }
}
