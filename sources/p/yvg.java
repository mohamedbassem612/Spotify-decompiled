package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yvg implements CoroutinesSubtypeEffectHandlerBuilder.EffectsHandler {
    public final /* synthetic */ zvg a;
    public final /* synthetic */ lz81 b;

    public yvg(zvg zvgVar, lz81 lz81Var) {
        this.a = zvgVar;
        this.b = lz81Var;
    }

    public final Object a(bbc bbcVar, r261 r261Var, lnm lnmVar) {
        Object objS = smo1.s(new xvg(bbcVar, this.a, this.b, r261Var, null), lnmVar);
        return objS == d9n.a ? objS : rih1.a;
    }
}
