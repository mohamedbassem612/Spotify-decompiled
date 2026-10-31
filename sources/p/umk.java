package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class umk implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ cnk a;

    public umk(cnk cnkVar) {
        this.a = cnkVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        cnk cnkVar = this.a;
        Object objY = fn31.Y(cnkVar.i, new zti(cnkVar, (fmk) obj, null, (byte) 15), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }
}
