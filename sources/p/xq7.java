package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xq7 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ dqu a;

    public xq7(dqu dquVar) {
        this.a = dquVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        xaw xawVar = (xaw) obj;
        Object objA = ((wh71) this.a.b).a(new dlw0(xawVar.a, xawVar.b), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objA != d9nVar) {
            objA = rih1Var;
        }
        return objA == d9nVar ? objA : rih1Var;
    }
}
