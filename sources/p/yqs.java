package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class yqs implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ zqs a;

    public yqs(zqs zqsVar) {
        this.a = zqsVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objInvoke = this.a.b.invoke((lw91) obj, onmVar);
        return objInvoke == d9n.a ? objInvoke : rih1.a;
    }
}
