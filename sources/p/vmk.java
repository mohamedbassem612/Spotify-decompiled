package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vmk implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ cnk a;

    public vmk(cnk cnkVar) {
        this.a = cnkVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        cnk cnkVar = this.a;
        Object objY = fn31.Y(cnkVar.i, new zti(cnkVar, (lmk) obj, null, (byte) 11), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }
}
