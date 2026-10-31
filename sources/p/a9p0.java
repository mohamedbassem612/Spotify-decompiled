package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class a9p0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ q8n a;
    public final /* synthetic */ klm1 b;

    public a9p0(q8n q8nVar, klm1 klm1Var) {
        this.a = q8nVar;
        this.b = klm1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objY = fn31.Y(this.a, new xgf0(this.b, null, (byte) 1), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }
}
