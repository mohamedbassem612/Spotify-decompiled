package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fgw0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ q8n a;
    public final /* synthetic */ g1i b;

    public fgw0(q8n q8nVar, g1i g1iVar) {
        this.a = q8nVar;
        this.b = g1iVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objY = fn31.Y(this.a, new cqu0(this.b, (yfw0) obj, null, (byte) 11), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }
}
