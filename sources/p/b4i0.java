package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b4i0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ m4i0 a;

    public b4i0(m4i0 m4i0Var) {
        this.a = m4i0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        lag lagVar = this.a.e;
        Object objY = fn31.Y((q8n) lagVar.c, new hzb(lagVar, (lnm) null, (byte) 9), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
