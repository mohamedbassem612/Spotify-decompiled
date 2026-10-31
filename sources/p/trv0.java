package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.schedulers.Schedulers;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class trv0 extends hab0 implements iu30 {
    public final /* synthetic */ urv0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public trv0(urv0 urv0Var) {
        super(1);
        this.a = urv0Var;
    }

    public final Object invoke(Object obj) {
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilder;
        yon mt60Var;
        nfa0 nfa0Var;
        aru0 aru0Var;
        asv0 asv0Var = this.a.b;
        zrv0 zrv0Var = new zrv0();
        mzr0 mzr0Var = asv0Var.a;
        nfa0 nfa0Var2 = asv0Var.b;
        Scheduler scheduler = asv0Var.c;
        Scheduler scheduler2 = asv0Var.d;
        lzn0 lzn0Var = asv0Var.e;
        bqv0 bqv0Var = asv0Var.i;
        gal galVar = asv0Var.j;
        qil1 qil1Var = asv0Var.k;
        aru0 aru0Var2 = asv0Var.m;
        lk1 lk1Var = asv0Var.l;
        zhq0 zhq0Var = asv0Var.n;
        jxp0 jxp0Var = asv0Var.o;
        rrv0 rrv0Var = asv0Var.f0p;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        isv0 isv0Var = (isv0) jxp0Var.b;
        if (isv0Var.a()) {
            subtypeEffectHandlerBuilder = subtypeEffectHandlerBuilderC;
            mt60Var = new yon(mzr0Var, galVar, rrv0Var, zhq0Var, (byte) 8);
            nfa0Var = nfa0Var2;
            aru0Var = aru0Var2;
        } else {
            subtypeEffectHandlerBuilder = subtypeEffectHandlerBuilderC;
            nfa0Var = nfa0Var2;
            aru0Var = aru0Var2;
            mt60Var = new mt60(mzr0Var, aru0Var, galVar, rrv0Var, nfa0Var, (byte) 1);
        }
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilder2 = subtypeEffectHandlerBuilder;
        subtypeEffectHandlerBuilder2.g(xtv0.class, mt60Var);
        subtypeEffectHandlerBuilder2.g(wtv0.class, isv0Var.a() ? new so(mzr0Var, zhq0Var, (byte) 26) : new zd1(mzr0Var, aru0Var, nfa0Var, (byte) 15));
        subtypeEffectHandlerBuilder2.g(duv0.class, new lk1(scheduler, (byte) 4));
        subtypeEffectHandlerBuilder2.b(auv0.class, new g5b(lzn0Var, (byte) 4), scheduler2);
        subtypeEffectHandlerBuilder2.b(ytv0.class, new wqd0(bqv0Var, (byte) 18), scheduler2);
        subtypeEffectHandlerBuilder2.a(buv0.class, new wqd0(qil1Var, (byte) 19));
        subtypeEffectHandlerBuilder2.g(ztv0.class, nm3.Z);
        subtypeEffectHandlerBuilder2.g(cuv0.class, new o4e0(lk1Var, (byte) 21));
        MobiusLoop.Builder builderD = Mobius.d(zrv0Var, RxConnectables.a(subtypeEffectHandlerBuilder2.h()));
        p241 p241Var = asv0Var.f;
        return builderD.h(RxEventSources.a(new ObservableSource[]{p241Var.a.distinctUntilChanged().map(new sks0(asv0Var.h, (byte) 14)).publish(new jxp0(Schedulers.b, (byte) 16)), p241Var.b("country_code").map(o610.c1), asv0Var.g.e().distinctUntilChanged().map(f610.c1)}));
    }
}
