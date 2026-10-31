package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jof0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ q8n a;
    public final /* synthetic */ tbr0 b;

    public jof0(q8n q8nVar, tbr0 tbr0Var) {
        this.a = q8nVar;
        this.b = tbr0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objY = fn31.Y(this.a, new e9c0(this.b, (iof0) obj, (lnm) null, (byte) 24), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }
}
