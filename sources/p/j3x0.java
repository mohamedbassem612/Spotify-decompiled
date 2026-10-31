package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Supplier;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class j3x0 implements Supplier {
    public final /* synthetic */ k3x0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;

    public j3x0(k3x0 k3x0Var, String str, String str2, boolean z) {
        this.a = k3x0Var;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final Object get() {
        byte b;
        p811 p811Var = new p811();
        k3x0 k3x0Var = this.a;
        gdx0 gdx0Var = k3x0Var.g;
        q8n q8nVar = k3x0Var.n;
        th4 th4Var = gdx0Var.a;
        th4 th4Var2 = gdx0Var.a;
        boolean zH = th4Var2.h();
        String str = this.b;
        Observable observableMerge = Observable.merge(Observable.just(new u2x0(zH || th4Var2.i() || th4Var2.g() || (str.equals(this.c) && z1a1.k(gdx0Var)))), yoi1.i(k3x0Var.f7p, q8nVar));
        cfi1 cfi1Var = k3x0Var.m;
        do70 do70Var = k3x0Var.f;
        v5n v5nVar = k3x0Var.c;
        Scheduler scheduler = k3x0Var.h;
        Scheduler scheduler2 = k3x0Var.k;
        zsc zscVar = k3x0Var.d;
        j0a1 j0a1Var = k3x0Var.j;
        bfd bfdVar = k3x0Var.b;
        o241 o241Var = k3x0Var.e;
        g341 g341Var = k3x0Var.a;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(n1x0.class, new so(cfi1Var, scheduler2, (byte) 29));
        subtypeEffectHandlerBuilderC.g(s1x0.class, new zd1(do70Var, scheduler2, gdx0Var, (byte) 16));
        subtypeEffectHandlerBuilderC.g(o1x0.class, new x1x0(v5nVar, (byte) 0));
        subtypeEffectHandlerBuilderC.g(p1x0.class, new z1x0(zscVar, (byte) 0));
        subtypeEffectHandlerBuilderC.g(q1x0.class, new o4e0(j0a1Var, (byte) 22));
        subtypeEffectHandlerBuilderC.g(t1x0.class, new g2x0(o241Var, scheduler2, (byte) 0));
        subtypeEffectHandlerBuilderC.g(u1x0.class, new g2x0(g341Var, scheduler2, (byte) 1));
        subtypeEffectHandlerBuilderC.g(v1x0.class, new lk1(scheduler, (byte) 5));
        subtypeEffectHandlerBuilderC.g(r1x0.class, new c2x0(q8nVar, bfdVar, (byte) 0));
        MobiusLoop.Builder builderD = Mobius.d(g3x0.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h()));
        f3x0 f3x0Var = k3x0Var.l;
        FlowEventSources.Companion companion = FlowEventSources.a;
        q8n q8nVar2 = f3x0Var.b;
        mr20[] mr20VarArr = {new c1v0(rqt0.u(f3x0Var.f.b()), (byte) 22), rqt0.u(h5p1.r(f3x0Var.e.a, f3x0Var.a.a("restrict-settings-for-child", false), new wzv0(new c1v0(((e581) f3x0Var.c).d, (byte) 20), (byte) 2), new wzv0(new c1v0(((d981) f3x0Var.d).d, (byte) 21), (byte) 3), new mp6(5, (lnm) null, (byte) 6)))};
        companion.getClass();
        MobiusLoop.Builder builderG = l1d.g(builderD.h(new b(q8nVar2, mr20VarArr)).b(new h3x0(k3x0Var)).d(new i3x0(k3x0Var)));
        m3x0 m3x0Var = (m3x0) p811Var.a;
        if (m3x0Var == null) {
            b = 6;
            m3x0Var = new m3x0(str, this.c, this.d, th4Var.s(), k3x0Var.i.a.h(), th4Var.l(), th4Var.p(), th4Var.c(), -873529351, 14);
        } else {
            b = 6;
        }
        return observableMerge.compose(RxMobius.b(builderG, m3x0Var)).doOnNext(new wrk(p811Var, b));
    }
}
