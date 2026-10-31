package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mli1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ cmi1 a;

    public mli1(cmi1 cmi1Var) {
        this.a = cmi1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objY = fn31.Y(geo0.b, new n5s(this.a.g, ((uki1) obj).a, null, (byte) 28), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
