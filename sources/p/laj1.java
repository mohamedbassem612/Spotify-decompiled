package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class laj1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ naj1 a;

    public laj1(naj1 naj1Var) {
        this.a = naj1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        jc80 jc80Var = (jc80) obj;
        naj1 naj1Var = this.a;
        naj1Var.d.a(jc80Var.a.a, null);
        Object objInvoke = naj1Var.b.invoke(new gq0(jc80Var.a.a), onmVar);
        return objInvoke == d9n.a ? objInvoke : rih1.a;
    }
}
