package p;

import com.spotify.adsdisplay.proto.OnSurfaceAdsEvent;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ihu implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ t2j0 a;

    public ihu(t2j0 t2j0Var) {
        this.a = t2j0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ate0 ate0Var = (ate0) obj;
        i8q0 i8q0VarN = OnSurfaceAdsEvent.n();
        i8q0VarN.n(ate0Var.a.a());
        i8q0VarN.q(ate0Var.a.h());
        i8q0VarN.r(ate0Var.b);
        i8q0VarN.s(ate0Var.c.getValue());
        this.a.a(i8q0VarN.build());
        return rih1.a;
    }
}
