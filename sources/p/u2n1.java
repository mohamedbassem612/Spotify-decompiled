package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class u2n1 extends hab0 implements vu30 {
    public final /* synthetic */ w2n1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2n1(w2n1 w2n1Var) {
        super(2);
        this.a = w2n1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        d2n1 d2n1Var = this.a.a;
        y1n1 y1n1Var = new y1n1();
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        lrj0 lrj0Var = new lrj0(d2n1Var.a, (byte) 11);
        Scheduler scheduler = d2n1Var.o;
        subtypeEffectHandlerBuilderC.d(n0n1.class, lrj0Var, scheduler);
        subtypeEffectHandlerBuilderC.d(r0n1.class, new tr41(d2n1Var.c, (byte) 14), scheduler);
        subtypeEffectHandlerBuilderC.g(p0n1.class, new yx11(d2n1Var.i, (byte) 5));
        subtypeEffectHandlerBuilderC.c(l0n1.class, new cfs(d2n1Var.f, (byte) 9));
        subtypeEffectHandlerBuilderC.g(q0n1.class, new yx11(d2n1Var.l, (byte) 21));
        subtypeEffectHandlerBuilderC.g(u0n1.class, new yx11(d2n1Var.e, (byte) 4));
        subtypeEffectHandlerBuilderC.g(m0n1.class, new bk1(d2n1Var.g, (byte) 18));
        subtypeEffectHandlerBuilderC.c(o0n1.class, new lyw0(d2n1Var.b, (byte) 19));
        subtypeEffectHandlerBuilderC.d(s0n1.class, new tr41(d2n1Var.j, (byte) 15), scheduler);
        subtypeEffectHandlerBuilderC.d(t0n1.class, new tr41(d2n1Var.k, (byte) 22), scheduler);
        MobiusLoop.Builder builderD = Mobius.d(y1n1Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h()));
        mr20 mr20VarC = d2n1Var.h.a.c();
        o6x o6xVar = o6x.a;
        return gvg.d("YourUpdates", builderD.h(RxEventSources.a(new ObservableSource[]{yoi1.i(mr20VarC, o6xVar).map(fj10.g).map(z1n1.a), d2n1Var.d.a.map(uh21.h).map(a2n1.a), yoi1.i(k4p1.B(((a2t) d2n1Var.m.a).c), o6xVar).map(rdx0.Y0)}))).b(new b2n1(d2n1Var)).d(new c2n1(d2n1Var));
    }
}
