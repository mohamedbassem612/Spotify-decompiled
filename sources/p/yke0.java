package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yke0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ im01 a;
    public final /* synthetic */ uo5 b;

    public yke0(im01 im01Var, uo5 uo5Var) {
        this.a = im01Var;
        this.b = uo5Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new qk3(obj, (lnm) null, this.a, this.b, (byte) 10)).collect(new cg00(r261Var, (byte) 26), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
