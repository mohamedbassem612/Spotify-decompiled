package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hsu implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ nsu a;

    public hsu(nsu nsuVar) {
        this.a = nsuVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        fey feyVar = this.a.c;
        Object objG = feyVar.g("remove download", new utz(feyVar, ((csu) obj).a, null, (byte) 1), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objG != d9nVar) {
            objG = rih1Var;
        }
        return objG == d9nVar ? objG : rih1Var;
    }
}
