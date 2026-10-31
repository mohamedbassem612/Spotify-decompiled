package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cj21 implements h0r0 {
    public final q7e0 a;
    public final Scheduler b;
    public final gj21 c;
    public final wi21 d;
    public final joq e;
    public final cbr0 f;

    public cj21(jma jmaVar, q7e0 q7e0Var, Scheduler scheduler, gj21 gj21Var, wi21 wi21Var, joq joqVar) {
        this.a = q7e0Var;
        this.b = scheduler;
        this.c = gj21Var;
        this.d = wi21Var;
        this.e = joqVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.f = new cbr0(new dbr0[]{new yxe1(new jx21(2131961242)), new bn70(yon1.F3(), nik1.I4.b(jma.f(gj21Var.b())), (nar0) null)}, false);
    }

    public final cbr0 a() {
        return this.f;
    }

    public final p2r0 b() {
        gj21 gj21Var = this.c;
        return this.a.a(bbp1.g(Single.just(new mmr0(gj21Var.b(), gj21Var.a())).observeOn(this.b)), new zw11(this, (byte) 8), new n7e0(new aj21(this), rs11.W0, jcx0.g, ma21.X0), new u7r0(a4p1.n(), (g4h1) null, (iu30) null, false, false, 126));
    }
}
