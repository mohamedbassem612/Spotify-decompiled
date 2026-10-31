package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xke0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ uo5 a;

    public xke0(uo5 uo5Var) {
        this.a = uo5Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new a38(obj, (lnm) null, this.a, (byte) 12)).collect(new cg00(r261Var, (byte) 25), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
