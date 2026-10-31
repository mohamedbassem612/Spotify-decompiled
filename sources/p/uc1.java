package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class uc1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ vc1 a;

    public uc1(vc1 vc1Var) {
        this.a = vc1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new tc1(obj, (lnm) null, this.a, (byte) 0)).collect(new k91(r261Var, (byte) 3), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
