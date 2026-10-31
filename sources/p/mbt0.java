package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.ObservableSource;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mbt0 extends hab0 implements vu30 {
    public final /* synthetic */ nbt0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbt0(nbt0 nbt0Var) {
        super(2);
        this.a = nbt0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        kbt0 kbt0Var = this.a.b;
        jbt0 jbt0Var = new jbt0();
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        tzr0 tzr0Var = kbt0Var.a;
        subtypeEffectHandlerBuilderC.c(j9t0.class, new fat0(tzr0Var, (byte) 0));
        subtypeEffectHandlerBuilderC.c(m9t0.class, new fat0(tzr0Var, (byte) 3));
        subtypeEffectHandlerBuilderC.c(n9t0.class, new fat0(tzr0Var, (byte) 4));
        subtypeEffectHandlerBuilderC.c(t9t0.class, new fat0(tzr0Var, (byte) 10));
        subtypeEffectHandlerBuilderC.c(o9t0.class, new fat0(tzr0Var, (byte) 5));
        subtypeEffectHandlerBuilderC.c(q9t0.class, new fat0(tzr0Var, (byte) 7));
        subtypeEffectHandlerBuilderC.c(s9t0.class, new fat0(tzr0Var, (byte) 9));
        subtypeEffectHandlerBuilderC.c(bat0.class, new fat0(tzr0Var, (byte) 17));
        subtypeEffectHandlerBuilderC.c(y9t0.class, new fat0(tzr0Var, (byte) 14));
        subtypeEffectHandlerBuilderC.c(aat0.class, new fat0(tzr0Var, (byte) 16));
        subtypeEffectHandlerBuilderC.c(p9t0.class, new fat0(tzr0Var, (byte) 6));
        subtypeEffectHandlerBuilderC.c(r9t0.class, new fat0(tzr0Var, (byte) 8));
        subtypeEffectHandlerBuilderC.c(u9t0.class, new vrk1((byte) 28));
        subtypeEffectHandlerBuilderC.c(v9t0.class, new fat0(tzr0Var, (byte) 11));
        subtypeEffectHandlerBuilderC.c(k9t0.class, new fat0(tzr0Var, (byte) 1));
        subtypeEffectHandlerBuilderC.c(z9t0.class, new fat0(tzr0Var, (byte) 15));
        subtypeEffectHandlerBuilderC.c(dat0.class, new fat0(tzr0Var, (byte) 18));
        subtypeEffectHandlerBuilderC.c(eat0.class, new fat0(tzr0Var, (byte) 19));
        subtypeEffectHandlerBuilderC.c(l9t0.class, new fat0(tzr0Var, (byte) 2));
        subtypeEffectHandlerBuilderC.c(w9t0.class, new fat0(tzr0Var, (byte) 12));
        subtypeEffectHandlerBuilderC.c(x9t0.class, new fat0(tzr0Var, (byte) 13));
        subtypeEffectHandlerBuilderC.g(cat0.class, new o4e0(kbt0Var, (byte) 14));
        return gvg.d("pam-plan-overview", Mobius.d(jbt0Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).h(RxEventSources.a(new ObservableSource[]{((vw) kbt0Var.b.b).a().filter(cj20.X0).map(dj20.V0).onErrorResumeNext(xj20.X0)})));
    }
}
