package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qmk implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ cnk a;

    public qmk(cnk cnkVar) {
        this.a = cnkVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        cnk cnkVar = this.a;
        Object objY = fn31.Y(cnkVar.i, new zti(cnkVar, (mmk) obj, null, (byte) 13), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }
}
