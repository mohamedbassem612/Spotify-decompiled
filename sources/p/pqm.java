package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pqm implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ q8n a;
    public final /* synthetic */ lzn0 b;

    public pqm(q8n q8nVar, lzn0 lzn0Var) {
        this.a = q8nVar;
        this.b = lzn0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objY = fn31.Y(this.a, new fik(this.b, (lnm) null, (byte) 1), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }
}
