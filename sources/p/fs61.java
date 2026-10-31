package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.MobiusAndroid;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fs61 implements v6r0 {
    public final u5v0 a;
    public final lzn0 b;
    public final nt8 c;
    public final dq61 d;
    public final cs61 e;
    public final Scheduler f;

    public fs61(u5v0 u5v0Var, lzn0 lzn0Var, nt8 nt8Var, dq61 dq61Var, cs61 cs61Var, Scheduler scheduler) {
        this.a = u5v0Var;
        this.b = lzn0Var;
        this.c = nt8Var;
        this.d = dq61Var;
        this.e = cs61Var;
        this.f = scheduler;
    }

    @Override // p.v6r0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final MobiusLoop.Controller a(mr61 mr61Var) {
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        lzn0 lzn0Var = this.b;
        f5b f5bVar = new f5b(lzn0Var, (byte) 17);
        Scheduler scheduler = this.f;
        subtypeEffectHandlerBuilderC.d(po61.class, f5bVar, scheduler);
        subtypeEffectHandlerBuilderC.d(ro61.class, new f5b(lzn0Var, (byte) 18), scheduler);
        subtypeEffectHandlerBuilderC.d(qo61.class, new tr41(this.a, (byte) 7), scheduler);
        nt8 nt8Var = this.c;
        subtypeEffectHandlerBuilderC.g(uo61.class, new b5z(nt8Var, (byte) 2));
        cs61 cs61Var = this.e;
        subtypeEffectHandlerBuilderC.g(to61.class, new g2x0(nt8Var, cs61Var, (byte) 8));
        subtypeEffectHandlerBuilderC.g(vo61.class, new b5z(nt8Var, (byte) 3));
        subtypeEffectHandlerBuilderC.g(so61.class, new yx11(cs61Var, (byte) 19));
        return MobiusAndroid.b(Mobius.d(ds61.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).h(this.d), mr61Var, es61.a);
    }
}
