package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wke0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ rke0 a;

    public wke0(rke0 rke0Var) {
        this.a = rke0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new v4e0(this.a, obj, (lnm) null, (byte) 2)).collect(new cg00(r261Var, (byte) 24), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
