package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lof0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ q8n a;
    public final /* synthetic */ tbr0 b;

    public lof0(q8n q8nVar, tbr0 tbr0Var) {
        this.a = q8nVar;
        this.b = tbr0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objY = fn31.Y(this.a, new iue(this.b, (lnm) null, (byte) 4), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }
}
