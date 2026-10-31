package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bfy implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ dh30 a;

    public bfy(dh30 dh30Var) {
        this.a = dh30Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        vey veyVar = (vey) obj;
        j80 j80Var = veyVar.a;
        Object objI = this.a.I(new ldh(j80Var.a, j80Var.b, veyVar.b, veyVar.c, j80Var.c), onmVar);
        return objI == d9n.a ? objI : rih1.a;
    }
}
