package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class so31 implements c8m0 {
    public final wn31 a;
    public final EventSource b;
    public final Scheduler c;

    public so31(wn31 wn31Var, EventSource eventSource, Scheduler scheduler) {
        this.a = wn31Var;
        this.b = eventSource;
        this.c = scheduler;
    }

    @Override // p.c8m0
    public final MobiusLoop.Controller a(Object obj, bk1 bk1Var) {
        f230 f230Var = new f230(ko31.h, (byte) 2);
        bo31 bo31Var = (bo31) this.a;
        bo31Var.getClass();
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(tn3.class, bo31Var.e.B());
        subtypeEffectHandlerBuilderC.c(co3.class, new xn31(bo31Var, (byte) 4));
        subtypeEffectHandlerBuilderC.c(bo3.class, new xn31(bo31Var, (byte) 5));
        subtypeEffectHandlerBuilderC.e(mn3.class, new vqv0(bo31Var, (byte) 26));
        subtypeEffectHandlerBuilderC.g(on3.class, new y0h(bk1Var, (byte) 1));
        jzs0 jzs0Var = bo31Var.b;
        subtypeEffectHandlerBuilderC.g(un3.class, (ObservableTransformer) jzs0Var.b.getValue());
        subtypeEffectHandlerBuilderC.g(uo3.class, (ObservableTransformer) jzs0Var.c.getValue());
        subtypeEffectHandlerBuilderC.a(pn3.class, new ao31(bo31Var, (byte) 0));
        subtypeEffectHandlerBuilderC.c(to3.class, new xn31(bo31Var, (byte) 6));
        subtypeEffectHandlerBuilderC.c(ln3.class, new xn31(bo31Var, (byte) 7));
        subtypeEffectHandlerBuilderC.a(qn3.class, new ao31(bo31Var, (byte) 1));
        xn31 xn31Var = new xn31(bo31Var, (byte) 8);
        Scheduler scheduler = bo31Var.f;
        subtypeEffectHandlerBuilderC.d(do3.class, xn31Var, scheduler);
        subtypeEffectHandlerBuilderC.b(eo3.class, new s030(bo31Var.g, (byte) 1), scheduler);
        subtypeEffectHandlerBuilderC.d(fo3.class, new xn31(bo31Var, (byte) 0), scheduler);
        subtypeEffectHandlerBuilderC.c(nn3.class, new xn31(bo31Var, (byte) 1));
        subtypeEffectHandlerBuilderC.g(qo3.class, bo31Var.d.a());
        subtypeEffectHandlerBuilderC.g(ro3.class, (ObservableTransformer) bo31Var.n.c.getValue());
        subtypeEffectHandlerBuilderC.g(xn3.class, (ObservableTransformer) bo31Var.m.d.getValue());
        subtypeEffectHandlerBuilderC.g(vn3.class, (cp81) bo31Var.o.e);
        subtypeEffectHandlerBuilderC.d(go3.class, new xn31(bo31Var, (byte) 2), scheduler);
        subtypeEffectHandlerBuilderC.c(zn3.class, new xn31(bo31Var, (byte) 3));
        viw.a(subtypeEffectHandlerBuilderC, sn3.class, new yn31(bo31Var, (byte) 0));
        viw.a(subtypeEffectHandlerBuilderC, yn3.class, new yn31(bo31Var, (byte) 1));
        viw.a(subtypeEffectHandlerBuilderC, rn3.class, new yn31(bo31Var, (byte) 2));
        subtypeEffectHandlerBuilderC.g(vo3.class, new zn31(bo31Var, (byte) 0));
        subtypeEffectHandlerBuilderC.g(wn3.class, new zn31(bo31Var, (byte) 1));
        subtypeEffectHandlerBuilderC.g(jn3.class, new zn31(bo31Var, (byte) 2));
        subtypeEffectHandlerBuilderC.g(po3.class, new zn31(bo31Var, (byte) 3));
        subtypeEffectHandlerBuilderC.c(ao3.class, mux0.V0);
        subtypeEffectHandlerBuilderC.c(kn3.class, mux0.W0);
        return Mobius.b(Mobius.d(f230Var, RxConnectables.a(new wiw(subtypeEffectHandlerBuilderC.h(), (byte) 0))).h(this.b).d(new lo31(this)).b(new mo31(this)).f(wue0.a()), (tr3) obj, new qh80(no31.a, oo31.a, po31.b, qo31.a, ro31.a), MainThreadWorkRunner.a());
    }
}
