package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xt10 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ mu10 a;

    public xt10(mu10 mu10Var) {
        this.a = mu10Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        it10 it10Var = (it10) obj;
        gw10 gw10Var = this.a.d;
        uv10 uv10Var = it10Var.a;
        boolean z = it10Var.b;
        if (u890.j(gw10Var.a.getValue(), uv10Var)) {
            gw10Var.d.m((Object) null, Boolean.valueOf(z));
        }
        return rih1.a;
    }
}
