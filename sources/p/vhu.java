package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vhu implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ yhu a;

    public vhu(yhu yhuVar) {
        this.a = yhuVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        eeu eeuVar = (eeu) obj;
        yhu yhuVar = this.a;
        ao0.a(yhuVar.e, co0.g, eeuVar.a.a, (Long) null, (String) null, (String) null, 124);
        Object objInvoke = yhuVar.b.invoke(new gq0(eeuVar.a.a), onmVar);
        return objInvoke == d9n.a ? objInvoke : rih1.a;
    }
}
