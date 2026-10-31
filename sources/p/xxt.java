package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xxt implements CoroutinesSubtypeEffectHandlerBuilder.EffectsHandler {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ yqg c;
    public final /* synthetic */ o9s d;

    public xxt(long j, long j2, yqg yqgVar, o9s o9sVar) {
        this.a = j;
        this.b = j2;
        this.c = yqgVar;
        this.d = o9sVar;
    }

    public final Object a(bbc bbcVar, r261 r261Var, lnm lnmVar) {
        mfe mfeVarL = k4p1.l(bbcVar);
        w0h1.o(2, qlt.t);
        bge bgeVarG = h4p1.g(new wn2(mfeVarL, this.a, (lnm) null, (byte) 7));
        w0h1.o(1, zlt.W0);
        Object objCollect = new m441(new xn2(this.c, this.b, bgeVarG, (lnm) null, (byte) 4)).collect(new skr(this.d, (byte) 18), lnmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
