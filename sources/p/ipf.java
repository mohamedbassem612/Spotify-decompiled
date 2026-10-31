package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ipf implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ lpf a;

    public ipf(lpf lpfVar) {
        this.a = lpfVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        lpf lpfVar = this.a;
        Object objY = fn31.Y(lpfVar.c, new pid((hpf) obj, lpfVar, (lnm) null, (byte) 9), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }
}
