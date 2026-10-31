package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class efy implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ dh30 a;

    public efy(dh30 dh30Var) {
        this.a = dh30Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        xey xeyVar = (xey) obj;
        Object objI = this.a.I(new odh(xeyVar.a.a, xeyVar.b, xeyVar.c), onmVar);
        return objI == d9n.a ? objI : rih1.a;
    }
}
