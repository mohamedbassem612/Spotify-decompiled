package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class uy80 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ bz80 a;

    public uy80(bz80 bz80Var) {
        this.a = bz80Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    public final Object a(Object obj, r261 r261Var, onm onmVar) throws Throwable {
        Object objCollect = h4p1.l(new nx(obj, (lnm) null, this.a, (byte) 9)).collect(new cg00(r261Var, (byte) 19), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
