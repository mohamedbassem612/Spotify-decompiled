package p;

import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i1p {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ i1p(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final cg7 a(cir0 cir0Var, le7 le7Var, ze zeVar) {
        byte b = this.a;
        fwo fwoVar = this.b;
        switch (b) {
            case 0:
                yxo yxoVar = (yxo) fwoVar.c;
                Scheduler scheduler = (Scheduler) ((ae7) yxoVar.d).a.get();
                c8o.l(scheduler);
                Scheduler scheduler2 = (Scheduler) ((ae7) yxoVar.d).d.get();
                c8o.l(scheduler2);
                me7 me7Var = ((be7) yxoVar.c).e;
                c8o.m(me7Var);
                return new cg7(scheduler, scheduler2, me7Var, (y0p) yxoVar.S0.get(), (a1p) yxoVar.T0.get(), (b1p) yxoVar.U0.get(), (c1p) yxoVar.V0.get(), (d1p) yxoVar.W0.get(), (e1p) yxoVar.X0.get(), cir0Var, le7Var, zeVar);
            default:
                voa voaVar = (voa) fwoVar.c;
                Scheduler scheduler3 = (Scheduler) ((oe7) voaVar.b).a.get();
                c8o.l(scheduler3);
                Scheduler scheduler4 = (Scheduler) ((oe7) voaVar.b).d.get();
                c8o.l(scheduler4);
                me7 me7Var2 = ((pe7) voaVar.a).d;
                c8o.m(me7Var2);
                return new cg7(scheduler3, scheduler4, me7Var2, (y0p) ((jly0) voaVar.r).get(), (a1p) ((jly0) voaVar.s).get(), (b1p) ((jly0) voaVar.t).get(), (c1p) ((jly0) voaVar.u).get(), (d1p) ((jly0) voaVar.v).get(), (e1p) ((jly0) voaVar.w).get(), cir0Var, le7Var, zeVar);
        }
    }
}
