package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gsu implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ nsu a;

    public gsu(nsu nsuVar) {
        this.a = nsuVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        fey feyVar = this.a.c;
        Object objG = feyVar.g("start download", new utz(feyVar, ((dsu) obj).a, null, (byte) 0), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objG != d9nVar) {
            objG = rih1Var;
        }
        return objG == d9nVar ? objG : rih1Var;
    }
}
