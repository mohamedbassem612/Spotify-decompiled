package p;

import io.reactivex.rxjava3.core.Scheduler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kcp0 extends hab0 implements Function0 {
    public final /* synthetic */ ccp0 X;
    public final /* synthetic */ ybp0 Y;
    public final /* synthetic */ ybp0 a;
    public final /* synthetic */ ybp0 b;
    public final /* synthetic */ ybp0 c;
    public final /* synthetic */ ybp0 d;
    public final /* synthetic */ ybp0 e;
    public final /* synthetic */ ybp0 f;
    public final /* synthetic */ ybp0 g;
    public final /* synthetic */ ccp0 h;
    public final /* synthetic */ ybp0 i;
    public final /* synthetic */ ccp0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kcp0(ybp0 ybp0Var, ybp0 ybp0Var2, ybp0 ybp0Var3, ybp0 ybp0Var4, ybp0 ybp0Var5, ybp0 ybp0Var6, ybp0 ybp0Var7, ccp0 ccp0Var, ybp0 ybp0Var8, ccp0 ccp0Var2, ccp0 ccp0Var3, ybp0 ybp0Var9) {
        super(0);
        this.a = ybp0Var;
        this.b = ybp0Var2;
        this.c = ybp0Var3;
        this.d = ybp0Var4;
        this.e = ybp0Var5;
        this.f = ybp0Var6;
        this.g = ybp0Var7;
        this.h = ccp0Var;
        this.i = ybp0Var8;
        this.t = ccp0Var2;
        this.X = ccp0Var3;
        this.Y = ybp0Var9;
    }

    public final Object invoke() {
        kly0 kly0Var = this.a.b.C0;
        kly0 kly0Var2 = this.b.b.D0;
        kly0 kly0Var3 = this.c.b.E0;
        kly0 kly0Var4 = this.d.b.F0;
        kly0 kly0Var5 = this.e.b.G0;
        kly0 kly0Var6 = this.f.b.H0;
        kly0 kly0Var7 = this.g.b.i0;
        t8u0 t8u0Var = (t8u0) this.h.invoke();
        kly0 kly0Var8 = this.i.b.k1;
        Scheduler scheduler = (Scheduler) this.t.invoke();
        q8n q8nVar = (q8n) this.X.invoke();
        kly0 kly0Var9 = this.Y.b.j0;
        up90 up90Var = (up90) kly0Var3.get();
        lx91 lx91Var = (lx91) kly0Var5.get();
        up90Var.getClass();
        return new rrd0(new prd0(new xqd0((p4s) kly0Var4.get(), up90Var, scheduler, q8nVar, (c9c0) kly0Var.get(), (fy91) kly0Var2.get(), (x350) kly0Var6.get(), t8u0Var, (x8c0) kly0Var8.get(), new t8r0(lx91Var, up90Var), (vq4) kly0Var9.get()), (n350) kly0Var7.get(), scheduler));
    }
}
