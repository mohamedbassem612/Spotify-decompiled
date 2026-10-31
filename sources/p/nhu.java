package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nhu implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ i01 a;
    public final /* synthetic */ zhu b;

    public nhu(i01 i01Var, zhu zhuVar) {
        this.a = i01Var;
        this.b = zhuVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        kc80 kc80Var = (kc80) obj;
        this.a.a(kc80Var.a.a(), null);
        Object objInvoke = this.b.a.invoke(new gq0(kc80Var.a.a()), onmVar);
        return objInvoke == d9n.a ? objInvoke : rih1.a;
    }
}
