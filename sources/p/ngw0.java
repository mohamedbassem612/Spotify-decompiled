package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ngw0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ q8n a;
    public final /* synthetic */ wr00 b;

    public ngw0(q8n q8nVar, wr00 wr00Var) {
        this.a = q8nVar;
        this.b = wr00Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objY = fn31.Y(this.a, new cqu0(this.b, (dgw0) obj, null, (byte) 13), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }
}
