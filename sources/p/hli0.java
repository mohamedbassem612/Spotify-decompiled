package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.ObservableSource;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hli0 extends hab0 implements vu30 {
    public final /* synthetic */ ili0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hli0(ili0 ili0Var) {
        super(2);
        this.a = ili0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        ili0 ili0Var = this.a;
        rki0 rki0Var = ili0Var.g;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        gj10 gj10Var = rki0Var.a;
        subtypeEffectHandlerBuilderC.g(oki0.class, new pki0(gj10Var, (byte) 1));
        subtypeEffectHandlerBuilderC.g(mki0.class, new qki0(rki0Var, (byte) 1));
        subtypeEffectHandlerBuilderC.g(nki0.class, new qki0(rki0Var, (byte) 2));
        subtypeEffectHandlerBuilderC.g(lki0.class, new qki0(rki0Var, (byte) 0));
        subtypeEffectHandlerBuilderC.g(jki0.class, new pki0(gj10Var, (byte) 0));
        subtypeEffectHandlerBuilderC.d(iki0.class, new f5b(rki0Var.d, (byte) 10), rki0Var.e);
        subtypeEffectHandlerBuilderC.c(kki0.class, new i71(rki0Var.b, rki0Var.c, (byte) 1));
        return gvg.d("pam-member-details", Mobius.d(gli0.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).h(RxEventSources.a(new ObservableSource[]{ili0Var.h.a.a().map(zz10.O0)})));
    }
}
