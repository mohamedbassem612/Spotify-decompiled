package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kaj1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ naj1 a;

    public kaj1(naj1 naj1Var) {
        this.a = naj1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        heu heuVar = (heu) obj;
        naj1 naj1Var = this.a;
        ao0.a(naj1Var.h, co0.g, heuVar.a.a, (Long) null, (String) null, (String) null, 124);
        Object objInvoke = naj1Var.c.invoke(new gq0(heuVar.a.a), onmVar);
        return objInvoke == d9n.a ? objInvoke : rih1.a;
    }
}
