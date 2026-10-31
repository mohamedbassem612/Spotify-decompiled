package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tt10 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ mu10 a;

    public tt10(mu10 mu10Var) {
        this.a = mu10Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        gw10 gw10Var = this.a.d;
        uv10 uv10Var = ((ot10) obj).a;
        bpb1 bpb1Var = gw10Var.a;
        if (u890.j(bpb1Var.getValue(), uv10Var)) {
            gw10Var.d.m((Object) null, Boolean.FALSE);
            bpb1Var.l((Object) null);
            gw10Var.c.l((Object) null);
        }
        return rih1.a;
    }
}
