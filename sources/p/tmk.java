package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class tmk implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ cnk a;

    public tmk(cnk cnkVar) {
        this.a = cnkVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        cnk cnkVar = this.a;
        Object objY = fn31.Y(cnkVar.i, new zti(cnkVar, (kmk) obj, null, (byte) 14), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }
}
