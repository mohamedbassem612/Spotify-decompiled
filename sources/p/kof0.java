package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kof0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ q8n a;
    public final /* synthetic */ b9y b;

    public kof0(q8n q8nVar, b9y b9yVar) {
        this.a = q8nVar;
        this.b = b9yVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objY = fn31.Y(this.a, new e9c0(this.b, (hof0) obj, (lnm) null, (byte) 25), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }
}
