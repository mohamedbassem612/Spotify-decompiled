package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vt10 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ mu10 a;

    public vt10(mu10 mu10Var) {
        this.a = mu10Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        gw10 gw10Var = this.a.d;
        String str = ((qt10) obj).a;
        bpb1 bpb1Var = gw10Var.c;
        dw10 dw10Var = (dw10) bpb1Var.getValue();
        bpb1Var.l(dw10Var != null ? new dw10(dw10Var.a, str, dw10Var.c) : null);
        return rih1.a;
    }
}
