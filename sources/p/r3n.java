package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r3n implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ s3n a;

    public r3n(s3n s3nVar) {
        this.a = s3nVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        p3n p3nVar = (p3n) obj;
        lag lagVar = this.a.a;
        Object objY = fn31.Y((q8n) lagVar.e, new gke(p3nVar.b, lagVar, p3nVar.c, (lnm) null, (byte) 13), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
