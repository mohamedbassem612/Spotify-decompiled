package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x0m implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ q8n a;
    public final /* synthetic */ xwb b;

    public x0m(q8n q8nVar, xwb xwbVar) {
        this.a = q8nVar;
        this.b = xwbVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objY = fn31.Y(this.a, new zti(this.b, (m0m) obj, (lnm) null, (byte) 24), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }
}
