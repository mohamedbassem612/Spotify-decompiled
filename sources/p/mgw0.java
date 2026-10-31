package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mgw0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ q8n a;
    public final /* synthetic */ yh2 b;

    public mgw0(q8n q8nVar, yh2 yh2Var) {
        this.a = q8nVar;
        this.b = yh2Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objY = fn31.Y(this.a, new cqu0(this.b, (cgw0) obj, null, (byte) 12), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }
}
