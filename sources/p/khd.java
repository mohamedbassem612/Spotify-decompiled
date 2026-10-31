package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class khd implements CoroutinesSubtypeEffectHandlerBuilder.EffectsHandler {
    public final /* synthetic */ lhd a;
    public final /* synthetic */ b3p0 b;

    public khd(lhd lhdVar, b3p0 b3p0Var) {
        this.a = lhdVar;
        this.b = b3p0Var;
    }

    public final Object a(bbc bbcVar, r261 r261Var, lnm lnmVar) {
        Object objS = smo1.s(new jhd(bbcVar, this.a, this.b, r261Var, null), lnmVar);
        return objS == d9n.a ? objS : rih1.a;
    }
}
