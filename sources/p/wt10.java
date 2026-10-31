package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wt10 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ mu10 a;

    public wt10(mu10 mu10Var) {
        this.a = mu10Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        dw10 dw10Var;
        bpb1 bpb1Var = this.a.d.c;
        dw10 dw10Var2 = (dw10) bpb1Var.getValue();
        if (dw10Var2 != null) {
            String str = dw10Var2.c;
            dw10Var = new dw10(dw10Var2.a, str, str);
        } else {
            dw10Var = null;
        }
        bpb1Var.l(dw10Var);
        return rih1.a;
    }
}
