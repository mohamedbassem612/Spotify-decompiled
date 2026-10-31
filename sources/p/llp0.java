package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class llp0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ s1q0 a;

    public llp0(s1q0 s1q0Var) {
        this.a = s1q0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new rwm0(obj, (lnm) null, this.a)).collect(new klp0(r261Var, (byte) 0), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
