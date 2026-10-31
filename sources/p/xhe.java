package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xhe implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ m64 a;
    public final /* synthetic */ qzn0 b;

    public xhe(m64 m64Var, qzn0 qzn0Var) {
        this.a = m64Var;
        this.b = qzn0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objY = fn31.Y(geo0.b, new vs0(this.a, this.b, (vhe) obj, (lnm) null, (byte) 19), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }
}
