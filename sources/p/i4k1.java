package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i4k1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ fey a;

    public i4k1(fey feyVar) {
        this.a = feyVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        v4k1 v4k1Var = (v4k1) obj;
        Object objA = ((wh71) this.a.b).a(new dlw0(v4k1Var.a, v4k1Var.b), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objA != d9nVar) {
            objA = rih1Var;
        }
        return objA == d9nVar ? objA : rih1Var;
    }
}
